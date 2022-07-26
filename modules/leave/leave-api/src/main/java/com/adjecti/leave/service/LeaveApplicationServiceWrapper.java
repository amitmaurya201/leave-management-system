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

package com.adjecti.leave.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LeaveApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see LeaveApplicationService
 * @generated
 */
public class LeaveApplicationServiceWrapper
	implements LeaveApplicationService,
			   ServiceWrapper<LeaveApplicationService> {

	public LeaveApplicationServiceWrapper(
		LeaveApplicationService leaveApplicationService) {

		_leaveApplicationService = leaveApplicationService;
	}

	@Override
	public com.adjecti.leave.model.LeaveApplication addLeaveApplicationDetail(
		long leaveReasonId, long employeeId, long leaveTypeId, String startDate,
		String endDate, boolean startInHalfDay, boolean endInHalfDay,
		String actualJoiningDate, String remark, long documentId, String status,
		String reportingManager, String joinInHalfDay) {

		return _leaveApplicationService.addLeaveApplicationDetail(
			leaveReasonId, employeeId, leaveTypeId, startDate, endDate,
			startInHalfDay, endInHalfDay, actualJoiningDate, remark, documentId,
			status, reportingManager, joinInHalfDay);
	}

	@Override
	public java.util.List<com.adjecti.leave.model.LeaveApplication>
		getLeaveApplicationList() {

		return _leaveApplicationService.getLeaveApplicationList();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _leaveApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public LeaveApplicationService getWrappedService() {
		return _leaveApplicationService;
	}

	@Override
	public void setWrappedService(
		LeaveApplicationService leaveApplicationService) {

		_leaveApplicationService = leaveApplicationService;
	}

	private LeaveApplicationService _leaveApplicationService;

}