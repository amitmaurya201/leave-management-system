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

import com.adjecti.leave.exception.NoSuchReasonException;
import com.adjecti.leave.model.LeaveReason;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the leave reason service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeaveReasonUtil
 * @generated
 */
@ProviderType
public interface LeaveReasonPersistence extends BasePersistence<LeaveReason> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LeaveReasonUtil} to access the leave reason persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the leave reasons where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching leave reasons
	 */
	public java.util.List<LeaveReason> findByUuid(String uuid);

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
	public java.util.List<LeaveReason> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<LeaveReason> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
			orderByComparator);

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
	public java.util.List<LeaveReason> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first leave reason in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave reason
	 * @throws NoSuchReasonException if a matching leave reason could not be found
	 */
	public LeaveReason findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
				orderByComparator)
		throws NoSuchReasonException;

	/**
	 * Returns the first leave reason in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	public LeaveReason fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
			orderByComparator);

	/**
	 * Returns the last leave reason in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave reason
	 * @throws NoSuchReasonException if a matching leave reason could not be found
	 */
	public LeaveReason findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
				orderByComparator)
		throws NoSuchReasonException;

	/**
	 * Returns the last leave reason in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	public LeaveReason fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
			orderByComparator);

	/**
	 * Returns the leave reasons before and after the current leave reason in the ordered set where uuid = &#63;.
	 *
	 * @param leaveReasonId the primary key of the current leave reason
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next leave reason
	 * @throws NoSuchReasonException if a leave reason with the primary key could not be found
	 */
	public LeaveReason[] findByUuid_PrevAndNext(
			long leaveReasonId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
				orderByComparator)
		throws NoSuchReasonException;

	/**
	 * Removes all the leave reasons where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of leave reasons where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching leave reasons
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the leave reason where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchReasonException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching leave reason
	 * @throws NoSuchReasonException if a matching leave reason could not be found
	 */
	public LeaveReason findByUUID_G(String uuid, long groupId)
		throws NoSuchReasonException;

	/**
	 * Returns the leave reason where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	public LeaveReason fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the leave reason where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	public LeaveReason fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the leave reason where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the leave reason that was removed
	 */
	public LeaveReason removeByUUID_G(String uuid, long groupId)
		throws NoSuchReasonException;

	/**
	 * Returns the number of leave reasons where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching leave reasons
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the leave reasons where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching leave reasons
	 */
	public java.util.List<LeaveReason> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<LeaveReason> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<LeaveReason> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
			orderByComparator);

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
	public java.util.List<LeaveReason> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first leave reason in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave reason
	 * @throws NoSuchReasonException if a matching leave reason could not be found
	 */
	public LeaveReason findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
				orderByComparator)
		throws NoSuchReasonException;

	/**
	 * Returns the first leave reason in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	public LeaveReason fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
			orderByComparator);

	/**
	 * Returns the last leave reason in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave reason
	 * @throws NoSuchReasonException if a matching leave reason could not be found
	 */
	public LeaveReason findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
				orderByComparator)
		throws NoSuchReasonException;

	/**
	 * Returns the last leave reason in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	public LeaveReason fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
			orderByComparator);

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
	public LeaveReason[] findByUuid_C_PrevAndNext(
			long leaveReasonId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
				orderByComparator)
		throws NoSuchReasonException;

	/**
	 * Removes all the leave reasons where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of leave reasons where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching leave reasons
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the leave reasons where leaveReasonDescription = &#63;.
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @return the matching leave reasons
	 */
	public java.util.List<LeaveReason> findByleaveReasonDescription(
		String leaveReasonDescription);

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
	public java.util.List<LeaveReason> findByleaveReasonDescription(
		String leaveReasonDescription, int start, int end);

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
	public java.util.List<LeaveReason> findByleaveReasonDescription(
		String leaveReasonDescription, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
			orderByComparator);

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
	public java.util.List<LeaveReason> findByleaveReasonDescription(
		String leaveReasonDescription, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first leave reason in the ordered set where leaveReasonDescription = &#63;.
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave reason
	 * @throws NoSuchReasonException if a matching leave reason could not be found
	 */
	public LeaveReason findByleaveReasonDescription_First(
			String leaveReasonDescription,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
				orderByComparator)
		throws NoSuchReasonException;

	/**
	 * Returns the first leave reason in the ordered set where leaveReasonDescription = &#63;.
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	public LeaveReason fetchByleaveReasonDescription_First(
		String leaveReasonDescription,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
			orderByComparator);

	/**
	 * Returns the last leave reason in the ordered set where leaveReasonDescription = &#63;.
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave reason
	 * @throws NoSuchReasonException if a matching leave reason could not be found
	 */
	public LeaveReason findByleaveReasonDescription_Last(
			String leaveReasonDescription,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
				orderByComparator)
		throws NoSuchReasonException;

	/**
	 * Returns the last leave reason in the ordered set where leaveReasonDescription = &#63;.
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	public LeaveReason fetchByleaveReasonDescription_Last(
		String leaveReasonDescription,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
			orderByComparator);

	/**
	 * Returns the leave reasons before and after the current leave reason in the ordered set where leaveReasonDescription = &#63;.
	 *
	 * @param leaveReasonId the primary key of the current leave reason
	 * @param leaveReasonDescription the leave reason description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next leave reason
	 * @throws NoSuchReasonException if a leave reason with the primary key could not be found
	 */
	public LeaveReason[] findByleaveReasonDescription_PrevAndNext(
			long leaveReasonId, String leaveReasonDescription,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
				orderByComparator)
		throws NoSuchReasonException;

	/**
	 * Removes all the leave reasons where leaveReasonDescription = &#63; from the database.
	 *
	 * @param leaveReasonDescription the leave reason description
	 */
	public void removeByleaveReasonDescription(String leaveReasonDescription);

	/**
	 * Returns the number of leave reasons where leaveReasonDescription = &#63;.
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @return the number of matching leave reasons
	 */
	public int countByleaveReasonDescription(String leaveReasonDescription);

	/**
	 * Caches the leave reason in the entity cache if it is enabled.
	 *
	 * @param leaveReason the leave reason
	 */
	public void cacheResult(LeaveReason leaveReason);

	/**
	 * Caches the leave reasons in the entity cache if it is enabled.
	 *
	 * @param leaveReasons the leave reasons
	 */
	public void cacheResult(java.util.List<LeaveReason> leaveReasons);

	/**
	 * Creates a new leave reason with the primary key. Does not add the leave reason to the database.
	 *
	 * @param leaveReasonId the primary key for the new leave reason
	 * @return the new leave reason
	 */
	public LeaveReason create(long leaveReasonId);

	/**
	 * Removes the leave reason with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leaveReasonId the primary key of the leave reason
	 * @return the leave reason that was removed
	 * @throws NoSuchReasonException if a leave reason with the primary key could not be found
	 */
	public LeaveReason remove(long leaveReasonId) throws NoSuchReasonException;

	public LeaveReason updateImpl(LeaveReason leaveReason);

	/**
	 * Returns the leave reason with the primary key or throws a <code>NoSuchReasonException</code> if it could not be found.
	 *
	 * @param leaveReasonId the primary key of the leave reason
	 * @return the leave reason
	 * @throws NoSuchReasonException if a leave reason with the primary key could not be found
	 */
	public LeaveReason findByPrimaryKey(long leaveReasonId)
		throws NoSuchReasonException;

	/**
	 * Returns the leave reason with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param leaveReasonId the primary key of the leave reason
	 * @return the leave reason, or <code>null</code> if a leave reason with the primary key could not be found
	 */
	public LeaveReason fetchByPrimaryKey(long leaveReasonId);

	/**
	 * Returns all the leave reasons.
	 *
	 * @return the leave reasons
	 */
	public java.util.List<LeaveReason> findAll();

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
	public java.util.List<LeaveReason> findAll(int start, int end);

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
	public java.util.List<LeaveReason> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
			orderByComparator);

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
	public java.util.List<LeaveReason> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveReason>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the leave reasons from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of leave reasons.
	 *
	 * @return the number of leave reasons
	 */
	public int countAll();

}