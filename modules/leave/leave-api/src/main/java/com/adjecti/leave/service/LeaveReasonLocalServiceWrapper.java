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
 * Provides a wrapper for {@link LeaveReasonLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LeaveReasonLocalService
 * @generated
 */
public class LeaveReasonLocalServiceWrapper
	implements LeaveReasonLocalService,
			   ServiceWrapper<LeaveReasonLocalService> {

	public LeaveReasonLocalServiceWrapper(
		LeaveReasonLocalService leaveReasonLocalService) {

		_leaveReasonLocalService = leaveReasonLocalService;
	}

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
	@Override
	public com.adjecti.leave.model.LeaveReason addLeaveReason(
		com.adjecti.leave.model.LeaveReason leaveReason) {

		return _leaveReasonLocalService.addLeaveReason(leaveReason);
	}

	/**
	 * Creates a new leave reason with the primary key. Does not add the leave reason to the database.
	 *
	 * @param leaveReasonId the primary key for the new leave reason
	 * @return the new leave reason
	 */
	@Override
	public com.adjecti.leave.model.LeaveReason createLeaveReason(
		long leaveReasonId) {

		return _leaveReasonLocalService.createLeaveReason(leaveReasonId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leaveReasonLocalService.createPersistedModel(primaryKeyObj);
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
	@Override
	public com.adjecti.leave.model.LeaveReason deleteLeaveReason(
		com.adjecti.leave.model.LeaveReason leaveReason) {

		return _leaveReasonLocalService.deleteLeaveReason(leaveReason);
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
	@Override
	public com.adjecti.leave.model.LeaveReason deleteLeaveReason(
			long leaveReasonId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leaveReasonLocalService.deleteLeaveReason(leaveReasonId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leaveReasonLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _leaveReasonLocalService.dynamicQuery();
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

		return _leaveReasonLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _leaveReasonLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _leaveReasonLocalService.dynamicQuery(
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

		return _leaveReasonLocalService.dynamicQueryCount(dynamicQuery);
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

		return _leaveReasonLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.adjecti.leave.model.LeaveReason fetchLeaveReason(
		long leaveReasonId) {

		return _leaveReasonLocalService.fetchLeaveReason(leaveReasonId);
	}

	/**
	 * Returns the leave reason matching the UUID and group.
	 *
	 * @param uuid the leave reason's UUID
	 * @param groupId the primary key of the group
	 * @return the matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	@Override
	public com.adjecti.leave.model.LeaveReason fetchLeaveReasonByUuidAndGroupId(
		String uuid, long groupId) {

		return _leaveReasonLocalService.fetchLeaveReasonByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _leaveReasonLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _leaveReasonLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _leaveReasonLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the leave reason with the primary key.
	 *
	 * @param leaveReasonId the primary key of the leave reason
	 * @return the leave reason
	 * @throws PortalException if a leave reason with the primary key could not be found
	 */
	@Override
	public com.adjecti.leave.model.LeaveReason getLeaveReason(
			long leaveReasonId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leaveReasonLocalService.getLeaveReason(leaveReasonId);
	}

	/**
	 * Returns the leave reason matching the UUID and group.
	 *
	 * @param uuid the leave reason's UUID
	 * @param groupId the primary key of the group
	 * @return the matching leave reason
	 * @throws PortalException if a matching leave reason could not be found
	 */
	@Override
	public com.adjecti.leave.model.LeaveReason getLeaveReasonByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leaveReasonLocalService.getLeaveReasonByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<com.adjecti.leave.model.LeaveReason> getLeaveReasons(
		int start, int end) {

		return _leaveReasonLocalService.getLeaveReasons(start, end);
	}

	/**
	 * Returns all the leave reasons matching the UUID and company.
	 *
	 * @param uuid the UUID of the leave reasons
	 * @param companyId the primary key of the company
	 * @return the matching leave reasons, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.adjecti.leave.model.LeaveReason>
		getLeaveReasonsByUuidAndCompanyId(String uuid, long companyId) {

		return _leaveReasonLocalService.getLeaveReasonsByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.adjecti.leave.model.LeaveReason>
		getLeaveReasonsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.adjecti.leave.model.LeaveReason> orderByComparator) {

		return _leaveReasonLocalService.getLeaveReasonsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of leave reasons.
	 *
	 * @return the number of leave reasons
	 */
	@Override
	public int getLeaveReasonsCount() {
		return _leaveReasonLocalService.getLeaveReasonsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _leaveReasonLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _leaveReasonLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public com.adjecti.leave.model.LeaveReason updateLeaveReason(
		com.adjecti.leave.model.LeaveReason leaveReason) {

		return _leaveReasonLocalService.updateLeaveReason(leaveReason);
	}

	@Override
	public LeaveReasonLocalService getWrappedService() {
		return _leaveReasonLocalService;
	}

	@Override
	public void setWrappedService(
		LeaveReasonLocalService leaveReasonLocalService) {

		_leaveReasonLocalService = leaveReasonLocalService;
	}

	private LeaveReasonLocalService _leaveReasonLocalService;

}