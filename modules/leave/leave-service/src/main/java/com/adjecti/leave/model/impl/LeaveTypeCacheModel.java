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

import com.adjecti.leave.model.LeaveType;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LeaveType in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LeaveTypeCacheModel
	implements CacheModel<LeaveType>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof LeaveTypeCacheModel)) {
			return false;
		}

		LeaveTypeCacheModel leaveTypeCacheModel = (LeaveTypeCacheModel)object;

		if (leaveTypeId == leaveTypeCacheModel.leaveTypeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, leaveTypeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", leaveTypeId=");
		sb.append(leaveTypeId);
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
		sb.append(", leaveCode=");
		sb.append(leaveCode);
		sb.append(", leaveName=");
		sb.append(leaveName);
		sb.append(", count=");
		sb.append(count);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LeaveType toEntityModel() {
		LeaveTypeImpl leaveTypeImpl = new LeaveTypeImpl();

		if (uuid == null) {
			leaveTypeImpl.setUuid("");
		}
		else {
			leaveTypeImpl.setUuid(uuid);
		}

		leaveTypeImpl.setLeaveTypeId(leaveTypeId);
		leaveTypeImpl.setGroupId(groupId);
		leaveTypeImpl.setCompanyId(companyId);
		leaveTypeImpl.setUserId(userId);

		if (userName == null) {
			leaveTypeImpl.setUserName("");
		}
		else {
			leaveTypeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			leaveTypeImpl.setCreateDate(null);
		}
		else {
			leaveTypeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			leaveTypeImpl.setModifiedDate(null);
		}
		else {
			leaveTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (leaveCode == null) {
			leaveTypeImpl.setLeaveCode("");
		}
		else {
			leaveTypeImpl.setLeaveCode(leaveCode);
		}

		if (leaveName == null) {
			leaveTypeImpl.setLeaveName("");
		}
		else {
			leaveTypeImpl.setLeaveName(leaveName);
		}

		leaveTypeImpl.setCount(count);

		leaveTypeImpl.resetOriginalValues();

		return leaveTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		leaveTypeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		leaveCode = objectInput.readUTF();
		leaveName = objectInput.readUTF();

		count = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(leaveTypeId);

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

		if (leaveCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(leaveCode);
		}

		if (leaveName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(leaveName);
		}

		objectOutput.writeInt(count);
	}

	public String uuid;
	public long leaveTypeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String leaveCode;
	public String leaveName;
	public int count;

}