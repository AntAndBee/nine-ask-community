package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsUsersSina;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsUsersSina entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsUsersSina
 * @author MyEclipse Persistence Tools
 */
public class AwsUsersSinaDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsUsersSinaDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String NAME = "name";
	public static final String LOCATION = "location";
	public static final String DESCRIPTION = "description";
	public static final String URL = "url";
	public static final String PROFILE_IMAGE_URL = "profileImageUrl";
	public static final String GENDER = "gender";
	public static final String ADD_TIME = "addTime";
	public static final String EXPIRES_TIME = "expiresTime";
	public static final String ACCESS_TOKEN = "accessToken";
	public static final String LAST_MSG_ID = "lastMsgId";

	public void save(AwsUsersSina transientInstance) {
		log.debug("saving AwsUsersSina instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsUsersSina persistentInstance) {
		log.debug("deleting AwsUsersSina instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsUsersSina findById(java.lang.Long id) {
		log.debug("getting AwsUsersSina instance with id: " + id);
		try {
			AwsUsersSina instance = (AwsUsersSina) getSession().get(
					"com.world.wen.AwsUsersSina", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsUsersSina instance) {
		log.debug("finding AwsUsersSina instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsUsersSina")
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
		log.debug("finding AwsUsersSina instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsUsersSina as model where model."
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

	public List findByLocation(Object location) {
		return findByProperty(LOCATION, location);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findByUrl(Object url) {
		return findByProperty(URL, url);
	}

	public List findByProfileImageUrl(Object profileImageUrl) {
		return findByProperty(PROFILE_IMAGE_URL, profileImageUrl);
	}

	public List findByGender(Object gender) {
		return findByProperty(GENDER, gender);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findByExpiresTime(Object expiresTime) {
		return findByProperty(EXPIRES_TIME, expiresTime);
	}

	public List findByAccessToken(Object accessToken) {
		return findByProperty(ACCESS_TOKEN, accessToken);
	}

	public List findByLastMsgId(Object lastMsgId) {
		return findByProperty(LAST_MSG_ID, lastMsgId);
	}

	public List findAll() {
		log.debug("finding all AwsUsersSina instances");
		try {
			String queryString = "from AwsUsersSina";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsUsersSina merge(AwsUsersSina detachedInstance) {
		log.debug("merging AwsUsersSina instance");
		try {
			AwsUsersSina result = (AwsUsersSina) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsUsersSina instance) {
		log.debug("attaching dirty AwsUsersSina instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsUsersSina instance) {
		log.debug("attaching clean AwsUsersSina instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}