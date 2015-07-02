package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsDraft;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsDraft entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsDraft
 * @author MyEclipse Persistence Tools
 */
public class AwsDraftDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsDraftDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String TYPE = "type";
	public static final String ITEM_ID = "itemId";
	public static final String DATA = "data";
	public static final String TIME = "time";

	public void save(AwsDraft transientInstance) {
		log.debug("saving AwsDraft instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsDraft persistentInstance) {
		log.debug("deleting AwsDraft instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsDraft findById(java.lang.Integer id) {
		log.debug("getting AwsDraft instance with id: " + id);
		try {
			AwsDraft instance = (AwsDraft) getSession().get(
					"com.world.wen.AwsDraft", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsDraft instance) {
		log.debug("finding AwsDraft instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsDraft")
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
		log.debug("finding AwsDraft instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AwsDraft as model where model."
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

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByItemId(Object itemId) {
		return findByProperty(ITEM_ID, itemId);
	}

	public List findByData(Object data) {
		return findByProperty(DATA, data);
	}

	public List findByTime(Object time) {
		return findByProperty(TIME, time);
	}

	public List findAll() {
		log.debug("finding all AwsDraft instances");
		try {
			String queryString = "from AwsDraft";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsDraft merge(AwsDraft detachedInstance) {
		log.debug("merging AwsDraft instance");
		try {
			AwsDraft result = (AwsDraft) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsDraft instance) {
		log.debug("attaching dirty AwsDraft instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsDraft instance) {
		log.debug("attaching clean AwsDraft instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}