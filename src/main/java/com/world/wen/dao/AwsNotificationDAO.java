package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsNotification;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsNotification entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsNotification
 * @author MyEclipse Persistence Tools
 */
public class AwsNotificationDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsNotificationDAO.class);
	// property constants
	public static final String SENDER_UID = "senderUid";
	public static final String RECIPIENT_UID = "recipientUid";
	public static final String ACTION_TYPE = "actionType";
	public static final String MODEL_TYPE = "modelType";
	public static final String SOURCE_ID = "sourceId";
	public static final String ADD_TIME = "addTime";
	public static final String READ_FLAG = "readFlag";

	public void save(AwsNotification transientInstance) {
		log.debug("saving AwsNotification instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsNotification persistentInstance) {
		log.debug("deleting AwsNotification instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsNotification findById(java.lang.Integer id) {
		log.debug("getting AwsNotification instance with id: " + id);
		try {
			AwsNotification instance = (AwsNotification) getSession().get(
					"com.world.wen.AwsNotification", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsNotification instance) {
		log.debug("finding AwsNotification instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsNotification")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding AwsNotification instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsNotification as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySenderUid(Object senderUid) {
		return findByProperty(SENDER_UID, senderUid);
	}

	public List findByRecipientUid(Object recipientUid) {
		return findByProperty(RECIPIENT_UID, recipientUid);
	}

	public List findByActionType(Object actionType) {
		return findByProperty(ACTION_TYPE, actionType);
	}

	public List findByModelType(Object modelType) {
		return findByProperty(MODEL_TYPE, modelType);
	}

	public List findBySourceId(Object sourceId) {
		return findByProperty(SOURCE_ID, sourceId);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findByReadFlag(Object readFlag) {
		return findByProperty(READ_FLAG, readFlag);
	}

	public List findAll() {
		log.debug("finding all AwsNotification instances");
		try {
			String queryString = "from AwsNotification";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsNotification merge(AwsNotification detachedInstance) {
		log.debug("merging AwsNotification instance");
		try {
			AwsNotification result = (AwsNotification) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsNotification instance) {
		log.debug("attaching dirty AwsNotification instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsNotification instance) {
		log.debug("attaching clean AwsNotification instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}