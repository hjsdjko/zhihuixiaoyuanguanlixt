package com.entity.vo;

import com.entity.TongxunluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 通讯录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("tongxunlu")
public class TongxunluVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 联系人名称
     */

    @TableField(value = "tongxunlu_name")
    private String tongxunluName;


    /**
     * 联系人方式
     */

    @TableField(value = "tongxunlu_phone")
    private String tongxunluPhone;


    /**
     * 联系人身份
     */

    @TableField(value = "tongxunlu_shenfen")
    private String tongxunluShenfen;


    /**
     * 备注
     */

    @TableField(value = "tongxunlu_content")
    private String tongxunluContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
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
	 * 设置：联系人名称
	 */
    public String getTongxunluName() {
        return tongxunluName;
    }


    /**
	 * 获取：联系人名称
	 */

    public void setTongxunluName(String tongxunluName) {
        this.tongxunluName = tongxunluName;
    }
    /**
	 * 设置：联系人方式
	 */
    public String getTongxunluPhone() {
        return tongxunluPhone;
    }


    /**
	 * 获取：联系人方式
	 */

    public void setTongxunluPhone(String tongxunluPhone) {
        this.tongxunluPhone = tongxunluPhone;
    }
    /**
	 * 设置：联系人身份
	 */
    public String getTongxunluShenfen() {
        return tongxunluShenfen;
    }


    /**
	 * 获取：联系人身份
	 */

    public void setTongxunluShenfen(String tongxunluShenfen) {
        this.tongxunluShenfen = tongxunluShenfen;
    }
    /**
	 * 设置：备注
	 */
    public String getTongxunluContent() {
        return tongxunluContent;
    }


    /**
	 * 获取：备注
	 */

    public void setTongxunluContent(String tongxunluContent) {
        this.tongxunluContent = tongxunluContent;
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
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
