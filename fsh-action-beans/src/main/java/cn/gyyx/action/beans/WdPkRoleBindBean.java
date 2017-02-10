/**
  * -------------------------------------------------------------------------
  * (C) Copyright Gyyx Tec Corp. 1996-2017 - All Rights Reserved
  * @版权所有：北京光宇在线科技有限责任公司
  * @项目名称：fsh-action-ui
  * @作者：fengshuhao
  * @联系方式：fengshuhao@gyyx.cn
  * @创建时间：2017年2月10日 下午4:14:22
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package cn.gyyx.action.beans;

import java.util.Date;


public class WdPkRoleBindBean {

	 private int code;
	 private int actionCode;
	 private String account;
	 private int userId;
	 private int area;
	 private int ImageNumber;
	 private int serverId ;
	 private String serverName;
	 private String roleName;
	 private Date createAt;
	 
	public int getImageNumber() {
		return ImageNumber;
	}
	public void setImageNumber(int imageNumber) {
		ImageNumber = imageNumber;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getActionCode() {
		return actionCode;
	}
	public void setActionCode(int actionCode) {
		this.actionCode = actionCode;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getServerId() {
		return serverId;
	}
	public void setServerId(int serverId) {
		this.serverId = serverId;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	 
}
