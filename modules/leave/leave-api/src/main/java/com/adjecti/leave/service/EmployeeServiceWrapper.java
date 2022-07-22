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
 * Provides a wrapper for {@link EmployeeService}.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeService
 * @generated
 */
public class EmployeeServiceWrapper
	implements EmployeeService, ServiceWrapper<EmployeeService> {

	public EmployeeServiceWrapper(EmployeeService employeeService) {
		_employeeService = employeeService;
	}

	@Override
	public com.adjecti.leave.model.Employee addEmployeeDetails(
			String employeeCode, String employeeName, String dateOfJoining)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeService.addEmployeeDetails(
			employeeCode, employeeName, dateOfJoining);
	}

	@Override
	public void deleteEmployeeDetail(long employeeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		_employeeService.deleteEmployeeDetail(employeeId);
	}

	@Override
	public com.adjecti.leave.model.Employee getEmployeeById(long employeeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeService.getEmployeeById(employeeId);
	}

	@Override
	public java.util.List<com.adjecti.leave.model.Employee> getEmployeesList() {
		return _employeeService.getEmployeesList();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _employeeService.getOSGiServiceIdentifier();
	}

	@Override
	public com.adjecti.leave.model.Employee updateEmployeeDeatil(
		long employeeId, String employeeName, String employeeCode,
		String dateOfBirth) {

		return _employeeService.updateEmployeeDeatil(
			employeeId, employeeName, employeeCode, dateOfBirth);
	}

	@Override
	public EmployeeService getWrappedService() {
		return _employeeService;
	}

	@Override
	public void setWrappedService(EmployeeService employeeService) {
		_employeeService = employeeService;
	}

	private EmployeeService _employeeService;

}