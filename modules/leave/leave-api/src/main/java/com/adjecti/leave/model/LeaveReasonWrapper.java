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
 * This class is a wrapper for {@link LeaveReason}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeaveReason
 * @generated
 */
public class LeaveReasonWrapper
	extends BaseModelWrapper<LeaveReason>
	implements LeaveReason, ModelWrapper<LeaveReason> {

	public LeaveReasonWrapper(LeaveReason leaveReason) {
		super(leaveReason);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("leaveReasonId", getLeaveReasonId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("leaveReasonCode", getLeaveReasonCode());
		attributes.put("leaveReasonDescription", getLeaveReasonDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long leaveReasonId = (Long)attributes.get("leaveReasonId");

		if (leaveReasonId != null) {
			setLeaveReasonId(leaveReasonId);
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

		String leaveReasonCode = (String)attributes.get("leaveReasonCode");

		if (leaveReasonCode != null) {
			setLeaveReasonCode(leaveReasonCode);
		}

		String leaveReasonDescription = (String)attributes.get(
			"leaveReasonDescription");

		if (leaveReasonDescription != null) {
			setLeaveReasonDescription(leaveReasonDescription);
		}
	}

	/**
	 * Returns the company ID of this leave reason.
	 *
	 * @return the company ID of this leave reason
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this leave reason.
	 *
	 * @return the create date of this leave reason
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this leave reason.
	 *
	 * @return the group ID of this leave reason
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the leave reason code of this leave reason.
	 *
	 * @return the leave reason code of this leave reason
	 */
	@Override
	public String getLeaveReasonCode() {
		return model.getLeaveReasonCode();
	}

	/**
	 * Returns the leave reason description of this leave reason.
	 *
	 * @return the leave reason description of this leave reason
	 */
	@Override
	public String getLeaveReasonDescription() {
		return model.getLeaveReasonDescription();
	}

	/**
	 * Returns the leave reason ID of this leave reason.
	 *
	 * @return the leave reason ID of this leave reason
	 */
	@Override
	public long getLeaveReasonId() {
		return model.getLeaveReasonId();
	}

	/**
	 * Returns the modified date of this leave reason.
	 *
	 * @return the modified date of this leave reason
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this leave reason.
	 *
	 * @return the primary key of this leave reason
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this leave reason.
	 *
	 * @return the user ID of this leave reason
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this leave reason.
	 *
	 * @return the user name of this leave reason
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this leave reason.
	 *
	 * @return the user uuid of this leave reason
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this leave reason.
	 *
	 * @return the uuid of this leave reason
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
	 * Sets the company ID of this leave reason.
	 *
	 * @param companyId the company ID of this leave reason
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this leave reason.
	 *
	 * @param createDate the create date of this leave reason
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this leave reason.
	 *
	 * @param groupId the group ID of this leave reason
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the leave reason code of this leave reason.
	 *
	 * @param leaveReasonCode the leave reason code of this leave reason
	 */
	@Override
	public void setLeaveReasonCode(String leaveReasonCode) {
		model.setLeaveReasonCode(leaveReasonCode);
	}

	/**
	 * Sets the leave reason description of this leave reason.
	 *
	 * @param leaveReasonDescription the leave reason description of this leave reason
	 */
	@Override
	public void setLeaveReasonDescription(String leaveReasonDescription) {
		model.setLeaveReasonDescription(leaveReasonDescription);
	}

	/**
	 * Sets the leave reason ID of this leave reason.
	 *
	 * @param leaveReasonId the leave reason ID of this leave reason
	 */
	@Override
	public void setLeaveReasonId(long leaveReasonId) {
		model.setLeaveReasonId(leaveReasonId);
	}

	/**
	 * Sets the modified date of this leave reason.
	 *
	 * @param modifiedDate the modified date of this leave reason
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this leave reason.
	 *
	 * @param primaryKey the primary key of this leave reason
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this leave reason.
	 *
	 * @param userId the user ID of this leave reason
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this leave reason.
	 *
	 * @param userName the user name of this leave reason
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this leave reason.
	 *
	 * @param userUuid the user uuid of this leave reason
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this leave reason.
	 *
	 * @param uuid the uuid of this leave reason
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
	protected LeaveReasonWrapper wrap(LeaveReason leaveReason) {
		return new LeaveReasonWrapper(leaveReason);
	}

}