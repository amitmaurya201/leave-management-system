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

import com.adjecti.leave.model.Employee;
import com.adjecti.leave.service.base.EmployeeServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.Validator;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the employee remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.adjecti.leave.service.EmployeeService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=leave",
		"json.web.service.context.path=Employee"
	},
	service = AopService.class
)
public class EmployeeServiceImpl extends EmployeeServiceBaseImpl {
	
	public Employee addEmployeeDetails(String employeeCode,String employeeName,String dateOfJoining) throws PortalException {
		long employeeId=counterLocalService.increment(Employee.class.getName());
	Employee employee=	employeeLocalService.createEmployee(employeeId);
	employee.setEmployeeId(employeeId);
	employee.setEmployeeCode(employeeCode);
	employee.setEmployeeName(employeeName);
	employee.setDateOfJoining(dateOfJoining);
	employeeLocalService.addEmployee(employee);
		
		return employee;
	}

	public List<Employee> getEmployeesList(){
		
		return employeeLocalService.getEmployees(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}
	
	public void deleteEmployeeDetail(long employeeId) throws PortalException {
		
		employeeLocalService.deleteEmployee(employeeId);
	}
	
	public Employee updateEmployeeDeatil(long employeeId , String employeeName , String employeeCode , String dateOfBirth) {

		Employee employee = null;
		try {
			employee = employeeLocalService.getEmployee(employeeId);
		} catch (Exception e) {
			
		}

		if (Validator.isNotNull(employee)) {
			employee.setEmployeeName(employeeName);
			employee.setEmployeeCode(employeeCode);
			employee.setDateOfJoining(dateOfBirth);
			
			employeeLocalService.updateEmployee(employee);
		}
			
		return employee;
	}
	public Employee getEmployeeById(long employeeId) throws PortalException {
		
		
		return employeeLocalService.getEmployee(employeeId);
	}

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.adjecti.leave.service.EmployeeServiceUtil</code> to access the employee remote service.
	 */
}