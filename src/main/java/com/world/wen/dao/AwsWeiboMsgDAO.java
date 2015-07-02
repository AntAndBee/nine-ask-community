package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsWeiboMsg;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsWeiboMsg entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsWeiboMsg
 * @author MyEclipse Persistence Tools
 */
public class AwsWeiboMsgDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsWeiboMsgDAO.class);
	// property constants
	public static final String CREATED_AT = "createdAt";
	public static final String MSG_AUTHOR_UID = "msgAuthorUid";
	public static final String TEXT = "text";
	public static final String ACCESS_KEY = "accessKey";
	public static final String HAS_ATTACH = "hasAttach";
	public static final String UID = "uid";
	public static final String WEIBO_UID = "weiboUid";
	public static final String QUESTION_ID = "questionId";
	public static final String TICKET_ID = "ticketId";

	public void save(AwsWeiboMsg transientInstance) {
		log.debug("saving AwsWeiboMsg instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsWeiboMsg persistentInstance) {
		log.debug("deleting AwsWeiboMsg instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsWeiboMsg findById(java.lang.Long id) {
		log.debug("getting AwsWeiboMsg instance with id: " + id);
		try {
			AwsWeiboMsg instance = (AwsWeiboMsg) getSession().get(
					"com.world.wen.AwsWeiboMsg", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsWeiboMsg instance) {
		log.debug("finding AwsWeiboMsg instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsWeiboMsg")
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
		log.debug("finding AwsWeiboMsg instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AwsWeiboMsg as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCreatedAt(Object createdAt) {
		return findByProperty(CREATED_AT, createdAt);
	}

	public List findByMsgAuthorUid(Object msgAuthorUid) {
		return findByProperty(MSG_AUTHOR_UID, msgAuthorUid);
	}

	public List findByText(Object text) {
		return findByProperty(TEXT, text);
	}

	public List findByAccessKey(Object accessKey) {
		return findByProperty(ACCESS_KEY, accessKey);
	}

	public List findByHasAttach(Object hasAttach) {
		return findByProperty(HAS_ATTACH, hasAttach);
	}

	public List findByUid(Object uid) {
		return findByProperty(UID, uid);
	}

	public List findByWeiboUid(Object weiboUid) {
		return findByProperty(WEIBO_UID, weiboUid);
	}

	public List findByQuestionId(Object questionId) {
		return findByProperty(QUESTION_ID, questionId);
	}

	public List findByTicketId(Object ticketId) {
		return findByProperty(TICKET_ID, ticketId);
	}

	public List findAll() {
		log.debug("finding all AwsWeiboMsg instances");
		try {
			String queryString = "from AwsWeiboMsg";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsWeiboMsg merge(AwsWeiboMsg detachedInstance) {
		log.debug("merging AwsWeiboMsg instance");
		try {
			AwsWeiboMsg result = (AwsWeiboMsg) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsWeiboMsg instance) {
		log.debug("attaching dirty AwsWeiboMsg instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsWeiboMsg instance) {
		log.debug("attaching clean AwsWeiboMsg instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}