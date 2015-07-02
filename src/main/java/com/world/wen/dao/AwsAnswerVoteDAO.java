package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsAnswerVote;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsAnswerVote entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsAnswerVote
 * @author MyEclipse Persistence Tools
 */
public class AwsAnswerVoteDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsAnswerVoteDAO.class);
	// property constants
	public static final String ANSWER_ID = "answerId";
	public static final String ANSWER_UID = "answerUid";
	public static final String VOTE_UID = "voteUid";
	public static final String ADD_TIME = "addTime";
	public static final String VOTE_VALUE = "voteValue";
	public static final String REPUTATION_FACTOR = "reputationFactor";

	public void save(AwsAnswerVote transientInstance) {
		log.debug("saving AwsAnswerVote instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsAnswerVote persistentInstance) {
		log.debug("deleting AwsAnswerVote instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsAnswerVote findById(java.lang.Integer id) {
		log.debug("getting AwsAnswerVote instance with id: " + id);
		try {
			AwsAnswerVote instance = (AwsAnswerVote) getSession().get(
					"com.world.wen.AwsAnswerVote", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsAnswerVote instance) {
		log.debug("finding AwsAnswerVote instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsAnswerVote")
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
		log.debug("finding AwsAnswerVote instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsAnswerVote as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAnswerId(Object answerId) {
		return findByProperty(ANSWER_ID, answerId);
	}

	public List findByAnswerUid(Object answerUid) {
		return findByProperty(ANSWER_UID, answerUid);
	}

	public List findByVoteUid(Object voteUid) {
		return findByProperty(VOTE_UID, voteUid);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findByVoteValue(Object voteValue) {
		return findByProperty(VOTE_VALUE, voteValue);
	}

	public List findByReputationFactor(Object reputationFactor) {
		return findByProperty(REPUTATION_FACTOR, reputationFactor);
	}

	public List findAll() {
		log.debug("finding all AwsAnswerVote instances");
		try {
			String queryString = "from AwsAnswerVote";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsAnswerVote merge(AwsAnswerVote detachedInstance) {
		log.debug("merging AwsAnswerVote instance");
		try {
			AwsAnswerVote result = (AwsAnswerVote) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsAnswerVote instance) {
		log.debug("attaching dirty AwsAnswerVote instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsAnswerVote instance) {
		log.debug("attaching clean AwsAnswerVote instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}