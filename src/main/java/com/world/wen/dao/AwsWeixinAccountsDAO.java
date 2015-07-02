package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsWeixinAccounts;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsWeixinAccounts entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsWeixinAccounts
 * @author MyEclipse Persistence Tools
 */
public class AwsWeixinAccountsDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsWeixinAccountsDAO.class);
	// property constants
	public static final String WEIXIN_MP_TOKEN = "weixinMpToken";
	public static final String WEIXIN_ACCOUNT_ROLE = "weixinAccountRole";
	public static final String WEIXIN_APP_ID = "weixinAppId";
	public static final String WEIXIN_APP_SECRET = "weixinAppSecret";
	public static final String WEIXIN_MP_MENU = "weixinMpMenu";
	public static final String WEIXIN_SUBSCRIBE_MESSAGE_KEY = "weixinSubscribeMessageKey";
	public static final String WEIXIN_NO_RESULT_MESSAGE_KEY = "weixinNoResultMessageKey";
	public static final String WEIXIN_ENCODING_AES_KEY = "weixinEncodingAesKey";

	public void save(AwsWeixinAccounts transientInstance) {
		log.debug("saving AwsWeixinAccounts instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsWeixinAccounts persistentInstance) {
		log.debug("deleting AwsWeixinAccounts instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsWeixinAccounts findById(java.lang.Integer id) {
		log.debug("getting AwsWeixinAccounts instance with id: " + id);
		try {
			AwsWeixinAccounts instance = (AwsWeixinAccounts) getSession().get(
					"com.world.wen.AwsWeixinAccounts", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsWeixinAccounts instance) {
		log.debug("finding AwsWeixinAccounts instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsWeixinAccounts")
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
		log.debug("finding AwsWeixinAccounts instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsWeixinAccounts as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByWeixinMpToken(Object weixinMpToken) {
		return findByProperty(WEIXIN_MP_TOKEN, weixinMpToken);
	}

	public List findByWeixinAccountRole(Object weixinAccountRole) {
		return findByProperty(WEIXIN_ACCOUNT_ROLE, weixinAccountRole);
	}

	public List findByWeixinAppId(Object weixinAppId) {
		return findByProperty(WEIXIN_APP_ID, weixinAppId);
	}

	public List findByWeixinAppSecret(Object weixinAppSecret) {
		return findByProperty(WEIXIN_APP_SECRET, weixinAppSecret);
	}

	public List findByWeixinMpMenu(Object weixinMpMenu) {
		return findByProperty(WEIXIN_MP_MENU, weixinMpMenu);
	}

	public List findByWeixinSubscribeMessageKey(Object weixinSubscribeMessageKey) {
		return findByProperty(WEIXIN_SUBSCRIBE_MESSAGE_KEY,
				weixinSubscribeMessageKey);
	}

	public List findByWeixinNoResultMessageKey(Object weixinNoResultMessageKey) {
		return findByProperty(WEIXIN_NO_RESULT_MESSAGE_KEY,
				weixinNoResultMessageKey);
	}

	public List findByWeixinEncodingAesKey(Object weixinEncodingAesKey) {
		return findByProperty(WEIXIN_ENCODING_AES_KEY, weixinEncodingAesKey);
	}

	public List findAll() {
		log.debug("finding all AwsWeixinAccounts instances");
		try {
			String queryString = "from AwsWeixinAccounts";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsWeixinAccounts merge(AwsWeixinAccounts detachedInstance) {
		log.debug("merging AwsWeixinAccounts instance");
		try {
			AwsWeixinAccounts result = (AwsWeixinAccounts) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsWeixinAccounts instance) {
		log.debug("attaching dirty AwsWeixinAccounts instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsWeixinAccounts instance) {
		log.debug("attaching clean AwsWeixinAccounts instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}