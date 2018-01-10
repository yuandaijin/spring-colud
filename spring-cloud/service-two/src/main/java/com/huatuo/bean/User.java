package com.huatuo.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    /** serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** id 主键. */
    private String id;

    /** 用户名. */
    private String userName;

    /** 密码. */
    private String password;

    /** 用户类型. */
    private Integer userType;

    /** 注册时间. */
    private Date registerTime;

    /** 是否有效 0 有效 1 无效. */
    private String validity;

    /** 创建时间. */
    private Date createDate;

    /** 更新时间. */
    private Date updateDate;

    /** 删除标记. */
    private String delFlag;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
    
    
    
    
}
