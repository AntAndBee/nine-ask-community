package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsUsersWeixin;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsUsersWeixin entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsUsersWeixin
 * @author MyEclipse Persistence Tools
 */
public class AwsUsersWeixinDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsUsersWeixinDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String OPENID = "openid";
	public static final String EXPIRES_IN = "expiresIn";
	public static final String ACCESS_TOKEN = "accessToken";
	public static final String REFRESH_TOKEN = "refreshToken";
	public static final String SCOPE = "scope";
	public static final String HEADIMGURL = "headimgurl";
	public static final String NICKNAME = "nickname";
	public static final String SEX = "sex";
	public static final String PROVINCE = "province";
	public static final String CITY = "city";
	public static final String COUNTRY = "country";
	public static final String ADD_TIME = "addTime";
	public static final String LATITUDE = "latitude";
	public static final String LONGITUDE = "longitude";
	public static final String LOCATION_UPDATE = "locationUpdate";

	public void save(AwsUsersWeixin transientInstance) {
		log.debug("saving AwsUsersWeixin instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsUsersWeixin persistentInstance) {
		log.debug("deleting AwsUsersWeixin instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsUsersWeixin findById(java.lang.Integer id) {
		log.debug("getting AwsUsersWeixin instance with id: " + id);
		try {
			AwsUsersWeixin instance = (AwsUsersWeixin) getSession().get(
					"com.world.wen.AwsUsersWeixin", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsUsersWeixin instance) {
		log.debug("finding AwsUsersWeixin instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsUsersWeixin")
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
		log.debug("finding AwsUsersWeixin instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsUsersWeixin as model where model."
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

	public List findByOpenid(Object openid) {
		return findByProperty(OPENID, openid);
	}

	public List findByExpiresIn(Object expiresIn) {
		return findByProperty(EXPIRES_IN, expiresIn);
	}

	public List findByAccessToken(Object accessToken) {
		return findByProperty(ACCESS_TOKEN, accessToken);
	}

	public List findByRefreshToken(Object refreshToken) {
		return findByProperty(REFRESH_TOKEN, refreshToken);
	}

	public List findByScope(Object scope) {
		return findByProperty(SCOPE, scope);
	}

	public List findByHeadimgurl(Object headimgurl) {
		return findByProperty(HEADIMGURL, headimgurl);
	}

	public List findByNickname(Object nickname) {
		return findByProperty(NICKNAME, nickname);
	}

	public List findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List findByProvince(Object province) {
		return findByProperty(PROVINCE, province);
	}

	public List findByCity(Object city) {
		return findByProperty(CITY, city);
	}

	public List findByCountry(Object country) {
		return findByProperty(COUNTRY, country);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findByLatitude(Object latitude) {
		return findByProperty(LATITUDE, latitude);
	}

	public List findByLongitude(Object longitude) {
		return findByProperty(LONGITUDE, longitude);
	}

	public List findByLocationUpdate(Object locationUpdate) {
		return findByProperty(LOCATION_UPDATE, locationUpdate);
	}

	public List findAll() {
		log.debug("finding all AwsUsersWeixin instances");
		try {
			String queryString = "from AwsUsersWeixin";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsUsersWeixin merge(AwsUsersWeixin detachedInstance) {
		log.debug("merging AwsUsersWeixin instance");
		try {
			AwsUsersWeixin result = (AwsUsersWeixin) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsUsersWeixin instance) {
		log.debug("attaching dirty AwsUsersWeixin instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsUsersWeixin instance) {
		log.debug("attaching clean AwsUsersWeixin instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}