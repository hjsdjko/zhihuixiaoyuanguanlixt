package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 课程信息
 *
 * @author 
 * @email
 */
@TableName("kecheng")
public class KechengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KechengEntity() {

	}

	public KechengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 课程名称
     */
    @ColumnInfo(comment="课程名称",type="varchar(200)")
    @TableField(value = "kecheng_name")

    private String kechengName;


    /**
     * 课程类型
     */
    @ColumnInfo(comment="课程类型",type="int(11)")
    @TableField(value = "kecheng_types")

    private Integer kechengTypes;


    /**
     * 课程封面
     */
    @ColumnInfo(comment="课程封面",type="varchar(200)")
    @TableField(value = "kecheng_photo")

    private String kechengPhoto;


    /**
     * 学习视频
     */
    @ColumnInfo(comment="学习视频",type="varchar(200)")
    @TableField(value = "kecheng_video")

    private String kechengVideo;


    /**
     * 课件
     */
    @ColumnInfo(comment="课件",type="varchar(200)")
    @TableField(value = "kecheng_file")

    private String kechengFile;


    /**
     * 科目
     */
    @ColumnInfo(comment="科目",type="int(11)")
    @TableField(value = "kemu_types")

    private Integer kemuTypes;


    /**
     * 星期
     */
    @ColumnInfo(comment="星期",type="int(11)")
    @TableField(value = "banji_types")

    private Integer banjiTypes;


    /**
     * 上传教师
     */
    @ColumnInfo(comment="上传教师",type="int(11)")
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 课程简介
     */
    @ColumnInfo(comment="课程简介",type="text")
    @TableField(value = "kecheng_content")

    private String kechengContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "kecheng_delete")

    private Integer kechengDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：课程名称
	 */
    public String getKechengName() {
        return kechengName;
    }
    /**
	 * 设置：课程名称
	 */

    public void setKechengName(String kechengName) {
        this.kechengName = kechengName;
    }
    /**
	 * 获取：课程类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }
    /**
	 * 设置：课程类型
	 */

    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 获取：课程封面
	 */
    public String getKechengPhoto() {
        return kechengPhoto;
    }
    /**
	 * 设置：课程封面
	 */

    public void setKechengPhoto(String kechengPhoto) {
        this.kechengPhoto = kechengPhoto;
    }
    /**
	 * 获取：学习视频
	 */
    public String getKechengVideo() {
        return kechengVideo;
    }
    /**
	 * 设置：学习视频
	 */

    public void setKechengVideo(String kechengVideo) {
        this.kechengVideo = kechengVideo;
    }
    /**
	 * 获取：课件
	 */
    public String getKechengFile() {
        return kechengFile;
    }
    /**
	 * 设置：课件
	 */

    public void setKechengFile(String kechengFile) {
        this.kechengFile = kechengFile;
    }
    /**
	 * 获取：科目
	 */
    public Integer getKemuTypes() {
        return kemuTypes;
    }
    /**
	 * 设置：科目
	 */

    public void setKemuTypes(Integer kemuTypes) {
        this.kemuTypes = kemuTypes;
    }
    /**
	 * 获取：星期
	 */
    public Integer getBanjiTypes() {
        return banjiTypes;
    }
    /**
	 * 设置：星期
	 */

    public void setBanjiTypes(Integer banjiTypes) {
        this.banjiTypes = banjiTypes;
    }
    /**
	 * 获取：上传教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }
    /**
	 * 设置：上传教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 获取：课程简介
	 */
    public String getKechengContent() {
        return kechengContent;
    }
    /**
	 * 设置：课程简介
	 */

    public void setKechengContent(String kechengContent) {
        this.kechengContent = kechengContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getKechengDelete() {
        return kechengDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setKechengDelete(Integer kechengDelete) {
        this.kechengDelete = kechengDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Kecheng{" +
            ", id=" + id +
            ", kechengName=" + kechengName +
            ", kechengTypes=" + kechengTypes +
            ", kechengPhoto=" + kechengPhoto +
            ", kechengVideo=" + kechengVideo +
            ", kechengFile=" + kechengFile +
            ", kemuTypes=" + kemuTypes +
            ", banjiTypes=" + banjiTypes +
            ", jiaoshiId=" + jiaoshiId +
            ", kechengContent=" + kechengContent +
            ", kechengDelete=" + kechengDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
