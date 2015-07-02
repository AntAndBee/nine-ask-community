package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsUserActionHistoryData;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsUserActionHistoryData entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see com.world.wen.model.AwsUserActionHistoryData
 * @author MyEclipse Persistence Tools
 */
public class AwsUserActionHistoryDataDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsUserActionHistoryDataDAO.class);
	// property constants
	public static final String ASSOCIATE_CONTENT = "associateContent";
	public static final String ASSOCIATE_ATTACHED = "associateAttached";
	public static final String ADDON_DATA = "addonData";

	public void save(AwsUserActionHistoryData transientInstance) {
		log.debug("saving AwsUserActionHistoryData instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsUserActionHistoryData persistentInstance) {
		log.debug("deleting AwsUserActionHistoryData instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsUserActionHistoryData findById(java.lang.Integer id) {
		log.debug("getting AwsUserActionHistoryData instance with id: " + id);
		try {
			AwsUserActionHistoryData instance = (AwsUserActionHistoryData) getSession()
					.get("com.world.wen.AwsUserActionHistoryData", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsUserActionHistoryData instance) {
		log.debug("finding AwsUserActionHistoryData instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsUserActionHistoryData")
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
		log.debug("finding AwsUserActionHistoryData instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsUserActionHistoryData as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAssociateContent(Object associateContent) {
		return findByProperty(ASSOCIATE_CONTENT, associateContent);
	}

	public List findByAssociateAttached(Object associateAttached) {
		return findByProperty(ASSOCIATE_ATTACHED, associateAttached);
	}

	public List findByAddonData(Object addonData) {
		return findByProperty(ADDON_DATA, addonData);
	}

	public List findAll() {
		log.debug("finding all AwsUserActionHistoryData instances");
		try {
			String queryString = "from AwsUserActionHistoryData";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsUserActionHistoryData merge(
			AwsUserActionHistoryData detachedInstance) {
		log.debug("merging AwsUserActionHistoryData instance");
		try {
			AwsUserActionHistoryData result = (AwsUserActionHistoryData) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsUserActionHistoryData instance) {
		log.debug("attaching dirty AwsUserActionHistoryData instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsUserActionHistoryData instance) {
		log.debug("attaching clean AwsUserActionHistoryData instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}