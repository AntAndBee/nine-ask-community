package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsUsersGroup;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsUsersGroup entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsUsersGroup
 * @author MyEclipse Persistence Tools
 */
public class AwsUsersGroupDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsUsersGroupDAO.class);
	// property constants
	public static final String TYPE = "type";
	public static final String CUSTOM = "custom";
	public static final String GROUP_NAME = "groupName";
	public static final String REPUTATION_LOWER = "reputationLower";
	public static final String REPUTATION_HIGER = "reputationHiger";
	public static final String REPUTATION_FACTOR = "reputationFactor";
	public static final String PERMISSION = "permission";

	public void save(AwsUsersGroup transientInstance) {
		log.debug("saving AwsUsersGroup instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsUsersGroup persistentInstance) {
		log.debug("deleting AwsUsersGroup instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsUsersGroup findById(java.lang.Integer id) {
		log.debug("getting AwsUsersGroup instance with id: " + id);
		try {
			AwsUsersGroup instance = (AwsUsersGroup) getSession().get(
					"com.world.wen.AwsUsersGroup", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsUsersGroup instance) {
		log.debug("finding AwsUsersGroup instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsUsersGroup")
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
		log.debug("finding AwsUsersGroup instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsUsersGroup as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByCustom(Object custom) {
		return findByProperty(CUSTOM, custom);
	}

	public List findByGroupName(Object groupName) {
		return findByProperty(GROUP_NAME, groupName);
	}

	public List findByReputationLower(Object reputationLower) {
		return findByProperty(REPUTATION_LOWER, reputationLower);
	}

	public List findByReputationHiger(Object reputationHiger) {
		return findByProperty(REPUTATION_HIGER, reputationHiger);
	}

	public List findByReputationFactor(Object reputationFactor) {
		return findByProperty(REPUTATION_FACTOR, reputationFactor);
	}

	public List findByPermission(Object permission) {
		return findByProperty(PERMISSION, permission);
	}

	public List findAll() {
		log.debug("finding all AwsUsersGroup instances");
		try {
			String queryString = "from AwsUsersGroup";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsUsersGroup merge(AwsUsersGroup detachedInstance) {
		log.debug("merging AwsUsersGroup instance");
		try {
			AwsUsersGroup result = (AwsUsersGroup) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsUsersGroup instance) {
		log.debug("attaching dirty AwsUsersGroup instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsUsersGroup instance) {
		log.debug("attaching clean AwsUsersGroup instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}