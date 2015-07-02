package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsWorkExperience;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsWorkExperience entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsWorkExperience
 * @author MyEclipse Persistence Tools
 */
public class AwsWorkExperienceDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsWorkExperienceDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String START_YEAR = "startYear";
	public static final String END_YEAR = "endYear";
	public static final String COMPANY_NAME = "companyName";
	public static final String JOB_ID = "jobId";
	public static final String ADD_TIME = "addTime";

	public void save(AwsWorkExperience transientInstance) {
		log.debug("saving AwsWorkExperience instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsWorkExperience persistentInstance) {
		log.debug("deleting AwsWorkExperience instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsWorkExperience findById(java.lang.Integer id) {
		log.debug("getting AwsWorkExperience instance with id: " + id);
		try {
			AwsWorkExperience instance = (AwsWorkExperience) getSession().get(
					"com.world.wen.AwsWorkExperience", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsWorkExperience instance) {
		log.debug("finding AwsWorkExperience instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsWorkExperience")
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
		log.debug("finding AwsWorkExperience instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsWorkExperience as model where model."
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

	public List findByStartYear(Object startYear) {
		return findByProperty(START_YEAR, startYear);
	}

	public List findByEndYear(Object endYear) {
		return findByProperty(END_YEAR, endYear);
	}

	public List findByCompanyName(Object companyName) {
		return findByProperty(COMPANY_NAME, companyName);
	}

	public List findByJobId(Object jobId) {
		return findByProperty(JOB_ID, jobId);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findAll() {
		log.debug("finding all AwsWorkExperience instances");
		try {
			String queryString = "from AwsWorkExperience";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsWorkExperience merge(AwsWorkExperience detachedInstance) {
		log.debug("merging AwsWorkExperience instance");
		try {
			AwsWorkExperience result = (AwsWorkExperience) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsWorkExperience instance) {
		log.debug("attaching dirty AwsWorkExperience instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsWorkExperience instance) {
		log.debug("attaching clean AwsWorkExperience instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}