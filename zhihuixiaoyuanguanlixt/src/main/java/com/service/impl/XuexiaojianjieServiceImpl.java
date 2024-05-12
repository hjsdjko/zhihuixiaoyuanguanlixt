package com.service.impl;

import com.utils.StringUtil;
import com.service.DictionaryService;
import com.utils.ClazzDiff;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;
import com.dao.XuexiaojianjieDao;
import com.entity.XuexiaojianjieEntity;
import com.service.XuexiaojianjieService;
import com.entity.view.XuexiaojianjieView;

/**
 * 学校简介 服务实现类
 */
@Service("xuexiaojianjieService")
@Transactional
public class XuexiaojianjieServiceImpl extends ServiceImpl<XuexiaojianjieDao, XuexiaojianjieEntity> implements XuexiaojianjieService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        Page<XuexiaojianjieView> page =new Query<XuexiaojianjieView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
