package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsArticleComments;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsArticleComments entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsArticleComments
 * @author MyEclipse Persistence Tools
 */
public class AwsArticleCommentsDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsArticleCommentsDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String ARTICLE_ID = "articleId";
	public static final String MESSAGE = "message";
	public static final String ADD_TIME = "addTime";
	public static final String AT_UID = "atUid";
	public static final String VOTES = "votes";

	public void save(AwsArticleComments transientInstance) {
		log.debug("saving AwsArticleComments instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsArticleComments persistentInstance) {
		log.debug("deleting AwsArticleComments instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsArticleComments findById(java.lang.Integer id) {
		log.debug("getting AwsArticleComments instance with id: " + id);
		try {
			AwsArticleComments instance = (AwsArticleComments) getSession()
					.get("com.world.wen.AwsArticleComments", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsArticleComments instance) {
		log.debug("finding AwsArticleComments instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsArticleComments")
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
		log.debug("finding AwsArticleComments instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsArticleComments as model where model."
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

	public List findByArticleId(Object articleId) {
		return findByProperty(ARTICLE_ID, articleId);
	}

	public List findByMessage(Object message) {
		return findByProperty(MESSAGE, message);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findByAtUid(Object atUid) {
		return findByProperty(AT_UID, atUid);
	}

	public List findByVotes(Object votes) {
		return findByProperty(VOTES, votes);
	}

	public List findAll() {
		log.debug("finding all AwsArticleComments instances");
		try {
			String queryString = "from AwsArticleComments";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsArticleComments merge(AwsArticleComments detachedInstance) {
		log.debug("merging AwsArticleComments instance");
		try {
			AwsArticleComments result = (AwsArticleComments) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsArticleComments instance) {
		log.debug("attaching dirty AwsArticleComments instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsArticleComments instance) {
		log.debug("attaching clean AwsArticleComments instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}