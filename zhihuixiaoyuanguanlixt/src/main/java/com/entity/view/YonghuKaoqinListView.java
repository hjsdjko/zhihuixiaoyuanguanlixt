package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.YonghuKaoqinListEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 学生考勤详情
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("yonghu_kaoqin_list")
public class YonghuKaoqinListView extends YonghuKaoqinListEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 打卡状态的值
	*/
	@ColumnInfo(comment="打卡状态的字典表值",type="varchar(200)")
	private String yonghuKaoqinListValue;

	//级联表 学生
		/**
		* 学生姓名
		*/

		@ColumnInfo(comment="学生姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 头像
		*/

		@ColumnInfo(comment="头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 身份证号
		*/

		@ColumnInfo(comment="身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 联系方式
		*/

		@ColumnInfo(comment="联系方式",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 电子邮箱
		*/

		@ColumnInfo(comment="电子邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer yonghuDelete;
	//级联表 学生考勤
		/**
		* 考勤唯一编号
		*/

		@ColumnInfo(comment="考勤唯一编号",type="varchar(200)")
		private String yonghuKaoqinUuidNumber;
		/**
		* 考勤标题
		*/

		@ColumnInfo(comment="考勤标题",type="varchar(200)")
		private String yonghuKaoqinName;
		/**
		* 考勤详情
		*/

		@ColumnInfo(comment="考勤详情",type="text")
		private String yonghuKaoqinContent;
		/**
		* 考勤截止时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="考勤截止时间",type="timestamp")
		private Date jiezhiTime;



	public YonghuKaoqinListView() {

	}

	public YonghuKaoqinListView(YonghuKaoqinListEntity yonghuKaoqinListEntity) {
		try {
			BeanUtils.copyProperties(this, yonghuKaoqinListEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 打卡状态的值
	*/
	public String getYonghuKaoqinListValue() {
		return yonghuKaoqinListValue;
	}
	/**
	* 设置： 打卡状态的值
	*/
	public void setYonghuKaoqinListValue(String yonghuKaoqinListValue) {
		this.yonghuKaoqinListValue = yonghuKaoqinListValue;
	}


	//级联表的get和set 学生

		/**
		* 获取： 学生姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 学生姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 联系方式
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 联系方式
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 电子邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 电子邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getYonghuDelete() {
			return yonghuDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setYonghuDelete(Integer yonghuDelete) {
			this.yonghuDelete = yonghuDelete;
		}
	//级联表的get和set 学生考勤

		/**
		* 获取： 考勤唯一编号
		*/
		public String getYonghuKaoqinUuidNumber() {
			return yonghuKaoqinUuidNumber;
		}
		/**
		* 设置： 考勤唯一编号
		*/
		public void setYonghuKaoqinUuidNumber(String yonghuKaoqinUuidNumber) {
			this.yonghuKaoqinUuidNumber = yonghuKaoqinUuidNumber;
		}

		/**
		* 获取： 考勤标题
		*/
		public String getYonghuKaoqinName() {
			return yonghuKaoqinName;
		}
		/**
		* 设置： 考勤标题
		*/
		public void setYonghuKaoqinName(String yonghuKaoqinName) {
			this.yonghuKaoqinName = yonghuKaoqinName;
		}

		/**
		* 获取： 考勤详情
		*/
		public String getYonghuKaoqinContent() {
			return yonghuKaoqinContent;
		}
		/**
		* 设置： 考勤详情
		*/
		public void setYonghuKaoqinContent(String yonghuKaoqinContent) {
			this.yonghuKaoqinContent = yonghuKaoqinContent;
		}

		/**
		* 获取： 考勤截止时间
		*/
		public Date getJiezhiTime() {
			return jiezhiTime;
		}
		/**
		* 设置： 考勤截止时间
		*/
		public void setJiezhiTime(Date jiezhiTime) {
			this.jiezhiTime = jiezhiTime;
		}


	@Override
	public String toString() {
		return "YonghuKaoqinListView{" +
			", yonghuKaoqinListValue=" + yonghuKaoqinListValue +
			", yonghuName=" + yonghuName +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhone=" + yonghuPhone +
			", yonghuEmail=" + yonghuEmail +
			", yonghuDelete=" + yonghuDelete +
			", yonghuKaoqinUuidNumber=" + yonghuKaoqinUuidNumber +
			", yonghuKaoqinName=" + yonghuKaoqinName +
			", yonghuKaoqinContent=" + yonghuKaoqinContent +
			", jiezhiTime=" + DateUtil.convertString(jiezhiTime,"yyyy-MM-dd") +
			"} " + super.toString();
	}
}
