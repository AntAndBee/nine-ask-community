package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsHelpChapter;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsHelpChapter entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsHelpChapter
 * @author MyEclipse Persistence Tools
 */
public class AwsHelpChapterDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsHelpChapterDAO.class);
	// property constants
	public static final String TITLE = "title";
	public static final String DESCRIPTION = "description";
	public static final String URL_TOKEN = "urlToken";
	public static final String SORT = "sort";

	public void save(AwsHelpChapter transientInstance) {
		log.debug("saving AwsHelpChapter instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsHelpChapter persistentInstance) {
		log.debug("deleting AwsHelpChapter instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsHelpChapter findById(java.lang.Integer id) {
		log.debug("getting AwsHelpChapter instance with id: " + id);
		try {
			AwsHelpChapter instance = (AwsHelpChapter) getSession().get(
					"com.world.wen.AwsHelpChapter", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsHelpChapter instance) {
		log.debug("finding AwsHelpChapter instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsHelpChapter")
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
		log.debug("finding AwsHelpChapter instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsHelpChapter as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findByUrlToken(Object urlToken) {
		return findByProperty(URL_TOKEN, urlToken);
	}

	public List findBySort(Object sort) {
		return findByProperty(SORT, sort);
	}

	public List findAll() {
		log.debug("finding all AwsHelpChapter instances");
		try {
			String queryString = "from AwsHelpChapter";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsHelpChapter merge(AwsHelpChapter detachedInstance) {
		log.debug("merging AwsHelpChapter instance");
		try {
			AwsHelpChapter result = (AwsHelpChapter) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsHelpChapter instance) {
		log.debug("attaching dirty AwsHelpChapter instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsHelpChapter instance) {
		log.debug("attaching clean AwsHelpChapter instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}