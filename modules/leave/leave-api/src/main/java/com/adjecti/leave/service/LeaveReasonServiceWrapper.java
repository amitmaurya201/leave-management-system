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
 * Provides a wrapper for {@link LeaveReasonService}.
 *
 * @author Brian Wing Shun Chan
 * @see LeaveReasonService
 * @generated
 */
public class LeaveReasonServiceWrapper
	implements LeaveReasonService, ServiceWrapper<LeaveReasonService> {

	public LeaveReasonServiceWrapper(LeaveReasonService leaveReasonService) {
		_leaveReasonService = leaveReasonService;
	}

	@Override
	public com.adjecti.leave.model.LeaveReason addLeaveReasonDetails(
		String reasonCode, String reasonDes) {

		return _leaveReasonService.addLeaveReasonDetails(reasonCode, reasonDes);
	}

	@Override
	public void deleteLeaveReason(long leaveReasonId)
		throws com.liferay.portal.kernel.exception.PortalException {

		_leaveReasonService.deleteLeaveReason(leaveReasonId);
	}

	@Override
	public java.util.List<com.adjecti.leave.model.LeaveReason>
		getLeaveReasonList() {

		return _leaveReasonService.getLeaveReasonList();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _leaveReasonService.getOSGiServiceIdentifier();
	}

	@Override
	public com.adjecti.leave.model.LeaveReason updateLeaveReason(
			long leaveReasonId, String leaveReasonCode,
			String leaveReasonDescription)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leaveReasonService.updateLeaveReason(
			leaveReasonId, leaveReasonCode, leaveReasonDescription);
	}

	@Override
	public LeaveReasonService getWrappedService() {
		return _leaveReasonService;
	}

	@Override
	public void setWrappedService(LeaveReasonService leaveReasonService) {
		_leaveReasonService = leaveReasonService;
	}

	private LeaveReasonService _leaveReasonService;

}