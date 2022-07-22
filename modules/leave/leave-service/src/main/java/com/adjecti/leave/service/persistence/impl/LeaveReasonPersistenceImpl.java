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

import com.adjecti.leave.exception.NoSuchReasonException;
import com.adjecti.leave.model.LeaveReason;
import com.adjecti.leave.model.impl.LeaveReasonImpl;
import com.adjecti.leave.model.impl.LeaveReasonModelImpl;
import com.adjecti.leave.service.persistence.LeaveReasonPersistence;
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
 * The persistence implementation for the leave reason service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = LeaveReasonPersistence.class)
public class LeaveReasonPersistenceImpl
	extends BasePersistenceImpl<LeaveReason> implements LeaveReasonPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>LeaveReasonUtil</code> to access the leave reason persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		LeaveReasonImpl.class.getName();

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
	 * Returns all the leave reasons where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching leave reasons
	 */
	@Override
	public List<LeaveReason> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LeaveReason> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<LeaveReason> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<LeaveReason> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<LeaveReason> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<LeaveReason> orderByComparator,
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

		List<LeaveReason> list = null;

		if (useFinderCache) {
			list = (List<LeaveReason>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LeaveReason leaveReason : list) {
					if (!uuid.equals(leaveReason.getUuid())) {
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

			sb.append(_SQL_SELECT_LEAVEREASON_WHERE);

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
				sb.append(LeaveReasonModelImpl.ORDER_BY_JPQL);
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

				list = (List<LeaveReason>)QueryUtil.list(
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
	 * Returns the first leave reason in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave reason
	 * @throws NoSuchReasonException if a matching leave reason could not be found
	 */
	@Override
	public LeaveReason findByUuid_First(
			String uuid, OrderByComparator<LeaveReason> orderByComparator)
		throws NoSuchReasonException {

		LeaveReason leaveReason = fetchByUuid_First(uuid, orderByComparator);

		if (leaveReason != null) {
			return leaveReason;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchReasonException(sb.toString());
	}

	/**
	 * Returns the first leave reason in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	@Override
	public LeaveReason fetchByUuid_First(
		String uuid, OrderByComparator<LeaveReason> orderByComparator) {

		List<LeaveReason> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last leave reason in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave reason
	 * @throws NoSuchReasonException if a matching leave reason could not be found
	 */
	@Override
	public LeaveReason findByUuid_Last(
			String uuid, OrderByComparator<LeaveReason> orderByComparator)
		throws NoSuchReasonException {

		LeaveReason leaveReason = fetchByUuid_Last(uuid, orderByComparator);

		if (leaveReason != null) {
			return leaveReason;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchReasonException(sb.toString());
	}

	/**
	 * Returns the last leave reason in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	@Override
	public LeaveReason fetchByUuid_Last(
		String uuid, OrderByComparator<LeaveReason> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<LeaveReason> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LeaveReason[] findByUuid_PrevAndNext(
			long leaveReasonId, String uuid,
			OrderByComparator<LeaveReason> orderByComparator)
		throws NoSuchReasonException {

		uuid = Objects.toString(uuid, "");

		LeaveReason leaveReason = findByPrimaryKey(leaveReasonId);

		Session session = null;

		try {
			session = openSession();

			LeaveReason[] array = new LeaveReasonImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, leaveReason, uuid, orderByComparator, true);

			array[1] = leaveReason;

			array[2] = getByUuid_PrevAndNext(
				session, leaveReason, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected LeaveReason getByUuid_PrevAndNext(
		Session session, LeaveReason leaveReason, String uuid,
		OrderByComparator<LeaveReason> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_LEAVEREASON_WHERE);

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
			sb.append(LeaveReasonModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(leaveReason)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<LeaveReason> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the leave reasons where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (LeaveReason leaveReason :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(leaveReason);
		}
	}

	/**
	 * Returns the number of leave reasons where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching leave reasons
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_LEAVEREASON_WHERE);

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
		"leaveReason.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(leaveReason.uuid IS NULL OR leaveReason.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the leave reason where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchReasonException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching leave reason
	 * @throws NoSuchReasonException if a matching leave reason could not be found
	 */
	@Override
	public LeaveReason findByUUID_G(String uuid, long groupId)
		throws NoSuchReasonException {

		LeaveReason leaveReason = fetchByUUID_G(uuid, groupId);

		if (leaveReason == null) {
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

			throw new NoSuchReasonException(sb.toString());
		}

		return leaveReason;
	}

	/**
	 * Returns the leave reason where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	@Override
	public LeaveReason fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the leave reason where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	@Override
	public LeaveReason fetchByUUID_G(
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

		if (result instanceof LeaveReason) {
			LeaveReason leaveReason = (LeaveReason)result;

			if (!Objects.equals(uuid, leaveReason.getUuid()) ||
				(groupId != leaveReason.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_LEAVEREASON_WHERE);

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

				List<LeaveReason> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					LeaveReason leaveReason = list.get(0);

					result = leaveReason;

					cacheResult(leaveReason);
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
			return (LeaveReason)result;
		}
	}

	/**
	 * Removes the leave reason where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the leave reason that was removed
	 */
	@Override
	public LeaveReason removeByUUID_G(String uuid, long groupId)
		throws NoSuchReasonException {

		LeaveReason leaveReason = findByUUID_G(uuid, groupId);

		return remove(leaveReason);
	}

	/**
	 * Returns the number of leave reasons where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching leave reasons
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_LEAVEREASON_WHERE);

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
		"leaveReason.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(leaveReason.uuid IS NULL OR leaveReason.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"leaveReason.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the leave reasons where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching leave reasons
	 */
	@Override
	public List<LeaveReason> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LeaveReason> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<LeaveReason> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LeaveReason> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<LeaveReason> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LeaveReason> orderByComparator,
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

		List<LeaveReason> list = null;

		if (useFinderCache) {
			list = (List<LeaveReason>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LeaveReason leaveReason : list) {
					if (!uuid.equals(leaveReason.getUuid()) ||
						(companyId != leaveReason.getCompanyId())) {

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

			sb.append(_SQL_SELECT_LEAVEREASON_WHERE);

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
				sb.append(LeaveReasonModelImpl.ORDER_BY_JPQL);
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

				list = (List<LeaveReason>)QueryUtil.list(
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
	 * Returns the first leave reason in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave reason
	 * @throws NoSuchReasonException if a matching leave reason could not be found
	 */
	@Override
	public LeaveReason findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<LeaveReason> orderByComparator)
		throws NoSuchReasonException {

		LeaveReason leaveReason = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (leaveReason != null) {
			return leaveReason;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchReasonException(sb.toString());
	}

	/**
	 * Returns the first leave reason in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	@Override
	public LeaveReason fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<LeaveReason> orderByComparator) {

		List<LeaveReason> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LeaveReason findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<LeaveReason> orderByComparator)
		throws NoSuchReasonException {

		LeaveReason leaveReason = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (leaveReason != null) {
			return leaveReason;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchReasonException(sb.toString());
	}

	/**
	 * Returns the last leave reason in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	@Override
	public LeaveReason fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<LeaveReason> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<LeaveReason> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LeaveReason[] findByUuid_C_PrevAndNext(
			long leaveReasonId, String uuid, long companyId,
			OrderByComparator<LeaveReason> orderByComparator)
		throws NoSuchReasonException {

		uuid = Objects.toString(uuid, "");

		LeaveReason leaveReason = findByPrimaryKey(leaveReasonId);

		Session session = null;

		try {
			session = openSession();

			LeaveReason[] array = new LeaveReasonImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, leaveReason, uuid, companyId, orderByComparator, true);

			array[1] = leaveReason;

			array[2] = getByUuid_C_PrevAndNext(
				session, leaveReason, uuid, companyId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected LeaveReason getByUuid_C_PrevAndNext(
		Session session, LeaveReason leaveReason, String uuid, long companyId,
		OrderByComparator<LeaveReason> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_LEAVEREASON_WHERE);

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
			sb.append(LeaveReasonModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(leaveReason)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<LeaveReason> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the leave reasons where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (LeaveReason leaveReason :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(leaveReason);
		}
	}

	/**
	 * Returns the number of leave reasons where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching leave reasons
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_LEAVEREASON_WHERE);

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
		"leaveReason.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(leaveReason.uuid IS NULL OR leaveReason.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"leaveReason.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByleaveReasonDescription;
	private FinderPath _finderPathWithoutPaginationFindByleaveReasonDescription;
	private FinderPath _finderPathCountByleaveReasonDescription;

	/**
	 * Returns all the leave reasons where leaveReasonDescription = &#63;.
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @return the matching leave reasons
	 */
	@Override
	public List<LeaveReason> findByleaveReasonDescription(
		String leaveReasonDescription) {

		return findByleaveReasonDescription(
			leaveReasonDescription, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LeaveReason> findByleaveReasonDescription(
		String leaveReasonDescription, int start, int end) {

		return findByleaveReasonDescription(
			leaveReasonDescription, start, end, null);
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
	@Override
	public List<LeaveReason> findByleaveReasonDescription(
		String leaveReasonDescription, int start, int end,
		OrderByComparator<LeaveReason> orderByComparator) {

		return findByleaveReasonDescription(
			leaveReasonDescription, start, end, orderByComparator, true);
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
	@Override
	public List<LeaveReason> findByleaveReasonDescription(
		String leaveReasonDescription, int start, int end,
		OrderByComparator<LeaveReason> orderByComparator,
		boolean useFinderCache) {

		leaveReasonDescription = Objects.toString(leaveReasonDescription, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindByleaveReasonDescription;
				finderArgs = new Object[] {leaveReasonDescription};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByleaveReasonDescription;
			finderArgs = new Object[] {
				leaveReasonDescription, start, end, orderByComparator
			};
		}

		List<LeaveReason> list = null;

		if (useFinderCache) {
			list = (List<LeaveReason>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LeaveReason leaveReason : list) {
					if (!leaveReasonDescription.equals(
							leaveReason.getLeaveReasonDescription())) {

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

			sb.append(_SQL_SELECT_LEAVEREASON_WHERE);

			boolean bindLeaveReasonDescription = false;

			if (leaveReasonDescription.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_LEAVEREASONDESCRIPTION_LEAVEREASONDESCRIPTION_3);
			}
			else {
				bindLeaveReasonDescription = true;

				sb.append(
					_FINDER_COLUMN_LEAVEREASONDESCRIPTION_LEAVEREASONDESCRIPTION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(LeaveReasonModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindLeaveReasonDescription) {
					queryPos.add(leaveReasonDescription);
				}

				list = (List<LeaveReason>)QueryUtil.list(
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
	 * Returns the first leave reason in the ordered set where leaveReasonDescription = &#63;.
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave reason
	 * @throws NoSuchReasonException if a matching leave reason could not be found
	 */
	@Override
	public LeaveReason findByleaveReasonDescription_First(
			String leaveReasonDescription,
			OrderByComparator<LeaveReason> orderByComparator)
		throws NoSuchReasonException {

		LeaveReason leaveReason = fetchByleaveReasonDescription_First(
			leaveReasonDescription, orderByComparator);

		if (leaveReason != null) {
			return leaveReason;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("leaveReasonDescription=");
		sb.append(leaveReasonDescription);

		sb.append("}");

		throw new NoSuchReasonException(sb.toString());
	}

	/**
	 * Returns the first leave reason in the ordered set where leaveReasonDescription = &#63;.
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	@Override
	public LeaveReason fetchByleaveReasonDescription_First(
		String leaveReasonDescription,
		OrderByComparator<LeaveReason> orderByComparator) {

		List<LeaveReason> list = findByleaveReasonDescription(
			leaveReasonDescription, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last leave reason in the ordered set where leaveReasonDescription = &#63;.
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave reason
	 * @throws NoSuchReasonException if a matching leave reason could not be found
	 */
	@Override
	public LeaveReason findByleaveReasonDescription_Last(
			String leaveReasonDescription,
			OrderByComparator<LeaveReason> orderByComparator)
		throws NoSuchReasonException {

		LeaveReason leaveReason = fetchByleaveReasonDescription_Last(
			leaveReasonDescription, orderByComparator);

		if (leaveReason != null) {
			return leaveReason;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("leaveReasonDescription=");
		sb.append(leaveReasonDescription);

		sb.append("}");

		throw new NoSuchReasonException(sb.toString());
	}

	/**
	 * Returns the last leave reason in the ordered set where leaveReasonDescription = &#63;.
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching leave reason, or <code>null</code> if a matching leave reason could not be found
	 */
	@Override
	public LeaveReason fetchByleaveReasonDescription_Last(
		String leaveReasonDescription,
		OrderByComparator<LeaveReason> orderByComparator) {

		int count = countByleaveReasonDescription(leaveReasonDescription);

		if (count == 0) {
			return null;
		}

		List<LeaveReason> list = findByleaveReasonDescription(
			leaveReasonDescription, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LeaveReason[] findByleaveReasonDescription_PrevAndNext(
			long leaveReasonId, String leaveReasonDescription,
			OrderByComparator<LeaveReason> orderByComparator)
		throws NoSuchReasonException {

		leaveReasonDescription = Objects.toString(leaveReasonDescription, "");

		LeaveReason leaveReason = findByPrimaryKey(leaveReasonId);

		Session session = null;

		try {
			session = openSession();

			LeaveReason[] array = new LeaveReasonImpl[3];

			array[0] = getByleaveReasonDescription_PrevAndNext(
				session, leaveReason, leaveReasonDescription, orderByComparator,
				true);

			array[1] = leaveReason;

			array[2] = getByleaveReasonDescription_PrevAndNext(
				session, leaveReason, leaveReasonDescription, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected LeaveReason getByleaveReasonDescription_PrevAndNext(
		Session session, LeaveReason leaveReason, String leaveReasonDescription,
		OrderByComparator<LeaveReason> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_LEAVEREASON_WHERE);

		boolean bindLeaveReasonDescription = false;

		if (leaveReasonDescription.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_LEAVEREASONDESCRIPTION_LEAVEREASONDESCRIPTION_3);
		}
		else {
			bindLeaveReasonDescription = true;

			sb.append(
				_FINDER_COLUMN_LEAVEREASONDESCRIPTION_LEAVEREASONDESCRIPTION_2);
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
			sb.append(LeaveReasonModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindLeaveReasonDescription) {
			queryPos.add(leaveReasonDescription);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(leaveReason)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<LeaveReason> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the leave reasons where leaveReasonDescription = &#63; from the database.
	 *
	 * @param leaveReasonDescription the leave reason description
	 */
	@Override
	public void removeByleaveReasonDescription(String leaveReasonDescription) {
		for (LeaveReason leaveReason :
				findByleaveReasonDescription(
					leaveReasonDescription, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(leaveReason);
		}
	}

	/**
	 * Returns the number of leave reasons where leaveReasonDescription = &#63;.
	 *
	 * @param leaveReasonDescription the leave reason description
	 * @return the number of matching leave reasons
	 */
	@Override
	public int countByleaveReasonDescription(String leaveReasonDescription) {
		leaveReasonDescription = Objects.toString(leaveReasonDescription, "");

		FinderPath finderPath = _finderPathCountByleaveReasonDescription;

		Object[] finderArgs = new Object[] {leaveReasonDescription};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_LEAVEREASON_WHERE);

			boolean bindLeaveReasonDescription = false;

			if (leaveReasonDescription.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_LEAVEREASONDESCRIPTION_LEAVEREASONDESCRIPTION_3);
			}
			else {
				bindLeaveReasonDescription = true;

				sb.append(
					_FINDER_COLUMN_LEAVEREASONDESCRIPTION_LEAVEREASONDESCRIPTION_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindLeaveReasonDescription) {
					queryPos.add(leaveReasonDescription);
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

	private static final String
		_FINDER_COLUMN_LEAVEREASONDESCRIPTION_LEAVEREASONDESCRIPTION_2 =
			"leaveReason.leaveReasonDescription = ?";

	private static final String
		_FINDER_COLUMN_LEAVEREASONDESCRIPTION_LEAVEREASONDESCRIPTION_3 =
			"(leaveReason.leaveReasonDescription IS NULL OR leaveReason.leaveReasonDescription = '')";

	public LeaveReasonPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(LeaveReason.class);

		setModelImplClass(LeaveReasonImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the leave reason in the entity cache if it is enabled.
	 *
	 * @param leaveReason the leave reason
	 */
	@Override
	public void cacheResult(LeaveReason leaveReason) {
		entityCache.putResult(
			LeaveReasonImpl.class, leaveReason.getPrimaryKey(), leaveReason);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {leaveReason.getUuid(), leaveReason.getGroupId()},
			leaveReason);
	}

	/**
	 * Caches the leave reasons in the entity cache if it is enabled.
	 *
	 * @param leaveReasons the leave reasons
	 */
	@Override
	public void cacheResult(List<LeaveReason> leaveReasons) {
		for (LeaveReason leaveReason : leaveReasons) {
			if (entityCache.getResult(
					LeaveReasonImpl.class, leaveReason.getPrimaryKey()) ==
						null) {

				cacheResult(leaveReason);
			}
		}
	}

	/**
	 * Clears the cache for all leave reasons.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LeaveReasonImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the leave reason.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LeaveReason leaveReason) {
		entityCache.removeResult(LeaveReasonImpl.class, leaveReason);
	}

	@Override
	public void clearCache(List<LeaveReason> leaveReasons) {
		for (LeaveReason leaveReason : leaveReasons) {
			entityCache.removeResult(LeaveReasonImpl.class, leaveReason);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(LeaveReasonImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		LeaveReasonModelImpl leaveReasonModelImpl) {

		Object[] args = new Object[] {
			leaveReasonModelImpl.getUuid(), leaveReasonModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, leaveReasonModelImpl, false);
	}

	/**
	 * Creates a new leave reason with the primary key. Does not add the leave reason to the database.
	 *
	 * @param leaveReasonId the primary key for the new leave reason
	 * @return the new leave reason
	 */
	@Override
	public LeaveReason create(long leaveReasonId) {
		LeaveReason leaveReason = new LeaveReasonImpl();

		leaveReason.setNew(true);
		leaveReason.setPrimaryKey(leaveReasonId);

		String uuid = PortalUUIDUtil.generate();

		leaveReason.setUuid(uuid);

		leaveReason.setCompanyId(CompanyThreadLocal.getCompanyId());

		return leaveReason;
	}

	/**
	 * Removes the leave reason with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leaveReasonId the primary key of the leave reason
	 * @return the leave reason that was removed
	 * @throws NoSuchReasonException if a leave reason with the primary key could not be found
	 */
	@Override
	public LeaveReason remove(long leaveReasonId) throws NoSuchReasonException {
		return remove((Serializable)leaveReasonId);
	}

	/**
	 * Removes the leave reason with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the leave reason
	 * @return the leave reason that was removed
	 * @throws NoSuchReasonException if a leave reason with the primary key could not be found
	 */
	@Override
	public LeaveReason remove(Serializable primaryKey)
		throws NoSuchReasonException {

		Session session = null;

		try {
			session = openSession();

			LeaveReason leaveReason = (LeaveReason)session.get(
				LeaveReasonImpl.class, primaryKey);

			if (leaveReason == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchReasonException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(leaveReason);
		}
		catch (NoSuchReasonException noSuchEntityException) {
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
	protected LeaveReason removeImpl(LeaveReason leaveReason) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(leaveReason)) {
				leaveReason = (LeaveReason)session.get(
					LeaveReasonImpl.class, leaveReason.getPrimaryKeyObj());
			}

			if (leaveReason != null) {
				session.delete(leaveReason);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (leaveReason != null) {
			clearCache(leaveReason);
		}

		return leaveReason;
	}

	@Override
	public LeaveReason updateImpl(LeaveReason leaveReason) {
		boolean isNew = leaveReason.isNew();

		if (!(leaveReason instanceof LeaveReasonModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(leaveReason.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(leaveReason);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in leaveReason proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom LeaveReason implementation " +
					leaveReason.getClass());
		}

		LeaveReasonModelImpl leaveReasonModelImpl =
			(LeaveReasonModelImpl)leaveReason;

		if (Validator.isNull(leaveReason.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			leaveReason.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (leaveReason.getCreateDate() == null)) {
			if (serviceContext == null) {
				leaveReason.setCreateDate(date);
			}
			else {
				leaveReason.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!leaveReasonModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				leaveReason.setModifiedDate(date);
			}
			else {
				leaveReason.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(leaveReason);
			}
			else {
				leaveReason = (LeaveReason)session.merge(leaveReason);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			LeaveReasonImpl.class, leaveReasonModelImpl, false, true);

		cacheUniqueFindersCache(leaveReasonModelImpl);

		if (isNew) {
			leaveReason.setNew(false);
		}

		leaveReason.resetOriginalValues();

		return leaveReason;
	}

	/**
	 * Returns the leave reason with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the leave reason
	 * @return the leave reason
	 * @throws NoSuchReasonException if a leave reason with the primary key could not be found
	 */
	@Override
	public LeaveReason findByPrimaryKey(Serializable primaryKey)
		throws NoSuchReasonException {

		LeaveReason leaveReason = fetchByPrimaryKey(primaryKey);

		if (leaveReason == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchReasonException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return leaveReason;
	}

	/**
	 * Returns the leave reason with the primary key or throws a <code>NoSuchReasonException</code> if it could not be found.
	 *
	 * @param leaveReasonId the primary key of the leave reason
	 * @return the leave reason
	 * @throws NoSuchReasonException if a leave reason with the primary key could not be found
	 */
	@Override
	public LeaveReason findByPrimaryKey(long leaveReasonId)
		throws NoSuchReasonException {

		return findByPrimaryKey((Serializable)leaveReasonId);
	}

	/**
	 * Returns the leave reason with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param leaveReasonId the primary key of the leave reason
	 * @return the leave reason, or <code>null</code> if a leave reason with the primary key could not be found
	 */
	@Override
	public LeaveReason fetchByPrimaryKey(long leaveReasonId) {
		return fetchByPrimaryKey((Serializable)leaveReasonId);
	}

	/**
	 * Returns all the leave reasons.
	 *
	 * @return the leave reasons
	 */
	@Override
	public List<LeaveReason> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LeaveReason> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<LeaveReason> findAll(
		int start, int end, OrderByComparator<LeaveReason> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<LeaveReason> findAll(
		int start, int end, OrderByComparator<LeaveReason> orderByComparator,
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

		List<LeaveReason> list = null;

		if (useFinderCache) {
			list = (List<LeaveReason>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_LEAVEREASON);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_LEAVEREASON;

				sql = sql.concat(LeaveReasonModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<LeaveReason>)QueryUtil.list(
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
	 * Removes all the leave reasons from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (LeaveReason leaveReason : findAll()) {
			remove(leaveReason);
		}
	}

	/**
	 * Returns the number of leave reasons.
	 *
	 * @return the number of leave reasons
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_LEAVEREASON);

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
		return "leaveReasonId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_LEAVEREASON;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return LeaveReasonModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the leave reason persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new LeaveReasonModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", LeaveReason.class.getName()));

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

		_finderPathWithPaginationFindByleaveReasonDescription =
			_createFinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findByleaveReasonDescription",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"leaveReasonDescription"}, true);

		_finderPathWithoutPaginationFindByleaveReasonDescription =
			_createFinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findByleaveReasonDescription",
				new String[] {String.class.getName()},
				new String[] {"leaveReasonDescription"}, true);

		_finderPathCountByleaveReasonDescription = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByleaveReasonDescription",
			new String[] {String.class.getName()},
			new String[] {"leaveReasonDescription"}, false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(LeaveReasonImpl.class.getName());

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

	private static final String _SQL_SELECT_LEAVEREASON =
		"SELECT leaveReason FROM LeaveReason leaveReason";

	private static final String _SQL_SELECT_LEAVEREASON_WHERE =
		"SELECT leaveReason FROM LeaveReason leaveReason WHERE ";

	private static final String _SQL_COUNT_LEAVEREASON =
		"SELECT COUNT(leaveReason) FROM LeaveReason leaveReason";

	private static final String _SQL_COUNT_LEAVEREASON_WHERE =
		"SELECT COUNT(leaveReason) FROM LeaveReason leaveReason WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "leaveReason.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No LeaveReason exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No LeaveReason exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		LeaveReasonPersistenceImpl.class);

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

	private static class LeaveReasonModelArgumentsResolver
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

			LeaveReasonModelImpl leaveReasonModelImpl =
				(LeaveReasonModelImpl)baseModel;

			long columnBitmask = leaveReasonModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(leaveReasonModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						leaveReasonModelImpl.getColumnBitmask(columnName);
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
				return _getValue(leaveReasonModelImpl, columnNames, original);
			}

			return null;
		}

		private static Object[] _getValue(
			LeaveReasonModelImpl leaveReasonModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = leaveReasonModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = leaveReasonModelImpl.getColumnValue(
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

			orderByColumnsBitmask |= LeaveReasonModelImpl.getColumnBitmask(
				"leaveReasonDescription");

			_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
		}

	}

}