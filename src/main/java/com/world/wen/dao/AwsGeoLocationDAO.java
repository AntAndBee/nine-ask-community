package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsGeoLocation;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsGeoLocation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsGeoLocation
 * @author MyEclipse Persistence Tools
 */
public class AwsGeoLocationDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsGeoLocationDAO.class);
	// property constants
	public static final String ITEM_TYPE = "itemType";
	public static final String ITEM_ID = "itemId";
	public static final String LATITUDE = "latitude";
	public static final String LONGITUDE = "longitude";
	public static final String ADD_TIME = "addTime";

	public void save(AwsGeoLocation transientInstance) {
		log.debug("saving AwsGeoLocation instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsGeoLocation persistentInstance) {
		log.debug("deleting AwsGeoLocation instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsGeoLocation findById(java.lang.Integer id) {
		log.debug("getting AwsGeoLocation instance with id: " + id);
		try {
			AwsGeoLocation instance = (AwsGeoLocation) getSession().get(
					"com.world.wen.AwsGeoLocation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsGeoLocation instance) {
		log.debug("finding AwsGeoLocation instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsGeoLocation")
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
		log.debug("finding AwsGeoLocation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsGeoLocation as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByItemType(Object itemType) {
		return findByProperty(ITEM_TYPE, itemType);
	}

	public List findByItemId(Object itemId) {
		return findByProperty(ITEM_ID, itemId);
	}

	public List findByLatitude(Object latitude) {
		return findByProperty(LATITUDE, latitude);
	}

	public List findByLongitude(Object longitude) {
		return findByProperty(LONGITUDE, longitude);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findAll() {
		log.debug("finding all AwsGeoLocation instances");
		try {
			String queryString = "from AwsGeoLocation";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsGeoLocation merge(AwsGeoLocation detachedInstance) {
		log.debug("merging AwsGeoLocation instance");
		try {
			AwsGeoLocation result = (AwsGeoLocation) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsGeoLocation instance) {
		log.debug("attaching dirty AwsGeoLocation instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsGeoLocation instance) {
		log.debug("attaching clean AwsGeoLocation instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}