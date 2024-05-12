package com.entity.model;

import com.entity.XuexiaojianjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学校简介
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XuexiaojianjieModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String xuexiaojianjieName;


    /**
     * 简介类型
     */
    private Integer xuexiaojianjieTypes;


    /**
     * 封面
     */
    private String xuexiaojianjiePhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 详情
     */
    private String xuexiaojianjieContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
