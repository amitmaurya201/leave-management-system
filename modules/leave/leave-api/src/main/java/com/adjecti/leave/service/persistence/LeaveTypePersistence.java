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

import com.adjecti.leave.exception.NoSuchTypeException;
import com.adjecti.leave.model.LeaveType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the leave type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeaveTypeUtil
 * @generated
 */
@ProviderType
public interface LeaveTypePersistence extends BasePersistence<LeaveType> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LeaveTypeUtil} to access the leave type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the leave types where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching leave types
	 */
	public java.util.List<LeaveType> findByUuid(String uuid);

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
	public java.util.List<LeaveType> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<LeaveType> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
			orderByComparator);

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
	public java.util.List<LeaveType> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first leave type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave type
	 * @throws NoSuchTypeException if a matching leave type could not be found
	 */
	public LeaveType findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
				orderByComparator)
		throws NoSuchTypeException;

	/**
	 * Returns the first leave type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	public LeaveType fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
			orderByComparator);

	/**
	 * Returns the last leave type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave type
	 * @throws NoSuchTypeException if a matching leave type could not be found
	 */
	public LeaveType findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
				orderByComparator)
		throws NoSuchTypeException;

	/**
	 * Returns the last leave type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	public LeaveType fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
			orderByComparator);

	/**
	 * Returns the leave types before and after the current leave type in the ordered set where uuid = &#63;.
	 *
	 * @param leaveTypeId the primary key of the current leave type
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next leave type
	 * @throws NoSuchTypeException if a leave type with the primary key could not be found
	 */
	public LeaveType[] findByUuid_PrevAndNext(
			long leaveTypeId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
				orderByComparator)
		throws NoSuchTypeException;

	/**
	 * Removes all the leave types where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of leave types where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching leave types
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the leave type where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTypeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching leave type
	 * @throws NoSuchTypeException if a matching leave type could not be found
	 */
	public LeaveType findByUUID_G(String uuid, long groupId)
		throws NoSuchTypeException;

	/**
	 * Returns the leave type where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	public LeaveType fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the leave type where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	public LeaveType fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the leave type where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the leave type that was removed
	 */
	public LeaveType removeByUUID_G(String uuid, long groupId)
		throws NoSuchTypeException;

	/**
	 * Returns the number of leave types where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching leave types
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the leave types where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching leave types
	 */
	public java.util.List<LeaveType> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<LeaveType> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<LeaveType> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
			orderByComparator);

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
	public java.util.List<LeaveType> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first leave type in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave type
	 * @throws NoSuchTypeException if a matching leave type could not be found
	 */
	public LeaveType findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
				orderByComparator)
		throws NoSuchTypeException;

	/**
	 * Returns the first leave type in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	public LeaveType fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
			orderByComparator);

	/**
	 * Returns the last leave type in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave type
	 * @throws NoSuchTypeException if a matching leave type could not be found
	 */
	public LeaveType findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
				orderByComparator)
		throws NoSuchTypeException;

	/**
	 * Returns the last leave type in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	public LeaveType fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
			orderByComparator);

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
	public LeaveType[] findByUuid_C_PrevAndNext(
			long leaveTypeId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
				orderByComparator)
		throws NoSuchTypeException;

	/**
	 * Removes all the leave types where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of leave types where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching leave types
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the leave types where leaveName = &#63;.
	 *
	 * @param leaveName the leave name
	 * @return the matching leave types
	 */
	public java.util.List<LeaveType> findByleaveName(String leaveName);

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
	public java.util.List<LeaveType> findByleaveName(
		String leaveName, int start, int end);

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
	public java.util.List<LeaveType> findByleaveName(
		String leaveName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
			orderByComparator);

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
	public java.util.List<LeaveType> findByleaveName(
		String leaveName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first leave type in the ordered set where leaveName = &#63;.
	 *
	 * @param leaveName the leave name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave type
	 * @throws NoSuchTypeException if a matching leave type could not be found
	 */
	public LeaveType findByleaveName_First(
			String leaveName,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
				orderByComparator)
		throws NoSuchTypeException;

	/**
	 * Returns the first leave type in the ordered set where leaveName = &#63;.
	 *
	 * @param leaveName the leave name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	public LeaveType fetchByleaveName_First(
		String leaveName,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
			orderByComparator);

	/**
	 * Returns the last leave type in the ordered set where leaveName = &#63;.
	 *
	 * @param leaveName the leave name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave type
	 * @throws NoSuchTypeException if a matching leave type could not be found
	 */
	public LeaveType findByleaveName_Last(
			String leaveName,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
				orderByComparator)
		throws NoSuchTypeException;

	/**
	 * Returns the last leave type in the ordered set where leaveName = &#63;.
	 *
	 * @param leaveName the leave name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	public LeaveType fetchByleaveName_Last(
		String leaveName,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
			orderByComparator);

	/**
	 * Returns the leave types before and after the current leave type in the ordered set where leaveName = &#63;.
	 *
	 * @param leaveTypeId the primary key of the current leave type
	 * @param leaveName the leave name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next leave type
	 * @throws NoSuchTypeException if a leave type with the primary key could not be found
	 */
	public LeaveType[] findByleaveName_PrevAndNext(
			long leaveTypeId, String leaveName,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
				orderByComparator)
		throws NoSuchTypeException;

	/**
	 * Removes all the leave types where leaveName = &#63; from the database.
	 *
	 * @param leaveName the leave name
	 */
	public void removeByleaveName(String leaveName);

	/**
	 * Returns the number of leave types where leaveName = &#63;.
	 *
	 * @param leaveName the leave name
	 * @return the number of matching leave types
	 */
	public int countByleaveName(String leaveName);

	/**
	 * Caches the leave type in the entity cache if it is enabled.
	 *
	 * @param leaveType the leave type
	 */
	public void cacheResult(LeaveType leaveType);

	/**
	 * Caches the leave types in the entity cache if it is enabled.
	 *
	 * @param leaveTypes the leave types
	 */
	public void cacheResult(java.util.List<LeaveType> leaveTypes);

	/**
	 * Creates a new leave type with the primary key. Does not add the leave type to the database.
	 *
	 * @param leaveTypeId the primary key for the new leave type
	 * @return the new leave type
	 */
	public LeaveType create(long leaveTypeId);

	/**
	 * Removes the leave type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leaveTypeId the primary key of the leave type
	 * @return the leave type that was removed
	 * @throws NoSuchTypeException if a leave type with the primary key could not be found
	 */
	public LeaveType remove(long leaveTypeId) throws NoSuchTypeException;

	public LeaveType updateImpl(LeaveType leaveType);

	/**
	 * Returns the leave type with the primary key or throws a <code>NoSuchTypeException</code> if it could not be found.
	 *
	 * @param leaveTypeId the primary key of the leave type
	 * @return the leave type
	 * @throws NoSuchTypeException if a leave type with the primary key could not be found
	 */
	public LeaveType findByPrimaryKey(long leaveTypeId)
		throws NoSuchTypeException;

	/**
	 * Returns the leave type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param leaveTypeId the primary key of the leave type
	 * @return the leave type, or <code>null</code> if a leave type with the primary key could not be found
	 */
	public LeaveType fetchByPrimaryKey(long leaveTypeId);

	/**
	 * Returns all the leave types.
	 *
	 * @return the leave types
	 */
	public java.util.List<LeaveType> findAll();

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
	public java.util.List<LeaveType> findAll(int start, int end);

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
	public java.util.List<LeaveType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
			orderByComparator);

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
	public java.util.List<LeaveType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveType>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the leave types from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of leave types.
	 *
	 * @return the number of leave types
	 */
	public int countAll();

}