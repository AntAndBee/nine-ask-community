package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsReceivedEmail;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsReceivedEmail entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsReceivedEmail
 * @author MyEclipse Persistence Tools
 */
public class AwsReceivedEmailDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsReceivedEmailDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String CONFIG_ID = "configId";
	public static final String MESSAGE_ID = "messageId";
	public static final String DATE = "date";
	public static final String FROM = "from";
	public static final String SUBJECT = "subject";
	public static final String CONTENT = "content";
	public static final String QUESTION_ID = "questionId";
	public static final String TICKET_ID = "ticketId";

	public void save(AwsReceivedEmail transientInstance) {
		log.debug("saving AwsReceivedEmail instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsReceivedEmail persistentInstance) {
		log.debug("deleting AwsReceivedEmail instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsReceivedEmail findById(java.lang.Integer id) {
		log.debug("getting AwsReceivedEmail instance with id: " + id);
		try {
			AwsReceivedEmail instance = (AwsReceivedEmail) getSession().get(
					"com.world.wen.AwsReceivedEmail", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsReceivedEmail instance) {
		log.debug("finding AwsReceivedEmail instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsReceivedEmail")
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
		log.debug("finding AwsReceivedEmail instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsReceivedEmail as model where model."
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

	public List findByConfigId(Object configId) {
		return findByProperty(CONFIG_ID, configId);
	}

	public List findByMessageId(Object messageId) {
		return findByProperty(MESSAGE_ID, messageId);
	}

	public List findByDate(Object date) {
		return findByProperty(DATE, date);
	}

	public List findByFrom(Object from) {
		return findByProperty(FROM, from);
	}

	public List findBySubject(Object subject) {
		return findByProperty(SUBJECT, subject);
	}

	public List findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List findByQuestionId(Object questionId) {
		return findByProperty(QUESTION_ID, questionId);
	}

	public List findByTicketId(Object ticketId) {
		return findByProperty(TICKET_ID, ticketId);
	}

	public List findAll() {
		log.debug("finding all AwsReceivedEmail instances");
		try {
			String queryString = "from AwsReceivedEmail";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsReceivedEmail merge(AwsReceivedEmail detachedInstance) {
		log.debug("merging AwsReceivedEmail instance");
		try {
			AwsReceivedEmail result = (AwsReceivedEmail) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsReceivedEmail instance) {
		log.debug("attaching dirty AwsReceivedEmail instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsReceivedEmail instance) {
		log.debug("attaching clean AwsReceivedEmail instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}