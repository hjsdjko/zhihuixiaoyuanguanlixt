package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.XuexiaojianjieEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 学校简介
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("xuexiaojianjie")
public class XuexiaojianjieView extends XuexiaojianjieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 简介类型的值
	*/
	@ColumnInfo(comment="简介类型的字典表值",type="varchar(200)")
	private String xuexiaojianjieValue;




	public XuexiaojianjieView() {

	}

	public XuexiaojianjieView(XuexiaojianjieEntity xuexiaojianjieEntity) {
		try {
			BeanUtils.copyProperties(this, xuexiaojianjieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 简介类型的值
	*/
	public String getXuexiaojianjieValue() {
		return xuexiaojianjieValue;
	}
	/**
	* 设置： 简介类型的值
	*/
	public void setXuexiaojianjieValue(String xuexiaojianjieValue) {
		this.xuexiaojianjieValue = xuexiaojianjieValue;
	}




	@Override
	public String toString() {
		return "XuexiaojianjieView{" +
			", xuexiaojianjieValue=" + xuexiaojianjieValue +
			"} " + super.toString();
	}
}
