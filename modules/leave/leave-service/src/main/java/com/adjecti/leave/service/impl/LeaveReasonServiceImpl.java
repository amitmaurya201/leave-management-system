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

import com.adjecti.leave.model.LeaveReason;
import com.adjecti.leave.service.base.LeaveReasonServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.Validator;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the leave reason remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.adjecti.leave.service.LeaveReasonService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeaveReasonServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=leave",
		"json.web.service.context.path=LeaveReason"
	},
	service = AopService.class
)
public class LeaveReasonServiceImpl extends LeaveReasonServiceBaseImpl {
	public LeaveReason addLeaveReasonDetails(String reasonCode, String reasonDes) {
		long reasonId=counterLocalService.increment(LeaveReason.class.getName());
		LeaveReason leaveReason=leaveReasonLocalService.createLeaveReason(reasonId);
		leaveReason.setLeaveReasonId(reasonId);
		leaveReason.setLeaveReasonCode(reasonCode);
		leaveReason.setLeaveReasonDescription(reasonDes);
		leaveReasonLocalService.addLeaveReason(leaveReason);
		return leaveReason;
		
	}
	public void deleteLeaveReason(long leaveReasonId) throws PortalException {
		leaveReasonLocalService.deleteLeaveReason(leaveReasonId);
			
	}
	public List<LeaveReason> getLeaveReasonList(){
		List<LeaveReason> leaveReasonList=leaveReasonLocalService.getLeaveReasons(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		return leaveReasonList;
		
	}
	public LeaveReason updateLeaveReason(long leaveReasonId, String leaveReasonCode, String leaveReasonDescription) throws PortalException {
		
		LeaveReason leaveReason = null;
		try {
			leaveReason = leaveReasonLocalService.getLeaveReason(leaveReasonId);
		} catch (Exception e) {
			
		}

		if (Validator.isNotNull(leaveReason)) {
			leaveReason.setLeaveReasonCode(leaveReasonCode);
			leaveReason.setLeaveReasonDescription(leaveReasonDescription);
			leaveReasonLocalService.updateLeaveReason(leaveReason);
			
		}
		return leaveReason;
		
		
	}
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.adjecti.leave.service.LeaveReasonServiceUtil</code> to access the leave reason remote service.
	 */
}