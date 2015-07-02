package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsPages;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsPages entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsPages
 * @author MyEclipse Persistence Tools
 */
public class AwsPagesDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsPagesDAO.class);
	// property constants
	public static final String URL_TOKEN = "urlToken";
	public static final String TITLE = "title";
	public static final String KEYWORDS = "keywords";
	public static final String DESCRIPTION = "description";
	public static final String CONTENTS = "contents";
	public static final String ENABLED = "enabled";

	public void save(AwsPages transientInstance) {
		log.debug("saving AwsPages instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsPages persistentInstance) {
		log.debug("deleting AwsPages instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsPages findById(java.lang.Integer id) {
		log.debug("getting AwsPages instance with id: " + id);
		try {
			AwsPages instance = (AwsPages) getSession().get(
					"com.world.wen.AwsPages", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsPages instance) {
		log.debug("finding AwsPages instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsPages")
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
		log.debug("finding AwsPages instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AwsPages as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUrlToken(Object urlToken) {
		return findByProperty(URL_TOKEN, urlToken);
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByKeywords(Object keywords) {
		return findByProperty(KEYWORDS, keywords);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findByContents(Object contents) {
		return findByProperty(CONTENTS, contents);
	}

	public List findByEnabled(Object enabled) {
		return findByProperty(ENABLED, enabled);
	}

	public List findAll() {
		log.debug("finding all AwsPages instances");
		try {
			String queryString = "from AwsPages";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsPages merge(AwsPages detachedInstance) {
		log.debug("merging AwsPages instance");
		try {
			AwsPages result = (AwsPages) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsPages instance) {
		log.debug("attaching dirty AwsPages instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsPages instance) {
		log.debug("attaching clean AwsPages instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}