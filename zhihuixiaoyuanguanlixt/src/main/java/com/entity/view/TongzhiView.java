package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.TongzhiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 通知信息
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("tongzhi")
public class TongzhiView extends TongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 通知类型的值
	*/
	@ColumnInfo(comment="通知类型的字典表值",type="varchar(200)")
	private String tongzhiValue;




	public TongzhiView() {

	}

	public TongzhiView(TongzhiEntity tongzhiEntity) {
		try {
			BeanUtils.copyProperties(this, tongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 通知类型的值
	*/
	public String getTongzhiValue() {
		return tongzhiValue;
	}
	/**
	* 设置： 通知类型的值
	*/
	public void setTongzhiValue(String tongzhiValue) {
		this.tongzhiValue = tongzhiValue;
	}




	@Override
	public String toString() {
		return "TongzhiView{" +
			", tongzhiValue=" + tongzhiValue +
			"} " + super.toString();
	}
}
