package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsRelatedLinks;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsRelatedLinks entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsRelatedLinks
 * @author MyEclipse Persistence Tools
 */
public class AwsRelatedLinksDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsRelatedLinksDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String ITEM_TYPE = "itemType";
	public static final String ITEM_ID = "itemId";
	public static final String LINK = "link";
	public static final String ADD_TIME = "addTime";

	public void save(AwsRelatedLinks transientInstance) {
		log.debug("saving AwsRelatedLinks instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsRelatedLinks persistentInstance) {
		log.debug("deleting AwsRelatedLinks instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsRelatedLinks findById(java.lang.Integer id) {
		log.debug("getting AwsRelatedLinks instance with id: " + id);
		try {
			AwsRelatedLinks instance = (AwsRelatedLinks) getSession().get(
					"com.world.wen.AwsRelatedLinks", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsRelatedLinks instance) {
		log.debug("finding AwsRelatedLinks instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsRelatedLinks")
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
		log.debug("finding AwsRelatedLinks instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsRelatedLinks as model where model."
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

	public List findByItemType(Object itemType) {
		return findByProperty(ITEM_TYPE, itemType);
	}

	public List findByItemId(Object itemId) {
		return findByProperty(ITEM_ID, itemId);
	}

	public List findByLink(Object link) {
		return findByProperty(LINK, link);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findAll() {
		log.debug("finding all AwsRelatedLinks instances");
		try {
			String queryString = "from AwsRelatedLinks";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsRelatedLinks merge(AwsRelatedLinks detachedInstance) {
		log.debug("merging AwsRelatedLinks instance");
		try {
			AwsRelatedLinks result = (AwsRelatedLinks) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsRelatedLinks instance) {
		log.debug("attaching dirty AwsRelatedLinks instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsRelatedLinks instance) {
		log.debug("attaching clean AwsRelatedLinks instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}