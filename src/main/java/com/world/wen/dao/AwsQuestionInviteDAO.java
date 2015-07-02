package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsQuestionInvite;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsQuestionInvite entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsQuestionInvite
 * @author MyEclipse Persistence Tools
 */
public class AwsQuestionInviteDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsQuestionInviteDAO.class);
	// property constants
	public static final String QUESTION_ID = "questionId";
	public static final String SENDER_UID = "senderUid";
	public static final String RECIPIENTS_UID = "recipientsUid";
	public static final String EMAIL = "email";
	public static final String ADD_TIME = "addTime";
	public static final String AVAILABLE_TIME = "availableTime";

	public void save(AwsQuestionInvite transientInstance) {
		log.debug("saving AwsQuestionInvite instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsQuestionInvite persistentInstance) {
		log.debug("deleting AwsQuestionInvite instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsQuestionInvite findById(java.lang.Integer id) {
		log.debug("getting AwsQuestionInvite instance with id: " + id);
		try {
			AwsQuestionInvite instance = (AwsQuestionInvite) getSession().get(
					"com.world.wen.AwsQuestionInvite", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsQuestionInvite instance) {
		log.debug("finding AwsQuestionInvite instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsQuestionInvite")
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
		log.debug("finding AwsQuestionInvite instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsQuestionInvite as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByQuestionId(Object questionId) {
		return findByProperty(QUESTION_ID, questionId);
	}

	public List findBySenderUid(Object senderUid) {
		return findByProperty(SENDER_UID, senderUid);
	}

	public List findByRecipientsUid(Object recipientsUid) {
		return findByProperty(RECIPIENTS_UID, recipientsUid);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findByAvailableTime(Object availableTime) {
		return findByProperty(AVAILABLE_TIME, availableTime);
	}

	public List findAll() {
		log.debug("finding all AwsQuestionInvite instances");
		try {
			String queryString = "from AwsQuestionInvite";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsQuestionInvite merge(AwsQuestionInvite detachedInstance) {
		log.debug("merging AwsQuestionInvite instance");
		try {
			AwsQuestionInvite result = (AwsQuestionInvite) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsQuestionInvite instance) {
		log.debug("attaching dirty AwsQuestionInvite instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsQuestionInvite instance) {
		log.debug("attaching clean AwsQuestionInvite instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}