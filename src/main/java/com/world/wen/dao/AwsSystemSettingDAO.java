package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsSystemSetting;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsSystemSetting entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsSystemSetting
 * @author MyEclipse Persistence Tools
 */
public class AwsSystemSettingDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsSystemSettingDAO.class);
	// property constants
	public static final String VARNAME = "varname";
	public static final String VALUE = "value";

	public void save(AwsSystemSetting transientInstance) {
		log.debug("saving AwsSystemSetting instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsSystemSetting persistentInstance) {
		log.debug("deleting AwsSystemSetting instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsSystemSetting findById(java.lang.Integer id) {
		log.debug("getting AwsSystemSetting instance with id: " + id);
		try {
			AwsSystemSetting instance = (AwsSystemSetting) getSession().get(
					"com.world.wen.AwsSystemSetting", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsSystemSetting instance) {
		log.debug("finding AwsSystemSetting instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsSystemSetting")
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
		log.debug("finding AwsSystemSetting instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsSystemSetting as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByVarname(Object varname) {
		return findByProperty(VARNAME, varname);
	}

	public List findByValue(Object value) {
		return findByProperty(VALUE, value);
	}

	public List findAll() {
		log.debug("finding all AwsSystemSetting instances");
		try {
			String queryString = "from AwsSystemSetting";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsSystemSetting merge(AwsSystemSetting detachedInstance) {
		log.debug("merging AwsSystemSetting instance");
		try {
			AwsSystemSetting result = (AwsSystemSetting) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsSystemSetting instance) {
		log.debug("attaching dirty AwsSystemSetting instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsSystemSetting instance) {
		log.debug("attaching clean AwsSystemSetting instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}