package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsUsersFacebook;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsUsersFacebook entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsUsersFacebook
 * @author MyEclipse Persistence Tools
 */
public class AwsUsersFacebookDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsUsersFacebookDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String NAME = "name";
	public static final String EMAIL = "email";
	public static final String LINK = "link";
	public static final String GENDER = "gender";
	public static final String LOCALE = "locale";
	public static final String TIMEZONE = "timezone";
	public static final String PICTURE = "picture";
	public static final String ACCESS_TOKEN = "accessToken";
	public static final String EXPIRES_TIME = "expiresTime";
	public static final String ADD_TIME = "addTime";

	public void save(AwsUsersFacebook transientInstance) {
		log.debug("saving AwsUsersFacebook instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsUsersFacebook persistentInstance) {
		log.debug("deleting AwsUsersFacebook instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsUsersFacebook findById(java.lang.Long id) {
		log.debug("getting AwsUsersFacebook instance with id: " + id);
		try {
			AwsUsersFacebook instance = (AwsUsersFacebook) getSession().get(
					"com.world.wen.AwsUsersFacebook", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsUsersFacebook instance) {
		log.debug("finding AwsUsersFacebook instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsUsersFacebook")
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
		log.debug("finding AwsUsersFacebook instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsUsersFacebook as model where model."
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

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByLink(Object link) {
		return findByProperty(LINK, link);
	}

	public List findByGender(Object gender) {
		return findByProperty(GENDER, gender);
	}

	public List findByLocale(Object locale) {
		return findByProperty(LOCALE, locale);
	}

	public List findByTimezone(Object timezone) {
		return findByProperty(TIMEZONE, timezone);
	}

	public List findByPicture(Object picture) {
		return findByProperty(PICTURE, picture);
	}

	public List findByAccessToken(Object accessToken) {
		return findByProperty(ACCESS_TOKEN, accessToken);
	}

	public List findByExpiresTime(Object expiresTime) {
		return findByProperty(EXPIRES_TIME, expiresTime);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findAll() {
		log.debug("finding all AwsUsersFacebook instances");
		try {
			String queryString = "from AwsUsersFacebook";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsUsersFacebook merge(AwsUsersFacebook detachedInstance) {
		log.debug("merging AwsUsersFacebook instance");
		try {
			AwsUsersFacebook result = (AwsUsersFacebook) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsUsersFacebook instance) {
		log.debug("attaching dirty AwsUsersFacebook instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsUsersFacebook instance) {
		log.debug("attaching clean AwsUsersFacebook instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}