package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsJobs;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsJobs entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsJobs
 * @author MyEclipse Persistence Tools
 */
public class AwsJobsDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(AwsJobsDAO.class);
	// property constants
	public static final String JOB_NAME = "jobName";

	public void save(AwsJobs transientInstance) {
		log.debug("saving AwsJobs instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsJobs persistentInstance) {
		log.debug("deleting AwsJobs instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsJobs findById(java.lang.Integer id) {
		log.debug("getting AwsJobs instance with id: " + id);
		try {
			AwsJobs instance = (AwsJobs) getSession().get(
					"com.world.wen.AwsJobs", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsJobs instance) {
		log.debug("finding AwsJobs instance by example");
		try {
			List results = getSession().createCriteria("com.world.wen.AwsJobs")
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
		log.debug("finding AwsJobs instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AwsJobs as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByJobName(Object jobName) {
		return findByProperty(JOB_NAME, jobName);
	}

	public List findAll() {
		log.debug("finding all AwsJobs instances");
		try {
			String queryString = "from AwsJobs";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsJobs merge(AwsJobs detachedInstance) {
		log.debug("merging AwsJobs instance");
		try {
			AwsJobs result = (AwsJobs) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsJobs instance) {
		log.debug("attaching dirty AwsJobs instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsJobs instance) {
		log.debug("attaching clean AwsJobs instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}