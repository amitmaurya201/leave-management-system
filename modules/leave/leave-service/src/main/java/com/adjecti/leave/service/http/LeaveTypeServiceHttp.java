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

import com.adjecti.leave.service.LeaveTypeServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>LeaveTypeServiceUtil</code> service
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
 * @see LeaveTypeServiceSoap
 * @generated
 */
public class LeaveTypeServiceHttp {

	public static com.adjecti.leave.model.LeaveType createLeaveType(
			HttpPrincipal httpPrincipal, String leaveCode, String leaveName,
			int count)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		try {
			MethodKey methodKey = new MethodKey(
				LeaveTypeServiceUtil.class, "createLeaveType",
				_createLeaveTypeParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, leaveCode, leaveName, count);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.SystemException) {

					throw (com.liferay.portal.kernel.exception.SystemException)
						exception;
				}

				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.adjecti.leave.model.LeaveType)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.adjecti.leave.model.LeaveType>
		getLeaveTypeList(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				LeaveTypeServiceUtil.class, "getLeaveTypeList",
				_getLeaveTypeListParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.adjecti.leave.model.LeaveType>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.adjecti.leave.model.LeaveType getLeaveTypeById(
			HttpPrincipal httpPrincipal, long leaveTypeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				LeaveTypeServiceUtil.class, "getLeaveTypeById",
				_getLeaveTypeByIdParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, leaveTypeId);

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

			return (com.adjecti.leave.model.LeaveType)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static void deleteLeaveType(
			HttpPrincipal httpPrincipal, long leaveTypeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				LeaveTypeServiceUtil.class, "deleteLeaveType",
				_deleteLeaveTypeParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, leaveTypeId);

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

	public static com.adjecti.leave.model.LeaveType updateLeaveType(
			HttpPrincipal httpPrincipal, String leaveCode, long leaveTypeId,
			String leaveName, int count)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		try {
			MethodKey methodKey = new MethodKey(
				LeaveTypeServiceUtil.class, "updateLeaveType",
				_updateLeaveTypeParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, leaveCode, leaveTypeId, leaveName, count);

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

				if (exception instanceof
						com.liferay.portal.kernel.exception.SystemException) {

					throw (com.liferay.portal.kernel.exception.SystemException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.adjecti.leave.model.LeaveType)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(LeaveTypeServiceHttp.class);

	private static final Class<?>[] _createLeaveTypeParameterTypes0 =
		new Class[] {String.class, String.class, int.class};
	private static final Class<?>[] _getLeaveTypeListParameterTypes1 =
		new Class[] {};
	private static final Class<?>[] _getLeaveTypeByIdParameterTypes2 =
		new Class[] {long.class};
	private static final Class<?>[] _deleteLeaveTypeParameterTypes3 =
		new Class[] {long.class};
	private static final Class<?>[] _updateLeaveTypeParameterTypes4 =
		new Class[] {String.class, long.class, String.class, int.class};

}