package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsFavorite;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsFavorite entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsFavorite
 * @author MyEclipse Persistence Tools
 */
public class AwsFavoriteDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsFavoriteDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String ITEM_ID = "itemId";
	public static final String TIME = "time";
	public static final String TYPE = "type";

	public void save(AwsFavorite transientInstance) {
		log.debug("saving AwsFavorite instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsFavorite persistentInstance) {
		log.debug("deleting AwsFavorite instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsFavorite findById(java.lang.Integer id) {
		log.debug("getting AwsFavorite instance with id: " + id);
		try {
			AwsFavorite instance = (AwsFavorite) getSession().get(
					"com.world.wen.AwsFavorite", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsFavorite instance) {
		log.debug("finding AwsFavorite instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsFavorite")
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
		log.debug("finding AwsFavorite instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AwsFavorite as model where model."
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

	public List findByItemId(Object itemId) {
		return findByProperty(ITEM_ID, itemId);
	}

	public List findByTime(Object time) {
		return findByProperty(TIME, time);
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findAll() {
		log.debug("finding all AwsFavorite instances");
		try {
			String queryString = "from AwsFavorite";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsFavorite merge(AwsFavorite detachedInstance) {
		log.debug("merging AwsFavorite instance");
		try {
			AwsFavorite result = (AwsFavorite) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsFavorite instance) {
		log.debug("attaching dirty AwsFavorite instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsFavorite instance) {
		log.debug("attaching clean AwsFavorite instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}