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

import com.adjecti.leave.model.LeaveApplication;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for LeaveApplication. This utility wraps
 * <code>com.adjecti.leave.service.impl.LeaveApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LeaveApplicationLocalService
 * @generated
 */
public class LeaveApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.adjecti.leave.service.impl.LeaveApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the leave application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LeaveApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param leaveApplication the leave application
	 * @return the leave application that was added
	 */
	public static LeaveApplication addLeaveApplication(
		LeaveApplication leaveApplication) {

		return getService().addLeaveApplication(leaveApplication);
	}

	/**
	 * Creates a new leave application with the primary key. Does not add the leave application to the database.
	 *
	 * @param leaveApplicationId the primary key for the new leave application
	 * @return the new leave application
	 */
	public static LeaveApplication createLeaveApplication(
		long leaveApplicationId) {

		return getService().createLeaveApplication(leaveApplicationId);
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
	 * Deletes the leave application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LeaveApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param leaveApplication the leave application
	 * @return the leave application that was removed
	 */
	public static LeaveApplication deleteLeaveApplication(
		LeaveApplication leaveApplication) {

		return getService().deleteLeaveApplication(leaveApplication);
	}

	/**
	 * Deletes the leave application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LeaveApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param leaveApplicationId the primary key of the leave application
	 * @return the leave application that was removed
	 * @throws PortalException if a leave application with the primary key could not be found
	 */
	public static LeaveApplication deleteLeaveApplication(
			long leaveApplicationId)
		throws PortalException {

		return getService().deleteLeaveApplication(leaveApplicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.leave.model.impl.LeaveApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.leave.model.impl.LeaveApplicationModelImpl</code>.
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

	public static LeaveApplication fetchLeaveApplication(
		long leaveApplicationId) {

		return getService().fetchLeaveApplication(leaveApplicationId);
	}

	/**
	 * Returns the leave application matching the UUID and group.
	 *
	 * @param uuid the leave application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching leave application, or <code>null</code> if a matching leave application could not be found
	 */
	public static LeaveApplication fetchLeaveApplicationByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchLeaveApplicationByUuidAndGroupId(
			uuid, groupId);
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
	 * Returns the leave application with the primary key.
	 *
	 * @param leaveApplicationId the primary key of the leave application
	 * @return the leave application
	 * @throws PortalException if a leave application with the primary key could not be found
	 */
	public static LeaveApplication getLeaveApplication(long leaveApplicationId)
		throws PortalException {

		return getService().getLeaveApplication(leaveApplicationId);
	}

	/**
	 * Returns the leave application matching the UUID and group.
	 *
	 * @param uuid the leave application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching leave application
	 * @throws PortalException if a matching leave application could not be found
	 */
	public static LeaveApplication getLeaveApplicationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getLeaveApplicationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the leave applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.leave.model.impl.LeaveApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of leave applications
	 * @param end the upper bound of the range of leave applications (not inclusive)
	 * @return the range of leave applications
	 */
	public static List<LeaveApplication> getLeaveApplications(
		int start, int end) {

		return getService().getLeaveApplications(start, end);
	}

	/**
	 * Returns all the leave applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the leave applications
	 * @param companyId the primary key of the company
	 * @return the matching leave applications, or an empty list if no matches were found
	 */
	public static List<LeaveApplication> getLeaveApplicationsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getLeaveApplicationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of leave applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the leave applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of leave applications
	 * @param end the upper bound of the range of leave applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching leave applications, or an empty list if no matches were found
	 */
	public static List<LeaveApplication> getLeaveApplicationsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LeaveApplication> orderByComparator) {

		return getService().getLeaveApplicationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of leave applications.
	 *
	 * @return the number of leave applications
	 */
	public static int getLeaveApplicationsCount() {
		return getService().getLeaveApplicationsCount();
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
	 * Updates the leave application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LeaveApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param leaveApplication the leave application
	 * @return the leave application that was updated
	 */
	public static LeaveApplication updateLeaveApplication(
		LeaveApplication leaveApplication) {

		return getService().updateLeaveApplication(leaveApplication);
	}

	public static LeaveApplicationLocalService getService() {
		return _service;
	}

	private static volatile LeaveApplicationLocalService _service;

}