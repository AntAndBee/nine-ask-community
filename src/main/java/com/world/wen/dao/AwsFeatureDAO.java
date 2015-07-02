package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsFeature;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsFeature entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsFeature
 * @author MyEclipse Persistence Tools
 */
public class AwsFeatureDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsFeatureDAO.class);
	// property constants
	public static final String TITLE = "title";
	public static final String DESCRIPTION = "description";
	public static final String ICON = "icon";
	public static final String TOPIC_COUNT = "topicCount";
	public static final String CSS = "css";
	public static final String URL_TOKEN = "urlToken";
	public static final String SEO_TITLE = "seoTitle";
	public static final String ENABLED = "enabled";

	public void save(AwsFeature transientInstance) {
		log.debug("saving AwsFeature instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsFeature persistentInstance) {
		log.debug("deleting AwsFeature instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsFeature findById(java.lang.Integer id) {
		log.debug("getting AwsFeature instance with id: " + id);
		try {
			AwsFeature instance = (AwsFeature) getSession().get(
					"com.world.wen.AwsFeature", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsFeature instance) {
		log.debug("finding AwsFeature instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsFeature")
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
		log.debug("finding AwsFeature instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AwsFeature as model where model."
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

	public List findByIcon(Object icon) {
		return findByProperty(ICON, icon);
	}

	public List findByTopicCount(Object topicCount) {
		return findByProperty(TOPIC_COUNT, topicCount);
	}

	public List findByCss(Object css) {
		return findByProperty(CSS, css);
	}

	public List findByUrlToken(Object urlToken) {
		return findByProperty(URL_TOKEN, urlToken);
	}

	public List findBySeoTitle(Object seoTitle) {
		return findByProperty(SEO_TITLE, seoTitle);
	}

	public List findByEnabled(Object enabled) {
		return findByProperty(ENABLED, enabled);
	}

	public List findAll() {
		log.debug("finding all AwsFeature instances");
		try {
			String queryString = "from AwsFeature";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsFeature merge(AwsFeature detachedInstance) {
		log.debug("merging AwsFeature instance");
		try {
			AwsFeature result = (AwsFeature) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsFeature instance) {
		log.debug("attaching dirty AwsFeature instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsFeature instance) {
		log.debug("attaching clean AwsFeature instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}