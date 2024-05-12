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
 * 学校简介
 *
 * @author 
 * @email
 */
@TableName("xuexiaojianjie")
public class XuexiaojianjieEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XuexiaojianjieEntity() {

	}

	public XuexiaojianjieEntity(T t) {
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
     * 标题
     */
    @ColumnInfo(comment="标题",type="varchar(200)")
    @TableField(value = "xuexiaojianjie_name")

    private String xuexiaojianjieName;


    /**
     * 简介类型
     */
    @ColumnInfo(comment="简介类型",type="int(11)")
    @TableField(value = "xuexiaojianjie_types")

    private Integer xuexiaojianjieTypes;


    /**
     * 封面
     */
    @ColumnInfo(comment="封面",type="varchar(200)")
    @TableField(value = "xuexiaojianjie_photo")

    private String xuexiaojianjiePhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="添加时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 详情
     */
    @ColumnInfo(comment="详情",type="text")
    @TableField(value = "xuexiaojianjie_content")

    private String xuexiaojianjieContent;


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
	 * 获取：标题
	 */
    public String getXuexiaojianjieName() {
        return xuexiaojianjieName;
    }
    /**
	 * 设置：标题
	 */

    public void setXuexiaojianjieName(String xuexiaojianjieName) {
        this.xuexiaojianjieName = xuexiaojianjieName;
    }
    /**
	 * 获取：简介类型
	 */
    public Integer getXuexiaojianjieTypes() {
        return xuexiaojianjieTypes;
    }
    /**
	 * 设置：简介类型
	 */

    public void setXuexiaojianjieTypes(Integer xuexiaojianjieTypes) {
        this.xuexiaojianjieTypes = xuexiaojianjieTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getXuexiaojianjiePhoto() {
        return xuexiaojianjiePhoto;
    }
    /**
	 * 设置：封面
	 */

    public void setXuexiaojianjiePhoto(String xuexiaojianjiePhoto) {
        this.xuexiaojianjiePhoto = xuexiaojianjiePhoto;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：详情
	 */
    public String getXuexiaojianjieContent() {
        return xuexiaojianjieContent;
    }
    /**
	 * 设置：详情
	 */

    public void setXuexiaojianjieContent(String xuexiaojianjieContent) {
        this.xuexiaojianjieContent = xuexiaojianjieContent;
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
        return "Xuexiaojianjie{" +
            ", id=" + id +
            ", xuexiaojianjieName=" + xuexiaojianjieName +
            ", xuexiaojianjieTypes=" + xuexiaojianjieTypes +
            ", xuexiaojianjiePhoto=" + xuexiaojianjiePhoto +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", xuexiaojianjieContent=" + xuexiaojianjieContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
