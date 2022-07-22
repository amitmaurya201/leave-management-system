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

import com.adjecti.leave.service.LeaveReasonServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>LeaveReasonServiceUtil</code> service
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
 * @see LeaveReasonServiceSoap
 * @generated
 */
public class LeaveReasonServiceHttp {

	public static com.adjecti.leave.model.LeaveReason addLeaveReasonDetails(
		HttpPrincipal httpPrincipal, String reasonCode, String reasonDes) {

		try {
			MethodKey methodKey = new MethodKey(
				LeaveReasonServiceUtil.class, "addLeaveReasonDetails",
				_addLeaveReasonDetailsParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, reasonCode, reasonDes);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.adjecti.leave.model.LeaveReason)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static void deleteLeaveReason(
			HttpPrincipal httpPrincipal, long leaveReasonId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				LeaveReasonServiceUtil.class, "deleteLeaveReason",
				_deleteLeaveReasonParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, leaveReasonId);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.adjecti.leave.model.LeaveReason>
		getLeaveReasonList(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				LeaveReasonServiceUtil.class, "getLeaveReasonList",
				_getLeaveReasonListParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.adjecti.leave.model.LeaveReason>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.adjecti.leave.model.LeaveReason updateLeaveReason(
			HttpPrincipal httpPrincipal, long leaveReasonId,
			String leaveReasonCode, String leaveReasonDescription)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				LeaveReasonServiceUtil.class, "updateLeaveReason",
				_updateLeaveReasonParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, leaveReasonId, leaveReasonCode,
				leaveReasonDescription);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.adjecti.leave.model.LeaveReason)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		LeaveReasonServiceHttp.class);

	private static final Class<?>[] _addLeaveReasonDetailsParameterTypes0 =
		new Class[] {String.class, String.class};
	private static final Class<?>[] _deleteLeaveReasonParameterTypes1 =
		new Class[] {long.class};
	private static final Class<?>[] _getLeaveReasonListParameterTypes2 =
		new Class[] {};
	private static final Class<?>[] _updateLeaveReasonParameterTypes3 =
		new Class[] {long.class, String.class, String.class};

}