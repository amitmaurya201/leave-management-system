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
 * This class is used by SOAP remote services, specifically {@link com.adjecti.leave.service.http.LeaveTypeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class LeaveTypeSoap implements Serializable {

	public static LeaveTypeSoap toSoapModel(LeaveType model) {
		LeaveTypeSoap soapModel = new LeaveTypeSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setLeaveTypeId(model.getLeaveTypeId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setLeaveCode(model.getLeaveCode());
		soapModel.setLeaveName(model.getLeaveName());
		soapModel.setCount(model.getCount());

		return soapModel;
	}

	public static LeaveTypeSoap[] toSoapModels(LeaveType[] models) {
		LeaveTypeSoap[] soapModels = new LeaveTypeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LeaveTypeSoap[][] toSoapModels(LeaveType[][] models) {
		LeaveTypeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LeaveTypeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LeaveTypeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LeaveTypeSoap[] toSoapModels(List<LeaveType> models) {
		List<LeaveTypeSoap> soapModels = new ArrayList<LeaveTypeSoap>(
			models.size());

		for (LeaveType model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LeaveTypeSoap[soapModels.size()]);
	}

	public LeaveTypeSoap() {
	}

	public long getPrimaryKey() {
		return _leaveTypeId;
	}

	public void setPrimaryKey(long pk) {
		setLeaveTypeId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getLeaveTypeId() {
		return _leaveTypeId;
	}

	public void setLeaveTypeId(long leaveTypeId) {
		_leaveTypeId = leaveTypeId;
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

	public String getLeaveCode() {
		return _leaveCode;
	}

	public void setLeaveCode(String leaveCode) {
		_leaveCode = leaveCode;
	}

	public String getLeaveName() {
		return _leaveName;
	}

	public void setLeaveName(String leaveName) {
		_leaveName = leaveName;
	}

	public int getCount() {
		return _count;
	}

	public void setCount(int count) {
		_count = count;
	}

	private String _uuid;
	private long _leaveTypeId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _leaveCode;
	private String _leaveName;
	private int _count;

}