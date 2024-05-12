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
 * 通讯录
 *
 * @author 
 * @email
 */
@TableName("tongxunlu")
public class TongxunluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TongxunluEntity() {

	}

	public TongxunluEntity(T t) {
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
     * 联系人名称
     */
    @ColumnInfo(comment="联系人名称",type="varchar(200)")
    @TableField(value = "tongxunlu_name")

    private String tongxunluName;


    /**
     * 联系人方式
     */
    @ColumnInfo(comment="联系人方式",type="varchar(200)")
    @TableField(value = "tongxunlu_phone")

    private String tongxunluPhone;


    /**
     * 联系人身份
     */
    @ColumnInfo(comment="联系人身份",type="varchar(200)")
    @TableField(value = "tongxunlu_shenfen")

    private String tongxunluShenfen;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="text")
    @TableField(value = "tongxunlu_content")

    private String tongxunluContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="添加时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间  listShow
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
	 * 获取：联系人名称
	 */
    public String getTongxunluName() {
        return tongxunluName;
    }
    /**
	 * 设置：联系人名称
	 */

    public void setTongxunluName(String tongxunluName) {
        this.tongxunluName = tongxunluName;
    }
    /**
	 * 获取：联系人方式
	 */
    public String getTongxunluPhone() {
        return tongxunluPhone;
    }
    /**
	 * 设置：联系人方式
	 */

    public void setTongxunluPhone(String tongxunluPhone) {
        this.tongxunluPhone = tongxunluPhone;
    }
    /**
	 * 获取：联系人身份
	 */
    public String getTongxunluShenfen() {
        return tongxunluShenfen;
    }
    /**
	 * 设置：联系人身份
	 */

    public void setTongxunluShenfen(String tongxunluShenfen) {
        this.tongxunluShenfen = tongxunluShenfen;
    }
    /**
	 * 获取：备注
	 */
    public String getTongxunluContent() {
        return tongxunluContent;
    }
    /**
	 * 设置：备注
	 */

    public void setTongxunluContent(String tongxunluContent) {
        this.tongxunluContent = tongxunluContent;
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
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Tongxunlu{" +
            ", id=" + id +
            ", tongxunluName=" + tongxunluName +
            ", tongxunluPhone=" + tongxunluPhone +
            ", tongxunluShenfen=" + tongxunluShenfen +
            ", tongxunluContent=" + tongxunluContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
