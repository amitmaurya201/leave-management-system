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
 * This class is a wrapper for {@link LeaveType}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeaveType
 * @generated
 */
public class LeaveTypeWrapper
	extends BaseModelWrapper<LeaveType>
	implements LeaveType, ModelWrapper<LeaveType> {

	public LeaveTypeWrapper(LeaveType leaveType) {
		super(leaveType);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("leaveTypeId", getLeaveTypeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("leaveCode", getLeaveCode());
		attributes.put("leaveName", getLeaveName());
		attributes.put("count", getCount());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long leaveTypeId = (Long)attributes.get("leaveTypeId");

		if (leaveTypeId != null) {
			setLeaveTypeId(leaveTypeId);
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

		String leaveCode = (String)attributes.get("leaveCode");

		if (leaveCode != null) {
			setLeaveCode(leaveCode);
		}

		String leaveName = (String)attributes.get("leaveName");

		if (leaveName != null) {
			setLeaveName(leaveName);
		}

		Integer count = (Integer)attributes.get("count");

		if (count != null) {
			setCount(count);
		}
	}

	/**
	 * Returns the company ID of this leave type.
	 *
	 * @return the company ID of this leave type
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the count of this leave type.
	 *
	 * @return the count of this leave type
	 */
	@Override
	public int getCount() {
		return model.getCount();
	}

	/**
	 * Returns the create date of this leave type.
	 *
	 * @return the create date of this leave type
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this leave type.
	 *
	 * @return the group ID of this leave type
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the leave code of this leave type.
	 *
	 * @return the leave code of this leave type
	 */
	@Override
	public String getLeaveCode() {
		return model.getLeaveCode();
	}

	/**
	 * Returns the leave name of this leave type.
	 *
	 * @return the leave name of this leave type
	 */
	@Override
	public String getLeaveName() {
		return model.getLeaveName();
	}

	/**
	 * Returns the leave type ID of this leave type.
	 *
	 * @return the leave type ID of this leave type
	 */
	@Override
	public long getLeaveTypeId() {
		return model.getLeaveTypeId();
	}

	/**
	 * Returns the modified date of this leave type.
	 *
	 * @return the modified date of this leave type
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this leave type.
	 *
	 * @return the primary key of this leave type
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this leave type.
	 *
	 * @return the user ID of this leave type
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this leave type.
	 *
	 * @return the user name of this leave type
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this leave type.
	 *
	 * @return the user uuid of this leave type
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this leave type.
	 *
	 * @return the uuid of this leave type
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this leave type.
	 *
	 * @param companyId the company ID of this leave type
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the count of this leave type.
	 *
	 * @param count the count of this leave type
	 */
	@Override
	public void setCount(int count) {
		model.setCount(count);
	}

	/**
	 * Sets the create date of this leave type.
	 *
	 * @param createDate the create date of this leave type
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this leave type.
	 *
	 * @param groupId the group ID of this leave type
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the leave code of this leave type.
	 *
	 * @param leaveCode the leave code of this leave type
	 */
	@Override
	public void setLeaveCode(String leaveCode) {
		model.setLeaveCode(leaveCode);
	}

	/**
	 * Sets the leave name of this leave type.
	 *
	 * @param leaveName the leave name of this leave type
	 */
	@Override
	public void setLeaveName(String leaveName) {
		model.setLeaveName(leaveName);
	}

	/**
	 * Sets the leave type ID of this leave type.
	 *
	 * @param leaveTypeId the leave type ID of this leave type
	 */
	@Override
	public void setLeaveTypeId(long leaveTypeId) {
		model.setLeaveTypeId(leaveTypeId);
	}

	/**
	 * Sets the modified date of this leave type.
	 *
	 * @param modifiedDate the modified date of this leave type
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this leave type.
	 *
	 * @param primaryKey the primary key of this leave type
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this leave type.
	 *
	 * @param userId the user ID of this leave type
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this leave type.
	 *
	 * @param userName the user name of this leave type
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this leave type.
	 *
	 * @param userUuid the user uuid of this leave type
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this leave type.
	 *
	 * @param uuid the uuid of this leave type
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
	protected LeaveTypeWrapper wrap(LeaveType leaveType) {
		return new LeaveTypeWrapper(leaveType);
	}

}