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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for LeaveReason. This utility wraps
 * <code>com.adjecti.leave.service.impl.LeaveReasonLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LeaveReasonLocalService
 * @generated
 */
public class LeaveReasonLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.adjecti.leave.service.impl.LeaveReasonLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the leave reason to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LeaveReasonLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param leaveReason the leave reason
	 * @return the leave reason that was added
	 */
	public static LeaveReason addLeaveReason(LeaveReason leaveReason) {
		return getService().addLeaveReason(leaveReason);
	}

	/**
	 * Creates a new leave reason with the primary key. Does not add the leave reason to the database.
	 *
	 * @param leaveReasonId the primary key for the new leave reason
	 * @return the new leave reason
	 */
	public static LeaveReason createLeaveReason(long leaveReasonId) {
		return getService().createLeaveReason(leaveReasonId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the leave reason from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LeaveReasonLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param leaveReason the leave reason
	 * @return the leave reason that was removed
	 */
	public static LeaveReason deleteLeaveReason(LeaveReason leaveReason) {
		return getService().deleteLeaveReason(leaveReason);
	}

	/**
	 * Deletes the leave reason with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LeaveReasonLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param leaveReasonId the primary key of the leave reason
	 * @return the leave reason that was removed
	 * @throws PortalException if a leave reason with the primary key could not be found
	 */
	public static LeaveReason deleteLeaveReason(long leaveReasonId)
		throws PortalException {

		return getService().deleteLeaveReason(leaveReasonId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.leave.model.impl.LeaveReasonModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.leave.model.impl.LeaveReasonModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static LeaveReason fetchLeaveReason(long leaveReasonId) {
		return getService().fetchLeaveReason(leaveReasonId);
	}

	/**
	 * Returns the leave reason matching the UUID and group.
	 *
	 * @param uuid the leave reason's UUID
	 * @param groupId the primary key of the group
	 * @return the matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	public static LeaveReason fetchLeaveReasonByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchLeaveReasonByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the leave reason with the primary key.
	 *
	 * @param leaveReasonId the primary key of the leave reason
	 * @return the leave reason
	 * @throws PortalException if a leave reason with the primary key could not be found
	 */
	public static LeaveReason getLeaveReason(long leaveReasonId)
		throws PortalException {

		return getService().getLeaveReason(leaveReasonId);
	}

	/**
	 * Returns the leave reason matching the UUID and group.
	 *
	 * @param uuid the leave reason's UUID
	 * @param groupId the primary key of the group
	 * @return the matching leave reason
	 * @throws PortalException if a matching leave reason could not be found
	 */
	public static LeaveReason getLeaveReasonByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getLeaveReasonByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the leave reasons.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.leave.model.impl.LeaveReasonModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of leave reasons
	 * @param end the upper bound of the range of leave reasons (not inclusive)
	 * @return the range of leave reasons
	 */
	public static List<LeaveReason> getLeaveReasons(int start, int end) {
		return getService().getLeaveReasons(start, end);
	}

	/**
	 * Returns all the leave reasons matching the UUID and company.
	 *
	 * @param uuid the UUID of the leave reasons
	 * @param companyId the primary key of the company
	 * @return the matching leave reasons, or an empty list if no matches were found
	 */
	public static List<LeaveReason> getLeaveReasonsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getLeaveReasonsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of leave reasons matching the UUID and company.
	 *
	 * @param uuid the UUID of the leave reasons
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of leave reasons
	 * @param end the upper bound of the range of leave reasons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching leave reasons, or an empty list if no matches were found
	 */
	public static List<LeaveReason> getLeaveReasonsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LeaveReason> orderByComparator) {

		return getService().getLeaveReasonsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of leave reasons.
	 *
	 * @return the number of leave reasons
	 */
	public static int getLeaveReasonsCount() {
		return getService().getLeaveReasonsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the leave reason in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LeaveReasonLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param leaveReason the leave reason
	 * @return the leave reason that was updated
	 */
	public static LeaveReason updateLeaveReason(LeaveReason leaveReason) {
		return getService().updateLeaveReason(leaveReason);
	}

	public static LeaveReasonLocalService getService() {
		return _service;
	}

	private static volatile LeaveReasonLocalService _service;

}