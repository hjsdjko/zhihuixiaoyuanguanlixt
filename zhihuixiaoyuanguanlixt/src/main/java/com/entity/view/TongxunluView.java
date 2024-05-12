package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.TongxunluEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 通讯录
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("tongxunlu")
public class TongxunluView extends TongxunluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表




	public TongxunluView() {

	}

	public TongxunluView(TongxunluEntity tongxunluEntity) {
		try {
			BeanUtils.copyProperties(this, tongxunluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}







	@Override
	public String toString() {
		return "TongxunluView{" +
			"} " + super.toString();
	}
}
