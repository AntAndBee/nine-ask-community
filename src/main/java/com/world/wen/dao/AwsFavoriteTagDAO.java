package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsFavoriteTag;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsFavoriteTag entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsFavoriteTag
 * @author MyEclipse Persistence Tools
 */
public class AwsFavoriteTagDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsFavoriteTagDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String TITLE = "title";
	public static final String ITEM_ID = "itemId";
	public static final String TYPE = "type";

	public void save(AwsFavoriteTag transientInstance) {
		log.debug("saving AwsFavoriteTag instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsFavoriteTag persistentInstance) {
		log.debug("deleting AwsFavoriteTag instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsFavoriteTag findById(java.lang.Integer id) {
		log.debug("getting AwsFavoriteTag instance with id: " + id);
		try {
			AwsFavoriteTag instance = (AwsFavoriteTag) getSession().get(
					"com.world.wen.AwsFavoriteTag", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsFavoriteTag instance) {
		log.debug("finding AwsFavoriteTag instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsFavoriteTag")
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
		log.debug("finding AwsFavoriteTag instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsFavoriteTag as model where model."
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

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByItemId(Object itemId) {
		return findByProperty(ITEM_ID, itemId);
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findAll() {
		log.debug("finding all AwsFavoriteTag instances");
		try {
			String queryString = "from AwsFavoriteTag";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsFavoriteTag merge(AwsFavoriteTag detachedInstance) {
		log.debug("merging AwsFavoriteTag instance");
		try {
			AwsFavoriteTag result = (AwsFavoriteTag) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsFavoriteTag instance) {
		log.debug("attaching dirty AwsFavoriteTag instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsFavoriteTag instance) {
		log.debug("attaching clean AwsFavoriteTag instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}