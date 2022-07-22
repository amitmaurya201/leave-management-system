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

import com.adjecti.leave.model.LeaveType;

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
 * The persistence utility for the leave type service. This utility wraps <code>com.adjecti.leave.service.persistence.impl.LeaveTypePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeaveTypePersistence
 * @generated
 */
public class LeaveTypeUtil {

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
	public static void clearCache(LeaveType leaveType) {
		getPersistence().clearCache(leaveType);
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
	public static Map<Serializable, LeaveType> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LeaveType> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LeaveType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LeaveType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<LeaveType> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LeaveType update(LeaveType leaveType) {
		return getPersistence().update(leaveType);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LeaveType update(
		LeaveType leaveType, ServiceContext serviceContext) {

		return getPersistence().update(leaveType, serviceContext);
	}

	/**
	 * Returns all the leave types where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching leave types
	 */
	public static List<LeaveType> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the leave types where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveTypeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of leave types
	 * @param end the upper bound of the range of leave types (not inclusive)
	 * @return the range of matching leave types
	 */
	public static List<LeaveType> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the leave types where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveTypeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of leave types
	 * @param end the upper bound of the range of leave types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching leave types
	 */
	public static List<LeaveType> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<LeaveType> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the leave types where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveTypeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of leave types
	 * @param end the upper bound of the range of leave types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching leave types
	 */
	public static List<LeaveType> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<LeaveType> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first leave type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave type
	 * @throws NoSuchTypeException if a matching leave type could not be found
	 */
	public static LeaveType findByUuid_First(
			String uuid, OrderByComparator<LeaveType> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchTypeException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first leave type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	public static LeaveType fetchByUuid_First(
		String uuid, OrderByComparator<LeaveType> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last leave type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave type
	 * @throws NoSuchTypeException if a matching leave type could not be found
	 */
	public static LeaveType findByUuid_Last(
			String uuid, OrderByComparator<LeaveType> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchTypeException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last leave type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	public static LeaveType fetchByUuid_Last(
		String uuid, OrderByComparator<LeaveType> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the leave types before and after the current leave type in the ordered set where uuid = &#63;.
	 *
	 * @param leaveTypeId the primary key of the current leave type
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next leave type
	 * @throws NoSuchTypeException if a leave type with the primary key could not be found
	 */
	public static LeaveType[] findByUuid_PrevAndNext(
			long leaveTypeId, String uuid,
			OrderByComparator<LeaveType> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchTypeException {

		return getPersistence().findByUuid_PrevAndNext(
			leaveTypeId, uuid, orderByComparator);
	}

	/**
	 * Removes all the leave types where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of leave types where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching leave types
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the leave type where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTypeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching leave type
	 * @throws NoSuchTypeException if a matching leave type could not be found
	 */
	public static LeaveType findByUUID_G(String uuid, long groupId)
		throws com.adjecti.leave.exception.NoSuchTypeException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the leave type where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	public static LeaveType fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the leave type where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	public static LeaveType fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the leave type where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the leave type that was removed
	 */
	public static LeaveType removeByUUID_G(String uuid, long groupId)
		throws com.adjecti.leave.exception.NoSuchTypeException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of leave types where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching leave types
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the leave types where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching leave types
	 */
	public static List<LeaveType> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the leave types where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveTypeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of leave types
	 * @param end the upper bound of the range of leave types (not inclusive)
	 * @return the range of matching leave types
	 */
	public static List<LeaveType> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the leave types where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveTypeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of leave types
	 * @param end the upper bound of the range of leave types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching leave types
	 */
	public static List<LeaveType> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LeaveType> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the leave types where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveTypeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of leave types
	 * @param end the upper bound of the range of leave types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching leave types
	 */
	public static List<LeaveType> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LeaveType> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first leave type in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave type
	 * @throws NoSuchTypeException if a matching leave type could not be found
	 */
	public static LeaveType findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<LeaveType> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchTypeException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first leave type in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	public static LeaveType fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<LeaveType> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last leave type in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave type
	 * @throws NoSuchTypeException if a matching leave type could not be found
	 */
	public static LeaveType findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<LeaveType> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchTypeException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last leave type in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	public static LeaveType fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<LeaveType> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the leave types before and after the current leave type in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param leaveTypeId the primary key of the current leave type
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next leave type
	 * @throws NoSuchTypeException if a leave type with the primary key could not be found
	 */
	public static LeaveType[] findByUuid_C_PrevAndNext(
			long leaveTypeId, String uuid, long companyId,
			OrderByComparator<LeaveType> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchTypeException {

		return getPersistence().findByUuid_C_PrevAndNext(
			leaveTypeId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the leave types where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of leave types where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching leave types
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the leave types where leaveName = &#63;.
	 *
	 * @param leaveName the leave name
	 * @return the matching leave types
	 */
	public static List<LeaveType> findByleaveName(String leaveName) {
		return getPersistence().findByleaveName(leaveName);
	}

	/**
	 * Returns a range of all the leave types where leaveName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveTypeModelImpl</code>.
	 * </p>
	 *
	 * @param leaveName the leave name
	 * @param start the lower bound of the range of leave types
	 * @param end the upper bound of the range of leave types (not inclusive)
	 * @return the range of matching leave types
	 */
	public static List<LeaveType> findByleaveName(
		String leaveName, int start, int end) {

		return getPersistence().findByleaveName(leaveName, start, end);
	}

	/**
	 * Returns an ordered range of all the leave types where leaveName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveTypeModelImpl</code>.
	 * </p>
	 *
	 * @param leaveName the leave name
	 * @param start the lower bound of the range of leave types
	 * @param end the upper bound of the range of leave types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching leave types
	 */
	public static List<LeaveType> findByleaveName(
		String leaveName, int start, int end,
		OrderByComparator<LeaveType> orderByComparator) {

		return getPersistence().findByleaveName(
			leaveName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the leave types where leaveName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveTypeModelImpl</code>.
	 * </p>
	 *
	 * @param leaveName the leave name
	 * @param start the lower bound of the range of leave types
	 * @param end the upper bound of the range of leave types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching leave types
	 */
	public static List<LeaveType> findByleaveName(
		String leaveName, int start, int end,
		OrderByComparator<LeaveType> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByleaveName(
			leaveName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first leave type in the ordered set where leaveName = &#63;.
	 *
	 * @param leaveName the leave name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave type
	 * @throws NoSuchTypeException if a matching leave type could not be found
	 */
	public static LeaveType findByleaveName_First(
			String leaveName, OrderByComparator<LeaveType> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchTypeException {

		return getPersistence().findByleaveName_First(
			leaveName, orderByComparator);
	}

	/**
	 * Returns the first leave type in the ordered set where leaveName = &#63;.
	 *
	 * @param leaveName the leave name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	public static LeaveType fetchByleaveName_First(
		String leaveName, OrderByComparator<LeaveType> orderByComparator) {

		return getPersistence().fetchByleaveName_First(
			leaveName, orderByComparator);
	}

	/**
	 * Returns the last leave type in the ordered set where leaveName = &#63;.
	 *
	 * @param leaveName the leave name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave type
	 * @throws NoSuchTypeException if a matching leave type could not be found
	 */
	public static LeaveType findByleaveName_Last(
			String leaveName, OrderByComparator<LeaveType> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchTypeException {

		return getPersistence().findByleaveName_Last(
			leaveName, orderByComparator);
	}

	/**
	 * Returns the last leave type in the ordered set where leaveName = &#63;.
	 *
	 * @param leaveName the leave name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	public static LeaveType fetchByleaveName_Last(
		String leaveName, OrderByComparator<LeaveType> orderByComparator) {

		return getPersistence().fetchByleaveName_Last(
			leaveName, orderByComparator);
	}

	/**
	 * Returns the leave types before and after the current leave type in the ordered set where leaveName = &#63;.
	 *
	 * @param leaveTypeId the primary key of the current leave type
	 * @param leaveName the leave name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next leave type
	 * @throws NoSuchTypeException if a leave type with the primary key could not be found
	 */
	public static LeaveType[] findByleaveName_PrevAndNext(
			long leaveTypeId, String leaveName,
			OrderByComparator<LeaveType> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchTypeException {

		return getPersistence().findByleaveName_PrevAndNext(
			leaveTypeId, leaveName, orderByComparator);
	}

	/**
	 * Removes all the leave types where leaveName = &#63; from the database.
	 *
	 * @param leaveName the leave name
	 */
	public static void removeByleaveName(String leaveName) {
		getPersistence().removeByleaveName(leaveName);
	}

	/**
	 * Returns the number of leave types where leaveName = &#63;.
	 *
	 * @param leaveName the leave name
	 * @return the number of matching leave types
	 */
	public static int countByleaveName(String leaveName) {
		return getPersistence().countByleaveName(leaveName);
	}

	/**
	 * Caches the leave type in the entity cache if it is enabled.
	 *
	 * @param leaveType the leave type
	 */
	public static void cacheResult(LeaveType leaveType) {
		getPersistence().cacheResult(leaveType);
	}

	/**
	 * Caches the leave types in the entity cache if it is enabled.
	 *
	 * @param leaveTypes the leave types
	 */
	public static void cacheResult(List<LeaveType> leaveTypes) {
		getPersistence().cacheResult(leaveTypes);
	}

	/**
	 * Creates a new leave type with the primary key. Does not add the leave type to the database.
	 *
	 * @param leaveTypeId the primary key for the new leave type
	 * @return the new leave type
	 */
	public static LeaveType create(long leaveTypeId) {
		return getPersistence().create(leaveTypeId);
	}

	/**
	 * Removes the leave type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leaveTypeId the primary key of the leave type
	 * @return the leave type that was removed
	 * @throws NoSuchTypeException if a leave type with the primary key could not be found
	 */
	public static LeaveType remove(long leaveTypeId)
		throws com.adjecti.leave.exception.NoSuchTypeException {

		return getPersistence().remove(leaveTypeId);
	}

	public static LeaveType updateImpl(LeaveType leaveType) {
		return getPersistence().updateImpl(leaveType);
	}

	/**
	 * Returns the leave type with the primary key or throws a <code>NoSuchTypeException</code> if it could not be found.
	 *
	 * @param leaveTypeId the primary key of the leave type
	 * @return the leave type
	 * @throws NoSuchTypeException if a leave type with the primary key could not be found
	 */
	public static LeaveType findByPrimaryKey(long leaveTypeId)
		throws com.adjecti.leave.exception.NoSuchTypeException {

		return getPersistence().findByPrimaryKey(leaveTypeId);
	}

	/**
	 * Returns the leave type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param leaveTypeId the primary key of the leave type
	 * @return the leave type, or <code>null</code> if a leave type with the primary key could not be found
	 */
	public static LeaveType fetchByPrimaryKey(long leaveTypeId) {
		return getPersistence().fetchByPrimaryKey(leaveTypeId);
	}

	/**
	 * Returns all the leave types.
	 *
	 * @return the leave types
	 */
	public static List<LeaveType> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the leave types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveTypeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of leave types
	 * @param end the upper bound of the range of leave types (not inclusive)
	 * @return the range of leave types
	 */
	public static List<LeaveType> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the leave types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveTypeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of leave types
	 * @param end the upper bound of the range of leave types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of leave types
	 */
	public static List<LeaveType> findAll(
		int start, int end, OrderByComparator<LeaveType> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the leave types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveTypeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of leave types
	 * @param end the upper bound of the range of leave types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of leave types
	 */
	public static List<LeaveType> findAll(
		int start, int end, OrderByComparator<LeaveType> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the leave types from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of leave types.
	 *
	 * @return the number of leave types
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static LeaveTypePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LeaveTypePersistence, LeaveTypePersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(LeaveTypePersistence.class);

		ServiceTracker<LeaveTypePersistence, LeaveTypePersistence>
			serviceTracker =
				new ServiceTracker<LeaveTypePersistence, LeaveTypePersistence>(
					bundle.getBundleContext(), LeaveTypePersistence.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}