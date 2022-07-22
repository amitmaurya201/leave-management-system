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
 * Provides a wrapper for {@link LeaveApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LeaveApplicationLocalService
 * @generated
 */
public class LeaveApplicationLocalServiceWrapper
	implements LeaveApplicationLocalService,
			   ServiceWrapper<LeaveApplicationLocalService> {

	public LeaveApplicationLocalServiceWrapper(
		LeaveApplicationLocalService leaveApplicationLocalService) {

		_leaveApplicationLocalService = leaveApplicationLocalService;
	}

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
	@Override
	public com.adjecti.leave.model.LeaveApplication addLeaveApplication(
		com.adjecti.leave.model.LeaveApplication leaveApplication) {

		return _leaveApplicationLocalService.addLeaveApplication(
			leaveApplication);
	}

	/**
	 * Creates a new leave application with the primary key. Does not add the leave application to the database.
	 *
	 * @param leaveApplicationId the primary key for the new leave application
	 * @return the new leave application
	 */
	@Override
	public com.adjecti.leave.model.LeaveApplication createLeaveApplication(
		long leaveApplicationId) {

		return _leaveApplicationLocalService.createLeaveApplication(
			leaveApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leaveApplicationLocalService.createPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.adjecti.leave.model.LeaveApplication deleteLeaveApplication(
		com.adjecti.leave.model.LeaveApplication leaveApplication) {

		return _leaveApplicationLocalService.deleteLeaveApplication(
			leaveApplication);
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
	@Override
	public com.adjecti.leave.model.LeaveApplication deleteLeaveApplication(
			long leaveApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leaveApplicationLocalService.deleteLeaveApplication(
			leaveApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leaveApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _leaveApplicationLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _leaveApplicationLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _leaveApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _leaveApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _leaveApplicationLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _leaveApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.adjecti.leave.model.LeaveApplication fetchLeaveApplication(
		long leaveApplicationId) {

		return _leaveApplicationLocalService.fetchLeaveApplication(
			leaveApplicationId);
	}

	/**
	 * Returns the leave application matching the UUID and group.
	 *
	 * @param uuid the leave application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching leave application, or <code>null</code> if a matching leave application could not be found
	 */
	@Override
	public com.adjecti.leave.model.LeaveApplication
		fetchLeaveApplicationByUuidAndGroupId(String uuid, long groupId) {

		return _leaveApplicationLocalService.
			fetchLeaveApplicationByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _leaveApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _leaveApplicationLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _leaveApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the leave application with the primary key.
	 *
	 * @param leaveApplicationId the primary key of the leave application
	 * @return the leave application
	 * @throws PortalException if a leave application with the primary key could not be found
	 */
	@Override
	public com.adjecti.leave.model.LeaveApplication getLeaveApplication(
			long leaveApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leaveApplicationLocalService.getLeaveApplication(
			leaveApplicationId);
	}

	/**
	 * Returns the leave application matching the UUID and group.
	 *
	 * @param uuid the leave application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching leave application
	 * @throws PortalException if a matching leave application could not be found
	 */
	@Override
	public com.adjecti.leave.model.LeaveApplication
			getLeaveApplicationByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leaveApplicationLocalService.
			getLeaveApplicationByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<com.adjecti.leave.model.LeaveApplication>
		getLeaveApplications(int start, int end) {

		return _leaveApplicationLocalService.getLeaveApplications(start, end);
	}

	/**
	 * Returns all the leave applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the leave applications
	 * @param companyId the primary key of the company
	 * @return the matching leave applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.adjecti.leave.model.LeaveApplication>
		getLeaveApplicationsByUuidAndCompanyId(String uuid, long companyId) {

		return _leaveApplicationLocalService.
			getLeaveApplicationsByUuidAndCompanyId(uuid, companyId);
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
	@Override
	public java.util.List<com.adjecti.leave.model.LeaveApplication>
		getLeaveApplicationsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.adjecti.leave.model.LeaveApplication> orderByComparator) {

		return _leaveApplicationLocalService.
			getLeaveApplicationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of leave applications.
	 *
	 * @return the number of leave applications
	 */
	@Override
	public int getLeaveApplicationsCount() {
		return _leaveApplicationLocalService.getLeaveApplicationsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _leaveApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leaveApplicationLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public com.adjecti.leave.model.LeaveApplication updateLeaveApplication(
		com.adjecti.leave.model.LeaveApplication leaveApplication) {

		return _leaveApplicationLocalService.updateLeaveApplication(
			leaveApplication);
	}

	@Override
	public LeaveApplicationLocalService getWrappedService() {
		return _leaveApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		LeaveApplicationLocalService leaveApplicationLocalService) {

		_leaveApplicationLocalService = leaveApplicationLocalService;
	}

	private LeaveApplicationLocalService _leaveApplicationLocalService;

}