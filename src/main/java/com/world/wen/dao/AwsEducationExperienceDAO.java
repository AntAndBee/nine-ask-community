package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsEducationExperience;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsEducationExperience entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsEducationExperience
 * @author MyEclipse Persistence Tools
 */
public class AwsEducationExperienceDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsEducationExperienceDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String EDUCATION_YEARS = "educationYears";
	public static final String SCHOOL_NAME = "schoolName";
	public static final String SCHOOL_TYPE = "schoolType";
	public static final String DEPARTMENTS = "departments";
	public static final String ADD_TIME = "addTime";

	public void save(AwsEducationExperience transientInstance) {
		log.debug("saving AwsEducationExperience instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsEducationExperience persistentInstance) {
		log.debug("deleting AwsEducationExperience instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsEducationExperience findById(java.lang.Integer id) {
		log.debug("getting AwsEducationExperience instance with id: " + id);
		try {
			AwsEducationExperience instance = (AwsEducationExperience) getSession()
					.get("com.world.wen.AwsEducationExperience", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsEducationExperience instance) {
		log.debug("finding AwsEducationExperience instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsEducationExperience")
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
		log.debug("finding AwsEducationExperience instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsEducationExperience as model where model."
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

	public List findByEducationYears(Object educationYears) {
		return findByProperty(EDUCATION_YEARS, educationYears);
	}

	public List findBySchoolName(Object schoolName) {
		return findByProperty(SCHOOL_NAME, schoolName);
	}

	public List findBySchoolType(Object schoolType) {
		return findByProperty(SCHOOL_TYPE, schoolType);
	}

	public List findByDepartments(Object departments) {
		return findByProperty(DEPARTMENTS, departments);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findAll() {
		log.debug("finding all AwsEducationExperience instances");
		try {
			String queryString = "from AwsEducationExperience";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsEducationExperience merge(AwsEducationExperience detachedInstance) {
		log.debug("merging AwsEducationExperience instance");
		try {
			AwsEducationExperience result = (AwsEducationExperience) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsEducationExperience instance) {
		log.debug("attaching dirty AwsEducationExperience instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsEducationExperience instance) {
		log.debug("attaching clean AwsEducationExperience instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}