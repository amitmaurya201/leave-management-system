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

package com.adjecti.leave.service.persistence;

import com.adjecti.leave.model.LeaveApplication;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the leave application service. This utility wraps <code>com.adjecti.leave.service.persistence.impl.LeaveApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeaveApplicationPersistence
 * @generated
 */
public class LeaveApplicationUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(LeaveApplication leaveApplication) {
		getPersistence().clearCache(leaveApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, LeaveApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LeaveApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LeaveApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LeaveApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<LeaveApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LeaveApplication update(LeaveApplication leaveApplication) {
		return getPersistence().update(leaveApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LeaveApplication update(
		LeaveApplication leaveApplication, ServiceContext serviceContext) {

		return getPersistence().update(leaveApplication, serviceContext);
	}

	/**
	 * Returns all the leave applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching leave applications
	 */
	public static List<LeaveApplication> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the leave applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of leave applications
	 * @param end the upper bound of the range of leave applications (not inclusive)
	 * @return the range of matching leave applications
	 */
	public static List<LeaveApplication> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the leave applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of leave applications
	 * @param end the upper bound of the range of leave applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching leave applications
	 */
	public static List<LeaveApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<LeaveApplication> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the leave applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of leave applications
	 * @param end the upper bound of the range of leave applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching leave applications
	 */
	public static List<LeaveApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<LeaveApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first leave application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave application
	 * @throws NoSuchApplicationException if a matching leave application could not be found
	 */
	public static LeaveApplication findByUuid_First(
			String uuid, OrderByComparator<LeaveApplication> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchApplicationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first leave application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave application, or <code>null</code> if a matching leave application could not be found
	 */
	public static LeaveApplication fetchByUuid_First(
		String uuid, OrderByComparator<LeaveApplication> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last leave application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave application
	 * @throws NoSuchApplicationException if a matching leave application could not be found
	 */
	public static LeaveApplication findByUuid_Last(
			String uuid, OrderByComparator<LeaveApplication> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchApplicationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last leave application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave application, or <code>null</code> if a matching leave application could not be found
	 */
	public static LeaveApplication fetchByUuid_Last(
		String uuid, OrderByComparator<LeaveApplication> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the leave applications before and after the current leave application in the ordered set where uuid = &#63;.
	 *
	 * @param leaveApplicationId the primary key of the current leave application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next leave application
	 * @throws NoSuchApplicationException if a leave application with the primary key could not be found
	 */
	public static LeaveApplication[] findByUuid_PrevAndNext(
			long leaveApplicationId, String uuid,
			OrderByComparator<LeaveApplication> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchApplicationException {

		return getPersistence().findByUuid_PrevAndNext(
			leaveApplicationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the leave applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of leave applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching leave applications
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the leave application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching leave application
	 * @throws NoSuchApplicationException if a matching leave application could not be found
	 */
	public static LeaveApplication findByUUID_G(String uuid, long groupId)
		throws com.adjecti.leave.exception.NoSuchApplicationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the leave application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching leave application, or <code>null</code> if a matching leave application could not be found
	 */
	public static LeaveApplication fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the leave application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching leave application, or <code>null</code> if a matching leave application could not be found
	 */
	public static LeaveApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the leave application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the leave application that was removed
	 */
	public static LeaveApplication removeByUUID_G(String uuid, long groupId)
		throws com.adjecti.leave.exception.NoSuchApplicationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of leave applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching leave applications
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the leave applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching leave applications
	 */
	public static List<LeaveApplication> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the leave applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of leave applications
	 * @param end the upper bound of the range of leave applications (not inclusive)
	 * @return the range of matching leave applications
	 */
	public static List<LeaveApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the leave applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of leave applications
	 * @param end the upper bound of the range of leave applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching leave applications
	 */
	public static List<LeaveApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LeaveApplication> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the leave applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of leave applications
	 * @param end the upper bound of the range of leave applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching leave applications
	 */
	public static List<LeaveApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LeaveApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first leave application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave application
	 * @throws NoSuchApplicationException if a matching leave application could not be found
	 */
	public static LeaveApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<LeaveApplication> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchApplicationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first leave application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave application, or <code>null</code> if a matching leave application could not be found
	 */
	public static LeaveApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<LeaveApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last leave application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave application
	 * @throws NoSuchApplicationException if a matching leave application could not be found
	 */
	public static LeaveApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<LeaveApplication> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchApplicationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last leave application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave application, or <code>null</code> if a matching leave application could not be found
	 */
	public static LeaveApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<LeaveApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the leave applications before and after the current leave application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param leaveApplicationId the primary key of the current leave application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next leave application
	 * @throws NoSuchApplicationException if a leave application with the primary key could not be found
	 */
	public static LeaveApplication[] findByUuid_C_PrevAndNext(
			long leaveApplicationId, String uuid, long companyId,
			OrderByComparator<LeaveApplication> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchApplicationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			leaveApplicationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the leave applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of leave applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching leave applications
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the leave applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching leave applications
	 */
	public static List<LeaveApplication> findBystatus(String status) {
		return getPersistence().findBystatus(status);
	}

	/**
	 * Returns a range of all the leave applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of leave applications
	 * @param end the upper bound of the range of leave applications (not inclusive)
	 * @return the range of matching leave applications
	 */
	public static List<LeaveApplication> findBystatus(
		String status, int start, int end) {

		return getPersistence().findBystatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the leave applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of leave applications
	 * @param end the upper bound of the range of leave applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching leave applications
	 */
	public static List<LeaveApplication> findBystatus(
		String status, int start, int end,
		OrderByComparator<LeaveApplication> orderByComparator) {

		return getPersistence().findBystatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the leave applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of leave applications
	 * @param end the upper bound of the range of leave applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching leave applications
	 */
	public static List<LeaveApplication> findBystatus(
		String status, int start, int end,
		OrderByComparator<LeaveApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBystatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first leave application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave application
	 * @throws NoSuchApplicationException if a matching leave application could not be found
	 */
	public static LeaveApplication findBystatus_First(
			String status,
			OrderByComparator<LeaveApplication> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchApplicationException {

		return getPersistence().findBystatus_First(status, orderByComparator);
	}

	/**
	 * Returns the first leave application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave application, or <code>null</code> if a matching leave application could not be found
	 */
	public static LeaveApplication fetchBystatus_First(
		String status, OrderByComparator<LeaveApplication> orderByComparator) {

		return getPersistence().fetchBystatus_First(status, orderByComparator);
	}

	/**
	 * Returns the last leave application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave application
	 * @throws NoSuchApplicationException if a matching leave application could not be found
	 */
	public static LeaveApplication findBystatus_Last(
			String status,
			OrderByComparator<LeaveApplication> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchApplicationException {

		return getPersistence().findBystatus_Last(status, orderByComparator);
	}

	/**
	 * Returns the last leave application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave application, or <code>null</code> if a matching leave application could not be found
	 */
	public static LeaveApplication fetchBystatus_Last(
		String status, OrderByComparator<LeaveApplication> orderByComparator) {

		return getPersistence().fetchBystatus_Last(status, orderByComparator);
	}

	/**
	 * Returns the leave applications before and after the current leave application in the ordered set where status = &#63;.
	 *
	 * @param leaveApplicationId the primary key of the current leave application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next leave application
	 * @throws NoSuchApplicationException if a leave application with the primary key could not be found
	 */
	public static LeaveApplication[] findBystatus_PrevAndNext(
			long leaveApplicationId, String status,
			OrderByComparator<LeaveApplication> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchApplicationException {

		return getPersistence().findBystatus_PrevAndNext(
			leaveApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the leave applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBystatus(String status) {
		getPersistence().removeBystatus(status);
	}

	/**
	 * Returns the number of leave applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching leave applications
	 */
	public static int countBystatus(String status) {
		return getPersistence().countBystatus(status);
	}

	/**
	 * Caches the leave application in the entity cache if it is enabled.
	 *
	 * @param leaveApplication the leave application
	 */
	public static void cacheResult(LeaveApplication leaveApplication) {
		getPersistence().cacheResult(leaveApplication);
	}

	/**
	 * Caches the leave applications in the entity cache if it is enabled.
	 *
	 * @param leaveApplications the leave applications
	 */
	public static void cacheResult(List<LeaveApplication> leaveApplications) {
		getPersistence().cacheResult(leaveApplications);
	}

	/**
	 * Creates a new leave application with the primary key. Does not add the leave application to the database.
	 *
	 * @param leaveApplicationId the primary key for the new leave application
	 * @return the new leave application
	 */
	public static LeaveApplication create(long leaveApplicationId) {
		return getPersistence().create(leaveApplicationId);
	}

	/**
	 * Removes the leave application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leaveApplicationId the primary key of the leave application
	 * @return the leave application that was removed
	 * @throws NoSuchApplicationException if a leave application with the primary key could not be found
	 */
	public static LeaveApplication remove(long leaveApplicationId)
		throws com.adjecti.leave.exception.NoSuchApplicationException {

		return getPersistence().remove(leaveApplicationId);
	}

	public static LeaveApplication updateImpl(
		LeaveApplication leaveApplication) {

		return getPersistence().updateImpl(leaveApplication);
	}

	/**
	 * Returns the leave application with the primary key or throws a <code>NoSuchApplicationException</code> if it could not be found.
	 *
	 * @param leaveApplicationId the primary key of the leave application
	 * @return the leave application
	 * @throws NoSuchApplicationException if a leave application with the primary key could not be found
	 */
	public static LeaveApplication findByPrimaryKey(long leaveApplicationId)
		throws com.adjecti.leave.exception.NoSuchApplicationException {

		return getPersistence().findByPrimaryKey(leaveApplicationId);
	}

	/**
	 * Returns the leave application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param leaveApplicationId the primary key of the leave application
	 * @return the leave application, or <code>null</code> if a leave application with the primary key could not be found
	 */
	public static LeaveApplication fetchByPrimaryKey(long leaveApplicationId) {
		return getPersistence().fetchByPrimaryKey(leaveApplicationId);
	}

	/**
	 * Returns all the leave applications.
	 *
	 * @return the leave applications
	 */
	public static List<LeaveApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the leave applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of leave applications
	 * @param end the upper bound of the range of leave applications (not inclusive)
	 * @return the range of leave applications
	 */
	public static List<LeaveApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the leave applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of leave applications
	 * @param end the upper bound of the range of leave applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of leave applications
	 */
	public static List<LeaveApplication> findAll(
		int start, int end,
		OrderByComparator<LeaveApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the leave applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of leave applications
	 * @param end the upper bound of the range of leave applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of leave applications
	 */
	public static List<LeaveApplication> findAll(
		int start, int end,
		OrderByComparator<LeaveApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the leave applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of leave applications.
	 *
	 * @return the number of leave applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static LeaveApplicationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<LeaveApplicationPersistence, LeaveApplicationPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			LeaveApplicationPersistence.class);

		ServiceTracker<LeaveApplicationPersistence, LeaveApplicationPersistence>
			serviceTracker =
				new ServiceTracker
					<LeaveApplicationPersistence, LeaveApplicationPersistence>(
						bundle.getBundleContext(),
						LeaveApplicationPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}