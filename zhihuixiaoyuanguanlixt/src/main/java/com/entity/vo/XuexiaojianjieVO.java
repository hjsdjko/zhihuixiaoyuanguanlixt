package com.entity.vo;

import com.entity.XuexiaojianjieEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 学校简介
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xuexiaojianjie")
public class XuexiaojianjieVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "xuexiaojianjie_name")
    private String xuexiaojianjieName;


    /**
     * 简介类型
     */

    @TableField(value = "xuexiaojianjie_types")
    private Integer xuexiaojianjieTypes;


    /**
     * 封面
     */

    @TableField(value = "xuexiaojianjie_photo")
    private String xuexiaojianjiePhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 详情
     */

    @TableField(value = "xuexiaojianjie_content")
    private String xuexiaojianjieContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：标题
	 */
    public String getXuexiaojianjieName() {
        return xuexiaojianjieName;
    }


    /**
	 * 获取：标题
	 */

    public void setXuexiaojianjieName(String xuexiaojianjieName) {
        this.xuexiaojianjieName = xuexiaojianjieName;
    }
    /**
	 * 设置：简介类型
	 */
    public Integer getXuexiaojianjieTypes() {
        return xuexiaojianjieTypes;
    }


    /**
	 * 获取：简介类型
	 */

    public void setXuexiaojianjieTypes(Integer xuexiaojianjieTypes) {
        this.xuexiaojianjieTypes = xuexiaojianjieTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getXuexiaojianjiePhoto() {
        return xuexiaojianjiePhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setXuexiaojianjiePhoto(String xuexiaojianjiePhoto) {
        this.xuexiaojianjiePhoto = xuexiaojianjiePhoto;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：详情
	 */
    public String getXuexiaojianjieContent() {
        return xuexiaojianjieContent;
    }


    /**
	 * 获取：详情
	 */

    public void setXuexiaojianjieContent(String xuexiaojianjieContent) {
        this.xuexiaojianjieContent = xuexiaojianjieContent;
    }
    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
