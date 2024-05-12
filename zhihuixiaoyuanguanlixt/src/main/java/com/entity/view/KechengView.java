package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.KechengEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 课程信息
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("kecheng")
public class KechengView extends KechengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 课程类型的值
	*/
	@ColumnInfo(comment="课程类型的字典表值",type="varchar(200)")
	private String kechengValue;
	/**
	* 科目的值
	*/
	@ColumnInfo(comment="科目的字典表值",type="varchar(200)")
	private String kemuValue;
	/**
	* 星期的值
	*/
	@ColumnInfo(comment="星期的字典表值",type="varchar(200)")
	private String banjiValue;

	//级联表 教师信息
		/**
		* 教师名称
		*/

		@ColumnInfo(comment="教师名称",type="varchar(200)")
		private String jiaoshiName;
		/**
		* 教师类型
		*/
		@ColumnInfo(comment="教师类型",type="int(11)")
		private Integer jiaoshiTypes;
			/**
			* 教师类型的值
			*/
			@ColumnInfo(comment="教师类型的字典表值",type="varchar(200)")
			private String jiaoshiValue;
		/**
		* 教师头像
		*/

		@ColumnInfo(comment="教师头像",type="varchar(200)")
		private String jiaoshiPhoto;
		/**
		* 联系方式
		*/

		@ColumnInfo(comment="联系方式",type="varchar(200)")
		private String jiaoshiPhone;
		/**
		* 工作时长
		*/

		@ColumnInfo(comment="工作时长",type="varchar(200)")
		private String jiaoshiShichang;
		/**
		* 教师简介
		*/

		@ColumnInfo(comment="教师简介",type="text")
		private String jiaoshiContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer jiaoshiDelete;



	public KechengView() {

	}

	public KechengView(KechengEntity kechengEntity) {
		try {
			BeanUtils.copyProperties(this, kechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 课程类型的值
	*/
	public String getKechengValue() {
		return kechengValue;
	}
	/**
	* 设置： 课程类型的值
	*/
	public void setKechengValue(String kechengValue) {
		this.kechengValue = kechengValue;
	}
	//当前表的
	/**
	* 获取： 科目的值
	*/
	public String getKemuValue() {
		return kemuValue;
	}
	/**
	* 设置： 科目的值
	*/
	public void setKemuValue(String kemuValue) {
		this.kemuValue = kemuValue;
	}
	//当前表的
	/**
	* 获取： 星期的值
	*/
	public String getBanjiValue() {
		return banjiValue;
	}
	/**
	* 设置： 星期的值
	*/
	public void setBanjiValue(String banjiValue) {
		this.banjiValue = banjiValue;
	}


	//级联表的get和set 教师信息

		/**
		* 获取： 教师名称
		*/
		public String getJiaoshiName() {
			return jiaoshiName;
		}
		/**
		* 设置： 教师名称
		*/
		public void setJiaoshiName(String jiaoshiName) {
			this.jiaoshiName = jiaoshiName;
		}
		/**
		* 获取： 教师类型
		*/
		public Integer getJiaoshiTypes() {
			return jiaoshiTypes;
		}
		/**
		* 设置： 教师类型
		*/
		public void setJiaoshiTypes(Integer jiaoshiTypes) {
			this.jiaoshiTypes = jiaoshiTypes;
		}


			/**
			* 获取： 教师类型的值
			*/
			public String getJiaoshiValue() {
				return jiaoshiValue;
			}
			/**
			* 设置： 教师类型的值
			*/
			public void setJiaoshiValue(String jiaoshiValue) {
				this.jiaoshiValue = jiaoshiValue;
			}

		/**
		* 获取： 教师头像
		*/
		public String getJiaoshiPhoto() {
			return jiaoshiPhoto;
		}
		/**
		* 设置： 教师头像
		*/
		public void setJiaoshiPhoto(String jiaoshiPhoto) {
			this.jiaoshiPhoto = jiaoshiPhoto;
		}

		/**
		* 获取： 联系方式
		*/
		public String getJiaoshiPhone() {
			return jiaoshiPhone;
		}
		/**
		* 设置： 联系方式
		*/
		public void setJiaoshiPhone(String jiaoshiPhone) {
			this.jiaoshiPhone = jiaoshiPhone;
		}

		/**
		* 获取： 工作时长
		*/
		public String getJiaoshiShichang() {
			return jiaoshiShichang;
		}
		/**
		* 设置： 工作时长
		*/
		public void setJiaoshiShichang(String jiaoshiShichang) {
			this.jiaoshiShichang = jiaoshiShichang;
		}

		/**
		* 获取： 教师简介
		*/
		public String getJiaoshiContent() {
			return jiaoshiContent;
		}
		/**
		* 设置： 教师简介
		*/
		public void setJiaoshiContent(String jiaoshiContent) {
			this.jiaoshiContent = jiaoshiContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getJiaoshiDelete() {
			return jiaoshiDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setJiaoshiDelete(Integer jiaoshiDelete) {
			this.jiaoshiDelete = jiaoshiDelete;
		}


	@Override
	public String toString() {
		return "KechengView{" +
			", kechengValue=" + kechengValue +
			", kemuValue=" + kemuValue +
			", banjiValue=" + banjiValue +
			", jiaoshiName=" + jiaoshiName +
			", jiaoshiPhoto=" + jiaoshiPhoto +
			", jiaoshiPhone=" + jiaoshiPhone +
			", jiaoshiShichang=" + jiaoshiShichang +
			", jiaoshiContent=" + jiaoshiContent +
			", jiaoshiDelete=" + jiaoshiDelete +
			"} " + super.toString();
	}
}
