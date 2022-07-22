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
 * Provides a wrapper for {@link LeaveTypeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LeaveTypeLocalService
 * @generated
 */
public class LeaveTypeLocalServiceWrapper
	implements LeaveTypeLocalService, ServiceWrapper<LeaveTypeLocalService> {

	public LeaveTypeLocalServiceWrapper(
		LeaveTypeLocalService leaveTypeLocalService) {

		_leaveTypeLocalService = leaveTypeLocalService;
	}

	/**
	 * Adds the leave type to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LeaveTypeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param leaveType the leave type
	 * @return the leave type that was added
	 */
	@Override
	public com.adjecti.leave.model.LeaveType addLeaveType(
		com.adjecti.leave.model.LeaveType leaveType) {

		return _leaveTypeLocalService.addLeaveType(leaveType);
	}

	/**
	 * Creates a new leave type with the primary key. Does not add the leave type to the database.
	 *
	 * @param leaveTypeId the primary key for the new leave type
	 * @return the new leave type
	 */
	@Override
	public com.adjecti.leave.model.LeaveType createLeaveType(long leaveTypeId) {
		return _leaveTypeLocalService.createLeaveType(leaveTypeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leaveTypeLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the leave type from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LeaveTypeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param leaveType the leave type
	 * @return the leave type that was removed
	 */
	@Override
	public com.adjecti.leave.model.LeaveType deleteLeaveType(
		com.adjecti.leave.model.LeaveType leaveType) {

		return _leaveTypeLocalService.deleteLeaveType(leaveType);
	}

	/**
	 * Deletes the leave type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LeaveTypeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param leaveTypeId the primary key of the leave type
	 * @return the leave type that was removed
	 * @throws PortalException if a leave type with the primary key could not be found
	 */
	@Override
	public com.adjecti.leave.model.LeaveType deleteLeaveType(long leaveTypeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leaveTypeLocalService.deleteLeaveType(leaveTypeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leaveTypeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _leaveTypeLocalService.dynamicQuery();
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

		return _leaveTypeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.leave.model.impl.LeaveTypeModelImpl</code>.
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

		return _leaveTypeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.leave.model.impl.LeaveTypeModelImpl</code>.
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

		return _leaveTypeLocalService.dynamicQuery(
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

		return _leaveTypeLocalService.dynamicQueryCount(dynamicQuery);
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

		return _leaveTypeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.adjecti.leave.model.LeaveType fetchLeaveType(long leaveTypeId) {
		return _leaveTypeLocalService.fetchLeaveType(leaveTypeId);
	}

	/**
	 * Returns the leave type matching the UUID and group.
	 *
	 * @param uuid the leave type's UUID
	 * @param groupId the primary key of the group
	 * @return the matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	@Override
	public com.adjecti.leave.model.LeaveType fetchLeaveTypeByUuidAndGroupId(
		String uuid, long groupId) {

		return _leaveTypeLocalService.fetchLeaveTypeByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _leaveTypeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _leaveTypeLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _leaveTypeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the leave type with the primary key.
	 *
	 * @param leaveTypeId the primary key of the leave type
	 * @return the leave type
	 * @throws PortalException if a leave type with the primary key could not be found
	 */
	@Override
	public com.adjecti.leave.model.LeaveType getLeaveType(long leaveTypeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leaveTypeLocalService.getLeaveType(leaveTypeId);
	}

	/**
	 * Returns the leave type matching the UUID and group.
	 *
	 * @param uuid the leave type's UUID
	 * @param groupId the primary key of the group
	 * @return the matching leave type
	 * @throws PortalException if a matching leave type could not be found
	 */
	@Override
	public com.adjecti.leave.model.LeaveType getLeaveTypeByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leaveTypeLocalService.getLeaveTypeByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the leave types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.leave.model.impl.LeaveTypeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of leave types
	 * @param end the upper bound of the range of leave types (not inclusive)
	 * @return the range of leave types
	 */
	@Override
	public java.util.List<com.adjecti.leave.model.LeaveType> getLeaveTypes(
		int start, int end) {

		return _leaveTypeLocalService.getLeaveTypes(start, end);
	}

	/**
	 * Returns all the leave types matching the UUID and company.
	 *
	 * @param uuid the UUID of the leave types
	 * @param companyId the primary key of the company
	 * @return the matching leave types, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.adjecti.leave.model.LeaveType>
		getLeaveTypesByUuidAndCompanyId(String uuid, long companyId) {

		return _leaveTypeLocalService.getLeaveTypesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of leave types matching the UUID and company.
	 *
	 * @param uuid the UUID of the leave types
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of leave types
	 * @param end the upper bound of the range of leave types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching leave types, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.adjecti.leave.model.LeaveType>
		getLeaveTypesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.adjecti.leave.model.LeaveType> orderByComparator) {

		return _leaveTypeLocalService.getLeaveTypesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of leave types.
	 *
	 * @return the number of leave types
	 */
	@Override
	public int getLeaveTypesCount() {
		return _leaveTypeLocalService.getLeaveTypesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _leaveTypeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leaveTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the leave type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LeaveTypeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param leaveType the leave type
	 * @return the leave type that was updated
	 */
	@Override
	public com.adjecti.leave.model.LeaveType updateLeaveType(
		com.adjecti.leave.model.LeaveType leaveType) {

		return _leaveTypeLocalService.updateLeaveType(leaveType);
	}

	@Override
	public LeaveTypeLocalService getWrappedService() {
		return _leaveTypeLocalService;
	}

	@Override
	public void setWrappedService(LeaveTypeLocalService leaveTypeLocalService) {
		_leaveTypeLocalService = leaveTypeLocalService;
	}

	private LeaveTypeLocalService _leaveTypeLocalService;

}