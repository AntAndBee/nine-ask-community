package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsWeixinReplyRule;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsWeixinReplyRule entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsWeixinReplyRule
 * @author MyEclipse Persistence Tools
 */
public class AwsWeixinReplyRuleDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsWeixinReplyRuleDAO.class);
	// property constants
	public static final String ACCOUNT_ID = "accountId";
	public static final String KEYWORD = "keyword";
	public static final String TITLE = "title";
	public static final String IMAGE_FILE = "imageFile";
	public static final String DESCRIPTION = "description";
	public static final String LINK = "link";
	public static final String ENABLED = "enabled";
	public static final String SORT_STATUS = "sortStatus";

	public void save(AwsWeixinReplyRule transientInstance) {
		log.debug("saving AwsWeixinReplyRule instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsWeixinReplyRule persistentInstance) {
		log.debug("deleting AwsWeixinReplyRule instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsWeixinReplyRule findById(java.lang.Integer id) {
		log.debug("getting AwsWeixinReplyRule instance with id: " + id);
		try {
			AwsWeixinReplyRule instance = (AwsWeixinReplyRule) getSession()
					.get("com.world.wen.AwsWeixinReplyRule", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsWeixinReplyRule instance) {
		log.debug("finding AwsWeixinReplyRule instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsWeixinReplyRule")
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
		log.debug("finding AwsWeixinReplyRule instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsWeixinReplyRule as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAccountId(Object accountId) {
		return findByProperty(ACCOUNT_ID, accountId);
	}

	public List findByKeyword(Object keyword) {
		return findByProperty(KEYWORD, keyword);
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByImageFile(Object imageFile) {
		return findByProperty(IMAGE_FILE, imageFile);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findByLink(Object link) {
		return findByProperty(LINK, link);
	}

	public List findByEnabled(Object enabled) {
		return findByProperty(ENABLED, enabled);
	}

	public List findBySortStatus(Object sortStatus) {
		return findByProperty(SORT_STATUS, sortStatus);
	}

	public List findAll() {
		log.debug("finding all AwsWeixinReplyRule instances");
		try {
			String queryString = "from AwsWeixinReplyRule";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsWeixinReplyRule merge(AwsWeixinReplyRule detachedInstance) {
		log.debug("merging AwsWeixinReplyRule instance");
		try {
			AwsWeixinReplyRule result = (AwsWeixinReplyRule) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsWeixinReplyRule instance) {
		log.debug("attaching dirty AwsWeixinReplyRule instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsWeixinReplyRule instance) {
		log.debug("attaching clean AwsWeixinReplyRule instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}