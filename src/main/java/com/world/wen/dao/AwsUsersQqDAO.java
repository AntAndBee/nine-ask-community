package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsUsersQq;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsUsersQq entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsUsersQq
 * @author MyEclipse Persistence Tools
 */
public class AwsUsersQqDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsUsersQqDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String NICKNAME = "nickname";
	public static final String OPENID = "openid";
	public static final String GENDER = "gender";
	public static final String ADD_TIME = "addTime";
	public static final String ACCESS_TOKEN = "accessToken";
	public static final String REFRESH_TOKEN = "refreshToken";
	public static final String EXPIRES_TIME = "expiresTime";
	public static final String FIGUREURL = "figureurl";

	public void save(AwsUsersQq transientInstance) {
		log.debug("saving AwsUsersQq instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsUsersQq persistentInstance) {
		log.debug("deleting AwsUsersQq instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsUsersQq findById(java.lang.Long id) {
		log.debug("getting AwsUsersQq instance with id: " + id);
		try {
			AwsUsersQq instance = (AwsUsersQq) getSession().get(
					"com.world.wen.AwsUsersQq", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsUsersQq instance) {
		log.debug("finding AwsUsersQq instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsUsersQq")
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
		log.debug("finding AwsUsersQq instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AwsUsersQq as model where model."
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

	public List findByNickname(Object nickname) {
		return findByProperty(NICKNAME, nickname);
	}

	public List findByOpenid(Object openid) {
		return findByProperty(OPENID, openid);
	}

	public List findByGender(Object gender) {
		return findByProperty(GENDER, gender);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findByAccessToken(Object accessToken) {
		return findByProperty(ACCESS_TOKEN, accessToken);
	}

	public List findByRefreshToken(Object refreshToken) {
		return findByProperty(REFRESH_TOKEN, refreshToken);
	}

	public List findByExpiresTime(Object expiresTime) {
		return findByProperty(EXPIRES_TIME, expiresTime);
	}

	public List findByFigureurl(Object figureurl) {
		return findByProperty(FIGUREURL, figureurl);
	}

	public List findAll() {
		log.debug("finding all AwsUsersQq instances");
		try {
			String queryString = "from AwsUsersQq";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsUsersQq merge(AwsUsersQq detachedInstance) {
		log.debug("merging AwsUsersQq instance");
		try {
			AwsUsersQq result = (AwsUsersQq) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsUsersQq instance) {
		log.debug("attaching dirty AwsUsersQq instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsUsersQq instance) {
		log.debug("attaching clean AwsUsersQq instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}