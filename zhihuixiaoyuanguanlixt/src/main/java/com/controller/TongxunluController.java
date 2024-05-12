
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 通讯录
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/tongxunlu")
public class TongxunluController {
    private static final Logger logger = LoggerFactory.getLogger(TongxunluController.class);

    private static final String TABLE_NAME = "tongxunlu";

    @Autowired
    private TongxunluService tongxunluService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private ChatService chatService;//意见反馈
    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private ExampaperService exampaperService;//试卷表
    @Autowired
    private ExampapertopicService exampapertopicService;//试卷选题
    @Autowired
    private ExamquestionService examquestionService;//试题表
    @Autowired
    private ExamrecordService examrecordService;//考试记录表
    @Autowired
    private ExamredetailsService examredetailsService;//答题详情表
    @Autowired
    private ExamrewrongquestionService examrewrongquestionService;//错题表
    @Autowired
    private ForumService forumService;//论坛
    @Autowired
    private JiaoshiService jiaoshiService;//教师信息
    @Autowired
    private KechengService kechengService;//课程信息
    @Autowired
    private KechengCollectionService kechengCollectionService;//课程收藏
    @Autowired
    private KechengLiuyanService kechengLiuyanService;//课程留言
    @Autowired
    private NewsService newsService;//公告信息
    @Autowired
    private TongzhiService tongzhiService;//通知信息
    @Autowired
    private XuexiaojianjieService xuexiaojianjieService;//学校简介
    @Autowired
    private YonghuService yonghuService;//学生
    @Autowired
    private YonghuKaoqinService yonghuKaoqinService;//学生考勤
    @Autowired
    private YonghuKaoqinListService yonghuKaoqinListService;//学生考勤详情
    @Autowired
    private YonghuqingjiaService yonghuqingjiaService;//学生请假
    @Autowired
    private ZuoyeService zuoyeService;//作业
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("学生".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("教师信息".equals(role))
            params.put("jiaoshiId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = tongxunluService.queryPage(params);

        //字典表数据转换
        List<TongxunluView> list =(List<TongxunluView>)page.getList();
        for(TongxunluView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        TongxunluEntity tongxunlu = tongxunluService.selectById(id);
        if(tongxunlu !=null){
            //entity转view
            TongxunluView view = new TongxunluView();
            BeanUtils.copyProperties( tongxunlu , view );//把实体数据重构到view中
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody TongxunluEntity tongxunlu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,tongxunlu:{}",this.getClass().getName(),tongxunlu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<TongxunluEntity> queryWrapper = new EntityWrapper<TongxunluEntity>()
            .eq("tongxunlu_name", tongxunlu.getTongxunluName())
            .eq("tongxunlu_phone", tongxunlu.getTongxunluPhone())
            .eq("tongxunlu_shenfen", tongxunlu.getTongxunluShenfen())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        TongxunluEntity tongxunluEntity = tongxunluService.selectOne(queryWrapper);
        if(tongxunluEntity==null){
            tongxunlu.setInsertTime(new Date());
            tongxunlu.setCreateTime(new Date());
            tongxunluService.insert(tongxunlu);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody TongxunluEntity tongxunlu, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,tongxunlu:{}",this.getClass().getName(),tongxunlu.toString());
        TongxunluEntity oldTongxunluEntity = tongxunluService.selectById(tongxunlu.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");

            tongxunluService.updateById(tongxunlu);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<TongxunluEntity> oldTongxunluList =tongxunluService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        tongxunluService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<TongxunluEntity> tongxunluList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            TongxunluEntity tongxunluEntity = new TongxunluEntity();
//                            tongxunluEntity.setTongxunluName(data.get(0));                    //联系人名称 要改的
//                            tongxunluEntity.setTongxunluPhone(data.get(0));                    //联系人方式 要改的
//                            tongxunluEntity.setTongxunluShenfen(data.get(0));                    //联系人身份 要改的
//                            tongxunluEntity.setTongxunluContent("");//详情和图片
//                            tongxunluEntity.setInsertTime(date);//时间
//                            tongxunluEntity.setCreateTime(date);//时间
                            tongxunluList.add(tongxunluEntity);


                            //把要查询是否重复的字段放入map中
                                //联系人方式
                                if(seachFields.containsKey("tongxunluPhone")){
                                    List<String> tongxunluPhone = seachFields.get("tongxunluPhone");
                                    tongxunluPhone.add(data.get(0));//要改的
                                }else{
                                    List<String> tongxunluPhone = new ArrayList<>();
                                    tongxunluPhone.add(data.get(0));//要改的
                                    seachFields.put("tongxunluPhone",tongxunluPhone);
                                }
                        }

                        //查询是否重复
                         //联系人方式
                        List<TongxunluEntity> tongxunluEntities_tongxunluPhone = tongxunluService.selectList(new EntityWrapper<TongxunluEntity>().in("tongxunlu_phone", seachFields.get("tongxunluPhone")));
                        if(tongxunluEntities_tongxunluPhone.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(TongxunluEntity s:tongxunluEntities_tongxunluPhone){
                                repeatFields.add(s.getTongxunluPhone());
                            }
                            return R.error(511,"数据库的该表中的 [联系人方式] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        tongxunluService.insertBatch(tongxunluList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = tongxunluService.queryPage(params);

        //字典表数据转换
        List<TongxunluView> list =(List<TongxunluView>)page.getList();
        for(TongxunluView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        TongxunluEntity tongxunlu = tongxunluService.selectById(id);
            if(tongxunlu !=null){


                //entity转view
                TongxunluView view = new TongxunluView();
                BeanUtils.copyProperties( tongxunlu , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody TongxunluEntity tongxunlu, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,tongxunlu:{}",this.getClass().getName(),tongxunlu.toString());
        Wrapper<TongxunluEntity> queryWrapper = new EntityWrapper<TongxunluEntity>()
            .eq("tongxunlu_name", tongxunlu.getTongxunluName())
            .eq("tongxunlu_phone", tongxunlu.getTongxunluPhone())
            .eq("tongxunlu_shenfen", tongxunlu.getTongxunluShenfen())
//            .notIn("tongxunlu_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        TongxunluEntity tongxunluEntity = tongxunluService.selectOne(queryWrapper);
        if(tongxunluEntity==null){
            tongxunlu.setInsertTime(new Date());
            tongxunlu.setCreateTime(new Date());
        tongxunluService.insert(tongxunlu);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

