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

import com.adjecti.leave.model.LeaveType;
import com.adjecti.leave.service.base.LeaveTypeServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the leave type remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.adjecti.leave.service.LeaveTypeService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeaveTypeServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=leave",
		"json.web.service.context.path=LeaveType"
	},
	service = AopService.class
)
public class LeaveTypeServiceImpl extends LeaveTypeServiceBaseImpl {
	public LeaveType createLeaveType(String leaveCode, String leaveName, float count)
			throws SystemException, PortalException {

		long leaveTypeId = counterLocalService.increment(LeaveType.class.getName());
		LeaveType leaveType = leaveTypeLocalService.createLeaveType(leaveTypeId);
		leaveType.setLeaveTypeId(leaveTypeId);
		leaveType.setLeaveCode(leaveCode);
		leaveType.setLeaveName(leaveName);
		leaveType.setCount(count);
		leaveTypeLocalService.addLeaveType(leaveType);
		return leaveType;
	}

	// list of LeaveType

	public List<LeaveType> getLeaveTypeList() {
		return leaveTypeLocalService.getLeaveTypes(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	// get leaveType by leaveTypeId

	public LeaveType getLeaveTypeById(long leaveTypeId) throws PortalException {
		return leaveTypeLocalService.getLeaveType(leaveTypeId);
	}

	// delete particular LeaveType

	public void deleteLeaveType(long leaveTypeId) throws PortalException {

		leaveTypeLocalService.deleteLeaveType(leaveTypeId);
	}

	// update LeaveType

	public LeaveType updateLeaveType(String leaveCode,long leaveTypeId,
            String leaveName,float count) throws PortalException,
            SystemException {
        LeaveType leaveType = leaveTypeLocalService.getLeaveType(leaveTypeId);
       
		leaveType.setLeaveCode(leaveCode);
		leaveType.setLeaveName(leaveName);
		leaveType.setCount(count);
		leaveType.setLeaveTypeId(leaveTypeId);
	    leaveTypeLocalService.updateLeaveType(leaveType);
        return leaveType;

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.adjecti.leave.service.LeaveTypeServiceUtil</code> to access the leave type remote service.
	 */
}
}