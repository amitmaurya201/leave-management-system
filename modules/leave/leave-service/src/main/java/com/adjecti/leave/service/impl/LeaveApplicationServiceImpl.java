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

package com.adjecti.leave.service.impl;

import com.adjecti.leave.model.LeaveApplication;
import com.adjecti.leave.service.base.LeaveApplicationServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the leave application remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.adjecti.leave.service.LeaveApplicationService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeaveApplicationServiceBaseImpl
 */
@Component(property = { "json.web.service.context.name=leave",
		"json.web.service.context.path=LeaveApplication" }, service = AopService.class)
public class LeaveApplicationServiceImpl extends LeaveApplicationServiceBaseImpl {

	public LeaveApplication addLeaveApplicationDetail(long leaveReasonId, long employeeId, long leaveTypeId,
			String startDate, String endDate, boolean startInHalfDay, boolean endInHalfDay, String actualJoiningDate,
			String remark, long documentId, String status, String reportingManager, String joinInHalfDay) {

		long leaveApplicationId = counterLocalService.increment(LeaveApplication.class.getName());
		LeaveApplication leaveApplication = leaveApplicationLocalService.createLeaveApplication(leaveApplicationId);
		leaveApplication.setLeaveApplicationId(leaveApplicationId);
		leaveApplication.setEmployeeId(employeeId);
		leaveApplication.setLeaveReasonId(leaveReasonId);
		leaveApplication.setLeaveTypeId(leaveTypeId);
		leaveApplication.setStartDate(startDate);
		leaveApplication.setEndDate(endDate);
		leaveApplication.setStartInHalfDay(startInHalfDay);
		leaveApplication.setEndInHalfDay(endInHalfDay);
		leaveApplication.setActualJoiningDate(actualJoiningDate);
		leaveApplication.setRemark(remark);
		leaveApplication.setDocumentId(documentId);
		leaveApplication.setStatus(status);
		leaveApplication.setReportingManager(reportingManager);
		leaveApplication.setJoinInHalfDay(joinInHalfDay);
		leaveApplicationLocalService.addLeaveApplication(leaveApplication);

		return leaveApplication;
	}

	public List<LeaveApplication> getLeaveApplicationList() {

		return leaveApplicationLocalService.getLeaveApplications(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use
	 * <code>com.adjecti.leave.service.LeaveApplicationServiceUtil</code> to access
	 * the leave application remote service.
	 */
}