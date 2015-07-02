package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsUserActionHistory;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsUserActionHistory entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsUserActionHistory
 * @author MyEclipse Persistence Tools
 */
public class AwsUserActionHistoryDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsUserActionHistoryDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String ASSOCIATE_TYPE = "associateType";
	public static final String ASSOCIATE_ACTION = "associateAction";
	public static final String ASSOCIATE_ID = "associateId";
	public static final String ADD_TIME = "addTime";
	public static final String ASSOCIATE_ATTACHED = "associateAttached";
	public static final String ANONYMOUS = "anonymous";
	public static final String FOLD_STATUS = "foldStatus";

	public void save(AwsUserActionHistory transientInstance) {
		log.debug("saving AwsUserActionHistory instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsUserActionHistory persistentInstance) {
		log.debug("deleting AwsUserActionHistory instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsUserActionHistory findById(java.lang.Integer id) {
		log.debug("getting AwsUserActionHistory instance with id: " + id);
		try {
			AwsUserActionHistory instance = (AwsUserActionHistory) getSession()
					.get("com.world.wen.AwsUserActionHistory", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsUserActionHistory instance) {
		log.debug("finding AwsUserActionHistory instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsUserActionHistory")
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
		log.debug("finding AwsUserActionHistory instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsUserActionHistory as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUid(Object uid) {
		return findByProperty(UID, uid);
	}

	public List findByAssociateType(Object associateType) {
		return findByProperty(ASSOCIATE_TYPE, associateType);
	}

	public List findByAssociateAction(Object associateAction) {
		return findByProperty(ASSOCIATE_ACTION, associateAction);
	}

	public List findByAssociateId(Object associateId) {
		return findByProperty(ASSOCIATE_ID, associateId);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findByAssociateAttached(Object associateAttached) {
		return findByProperty(ASSOCIATE_ATTACHED, associateAttached);
	}

	public List findByAnonymous(Object anonymous) {
		return findByProperty(ANONYMOUS, anonymous);
	}

	public List findByFoldStatus(Object foldStatus) {
		return findByProperty(FOLD_STATUS, foldStatus);
	}

	public List findAll() {
		log.debug("finding all AwsUserActionHistory instances");
		try {
			String queryString = "from AwsUserActionHistory";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsUserActionHistory merge(AwsUserActionHistory detachedInstance) {
		log.debug("merging AwsUserActionHistory instance");
		try {
			AwsUserActionHistory result = (AwsUserActionHistory) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsUserActionHistory instance) {
		log.debug("attaching dirty AwsUserActionHistory instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsUserActionHistory instance) {
		log.debug("attaching clean AwsUserActionHistory instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}