package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsNavMenu;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsNavMenu entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsNavMenu
 * @author MyEclipse Persistence Tools
 */
public class AwsNavMenuDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsNavMenuDAO.class);
	// property constants
	public static final String TITLE = "title";
	public static final String DESCRIPTION = "description";
	public static final String TYPE = "type";
	public static final String TYPE_ID = "typeId";
	public static final String LINK = "link";
	public static final String ICON = "icon";
	public static final String SORT = "sort";

	public void save(AwsNavMenu transientInstance) {
		log.debug("saving AwsNavMenu instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsNavMenu persistentInstance) {
		log.debug("deleting AwsNavMenu instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsNavMenu findById(java.lang.Integer id) {
		log.debug("getting AwsNavMenu instance with id: " + id);
		try {
			AwsNavMenu instance = (AwsNavMenu) getSession().get(
					"com.world.wen.AwsNavMenu", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsNavMenu instance) {
		log.debug("finding AwsNavMenu instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsNavMenu")
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
		log.debug("finding AwsNavMenu instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AwsNavMenu as model where model."
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

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByTypeId(Object typeId) {
		return findByProperty(TYPE_ID, typeId);
	}

	public List findByLink(Object link) {
		return findByProperty(LINK, link);
	}

	public List findByIcon(Object icon) {
		return findByProperty(ICON, icon);
	}

	public List findBySort(Object sort) {
		return findByProperty(SORT, sort);
	}

	public List findAll() {
		log.debug("finding all AwsNavMenu instances");
		try {
			String queryString = "from AwsNavMenu";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsNavMenu merge(AwsNavMenu detachedInstance) {
		log.debug("merging AwsNavMenu instance");
		try {
			AwsNavMenu result = (AwsNavMenu) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsNavMenu instance) {
		log.debug("attaching dirty AwsNavMenu instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsNavMenu instance) {
		log.debug("attaching clean AwsNavMenu instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}