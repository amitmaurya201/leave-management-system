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

import com.adjecti.leave.model.LeaveReason;

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
 * The persistence utility for the leave reason service. This utility wraps <code>com.adjecti.leave.service.persistence.impl.LeaveReasonPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeaveReasonPersistence
 * @generated
 */
public class LeaveReasonUtil {

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
	public static void clearCache(LeaveReason leaveReason) {
		getPersistence().clearCache(leaveReason);
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
	public static Map<Serializable, LeaveReason> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LeaveReason> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LeaveReason> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LeaveReason> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<LeaveReason> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LeaveReason update(LeaveReason leaveReason) {
		return getPersistence().update(leaveReason);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LeaveReason update(
		LeaveReason leaveReason, ServiceContext serviceContext) {

		return getPersistence().update(leaveReason, serviceContext);
	}

	/**
	 * Returns all the leave reasons where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching leave reasons
	 */
	public static List<LeaveReason> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the leave reasons where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveReasonModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of leave reasons
	 * @param end the upper bound of the range of leave reasons (not inclusive)
	 * @return the range of matching leave reasons
	 */
	public static List<LeaveReason> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the leave reasons where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveReasonModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of leave reasons
	 * @param end the upper bound of the range of leave reasons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching leave reasons
	 */
	public static List<LeaveReason> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<LeaveReason> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the leave reasons where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveReasonModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of leave reasons
	 * @param end the upper bound of the range of leave reasons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching leave reasons
	 */
	public static List<LeaveReason> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<LeaveReason> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first leave reason in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave reason
	 * @throws NoSuchReasonException if a matching leave reason could not be found
	 */
	public static LeaveReason findByUuid_First(
			String uuid, OrderByComparator<LeaveReason> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchReasonException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first leave reason in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	public static LeaveReason fetchByUuid_First(
		String uuid, OrderByComparator<LeaveReason> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last leave reason in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave reason
	 * @throws NoSuchReasonException if a matching leave reason could not be found
	 */
	public static LeaveReason findByUuid_Last(
			String uuid, OrderByComparator<LeaveReason> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchReasonException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last leave reason in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	public static LeaveReason fetchByUuid_Last(
		String uuid, OrderByComparator<LeaveReason> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the leave reasons before and after the current leave reason in the ordered set where uuid = &#63;.
	 *
	 * @param leaveReasonId the primary key of the current leave reason
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next leave reason
	 * @throws NoSuchReasonException if a leave reason with the primary key could not be found
	 */
	public static LeaveReason[] findByUuid_PrevAndNext(
			long leaveReasonId, String uuid,
			OrderByComparator<LeaveReason> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchReasonException {

		return getPersistence().findByUuid_PrevAndNext(
			leaveReasonId, uuid, orderByComparator);
	}

	/**
	 * Removes all the leave reasons where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of leave reasons where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching leave reasons
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the leave reason where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchReasonException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching leave reason
	 * @throws NoSuchReasonException if a matching leave reason could not be found
	 */
	public static LeaveReason findByUUID_G(String uuid, long groupId)
		throws com.adjecti.leave.exception.NoSuchReasonException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the leave reason where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	public static LeaveReason fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the leave reason where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	public static LeaveReason fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the leave reason where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the leave reason that was removed
	 */
	public static LeaveReason removeByUUID_G(String uuid, long groupId)
		throws com.adjecti.leave.exception.NoSuchReasonException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of leave reasons where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching leave reasons
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the leave reasons where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching leave reasons
	 */
	public static List<LeaveReason> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the leave reasons where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveReasonModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of leave reasons
	 * @param end the upper bound of the range of leave reasons (not inclusive)
	 * @return the range of matching leave reasons
	 */
	public static List<LeaveReason> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the leave reasons where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveReasonModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of leave reasons
	 * @param end the upper bound of the range of leave reasons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching leave reasons
	 */
	public static List<LeaveReason> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LeaveReason> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the leave reasons where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveReasonModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of leave reasons
	 * @param end the upper bound of the range of leave reasons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching leave reasons
	 */
	public static List<LeaveReason> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LeaveReason> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first leave reason in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave reason
	 * @throws NoSuchReasonException if a matching leave reason could not be found
	 */
	public static LeaveReason findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<LeaveReason> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchReasonException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first leave reason in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	public static LeaveReason fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<LeaveReason> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last leave reason in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave reason
	 * @throws NoSuchReasonException if a matching leave reason could not be found
	 */
	public static LeaveReason findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<LeaveReason> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchReasonException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last leave reason in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	public static LeaveReason fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<LeaveReason> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the leave reasons before and after the current leave reason in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param leaveReasonId the primary key of the current leave reason
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next leave reason
	 * @throws NoSuchReasonException if a leave reason with the primary key could not be found
	 */
	public static LeaveReason[] findByUuid_C_PrevAndNext(
			long leaveReasonId, String uuid, long companyId,
			OrderByComparator<LeaveReason> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchReasonException {

		return getPersistence().findByUuid_C_PrevAndNext(
			leaveReasonId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the leave reasons where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of leave reasons where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching leave reasons
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the leave reasons where leaveReasonDescription = &#63;.
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @return the matching leave reasons
	 */
	public static List<LeaveReason> findByleaveReasonDescription(
		String leaveReasonDescription) {

		return getPersistence().findByleaveReasonDescription(
			leaveReasonDescription);
	}

	/**
	 * Returns a range of all the leave reasons where leaveReasonDescription = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveReasonModelImpl</code>.
	 * </p>
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @param start the lower bound of the range of leave reasons
	 * @param end the upper bound of the range of leave reasons (not inclusive)
	 * @return the range of matching leave reasons
	 */
	public static List<LeaveReason> findByleaveReasonDescription(
		String leaveReasonDescription, int start, int end) {

		return getPersistence().findByleaveReasonDescription(
			leaveReasonDescription, start, end);
	}

	/**
	 * Returns an ordered range of all the leave reasons where leaveReasonDescription = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveReasonModelImpl</code>.
	 * </p>
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @param start the lower bound of the range of leave reasons
	 * @param end the upper bound of the range of leave reasons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching leave reasons
	 */
	public static List<LeaveReason> findByleaveReasonDescription(
		String leaveReasonDescription, int start, int end,
		OrderByComparator<LeaveReason> orderByComparator) {

		return getPersistence().findByleaveReasonDescription(
			leaveReasonDescription, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the leave reasons where leaveReasonDescription = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveReasonModelImpl</code>.
	 * </p>
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @param start the lower bound of the range of leave reasons
	 * @param end the upper bound of the range of leave reasons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching leave reasons
	 */
	public static List<LeaveReason> findByleaveReasonDescription(
		String leaveReasonDescription, int start, int end,
		OrderByComparator<LeaveReason> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByleaveReasonDescription(
			leaveReasonDescription, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first leave reason in the ordered set where leaveReasonDescription = &#63;.
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave reason
	 * @throws NoSuchReasonException if a matching leave reason could not be found
	 */
	public static LeaveReason findByleaveReasonDescription_First(
			String leaveReasonDescription,
			OrderByComparator<LeaveReason> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchReasonException {

		return getPersistence().findByleaveReasonDescription_First(
			leaveReasonDescription, orderByComparator);
	}

	/**
	 * Returns the first leave reason in the ordered set where leaveReasonDescription = &#63;.
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	public static LeaveReason fetchByleaveReasonDescription_First(
		String leaveReasonDescription,
		OrderByComparator<LeaveReason> orderByComparator) {

		return getPersistence().fetchByleaveReasonDescription_First(
			leaveReasonDescription, orderByComparator);
	}

	/**
	 * Returns the last leave reason in the ordered set where leaveReasonDescription = &#63;.
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave reason
	 * @throws NoSuchReasonException if a matching leave reason could not be found
	 */
	public static LeaveReason findByleaveReasonDescription_Last(
			String leaveReasonDescription,
			OrderByComparator<LeaveReason> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchReasonException {

		return getPersistence().findByleaveReasonDescription_Last(
			leaveReasonDescription, orderByComparator);
	}

	/**
	 * Returns the last leave reason in the ordered set where leaveReasonDescription = &#63;.
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	public static LeaveReason fetchByleaveReasonDescription_Last(
		String leaveReasonDescription,
		OrderByComparator<LeaveReason> orderByComparator) {

		return getPersistence().fetchByleaveReasonDescription_Last(
			leaveReasonDescription, orderByComparator);
	}

	/**
	 * Returns the leave reasons before and after the current leave reason in the ordered set where leaveReasonDescription = &#63;.
	 *
	 * @param leaveReasonId the primary key of the current leave reason
	 * @param leaveReasonDescription the leave reason description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next leave reason
	 * @throws NoSuchReasonException if a leave reason with the primary key could not be found
	 */
	public static LeaveReason[] findByleaveReasonDescription_PrevAndNext(
			long leaveReasonId, String leaveReasonDescription,
			OrderByComparator<LeaveReason> orderByComparator)
		throws com.adjecti.leave.exception.NoSuchReasonException {

		return getPersistence().findByleaveReasonDescription_PrevAndNext(
			leaveReasonId, leaveReasonDescription, orderByComparator);
	}

	/**
	 * Removes all the leave reasons where leaveReasonDescription = &#63; from the database.
	 *
	 * @param leaveReasonDescription the leave reason description
	 */
	public static void removeByleaveReasonDescription(
		String leaveReasonDescription) {

		getPersistence().removeByleaveReasonDescription(leaveReasonDescription);
	}

	/**
	 * Returns the number of leave reasons where leaveReasonDescription = &#63;.
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @return the number of matching leave reasons
	 */
	public static int countByleaveReasonDescription(
		String leaveReasonDescription) {

		return getPersistence().countByleaveReasonDescription(
			leaveReasonDescription);
	}

	/**
	 * Caches the leave reason in the entity cache if it is enabled.
	 *
	 * @param leaveReason the leave reason
	 */
	public static void cacheResult(LeaveReason leaveReason) {
		getPersistence().cacheResult(leaveReason);
	}

	/**
	 * Caches the leave reasons in the entity cache if it is enabled.
	 *
	 * @param leaveReasons the leave reasons
	 */
	public static void cacheResult(List<LeaveReason> leaveReasons) {
		getPersistence().cacheResult(leaveReasons);
	}

	/**
	 * Creates a new leave reason with the primary key. Does not add the leave reason to the database.
	 *
	 * @param leaveReasonId the primary key for the new leave reason
	 * @return the new leave reason
	 */
	public static LeaveReason create(long leaveReasonId) {
		return getPersistence().create(leaveReasonId);
	}

	/**
	 * Removes the leave reason with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leaveReasonId the primary key of the leave reason
	 * @return the leave reason that was removed
	 * @throws NoSuchReasonException if a leave reason with the primary key could not be found
	 */
	public static LeaveReason remove(long leaveReasonId)
		throws com.adjecti.leave.exception.NoSuchReasonException {

		return getPersistence().remove(leaveReasonId);
	}

	public static LeaveReason updateImpl(LeaveReason leaveReason) {
		return getPersistence().updateImpl(leaveReason);
	}

	/**
	 * Returns the leave reason with the primary key or throws a <code>NoSuchReasonException</code> if it could not be found.
	 *
	 * @param leaveReasonId the primary key of the leave reason
	 * @return the leave reason
	 * @throws NoSuchReasonException if a leave reason with the primary key could not be found
	 */
	public static LeaveReason findByPrimaryKey(long leaveReasonId)
		throws com.adjecti.leave.exception.NoSuchReasonException {

		return getPersistence().findByPrimaryKey(leaveReasonId);
	}

	/**
	 * Returns the leave reason with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param leaveReasonId the primary key of the leave reason
	 * @return the leave reason, or <code>null</code> if a leave reason with the primary key could not be found
	 */
	public static LeaveReason fetchByPrimaryKey(long leaveReasonId) {
		return getPersistence().fetchByPrimaryKey(leaveReasonId);
	}

	/**
	 * Returns all the leave reasons.
	 *
	 * @return the leave reasons
	 */
	public static List<LeaveReason> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the leave reasons.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveReasonModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of leave reasons
	 * @param end the upper bound of the range of leave reasons (not inclusive)
	 * @return the range of leave reasons
	 */
	public static List<LeaveReason> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the leave reasons.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveReasonModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of leave reasons
	 * @param end the upper bound of the range of leave reasons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of leave reasons
	 */
	public static List<LeaveReason> findAll(
		int start, int end, OrderByComparator<LeaveReason> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the leave reasons.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LeaveReasonModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of leave reasons
	 * @param end the upper bound of the range of leave reasons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of leave reasons
	 */
	public static List<LeaveReason> findAll(
		int start, int end, OrderByComparator<LeaveReason> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the leave reasons from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of leave reasons.
	 *
	 * @return the number of leave reasons
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static LeaveReasonPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<LeaveReasonPersistence, LeaveReasonPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(LeaveReasonPersistence.class);

		ServiceTracker<LeaveReasonPersistence, LeaveReasonPersistence>
			serviceTracker =
				new ServiceTracker
					<LeaveReasonPersistence, LeaveReasonPersistence>(
						bundle.getBundleContext(), LeaveReasonPersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}