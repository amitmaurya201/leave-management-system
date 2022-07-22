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

package com.adjecti.leave.service.persistence.impl;

import com.adjecti.leave.exception.NoSuchTypeException;
import com.adjecti.leave.model.LeaveType;
import com.adjecti.leave.model.impl.LeaveTypeImpl;
import com.adjecti.leave.model.impl.LeaveTypeModelImpl;
import com.adjecti.leave.service.persistence.LeaveTypePersistence;
import com.adjecti.leave.service.persistence.impl.constants.LeavePersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the leave type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = LeaveTypePersistence.class)
public class LeaveTypePersistenceImpl
	extends BasePersistenceImpl<LeaveType> implements LeaveTypePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>LeaveTypeUtil</code> to access the leave type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		LeaveTypeImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the leave types where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching leave types
	 */
	@Override
	public List<LeaveType> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LeaveType> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<LeaveType> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<LeaveType> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<LeaveType> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<LeaveType> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<LeaveType> list = null;

		if (useFinderCache) {
			list = (List<LeaveType>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LeaveType leaveType : list) {
					if (!uuid.equals(leaveType.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_LEAVETYPE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(LeaveTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<LeaveType>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first leave type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave type
	 * @throws NoSuchTypeException if a matching leave type could not be found
	 */
	@Override
	public LeaveType findByUuid_First(
			String uuid, OrderByComparator<LeaveType> orderByComparator)
		throws NoSuchTypeException {

		LeaveType leaveType = fetchByUuid_First(uuid, orderByComparator);

		if (leaveType != null) {
			return leaveType;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchTypeException(sb.toString());
	}

	/**
	 * Returns the first leave type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	@Override
	public LeaveType fetchByUuid_First(
		String uuid, OrderByComparator<LeaveType> orderByComparator) {

		List<LeaveType> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last leave type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave type
	 * @throws NoSuchTypeException if a matching leave type could not be found
	 */
	@Override
	public LeaveType findByUuid_Last(
			String uuid, OrderByComparator<LeaveType> orderByComparator)
		throws NoSuchTypeException {

		LeaveType leaveType = fetchByUuid_Last(uuid, orderByComparator);

		if (leaveType != null) {
			return leaveType;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchTypeException(sb.toString());
	}

	/**
	 * Returns the last leave type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	@Override
	public LeaveType fetchByUuid_Last(
		String uuid, OrderByComparator<LeaveType> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<LeaveType> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LeaveType[] findByUuid_PrevAndNext(
			long leaveTypeId, String uuid,
			OrderByComparator<LeaveType> orderByComparator)
		throws NoSuchTypeException {

		uuid = Objects.toString(uuid, "");

		LeaveType leaveType = findByPrimaryKey(leaveTypeId);

		Session session = null;

		try {
			session = openSession();

			LeaveType[] array = new LeaveTypeImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, leaveType, uuid, orderByComparator, true);

			array[1] = leaveType;

			array[2] = getByUuid_PrevAndNext(
				session, leaveType, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected LeaveType getByUuid_PrevAndNext(
		Session session, LeaveType leaveType, String uuid,
		OrderByComparator<LeaveType> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_LEAVETYPE_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(LeaveTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(leaveType)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<LeaveType> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the leave types where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (LeaveType leaveType :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(leaveType);
		}
	}

	/**
	 * Returns the number of leave types where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching leave types
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_LEAVETYPE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"leaveType.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(leaveType.uuid IS NULL OR leaveType.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the leave type where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTypeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching leave type
	 * @throws NoSuchTypeException if a matching leave type could not be found
	 */
	@Override
	public LeaveType findByUUID_G(String uuid, long groupId)
		throws NoSuchTypeException {

		LeaveType leaveType = fetchByUUID_G(uuid, groupId);

		if (leaveType == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTypeException(sb.toString());
		}

		return leaveType;
	}

	/**
	 * Returns the leave type where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	@Override
	public LeaveType fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the leave type where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	@Override
	public LeaveType fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof LeaveType) {
			LeaveType leaveType = (LeaveType)result;

			if (!Objects.equals(uuid, leaveType.getUuid()) ||
				(groupId != leaveType.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_LEAVETYPE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<LeaveType> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					LeaveType leaveType = list.get(0);

					result = leaveType;

					cacheResult(leaveType);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (LeaveType)result;
		}
	}

	/**
	 * Removes the leave type where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the leave type that was removed
	 */
	@Override
	public LeaveType removeByUUID_G(String uuid, long groupId)
		throws NoSuchTypeException {

		LeaveType leaveType = findByUUID_G(uuid, groupId);

		return remove(leaveType);
	}

	/**
	 * Returns the number of leave types where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching leave types
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_LEAVETYPE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"leaveType.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(leaveType.uuid IS NULL OR leaveType.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"leaveType.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the leave types where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching leave types
	 */
	@Override
	public List<LeaveType> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LeaveType> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<LeaveType> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LeaveType> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<LeaveType> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LeaveType> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<LeaveType> list = null;

		if (useFinderCache) {
			list = (List<LeaveType>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LeaveType leaveType : list) {
					if (!uuid.equals(leaveType.getUuid()) ||
						(companyId != leaveType.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_LEAVETYPE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(LeaveTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<LeaveType>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public LeaveType findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<LeaveType> orderByComparator)
		throws NoSuchTypeException {

		LeaveType leaveType = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (leaveType != null) {
			return leaveType;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchTypeException(sb.toString());
	}

	/**
	 * Returns the first leave type in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	@Override
	public LeaveType fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<LeaveType> orderByComparator) {

		List<LeaveType> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LeaveType findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<LeaveType> orderByComparator)
		throws NoSuchTypeException {

		LeaveType leaveType = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (leaveType != null) {
			return leaveType;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchTypeException(sb.toString());
	}

	/**
	 * Returns the last leave type in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	@Override
	public LeaveType fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<LeaveType> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<LeaveType> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LeaveType[] findByUuid_C_PrevAndNext(
			long leaveTypeId, String uuid, long companyId,
			OrderByComparator<LeaveType> orderByComparator)
		throws NoSuchTypeException {

		uuid = Objects.toString(uuid, "");

		LeaveType leaveType = findByPrimaryKey(leaveTypeId);

		Session session = null;

		try {
			session = openSession();

			LeaveType[] array = new LeaveTypeImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, leaveType, uuid, companyId, orderByComparator, true);

			array[1] = leaveType;

			array[2] = getByUuid_C_PrevAndNext(
				session, leaveType, uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected LeaveType getByUuid_C_PrevAndNext(
		Session session, LeaveType leaveType, String uuid, long companyId,
		OrderByComparator<LeaveType> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_LEAVETYPE_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(LeaveTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(leaveType)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<LeaveType> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the leave types where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (LeaveType leaveType :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(leaveType);
		}
	}

	/**
	 * Returns the number of leave types where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching leave types
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_LEAVETYPE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"leaveType.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(leaveType.uuid IS NULL OR leaveType.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"leaveType.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByleaveName;
	private FinderPath _finderPathWithoutPaginationFindByleaveName;
	private FinderPath _finderPathCountByleaveName;

	/**
	 * Returns all the leave types where leaveName = &#63;.
	 *
	 * @param leaveName the leave name
	 * @return the matching leave types
	 */
	@Override
	public List<LeaveType> findByleaveName(String leaveName) {
		return findByleaveName(
			leaveName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LeaveType> findByleaveName(
		String leaveName, int start, int end) {

		return findByleaveName(leaveName, start, end, null);
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
	@Override
	public List<LeaveType> findByleaveName(
		String leaveName, int start, int end,
		OrderByComparator<LeaveType> orderByComparator) {

		return findByleaveName(leaveName, start, end, orderByComparator, true);
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
	@Override
	public List<LeaveType> findByleaveName(
		String leaveName, int start, int end,
		OrderByComparator<LeaveType> orderByComparator,
		boolean useFinderCache) {

		leaveName = Objects.toString(leaveName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByleaveName;
				finderArgs = new Object[] {leaveName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByleaveName;
			finderArgs = new Object[] {
				leaveName, start, end, orderByComparator
			};
		}

		List<LeaveType> list = null;

		if (useFinderCache) {
			list = (List<LeaveType>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LeaveType leaveType : list) {
					if (!leaveName.equals(leaveType.getLeaveName())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_LEAVETYPE_WHERE);

			boolean bindLeaveName = false;

			if (leaveName.isEmpty()) {
				sb.append(_FINDER_COLUMN_LEAVENAME_LEAVENAME_3);
			}
			else {
				bindLeaveName = true;

				sb.append(_FINDER_COLUMN_LEAVENAME_LEAVENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(LeaveTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindLeaveName) {
					queryPos.add(leaveName);
				}

				list = (List<LeaveType>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first leave type in the ordered set where leaveName = &#63;.
	 *
	 * @param leaveName the leave name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave type
	 * @throws NoSuchTypeException if a matching leave type could not be found
	 */
	@Override
	public LeaveType findByleaveName_First(
			String leaveName, OrderByComparator<LeaveType> orderByComparator)
		throws NoSuchTypeException {

		LeaveType leaveType = fetchByleaveName_First(
			leaveName, orderByComparator);

		if (leaveType != null) {
			return leaveType;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("leaveName=");
		sb.append(leaveName);

		sb.append("}");

		throw new NoSuchTypeException(sb.toString());
	}

	/**
	 * Returns the first leave type in the ordered set where leaveName = &#63;.
	 *
	 * @param leaveName the leave name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	@Override
	public LeaveType fetchByleaveName_First(
		String leaveName, OrderByComparator<LeaveType> orderByComparator) {

		List<LeaveType> list = findByleaveName(
			leaveName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last leave type in the ordered set where leaveName = &#63;.
	 *
	 * @param leaveName the leave name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave type
	 * @throws NoSuchTypeException if a matching leave type could not be found
	 */
	@Override
	public LeaveType findByleaveName_Last(
			String leaveName, OrderByComparator<LeaveType> orderByComparator)
		throws NoSuchTypeException {

		LeaveType leaveType = fetchByleaveName_Last(
			leaveName, orderByComparator);

		if (leaveType != null) {
			return leaveType;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("leaveName=");
		sb.append(leaveName);

		sb.append("}");

		throw new NoSuchTypeException(sb.toString());
	}

	/**
	 * Returns the last leave type in the ordered set where leaveName = &#63;.
	 *
	 * @param leaveName the leave name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave type, or <code>null</code> if a matching leave type could not be found
	 */
	@Override
	public LeaveType fetchByleaveName_Last(
		String leaveName, OrderByComparator<LeaveType> orderByComparator) {

		int count = countByleaveName(leaveName);

		if (count == 0) {
			return null;
		}

		List<LeaveType> list = findByleaveName(
			leaveName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LeaveType[] findByleaveName_PrevAndNext(
			long leaveTypeId, String leaveName,
			OrderByComparator<LeaveType> orderByComparator)
		throws NoSuchTypeException {

		leaveName = Objects.toString(leaveName, "");

		LeaveType leaveType = findByPrimaryKey(leaveTypeId);

		Session session = null;

		try {
			session = openSession();

			LeaveType[] array = new LeaveTypeImpl[3];

			array[0] = getByleaveName_PrevAndNext(
				session, leaveType, leaveName, orderByComparator, true);

			array[1] = leaveType;

			array[2] = getByleaveName_PrevAndNext(
				session, leaveType, leaveName, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected LeaveType getByleaveName_PrevAndNext(
		Session session, LeaveType leaveType, String leaveName,
		OrderByComparator<LeaveType> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_LEAVETYPE_WHERE);

		boolean bindLeaveName = false;

		if (leaveName.isEmpty()) {
			sb.append(_FINDER_COLUMN_LEAVENAME_LEAVENAME_3);
		}
		else {
			bindLeaveName = true;

			sb.append(_FINDER_COLUMN_LEAVENAME_LEAVENAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(LeaveTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindLeaveName) {
			queryPos.add(leaveName);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(leaveType)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<LeaveType> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the leave types where leaveName = &#63; from the database.
	 *
	 * @param leaveName the leave name
	 */
	@Override
	public void removeByleaveName(String leaveName) {
		for (LeaveType leaveType :
				findByleaveName(
					leaveName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(leaveType);
		}
	}

	/**
	 * Returns the number of leave types where leaveName = &#63;.
	 *
	 * @param leaveName the leave name
	 * @return the number of matching leave types
	 */
	@Override
	public int countByleaveName(String leaveName) {
		leaveName = Objects.toString(leaveName, "");

		FinderPath finderPath = _finderPathCountByleaveName;

		Object[] finderArgs = new Object[] {leaveName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_LEAVETYPE_WHERE);

			boolean bindLeaveName = false;

			if (leaveName.isEmpty()) {
				sb.append(_FINDER_COLUMN_LEAVENAME_LEAVENAME_3);
			}
			else {
				bindLeaveName = true;

				sb.append(_FINDER_COLUMN_LEAVENAME_LEAVENAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindLeaveName) {
					queryPos.add(leaveName);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_LEAVENAME_LEAVENAME_2 =
		"leaveType.leaveName = ?";

	private static final String _FINDER_COLUMN_LEAVENAME_LEAVENAME_3 =
		"(leaveType.leaveName IS NULL OR leaveType.leaveName = '')";

	public LeaveTypePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(LeaveType.class);

		setModelImplClass(LeaveTypeImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the leave type in the entity cache if it is enabled.
	 *
	 * @param leaveType the leave type
	 */
	@Override
	public void cacheResult(LeaveType leaveType) {
		entityCache.putResult(
			LeaveTypeImpl.class, leaveType.getPrimaryKey(), leaveType);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {leaveType.getUuid(), leaveType.getGroupId()},
			leaveType);
	}

	/**
	 * Caches the leave types in the entity cache if it is enabled.
	 *
	 * @param leaveTypes the leave types
	 */
	@Override
	public void cacheResult(List<LeaveType> leaveTypes) {
		for (LeaveType leaveType : leaveTypes) {
			if (entityCache.getResult(
					LeaveTypeImpl.class, leaveType.getPrimaryKey()) == null) {

				cacheResult(leaveType);
			}
		}
	}

	/**
	 * Clears the cache for all leave types.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LeaveTypeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the leave type.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LeaveType leaveType) {
		entityCache.removeResult(LeaveTypeImpl.class, leaveType);
	}

	@Override
	public void clearCache(List<LeaveType> leaveTypes) {
		for (LeaveType leaveType : leaveTypes) {
			entityCache.removeResult(LeaveTypeImpl.class, leaveType);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(LeaveTypeImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		LeaveTypeModelImpl leaveTypeModelImpl) {

		Object[] args = new Object[] {
			leaveTypeModelImpl.getUuid(), leaveTypeModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, leaveTypeModelImpl, false);
	}

	/**
	 * Creates a new leave type with the primary key. Does not add the leave type to the database.
	 *
	 * @param leaveTypeId the primary key for the new leave type
	 * @return the new leave type
	 */
	@Override
	public LeaveType create(long leaveTypeId) {
		LeaveType leaveType = new LeaveTypeImpl();

		leaveType.setNew(true);
		leaveType.setPrimaryKey(leaveTypeId);

		String uuid = PortalUUIDUtil.generate();

		leaveType.setUuid(uuid);

		leaveType.setCompanyId(CompanyThreadLocal.getCompanyId());

		return leaveType;
	}

	/**
	 * Removes the leave type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leaveTypeId the primary key of the leave type
	 * @return the leave type that was removed
	 * @throws NoSuchTypeException if a leave type with the primary key could not be found
	 */
	@Override
	public LeaveType remove(long leaveTypeId) throws NoSuchTypeException {
		return remove((Serializable)leaveTypeId);
	}

	/**
	 * Removes the leave type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the leave type
	 * @return the leave type that was removed
	 * @throws NoSuchTypeException if a leave type with the primary key could not be found
	 */
	@Override
	public LeaveType remove(Serializable primaryKey)
		throws NoSuchTypeException {

		Session session = null;

		try {
			session = openSession();

			LeaveType leaveType = (LeaveType)session.get(
				LeaveTypeImpl.class, primaryKey);

			if (leaveType == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTypeException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(leaveType);
		}
		catch (NoSuchTypeException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected LeaveType removeImpl(LeaveType leaveType) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(leaveType)) {
				leaveType = (LeaveType)session.get(
					LeaveTypeImpl.class, leaveType.getPrimaryKeyObj());
			}

			if (leaveType != null) {
				session.delete(leaveType);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (leaveType != null) {
			clearCache(leaveType);
		}

		return leaveType;
	}

	@Override
	public LeaveType updateImpl(LeaveType leaveType) {
		boolean isNew = leaveType.isNew();

		if (!(leaveType instanceof LeaveTypeModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(leaveType.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(leaveType);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in leaveType proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom LeaveType implementation " +
					leaveType.getClass());
		}

		LeaveTypeModelImpl leaveTypeModelImpl = (LeaveTypeModelImpl)leaveType;

		if (Validator.isNull(leaveType.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			leaveType.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (leaveType.getCreateDate() == null)) {
			if (serviceContext == null) {
				leaveType.setCreateDate(date);
			}
			else {
				leaveType.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!leaveTypeModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				leaveType.setModifiedDate(date);
			}
			else {
				leaveType.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(leaveType);
			}
			else {
				leaveType = (LeaveType)session.merge(leaveType);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			LeaveTypeImpl.class, leaveTypeModelImpl, false, true);

		cacheUniqueFindersCache(leaveTypeModelImpl);

		if (isNew) {
			leaveType.setNew(false);
		}

		leaveType.resetOriginalValues();

		return leaveType;
	}

	/**
	 * Returns the leave type with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the leave type
	 * @return the leave type
	 * @throws NoSuchTypeException if a leave type with the primary key could not be found
	 */
	@Override
	public LeaveType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTypeException {

		LeaveType leaveType = fetchByPrimaryKey(primaryKey);

		if (leaveType == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTypeException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return leaveType;
	}

	/**
	 * Returns the leave type with the primary key or throws a <code>NoSuchTypeException</code> if it could not be found.
	 *
	 * @param leaveTypeId the primary key of the leave type
	 * @return the leave type
	 * @throws NoSuchTypeException if a leave type with the primary key could not be found
	 */
	@Override
	public LeaveType findByPrimaryKey(long leaveTypeId)
		throws NoSuchTypeException {

		return findByPrimaryKey((Serializable)leaveTypeId);
	}

	/**
	 * Returns the leave type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param leaveTypeId the primary key of the leave type
	 * @return the leave type, or <code>null</code> if a leave type with the primary key could not be found
	 */
	@Override
	public LeaveType fetchByPrimaryKey(long leaveTypeId) {
		return fetchByPrimaryKey((Serializable)leaveTypeId);
	}

	/**
	 * Returns all the leave types.
	 *
	 * @return the leave types
	 */
	@Override
	public List<LeaveType> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LeaveType> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<LeaveType> findAll(
		int start, int end, OrderByComparator<LeaveType> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<LeaveType> findAll(
		int start, int end, OrderByComparator<LeaveType> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<LeaveType> list = null;

		if (useFinderCache) {
			list = (List<LeaveType>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_LEAVETYPE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_LEAVETYPE;

				sql = sql.concat(LeaveTypeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<LeaveType>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the leave types from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (LeaveType leaveType : findAll()) {
			remove(leaveType);
		}
	}

	/**
	 * Returns the number of leave types.
	 *
	 * @return the number of leave types
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_LEAVETYPE);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "leaveTypeId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_LEAVETYPE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return LeaveTypeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the leave type persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new LeaveTypeModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", LeaveType.class.getName()));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = _createFinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_finderPathWithPaginationFindByleaveName = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByleaveName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"leaveName"}, true);

		_finderPathWithoutPaginationFindByleaveName = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByleaveName",
			new String[] {String.class.getName()}, new String[] {"leaveName"},
			true);

		_finderPathCountByleaveName = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByleaveName",
			new String[] {String.class.getName()}, new String[] {"leaveName"},
			false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(LeaveTypeImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	@Override
	@Reference(
		target = LeavePersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = LeavePersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = LeavePersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private BundleContext _bundleContext;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_LEAVETYPE =
		"SELECT leaveType FROM LeaveType leaveType";

	private static final String _SQL_SELECT_LEAVETYPE_WHERE =
		"SELECT leaveType FROM LeaveType leaveType WHERE ";

	private static final String _SQL_COUNT_LEAVETYPE =
		"SELECT COUNT(leaveType) FROM LeaveType leaveType";

	private static final String _SQL_COUNT_LEAVETYPE_WHERE =
		"SELECT COUNT(leaveType) FROM LeaveType leaveType WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "leaveType.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No LeaveType exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No LeaveType exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		LeaveTypePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	private FinderPath _createFinderPath(
		String cacheName, String methodName, String[] params,
		String[] columnNames, boolean baseModelResult) {

		FinderPath finderPath = new FinderPath(
			cacheName, methodName, params, columnNames, baseModelResult);

		if (!cacheName.equals(FINDER_CLASS_NAME_LIST_WITH_PAGINATION)) {
			_serviceRegistrations.add(
				_bundleContext.registerService(
					FinderPath.class, finderPath,
					MapUtil.singletonDictionary("cache.name", cacheName)));
		}

		return finderPath;
	}

	private Set<ServiceRegistration<FinderPath>> _serviceRegistrations =
		new HashSet<>();
	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class LeaveTypeModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return FINDER_ARGS_EMPTY;
				}

				return null;
			}

			LeaveTypeModelImpl leaveTypeModelImpl =
				(LeaveTypeModelImpl)baseModel;

			long columnBitmask = leaveTypeModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(leaveTypeModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						leaveTypeModelImpl.getColumnBitmask(columnName);
				}

				if (finderPath.isBaseModelResult() &&
					(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

					finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(leaveTypeModelImpl, columnNames, original);
			}

			return null;
		}

		private static Object[] _getValue(
			LeaveTypeModelImpl leaveTypeModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = leaveTypeModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = leaveTypeModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static final Map<FinderPath, Long>
			_finderPathColumnBitmasksCache = new ConcurrentHashMap<>();

		private static final long _ORDER_BY_COLUMNS_BITMASK;

		static {
			long orderByColumnsBitmask = 0;

			orderByColumnsBitmask |= LeaveTypeModelImpl.getColumnBitmask(
				"leaveName");

			_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
		}

	}

}