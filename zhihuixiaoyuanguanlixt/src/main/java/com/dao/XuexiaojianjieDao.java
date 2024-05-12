package com.dao;

import com.entity.XuexiaojianjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexiaojianjieView;

/**
 * 学校简介 Dao 接口
 *
 * @author 
 */
public interface XuexiaojianjieDao extends BaseMapper<XuexiaojianjieEntity> {

   List<XuexiaojianjieView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
