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

import com.adjecti.leave.model.LeaveApplication;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LeaveApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LeaveApplicationCacheModel
	implements CacheModel<LeaveApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof LeaveApplicationCacheModel)) {
			return false;
		}

		LeaveApplicationCacheModel leaveApplicationCacheModel =
			(LeaveApplicationCacheModel)object;

		if (leaveApplicationId ==
				leaveApplicationCacheModel.leaveApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, leaveApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", leaveApplicationId=");
		sb.append(leaveApplicationId);
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
		sb.append(", leaveReasonId=");
		sb.append(leaveReasonId);
		sb.append(", employeeId=");
		sb.append(employeeId);
		sb.append(", leaveTypeId=");
		sb.append(leaveTypeId);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append(", startInHalfDay=");
		sb.append(startInHalfDay);
		sb.append(", endInHalfDay=");
		sb.append(endInHalfDay);
		sb.append(", actualJoiningDate=");
		sb.append(actualJoiningDate);
		sb.append(", remark=");
		sb.append(remark);
		sb.append(", documentId=");
		sb.append(documentId);
		sb.append(", status=");
		sb.append(status);
		sb.append(", reportingManager=");
		sb.append(reportingManager);
		sb.append(", joinInHalfDay=");
		sb.append(joinInHalfDay);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LeaveApplication toEntityModel() {
		LeaveApplicationImpl leaveApplicationImpl = new LeaveApplicationImpl();

		if (uuid == null) {
			leaveApplicationImpl.setUuid("");
		}
		else {
			leaveApplicationImpl.setUuid(uuid);
		}

		leaveApplicationImpl.setLeaveApplicationId(leaveApplicationId);
		leaveApplicationImpl.setGroupId(groupId);
		leaveApplicationImpl.setCompanyId(companyId);
		leaveApplicationImpl.setUserId(userId);

		if (userName == null) {
			leaveApplicationImpl.setUserName("");
		}
		else {
			leaveApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			leaveApplicationImpl.setCreateDate(null);
		}
		else {
			leaveApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			leaveApplicationImpl.setModifiedDate(null);
		}
		else {
			leaveApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		leaveApplicationImpl.setLeaveReasonId(leaveReasonId);
		leaveApplicationImpl.setEmployeeId(employeeId);
		leaveApplicationImpl.setLeaveTypeId(leaveTypeId);

		if (startDate == null) {
			leaveApplicationImpl.setStartDate("");
		}
		else {
			leaveApplicationImpl.setStartDate(startDate);
		}

		if (endDate == null) {
			leaveApplicationImpl.setEndDate("");
		}
		else {
			leaveApplicationImpl.setEndDate(endDate);
		}

		leaveApplicationImpl.setStartInHalfDay(startInHalfDay);
		leaveApplicationImpl.setEndInHalfDay(endInHalfDay);

		if (actualJoiningDate == null) {
			leaveApplicationImpl.setActualJoiningDate("");
		}
		else {
			leaveApplicationImpl.setActualJoiningDate(actualJoiningDate);
		}

		if (remark == null) {
			leaveApplicationImpl.setRemark("");
		}
		else {
			leaveApplicationImpl.setRemark(remark);
		}

		leaveApplicationImpl.setDocumentId(documentId);

		if (status == null) {
			leaveApplicationImpl.setStatus("");
		}
		else {
			leaveApplicationImpl.setStatus(status);
		}

		if (reportingManager == null) {
			leaveApplicationImpl.setReportingManager("");
		}
		else {
			leaveApplicationImpl.setReportingManager(reportingManager);
		}

		if (joinInHalfDay == null) {
			leaveApplicationImpl.setJoinInHalfDay("");
		}
		else {
			leaveApplicationImpl.setJoinInHalfDay(joinInHalfDay);
		}

		leaveApplicationImpl.resetOriginalValues();

		return leaveApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		leaveApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		leaveReasonId = objectInput.readLong();

		employeeId = objectInput.readLong();

		leaveTypeId = objectInput.readLong();
		startDate = objectInput.readUTF();
		endDate = objectInput.readUTF();

		startInHalfDay = objectInput.readBoolean();

		endInHalfDay = objectInput.readBoolean();
		actualJoiningDate = objectInput.readUTF();
		remark = objectInput.readUTF();

		documentId = objectInput.readLong();
		status = objectInput.readUTF();
		reportingManager = objectInput.readUTF();
		joinInHalfDay = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(leaveApplicationId);

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

		objectOutput.writeLong(leaveReasonId);

		objectOutput.writeLong(employeeId);

		objectOutput.writeLong(leaveTypeId);

		if (startDate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(startDate);
		}

		if (endDate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(endDate);
		}

		objectOutput.writeBoolean(startInHalfDay);

		objectOutput.writeBoolean(endInHalfDay);

		if (actualJoiningDate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(actualJoiningDate);
		}

		if (remark == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(remark);
		}

		objectOutput.writeLong(documentId);

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (reportingManager == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reportingManager);
		}

		if (joinInHalfDay == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(joinInHalfDay);
		}
	}

	public String uuid;
	public long leaveApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long leaveReasonId;
	public long employeeId;
	public long leaveTypeId;
	public String startDate;
	public String endDate;
	public boolean startInHalfDay;
	public boolean endInHalfDay;
	public String actualJoiningDate;
	public String remark;
	public long documentId;
	public String status;
	public String reportingManager;
	public String joinInHalfDay;

}