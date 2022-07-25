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

package com.adjecti.leave.service.http;

import com.adjecti.leave.service.LeaveApplicationServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>LeaveApplicationServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeaveApplicationServiceSoap
 * @generated
 */
public class LeaveApplicationServiceHttp {

	public static com.adjecti.leave.model.LeaveApplication
		addLeaveApplicationDetail(
			HttpPrincipal httpPrincipal, long leaveReasonId, long employeeId,
			long leaveTypeId, String startDate, String endDate,
			boolean startInHalfDay, boolean endInHalfDay,
			String actualJoiningDate, String remark, long documentId,
			String status, String reportingManager, String joinInHalfDay) {

		try {
			MethodKey methodKey = new MethodKey(
				LeaveApplicationServiceUtil.class, "addLeaveApplicationDetail",
				_addLeaveApplicationDetailParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, leaveReasonId, employeeId, leaveTypeId, startDate,
				endDate, startInHalfDay, endInHalfDay, actualJoiningDate,
				remark, documentId, status, reportingManager, joinInHalfDay);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.adjecti.leave.model.LeaveApplication)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.adjecti.leave.model.LeaveApplication>
		getLeaveApplicationList(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				LeaveApplicationServiceUtil.class, "getLeaveApplicationList",
				_getLeaveApplicationListParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.adjecti.leave.model.LeaveApplication>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		LeaveApplicationServiceHttp.class);

	private static final Class<?>[] _addLeaveApplicationDetailParameterTypes0 =
		new Class[] {
			long.class, long.class, long.class, String.class, String.class,
			boolean.class, boolean.class, String.class, String.class,
			long.class, String.class, String.class, String.class
		};
	private static final Class<?>[] _getLeaveApplicationListParameterTypes1 =
		new Class[] {};

}