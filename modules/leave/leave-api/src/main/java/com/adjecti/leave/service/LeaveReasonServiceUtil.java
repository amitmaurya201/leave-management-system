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

import com.adjecti.leave.model.LeaveReason;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

/**
 * Provides the remote service utility for LeaveReason. This utility wraps
 * <code>com.adjecti.leave.service.impl.LeaveReasonServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see LeaveReasonService
 * @generated
 */
public class LeaveReasonServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.adjecti.leave.service.impl.LeaveReasonServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static LeaveReason addLeaveReasonDetails(
		String reasonCode, String reasonDes) {

		return getService().addLeaveReasonDetails(reasonCode, reasonDes);
	}

	public static void deleteLeaveReason(long leaveReasonId)
		throws PortalException {

		getService().deleteLeaveReason(leaveReasonId);
	}

	public static List<LeaveReason> getLeaveReasonList() {
		return getService().getLeaveReasonList();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static LeaveReason updateLeaveReason(
			long leaveReasonId, String leaveReasonCode,
			String leaveReasonDescription)
		throws PortalException {

		return getService().updateLeaveReason(
			leaveReasonId, leaveReasonCode, leaveReasonDescription);
	}

	public static LeaveReasonService getService() {
		return _service;
	}

	private static volatile LeaveReasonService _service;

}