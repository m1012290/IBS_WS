package com.shrinfo.ibs.vo.business;

import java.util.List;

public class UserVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3203642603434696942L;

	private Long userId;

	private String loginName;

	private String password;

	private String desc;

	private String name;

	private String contactNum;

	private String email;

	private BranchVO branch;

	private Boolean freezeFlag;

	private String status;

	private List<UserRoleVO> roles;

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the loginName
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * @param loginName
	 *            the loginName to set
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc
	 *            the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the contactNum
	 */
	public String getContactNum() {
		return contactNum;
	}

	/**
	 * @param contactNum
	 *            the contactNum to set
	 */
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the branch
	 */
	public BranchVO getBranch() {
		return branch;
	}

	/**
	 * @param branch
	 *            the branch to set
	 */
	public void setBranch(BranchVO branch) {
		this.branch = branch;
	}

	/**
	 * @return the freezeFlag
	 */
	public Boolean getFreezeFlag() {
		return freezeFlag;
	}

	/**
	 * @param freezeFlag
	 *            the freezeFlag to set
	 */
	public void setFreezeFlag(Boolean freezeFlag) {
		this.freezeFlag = freezeFlag;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the roles
	 */
	public List<UserRoleVO> getRoles() {
		return roles;
	}

	/**
	 * @param roles
	 *            the roles to set
	 */
	public void setRoles(List<UserRoleVO> roles) {
		this.roles = roles;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
