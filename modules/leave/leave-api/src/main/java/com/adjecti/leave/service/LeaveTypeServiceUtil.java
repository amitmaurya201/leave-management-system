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

import com.adjecti.leave.model.LeaveType;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.List;

/**
 * Provides the remote service utility for LeaveType. This utility wraps
 * <code>com.adjecti.leave.service.impl.LeaveTypeServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see LeaveTypeService
 * @generated
 */
public class LeaveTypeServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.adjecti.leave.service.impl.LeaveTypeServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static LeaveType createLeaveType(
			String leaveCode, String leaveName, int count)
		throws PortalException, SystemException {

		return getService().createLeaveType(leaveCode, leaveName, count);
	}

	public static void deleteLeaveType(long leaveTypeId)
		throws PortalException {

		getService().deleteLeaveType(leaveTypeId);
	}

	public static LeaveType getLeaveTypeById(long leaveTypeId)
		throws PortalException {

		return getService().getLeaveTypeById(leaveTypeId);
	}

	public static List<LeaveType> getLeaveTypeList() {
		return getService().getLeaveTypeList();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static LeaveType updateLeaveType(
			String leaveCode, long leaveTypeId, String leaveName, int count)
		throws PortalException, SystemException {

		return getService().updateLeaveType(
			leaveCode, leaveTypeId, leaveName, count);
	}

	public static LeaveTypeService getService() {
		return _service;
	}

	private static volatile LeaveTypeService _service;

}