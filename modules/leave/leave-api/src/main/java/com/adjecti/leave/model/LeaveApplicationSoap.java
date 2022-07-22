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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.adjecti.leave.service.http.LeaveApplicationServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class LeaveApplicationSoap implements Serializable {

	public static LeaveApplicationSoap toSoapModel(LeaveApplication model) {
		LeaveApplicationSoap soapModel = new LeaveApplicationSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setLeaveApplicationId(model.getLeaveApplicationId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setLeaveReasonId(model.getLeaveReasonId());
		soapModel.setEmployeeId(model.getEmployeeId());
		soapModel.setLeaveTypeId(model.getLeaveTypeId());
		soapModel.setStartDate(model.getStartDate());
		soapModel.setEndDate(model.getEndDate());
		soapModel.setStartInHalfDay(model.isStartInHalfDay());
		soapModel.setEndInHalfDay(model.isEndInHalfDay());
		soapModel.setActualJoiningDate(model.getActualJoiningDate());
		soapModel.setRemark(model.getRemark());
		soapModel.setDocumentId(model.getDocumentId());
		soapModel.setStatus(model.getStatus());
		soapModel.setReportingManager(model.getReportingManager());
		soapModel.setJoinInHalfDay(model.getJoinInHalfDay());

		return soapModel;
	}

	public static LeaveApplicationSoap[] toSoapModels(
		LeaveApplication[] models) {

		LeaveApplicationSoap[] soapModels =
			new LeaveApplicationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LeaveApplicationSoap[][] toSoapModels(
		LeaveApplication[][] models) {

		LeaveApplicationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new LeaveApplicationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LeaveApplicationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LeaveApplicationSoap[] toSoapModels(
		List<LeaveApplication> models) {

		List<LeaveApplicationSoap> soapModels =
			new ArrayList<LeaveApplicationSoap>(models.size());

		for (LeaveApplication model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LeaveApplicationSoap[soapModels.size()]);
	}

	public LeaveApplicationSoap() {
	}

	public long getPrimaryKey() {
		return _leaveApplicationId;
	}

	public void setPrimaryKey(long pk) {
		setLeaveApplicationId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getLeaveApplicationId() {
		return _leaveApplicationId;
	}

	public void setLeaveApplicationId(long leaveApplicationId) {
		_leaveApplicationId = leaveApplicationId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getLeaveReasonId() {
		return _leaveReasonId;
	}

	public void setLeaveReasonId(long leaveReasonId) {
		_leaveReasonId = leaveReasonId;
	}

	public long getEmployeeId() {
		return _employeeId;
	}

	public void setEmployeeId(long employeeId) {
		_employeeId = employeeId;
	}

	public long getLeaveTypeId() {
		return _leaveTypeId;
	}

	public void setLeaveTypeId(long leaveTypeId) {
		_leaveTypeId = leaveTypeId;
	}

	public String getStartDate() {
		return _startDate;
	}

	public void setStartDate(String startDate) {
		_startDate = startDate;
	}

	public String getEndDate() {
		return _endDate;
	}

	public void setEndDate(String endDate) {
		_endDate = endDate;
	}

	public boolean getStartInHalfDay() {
		return _startInHalfDay;
	}

	public boolean isStartInHalfDay() {
		return _startInHalfDay;
	}

	public void setStartInHalfDay(boolean startInHalfDay) {
		_startInHalfDay = startInHalfDay;
	}

	public boolean getEndInHalfDay() {
		return _endInHalfDay;
	}

	public boolean isEndInHalfDay() {
		return _endInHalfDay;
	}

	public void setEndInHalfDay(boolean endInHalfDay) {
		_endInHalfDay = endInHalfDay;
	}

	public String getActualJoiningDate() {
		return _actualJoiningDate;
	}

	public void setActualJoiningDate(String actualJoiningDate) {
		_actualJoiningDate = actualJoiningDate;
	}

	public String getRemark() {
		return _remark;
	}

	public void setRemark(String remark) {
		_remark = remark;
	}

	public long getDocumentId() {
		return _documentId;
	}

	public void setDocumentId(long documentId) {
		_documentId = documentId;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public String getReportingManager() {
		return _reportingManager;
	}

	public void setReportingManager(String reportingManager) {
		_reportingManager = reportingManager;
	}

	public String getJoinInHalfDay() {
		return _joinInHalfDay;
	}

	public void setJoinInHalfDay(String joinInHalfDay) {
		_joinInHalfDay = joinInHalfDay;
	}

	private String _uuid;
	private long _leaveApplicationId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _leaveReasonId;
	private long _employeeId;
	private long _leaveTypeId;
	private String _startDate;
	private String _endDate;
	private boolean _startInHalfDay;
	private boolean _endInHalfDay;
	private String _actualJoiningDate;
	private String _remark;
	private long _documentId;
	private String _status;
	private String _reportingManager;
	private String _joinInHalfDay;

}