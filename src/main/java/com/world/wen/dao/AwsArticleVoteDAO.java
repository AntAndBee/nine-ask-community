package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsArticleVote;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsArticleVote entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsArticleVote
 * @author MyEclipse Persistence Tools
 */
public class AwsArticleVoteDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsArticleVoteDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String TYPE = "type";
	public static final String ITEM_ID = "itemId";
	public static final String RATING = "rating";
	public static final String TIME = "time";
	public static final String REPUTATION_FACTOR = "reputationFactor";
	public static final String ITEM_UID = "itemUid";

	public void save(AwsArticleVote transientInstance) {
		log.debug("saving AwsArticleVote instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsArticleVote persistentInstance) {
		log.debug("deleting AwsArticleVote instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsArticleVote findById(java.lang.Integer id) {
		log.debug("getting AwsArticleVote instance with id: " + id);
		try {
			AwsArticleVote instance = (AwsArticleVote) getSession().get(
					"com.world.wen.AwsArticleVote", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsArticleVote instance) {
		log.debug("finding AwsArticleVote instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsArticleVote")
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
		log.debug("finding AwsArticleVote instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsArticleVote as model where model."
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

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByItemId(Object itemId) {
		return findByProperty(ITEM_ID, itemId);
	}

	public List findByRating(Object rating) {
		return findByProperty(RATING, rating);
	}

	public List findByTime(Object time) {
		return findByProperty(TIME, time);
	}

	public List findByReputationFactor(Object reputationFactor) {
		return findByProperty(REPUTATION_FACTOR, reputationFactor);
	}

	public List findByItemUid(Object itemUid) {
		return findByProperty(ITEM_UID, itemUid);
	}

	public List findAll() {
		log.debug("finding all AwsArticleVote instances");
		try {
			String queryString = "from AwsArticleVote";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsArticleVote merge(AwsArticleVote detachedInstance) {
		log.debug("merging AwsArticleVote instance");
		try {
			AwsArticleVote result = (AwsArticleVote) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsArticleVote instance) {
		log.debug("attaching dirty AwsArticleVote instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsArticleVote instance) {
		log.debug("attaching clean AwsArticleVote instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}