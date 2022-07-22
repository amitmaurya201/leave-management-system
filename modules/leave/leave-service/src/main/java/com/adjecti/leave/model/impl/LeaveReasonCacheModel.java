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

package com.adjecti.leave.model.impl;

import com.adjecti.leave.model.LeaveReason;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LeaveReason in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LeaveReasonCacheModel
	implements CacheModel<LeaveReason>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof LeaveReasonCacheModel)) {
			return false;
		}

		LeaveReasonCacheModel leaveReasonCacheModel =
			(LeaveReasonCacheModel)object;

		if (leaveReasonId == leaveReasonCacheModel.leaveReasonId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, leaveReasonId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", leaveReasonId=");
		sb.append(leaveReasonId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", leaveReasonCode=");
		sb.append(leaveReasonCode);
		sb.append(", leaveReasonDescription=");
		sb.append(leaveReasonDescription);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LeaveReason toEntityModel() {
		LeaveReasonImpl leaveReasonImpl = new LeaveReasonImpl();

		if (uuid == null) {
			leaveReasonImpl.setUuid("");
		}
		else {
			leaveReasonImpl.setUuid(uuid);
		}

		leaveReasonImpl.setLeaveReasonId(leaveReasonId);
		leaveReasonImpl.setGroupId(groupId);
		leaveReasonImpl.setCompanyId(companyId);
		leaveReasonImpl.setUserId(userId);

		if (userName == null) {
			leaveReasonImpl.setUserName("");
		}
		else {
			leaveReasonImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			leaveReasonImpl.setCreateDate(null);
		}
		else {
			leaveReasonImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			leaveReasonImpl.setModifiedDate(null);
		}
		else {
			leaveReasonImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (leaveReasonCode == null) {
			leaveReasonImpl.setLeaveReasonCode("");
		}
		else {
			leaveReasonImpl.setLeaveReasonCode(leaveReasonCode);
		}

		if (leaveReasonDescription == null) {
			leaveReasonImpl.setLeaveReasonDescription("");
		}
		else {
			leaveReasonImpl.setLeaveReasonDescription(leaveReasonDescription);
		}

		leaveReasonImpl.resetOriginalValues();

		return leaveReasonImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		leaveReasonId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		leaveReasonCode = objectInput.readUTF();
		leaveReasonDescription = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(leaveReasonId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (leaveReasonCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(leaveReasonCode);
		}

		if (leaveReasonDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(leaveReasonDescription);
		}
	}

	public String uuid;
	public long leaveReasonId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String leaveReasonCode;
	public String leaveReasonDescription;

}