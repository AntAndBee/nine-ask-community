package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsInvitation;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsInvitation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsInvitation
 * @author MyEclipse Persistence Tools
 */
public class AwsInvitationDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsInvitationDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String INVITATION_CODE = "invitationCode";
	public static final String INVITATION_EMAIL = "invitationEmail";
	public static final String ADD_TIME = "addTime";
	public static final String ADD_IP = "addIp";
	public static final String ACTIVE_EXPIRE = "activeExpire";
	public static final String ACTIVE_TIME = "activeTime";
	public static final String ACTIVE_IP = "activeIp";
	public static final String ACTIVE_STATUS = "activeStatus";
	public static final String ACTIVE_UID = "activeUid";

	public void save(AwsInvitation transientInstance) {
		log.debug("saving AwsInvitation instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsInvitation persistentInstance) {
		log.debug("deleting AwsInvitation instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsInvitation findById(java.lang.Integer id) {
		log.debug("getting AwsInvitation instance with id: " + id);
		try {
			AwsInvitation instance = (AwsInvitation) getSession().get(
					"com.world.wen.AwsInvitation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsInvitation instance) {
		log.debug("finding AwsInvitation instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsInvitation")
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
		log.debug("finding AwsInvitation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsInvitation as model where model."
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

	public List findByInvitationCode(Object invitationCode) {
		return findByProperty(INVITATION_CODE, invitationCode);
	}

	public List findByInvitationEmail(Object invitationEmail) {
		return findByProperty(INVITATION_EMAIL, invitationEmail);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findByAddIp(Object addIp) {
		return findByProperty(ADD_IP, addIp);
	}

	public List findByActiveExpire(Object activeExpire) {
		return findByProperty(ACTIVE_EXPIRE, activeExpire);
	}

	public List findByActiveTime(Object activeTime) {
		return findByProperty(ACTIVE_TIME, activeTime);
	}

	public List findByActiveIp(Object activeIp) {
		return findByProperty(ACTIVE_IP, activeIp);
	}

	public List findByActiveStatus(Object activeStatus) {
		return findByProperty(ACTIVE_STATUS, activeStatus);
	}

	public List findByActiveUid(Object activeUid) {
		return findByProperty(ACTIVE_UID, activeUid);
	}

	public List findAll() {
		log.debug("finding all AwsInvitation instances");
		try {
			String queryString = "from AwsInvitation";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsInvitation merge(AwsInvitation detachedInstance) {
		log.debug("merging AwsInvitation instance");
		try {
			AwsInvitation result = (AwsInvitation) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsInvitation instance) {
		log.debug("attaching dirty AwsInvitation instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsInvitation instance) {
		log.debug("attaching clean AwsInvitation instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}