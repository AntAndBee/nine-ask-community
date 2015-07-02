package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsUsersTwitter;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsUsersTwitter entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsUsersTwitter
 * @author MyEclipse Persistence Tools
 */
public class AwsUsersTwitterDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsUsersTwitterDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String NAME = "name";
	public static final String SCREEN_NAME = "screenName";
	public static final String LOCATION = "location";
	public static final String TIME_ZONE = "timeZone";
	public static final String LANG = "lang";
	public static final String PROFILE_IMAGE_URL = "profileImageUrl";
	public static final String ADD_TIME = "addTime";
	public static final String ACCESS_TOKEN = "accessToken";

	public void save(AwsUsersTwitter transientInstance) {
		log.debug("saving AwsUsersTwitter instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsUsersTwitter persistentInstance) {
		log.debug("deleting AwsUsersTwitter instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsUsersTwitter findById(java.lang.Long id) {
		log.debug("getting AwsUsersTwitter instance with id: " + id);
		try {
			AwsUsersTwitter instance = (AwsUsersTwitter) getSession().get(
					"com.world.wen.AwsUsersTwitter", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsUsersTwitter instance) {
		log.debug("finding AwsUsersTwitter instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsUsersTwitter")
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
		log.debug("finding AwsUsersTwitter instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsUsersTwitter as model where model."
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

	public List findByScreenName(Object screenName) {
		return findByProperty(SCREEN_NAME, screenName);
	}

	public List findByLocation(Object location) {
		return findByProperty(LOCATION, location);
	}

	public List findByTimeZone(Object timeZone) {
		return findByProperty(TIME_ZONE, timeZone);
	}

	public List findByLang(Object lang) {
		return findByProperty(LANG, lang);
	}

	public List findByProfileImageUrl(Object profileImageUrl) {
		return findByProperty(PROFILE_IMAGE_URL, profileImageUrl);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findByAccessToken(Object accessToken) {
		return findByProperty(ACCESS_TOKEN, accessToken);
	}

	public List findAll() {
		log.debug("finding all AwsUsersTwitter instances");
		try {
			String queryString = "from AwsUsersTwitter";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsUsersTwitter merge(AwsUsersTwitter detachedInstance) {
		log.debug("merging AwsUsersTwitter instance");
		try {
			AwsUsersTwitter result = (AwsUsersTwitter) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsUsersTwitter instance) {
		log.debug("attaching dirty AwsUsersTwitter instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsUsersTwitter instance) {
		log.debug("attaching clean AwsUsersTwitter instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}