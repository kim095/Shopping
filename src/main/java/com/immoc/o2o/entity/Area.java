package com.immoc.o2o.entity;

import java.util.Date;

//区域类     ctrl+shift+f  格式化代码
public class Area {
  private Integer areaId;//ID
  private String areaName;//区域名称
  private Integer priority;//权重
  private Date createTime;//创建时间
  public Integer getAreaId() {
	return areaId;
}
public void setAreaId(Integer areaId) {
	this.areaId = areaId;
}
public String getAreaName() {
	return areaName;
}
public void setAreaName(String areaName) {
	this.areaName = areaName;
}
public Integer getPriority() {
	return priority;
}
public void setPriority(Integer priority) {
	this.priority = priority;
}
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}
public Date getLastEditTime() {
	return lastEditTime;
}
public void setLastEditTime(Date lastEditTime) {
	this.lastEditTime = lastEditTime;
}
private Date lastEditTime;//更新时间
}
