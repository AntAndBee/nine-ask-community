package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsInbox;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsInbox entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsInbox
 * @author MyEclipse Persistence Tools
 */
public class AwsInboxDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsInboxDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String DIALOG_ID = "dialogId";
	public static final String MESSAGE = "message";
	public static final String ADD_TIME = "addTime";
	public static final String SENDER_REMOVE = "senderRemove";
	public static final String RECIPIENT_REMOVE = "recipientRemove";
	public static final String RECEIPT = "receipt";

	public void save(AwsInbox transientInstance) {
		log.debug("saving AwsInbox instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsInbox persistentInstance) {
		log.debug("deleting AwsInbox instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsInbox findById(java.lang.Integer id) {
		log.debug("getting AwsInbox instance with id: " + id);
		try {
			AwsInbox instance = (AwsInbox) getSession().get(
					"com.world.wen.AwsInbox", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsInbox instance) {
		log.debug("finding AwsInbox instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsInbox")
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
		log.debug("finding AwsInbox instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AwsInbox as model where model."
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

	public List findByDialogId(Object dialogId) {
		return findByProperty(DIALOG_ID, dialogId);
	}

	public List findByMessage(Object message) {
		return findByProperty(MESSAGE, message);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findBySenderRemove(Object senderRemove) {
		return findByProperty(SENDER_REMOVE, senderRemove);
	}

	public List findByRecipientRemove(Object recipientRemove) {
		return findByProperty(RECIPIENT_REMOVE, recipientRemove);
	}

	public List findByReceipt(Object receipt) {
		return findByProperty(RECEIPT, receipt);
	}

	public List findAll() {
		log.debug("finding all AwsInbox instances");
		try {
			String queryString = "from AwsInbox";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsInbox merge(AwsInbox detachedInstance) {
		log.debug("merging AwsInbox instance");
		try {
			AwsInbox result = (AwsInbox) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsInbox instance) {
		log.debug("attaching dirty AwsInbox instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsInbox instance) {
		log.debug("attaching clean AwsInbox instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}