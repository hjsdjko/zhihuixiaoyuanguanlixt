package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.KechengLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 课程留言
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("kecheng_liuyan")
public class KechengLiuyanView extends KechengLiuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 课程信息
		/**
		* 课程名称
		*/

		@ColumnInfo(comment="课程名称",type="varchar(200)")
		private String kechengName;
		/**
		* 课程类型
		*/
		@ColumnInfo(comment="课程类型",type="int(11)")
		private Integer kechengTypes;
			/**
			* 课程类型的值
			*/
			@ColumnInfo(comment="课程类型的字典表值",type="varchar(200)")
			private String kechengValue;
		/**
		* 课程封面
		*/

		@ColumnInfo(comment="课程封面",type="varchar(200)")
		private String kechengPhoto;
		/**
		* 学习视频
		*/

		@ColumnInfo(comment="学习视频",type="varchar(200)")
		private String kechengVideo;
		/**
		* 课件
		*/

		@ColumnInfo(comment="课件",type="varchar(200)")
		private String kechengFile;
		/**
		* 科目
		*/
		@ColumnInfo(comment="科目",type="int(11)")
		private Integer kemuTypes;
			/**
			* 科目的值
			*/
			@ColumnInfo(comment="科目的字典表值",type="varchar(200)")
			private String kemuValue;
		/**
		* 星期
		*/
		@ColumnInfo(comment="星期",type="int(11)")
		private Integer banjiTypes;
			/**
			* 星期的值
			*/
			@ColumnInfo(comment="星期的字典表值",type="varchar(200)")
			private String banjiValue;
					 
		/**
		* 课程信息 的 上传教师
		*/
		@ColumnInfo(comment="上传教师",type="int(11)")
		private Integer kechengJiaoshiId;
		/**
		* 课程简介
		*/

		@ColumnInfo(comment="课程简介",type="text")
		private String kechengContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer kechengDelete;
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



	public KechengLiuyanView() {

	}

	public KechengLiuyanView(KechengLiuyanEntity kechengLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, kechengLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 课程信息

		/**
		* 获取： 课程名称
		*/
		public String getKechengName() {
			return kechengName;
		}
		/**
		* 设置： 课程名称
		*/
		public void setKechengName(String kechengName) {
			this.kechengName = kechengName;
		}
		/**
		* 获取： 课程类型
		*/
		public Integer getKechengTypes() {
			return kechengTypes;
		}
		/**
		* 设置： 课程类型
		*/
		public void setKechengTypes(Integer kechengTypes) {
			this.kechengTypes = kechengTypes;
		}


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

		/**
		* 获取： 课程封面
		*/
		public String getKechengPhoto() {
			return kechengPhoto;
		}
		/**
		* 设置： 课程封面
		*/
		public void setKechengPhoto(String kechengPhoto) {
			this.kechengPhoto = kechengPhoto;
		}

		/**
		* 获取： 学习视频
		*/
		public String getKechengVideo() {
			return kechengVideo;
		}
		/**
		* 设置： 学习视频
		*/
		public void setKechengVideo(String kechengVideo) {
			this.kechengVideo = kechengVideo;
		}

		/**
		* 获取： 课件
		*/
		public String getKechengFile() {
			return kechengFile;
		}
		/**
		* 设置： 课件
		*/
		public void setKechengFile(String kechengFile) {
			this.kechengFile = kechengFile;
		}
		/**
		* 获取： 科目
		*/
		public Integer getKemuTypes() {
			return kemuTypes;
		}
		/**
		* 设置： 科目
		*/
		public void setKemuTypes(Integer kemuTypes) {
			this.kemuTypes = kemuTypes;
		}


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
		/**
		* 获取： 星期
		*/
		public Integer getBanjiTypes() {
			return banjiTypes;
		}
		/**
		* 设置： 星期
		*/
		public void setBanjiTypes(Integer banjiTypes) {
			this.banjiTypes = banjiTypes;
		}


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
		/**
		* 获取：课程信息 的 上传教师
		*/
		public Integer getKechengJiaoshiId() {
			return kechengJiaoshiId;
		}
		/**
		* 设置：课程信息 的 上传教师
		*/
		public void setKechengJiaoshiId(Integer kechengJiaoshiId) {
			this.kechengJiaoshiId = kechengJiaoshiId;
		}

		/**
		* 获取： 课程简介
		*/
		public String getKechengContent() {
			return kechengContent;
		}
		/**
		* 设置： 课程简介
		*/
		public void setKechengContent(String kechengContent) {
			this.kechengContent = kechengContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getKechengDelete() {
			return kechengDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setKechengDelete(Integer kechengDelete) {
			this.kechengDelete = kechengDelete;
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


	@Override
	public String toString() {
		return "KechengLiuyanView{" +
			", yonghuName=" + yonghuName +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhone=" + yonghuPhone +
			", yonghuEmail=" + yonghuEmail +
			", yonghuDelete=" + yonghuDelete +
			", kechengName=" + kechengName +
			", kechengPhoto=" + kechengPhoto +
			", kechengVideo=" + kechengVideo +
			", kechengFile=" + kechengFile +
			", kechengContent=" + kechengContent +
			", kechengDelete=" + kechengDelete +
			"} " + super.toString();
	}
}
