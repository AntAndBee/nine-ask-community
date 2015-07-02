package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsReport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsReport entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsReport
 * @author MyEclipse Persistence Tools
 */
public class AwsReportDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsReportDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String TYPE = "type";
	public static final String TARGET_ID = "targetId";
	public static final String REASON = "reason";
	public static final String URL = "url";
	public static final String ADD_TIME = "addTime";
	public static final String STATUS = "status";

	public void save(AwsReport transientInstance) {
		log.debug("saving AwsReport instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsReport persistentInstance) {
		log.debug("deleting AwsReport instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsReport findById(java.lang.Integer id) {
		log.debug("getting AwsReport instance with id: " + id);
		try {
			AwsReport instance = (AwsReport) getSession().get(
					"com.world.wen.AwsReport", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsReport instance) {
		log.debug("finding AwsReport instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsReport")
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
		log.debug("finding AwsReport instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AwsReport as model where model."
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

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByTargetId(Object targetId) {
		return findByProperty(TARGET_ID, targetId);
	}

	public List findByReason(Object reason) {
		return findByProperty(REASON, reason);
	}

	public List findByUrl(Object url) {
		return findByProperty(URL, url);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findAll() {
		log.debug("finding all AwsReport instances");
		try {
			String queryString = "from AwsReport";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsReport merge(AwsReport detachedInstance) {
		log.debug("merging AwsReport instance");
		try {
			AwsReport result = (AwsReport) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsReport instance) {
		log.debug("attaching dirty AwsReport instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsReport instance) {
		log.debug("attaching clean AwsReport instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}