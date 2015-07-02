package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsCategory;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsCategory entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsCategory
 * @author MyEclipse Persistence Tools
 */
public class AwsCategoryDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsCategoryDAO.class);
	// property constants
	public static final String TITLE = "title";
	public static final String TYPE = "type";
	public static final String ICON = "icon";
	public static final String PARENT_ID = "parentId";
	public static final String SORT = "sort";
	public static final String URL_TOKEN = "urlToken";

	public void save(AwsCategory transientInstance) {
		log.debug("saving AwsCategory instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsCategory persistentInstance) {
		log.debug("deleting AwsCategory instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsCategory findById(java.lang.Integer id) {
		log.debug("getting AwsCategory instance with id: " + id);
		try {
			AwsCategory instance = (AwsCategory) getSession().get(
					"com.world.wen.AwsCategory", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsCategory instance) {
		log.debug("finding AwsCategory instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsCategory")
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
		log.debug("finding AwsCategory instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AwsCategory as model where model."
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

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByIcon(Object icon) {
		return findByProperty(ICON, icon);
	}

	public List findByParentId(Object parentId) {
		return findByProperty(PARENT_ID, parentId);
	}

	public List findBySort(Object sort) {
		return findByProperty(SORT, sort);
	}

	public List findByUrlToken(Object urlToken) {
		return findByProperty(URL_TOKEN, urlToken);
	}

	public List findAll() {
		log.debug("finding all AwsCategory instances");
		try {
			String queryString = "from AwsCategory";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsCategory merge(AwsCategory detachedInstance) {
		log.debug("merging AwsCategory instance");
		try {
			AwsCategory result = (AwsCategory) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsCategory instance) {
		log.debug("attaching dirty AwsCategory instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsCategory instance) {
		log.debug("attaching clean AwsCategory instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}