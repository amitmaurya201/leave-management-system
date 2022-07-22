/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.adjecti.leave.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LeaveApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeaveApplication
 * @generated
 */
public class LeaveApplicationWrapper
	extends BaseModelWrapper<LeaveApplication>
	implements LeaveApplication, ModelWrapper<LeaveApplication> {

	public LeaveApplicationWrapper(LeaveApplication leaveApplication) {
		super(leaveApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("leaveApplicationId", getLeaveApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("leaveReasonId", getLeaveReasonId());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("leaveTypeId", getLeaveTypeId());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("startInHalfDay", isStartInHalfDay());
		attributes.put("endInHalfDay", isEndInHalfDay());
		attributes.put("actualJoiningDate", getActualJoiningDate());
		attributes.put("remark", getRemark());
		attributes.put("documentId", getDocumentId());
		attributes.put("status", getStatus());
		attributes.put("reportingManager", getReportingManager());
		attributes.put("joinInHalfDay", getJoinInHalfDay());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long leaveApplicationId = (Long)attributes.get("leaveApplicationId");

		if (leaveApplicationId != null) {
			setLeaveApplicationId(leaveApplicationId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long leaveReasonId = (Long)attributes.get("leaveReasonId");

		if (leaveReasonId != null) {
			setLeaveReasonId(leaveReasonId);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Long leaveTypeId = (Long)attributes.get("leaveTypeId");

		if (leaveTypeId != null) {
			setLeaveTypeId(leaveTypeId);
		}

		String startDate = (String)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		String endDate = (String)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		Boolean startInHalfDay = (Boolean)attributes.get("startInHalfDay");

		if (startInHalfDay != null) {
			setStartInHalfDay(startInHalfDay);
		}

		Boolean endInHalfDay = (Boolean)attributes.get("endInHalfDay");

		if (endInHalfDay != null) {
			setEndInHalfDay(endInHalfDay);
		}

		String actualJoiningDate = (String)attributes.get("actualJoiningDate");

		if (actualJoiningDate != null) {
			setActualJoiningDate(actualJoiningDate);
		}

		String remark = (String)attributes.get("remark");

		if (remark != null) {
			setRemark(remark);
		}

		Long documentId = (Long)attributes.get("documentId");

		if (documentId != null) {
			setDocumentId(documentId);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String reportingManager = (String)attributes.get("reportingManager");

		if (reportingManager != null) {
			setReportingManager(reportingManager);
		}

		String joinInHalfDay = (String)attributes.get("joinInHalfDay");

		if (joinInHalfDay != null) {
			setJoinInHalfDay(joinInHalfDay);
		}
	}

	/**
	 * Returns the actual joining date of this leave application.
	 *
	 * @return the actual joining date of this leave application
	 */
	@Override
	public String getActualJoiningDate() {
		return model.getActualJoiningDate();
	}

	/**
	 * Returns the company ID of this leave application.
	 *
	 * @return the company ID of this leave application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this leave application.
	 *
	 * @return the create date of this leave application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the document ID of this leave application.
	 *
	 * @return the document ID of this leave application
	 */
	@Override
	public long getDocumentId() {
		return model.getDocumentId();
	}

	/**
	 * Returns the employee ID of this leave application.
	 *
	 * @return the employee ID of this leave application
	 */
	@Override
	public long getEmployeeId() {
		return model.getEmployeeId();
	}

	/**
	 * Returns the end date of this leave application.
	 *
	 * @return the end date of this leave application
	 */
	@Override
	public String getEndDate() {
		return model.getEndDate();
	}

	/**
	 * Returns the end in half day of this leave application.
	 *
	 * @return the end in half day of this leave application
	 */
	@Override
	public boolean getEndInHalfDay() {
		return model.getEndInHalfDay();
	}

	/**
	 * Returns the group ID of this leave application.
	 *
	 * @return the group ID of this leave application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the join in half day of this leave application.
	 *
	 * @return the join in half day of this leave application
	 */
	@Override
	public String getJoinInHalfDay() {
		return model.getJoinInHalfDay();
	}

	/**
	 * Returns the leave application ID of this leave application.
	 *
	 * @return the leave application ID of this leave application
	 */
	@Override
	public long getLeaveApplicationId() {
		return model.getLeaveApplicationId();
	}

	/**
	 * Returns the leave reason ID of this leave application.
	 *
	 * @return the leave reason ID of this leave application
	 */
	@Override
	public long getLeaveReasonId() {
		return model.getLeaveReasonId();
	}

	/**
	 * Returns the leave type ID of this leave application.
	 *
	 * @return the leave type ID of this leave application
	 */
	@Override
	public long getLeaveTypeId() {
		return model.getLeaveTypeId();
	}

	/**
	 * Returns the modified date of this leave application.
	 *
	 * @return the modified date of this leave application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this leave application.
	 *
	 * @return the primary key of this leave application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the remark of this leave application.
	 *
	 * @return the remark of this leave application
	 */
	@Override
	public String getRemark() {
		return model.getRemark();
	}

	/**
	 * Returns the reporting manager of this leave application.
	 *
	 * @return the reporting manager of this leave application
	 */
	@Override
	public String getReportingManager() {
		return model.getReportingManager();
	}

	/**
	 * Returns the start date of this leave application.
	 *
	 * @return the start date of this leave application
	 */
	@Override
	public String getStartDate() {
		return model.getStartDate();
	}

	/**
	 * Returns the start in half day of this leave application.
	 *
	 * @return the start in half day of this leave application
	 */
	@Override
	public boolean getStartInHalfDay() {
		return model.getStartInHalfDay();
	}

	/**
	 * Returns the status of this leave application.
	 *
	 * @return the status of this leave application
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this leave application.
	 *
	 * @return the user ID of this leave application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this leave application.
	 *
	 * @return the user name of this leave application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this leave application.
	 *
	 * @return the user uuid of this leave application
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this leave application.
	 *
	 * @return the uuid of this leave application
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this leave application is end in half day.
	 *
	 * @return <code>true</code> if this leave application is end in half day; <code>false</code> otherwise
	 */
	@Override
	public boolean isEndInHalfDay() {
		return model.isEndInHalfDay();
	}

	/**
	 * Returns <code>true</code> if this leave application is start in half day.
	 *
	 * @return <code>true</code> if this leave application is start in half day; <code>false</code> otherwise
	 */
	@Override
	public boolean isStartInHalfDay() {
		return model.isStartInHalfDay();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the actual joining date of this leave application.
	 *
	 * @param actualJoiningDate the actual joining date of this leave application
	 */
	@Override
	public void setActualJoiningDate(String actualJoiningDate) {
		model.setActualJoiningDate(actualJoiningDate);
	}

	/**
	 * Sets the company ID of this leave application.
	 *
	 * @param companyId the company ID of this leave application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this leave application.
	 *
	 * @param createDate the create date of this leave application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the document ID of this leave application.
	 *
	 * @param documentId the document ID of this leave application
	 */
	@Override
	public void setDocumentId(long documentId) {
		model.setDocumentId(documentId);
	}

	/**
	 * Sets the employee ID of this leave application.
	 *
	 * @param employeeId the employee ID of this leave application
	 */
	@Override
	public void setEmployeeId(long employeeId) {
		model.setEmployeeId(employeeId);
	}

	/**
	 * Sets the end date of this leave application.
	 *
	 * @param endDate the end date of this leave application
	 */
	@Override
	public void setEndDate(String endDate) {
		model.setEndDate(endDate);
	}

	/**
	 * Sets whether this leave application is end in half day.
	 *
	 * @param endInHalfDay the end in half day of this leave application
	 */
	@Override
	public void setEndInHalfDay(boolean endInHalfDay) {
		model.setEndInHalfDay(endInHalfDay);
	}

	/**
	 * Sets the group ID of this leave application.
	 *
	 * @param groupId the group ID of this leave application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the join in half day of this leave application.
	 *
	 * @param joinInHalfDay the join in half day of this leave application
	 */
	@Override
	public void setJoinInHalfDay(String joinInHalfDay) {
		model.setJoinInHalfDay(joinInHalfDay);
	}

	/**
	 * Sets the leave application ID of this leave application.
	 *
	 * @param leaveApplicationId the leave application ID of this leave application
	 */
	@Override
	public void setLeaveApplicationId(long leaveApplicationId) {
		model.setLeaveApplicationId(leaveApplicationId);
	}

	/**
	 * Sets the leave reason ID of this leave application.
	 *
	 * @param leaveReasonId the leave reason ID of this leave application
	 */
	@Override
	public void setLeaveReasonId(long leaveReasonId) {
		model.setLeaveReasonId(leaveReasonId);
	}

	/**
	 * Sets the leave type ID of this leave application.
	 *
	 * @param leaveTypeId the leave type ID of this leave application
	 */
	@Override
	public void setLeaveTypeId(long leaveTypeId) {
		model.setLeaveTypeId(leaveTypeId);
	}

	/**
	 * Sets the modified date of this leave application.
	 *
	 * @param modifiedDate the modified date of this leave application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this leave application.
	 *
	 * @param primaryKey the primary key of this leave application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the remark of this leave application.
	 *
	 * @param remark the remark of this leave application
	 */
	@Override
	public void setRemark(String remark) {
		model.setRemark(remark);
	}

	/**
	 * Sets the reporting manager of this leave application.
	 *
	 * @param reportingManager the reporting manager of this leave application
	 */
	@Override
	public void setReportingManager(String reportingManager) {
		model.setReportingManager(reportingManager);
	}

	/**
	 * Sets the start date of this leave application.
	 *
	 * @param startDate the start date of this leave application
	 */
	@Override
	public void setStartDate(String startDate) {
		model.setStartDate(startDate);
	}

	/**
	 * Sets whether this leave application is start in half day.
	 *
	 * @param startInHalfDay the start in half day of this leave application
	 */
	@Override
	public void setStartInHalfDay(boolean startInHalfDay) {
		model.setStartInHalfDay(startInHalfDay);
	}

	/**
	 * Sets the status of this leave application.
	 *
	 * @param status the status of this leave application
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this leave application.
	 *
	 * @param userId the user ID of this leave application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this leave application.
	 *
	 * @param userName the user name of this leave application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this leave application.
	 *
	 * @param userUuid the user uuid of this leave application
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this leave application.
	 *
	 * @param uuid the uuid of this leave application
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected LeaveApplicationWrapper wrap(LeaveApplication leaveApplication) {
		return new LeaveApplicationWrapper(leaveApplication);
	}

}