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
 * Provides a wrapper for {@link LeaveTypeService}.
 *
 * @author Brian Wing Shun Chan
 * @see LeaveTypeService
 * @generated
 */
public class LeaveTypeServiceWrapper
	implements LeaveTypeService, ServiceWrapper<LeaveTypeService> {

	public LeaveTypeServiceWrapper(LeaveTypeService leaveTypeService) {
		_leaveTypeService = leaveTypeService;
	}

	@Override
	public com.adjecti.leave.model.LeaveType createLeaveType(
			String leaveCode, String leaveName, int count)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _leaveTypeService.createLeaveType(leaveCode, leaveName, count);
	}

	@Override
	public void deleteLeaveType(long leaveTypeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		_leaveTypeService.deleteLeaveType(leaveTypeId);
	}

	@Override
	public com.adjecti.leave.model.LeaveType getLeaveTypeById(long leaveTypeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leaveTypeService.getLeaveTypeById(leaveTypeId);
	}

	@Override
	public java.util.List<com.adjecti.leave.model.LeaveType>
		getLeaveTypeList() {

		return _leaveTypeService.getLeaveTypeList();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _leaveTypeService.getOSGiServiceIdentifier();
	}

	@Override
	public com.adjecti.leave.model.LeaveType updateLeaveType(
			String leaveCode, long leaveTypeId, String leaveName, int count)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _leaveTypeService.updateLeaveType(
			leaveCode, leaveTypeId, leaveName, count);
	}

	@Override
	public LeaveTypeService getWrappedService() {
		return _leaveTypeService;
	}

	@Override
	public void setWrappedService(LeaveTypeService leaveTypeService) {
		_leaveTypeService = leaveTypeService;
	}

	private LeaveTypeService _leaveTypeService;

}