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

import com.adjecti.leave.exception.NoSuchApplicationException;
import com.adjecti.leave.model.LeaveApplication;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the leave application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeaveApplicationUtil
 * @generated
 */
@ProviderType
public interface LeaveApplicationPersistence
	extends BasePersistence<LeaveApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LeaveApplicationUtil} to access the leave application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the leave applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching leave applications
	 */
	public java.util.List<LeaveApplication> findByUuid(String uuid);

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
	public java.util.List<LeaveApplication> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<LeaveApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
			orderByComparator);

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
	public java.util.List<LeaveApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first leave application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave application
	 * @throws NoSuchApplicationException if a matching leave application could not be found
	 */
	public LeaveApplication findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
				orderByComparator)
		throws NoSuchApplicationException;

	/**
	 * Returns the first leave application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave application, or <code>null</code> if a matching leave application could not be found
	 */
	public LeaveApplication fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
			orderByComparator);

	/**
	 * Returns the last leave application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave application
	 * @throws NoSuchApplicationException if a matching leave application could not be found
	 */
	public LeaveApplication findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
				orderByComparator)
		throws NoSuchApplicationException;

	/**
	 * Returns the last leave application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave application, or <code>null</code> if a matching leave application could not be found
	 */
	public LeaveApplication fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
			orderByComparator);

	/**
	 * Returns the leave applications before and after the current leave application in the ordered set where uuid = &#63;.
	 *
	 * @param leaveApplicationId the primary key of the current leave application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next leave application
	 * @throws NoSuchApplicationException if a leave application with the primary key could not be found
	 */
	public LeaveApplication[] findByUuid_PrevAndNext(
			long leaveApplicationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
				orderByComparator)
		throws NoSuchApplicationException;

	/**
	 * Removes all the leave applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of leave applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching leave applications
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the leave application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching leave application
	 * @throws NoSuchApplicationException if a matching leave application could not be found
	 */
	public LeaveApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchApplicationException;

	/**
	 * Returns the leave application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching leave application, or <code>null</code> if a matching leave application could not be found
	 */
	public LeaveApplication fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the leave application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching leave application, or <code>null</code> if a matching leave application could not be found
	 */
	public LeaveApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the leave application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the leave application that was removed
	 */
	public LeaveApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchApplicationException;

	/**
	 * Returns the number of leave applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching leave applications
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the leave applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching leave applications
	 */
	public java.util.List<LeaveApplication> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<LeaveApplication> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<LeaveApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
			orderByComparator);

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
	public java.util.List<LeaveApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first leave application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave application
	 * @throws NoSuchApplicationException if a matching leave application could not be found
	 */
	public LeaveApplication findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
				orderByComparator)
		throws NoSuchApplicationException;

	/**
	 * Returns the first leave application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave application, or <code>null</code> if a matching leave application could not be found
	 */
	public LeaveApplication fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
			orderByComparator);

	/**
	 * Returns the last leave application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave application
	 * @throws NoSuchApplicationException if a matching leave application could not be found
	 */
	public LeaveApplication findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
				orderByComparator)
		throws NoSuchApplicationException;

	/**
	 * Returns the last leave application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave application, or <code>null</code> if a matching leave application could not be found
	 */
	public LeaveApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
			orderByComparator);

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
	public LeaveApplication[] findByUuid_C_PrevAndNext(
			long leaveApplicationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
				orderByComparator)
		throws NoSuchApplicationException;

	/**
	 * Removes all the leave applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of leave applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching leave applications
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the leave applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching leave applications
	 */
	public java.util.List<LeaveApplication> findBystatus(String status);

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
	public java.util.List<LeaveApplication> findBystatus(
		String status, int start, int end);

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
	public java.util.List<LeaveApplication> findBystatus(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
			orderByComparator);

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
	public java.util.List<LeaveApplication> findBystatus(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first leave application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave application
	 * @throws NoSuchApplicationException if a matching leave application could not be found
	 */
	public LeaveApplication findBystatus_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
				orderByComparator)
		throws NoSuchApplicationException;

	/**
	 * Returns the first leave application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave application, or <code>null</code> if a matching leave application could not be found
	 */
	public LeaveApplication fetchBystatus_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
			orderByComparator);

	/**
	 * Returns the last leave application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave application
	 * @throws NoSuchApplicationException if a matching leave application could not be found
	 */
	public LeaveApplication findBystatus_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
				orderByComparator)
		throws NoSuchApplicationException;

	/**
	 * Returns the last leave application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave application, or <code>null</code> if a matching leave application could not be found
	 */
	public LeaveApplication fetchBystatus_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
			orderByComparator);

	/**
	 * Returns the leave applications before and after the current leave application in the ordered set where status = &#63;.
	 *
	 * @param leaveApplicationId the primary key of the current leave application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next leave application
	 * @throws NoSuchApplicationException if a leave application with the primary key could not be found
	 */
	public LeaveApplication[] findBystatus_PrevAndNext(
			long leaveApplicationId, String status,
			com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
				orderByComparator)
		throws NoSuchApplicationException;

	/**
	 * Removes all the leave applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBystatus(String status);

	/**
	 * Returns the number of leave applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching leave applications
	 */
	public int countBystatus(String status);

	/**
	 * Caches the leave application in the entity cache if it is enabled.
	 *
	 * @param leaveApplication the leave application
	 */
	public void cacheResult(LeaveApplication leaveApplication);

	/**
	 * Caches the leave applications in the entity cache if it is enabled.
	 *
	 * @param leaveApplications the leave applications
	 */
	public void cacheResult(java.util.List<LeaveApplication> leaveApplications);

	/**
	 * Creates a new leave application with the primary key. Does not add the leave application to the database.
	 *
	 * @param leaveApplicationId the primary key for the new leave application
	 * @return the new leave application
	 */
	public LeaveApplication create(long leaveApplicationId);

	/**
	 * Removes the leave application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leaveApplicationId the primary key of the leave application
	 * @return the leave application that was removed
	 * @throws NoSuchApplicationException if a leave application with the primary key could not be found
	 */
	public LeaveApplication remove(long leaveApplicationId)
		throws NoSuchApplicationException;

	public LeaveApplication updateImpl(LeaveApplication leaveApplication);

	/**
	 * Returns the leave application with the primary key or throws a <code>NoSuchApplicationException</code> if it could not be found.
	 *
	 * @param leaveApplicationId the primary key of the leave application
	 * @return the leave application
	 * @throws NoSuchApplicationException if a leave application with the primary key could not be found
	 */
	public LeaveApplication findByPrimaryKey(long leaveApplicationId)
		throws NoSuchApplicationException;

	/**
	 * Returns the leave application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param leaveApplicationId the primary key of the leave application
	 * @return the leave application, or <code>null</code> if a leave application with the primary key could not be found
	 */
	public LeaveApplication fetchByPrimaryKey(long leaveApplicationId);

	/**
	 * Returns all the leave applications.
	 *
	 * @return the leave applications
	 */
	public java.util.List<LeaveApplication> findAll();

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
	public java.util.List<LeaveApplication> findAll(int start, int end);

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
	public java.util.List<LeaveApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
			orderByComparator);

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
	public java.util.List<LeaveApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LeaveApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the leave applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of leave applications.
	 *
	 * @return the number of leave applications
	 */
	public int countAll();

}