package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsTopicRelation;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsTopicRelation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsTopicRelation
 * @author MyEclipse Persistence Tools
 */
public class AwsTopicRelationDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsTopicRelationDAO.class);
	// property constants
	public static final String TOPIC_ID = "topicId";
	public static final String ITEM_ID = "itemId";
	public static final String ADD_TIME = "addTime";
	public static final String UID = "uid";
	public static final String TYPE = "type";

	public void save(AwsTopicRelation transientInstance) {
		log.debug("saving AwsTopicRelation instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsTopicRelation persistentInstance) {
		log.debug("deleting AwsTopicRelation instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsTopicRelation findById(java.lang.Integer id) {
		log.debug("getting AwsTopicRelation instance with id: " + id);
		try {
			AwsTopicRelation instance = (AwsTopicRelation) getSession().get(
					"com.world.wen.AwsTopicRelation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsTopicRelation instance) {
		log.debug("finding AwsTopicRelation instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsTopicRelation")
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
		log.debug("finding AwsTopicRelation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsTopicRelation as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTopicId(Object topicId) {
		return findByProperty(TOPIC_ID, topicId);
	}

	public List findByItemId(Object itemId) {
		return findByProperty(ITEM_ID, itemId);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findByUid(Object uid) {
		return findByProperty(UID, uid);
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findAll() {
		log.debug("finding all AwsTopicRelation instances");
		try {
			String queryString = "from AwsTopicRelation";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsTopicRelation merge(AwsTopicRelation detachedInstance) {
		log.debug("merging AwsTopicRelation instance");
		try {
			AwsTopicRelation result = (AwsTopicRelation) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsTopicRelation instance) {
		log.debug("attaching dirty AwsTopicRelation instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsTopicRelation instance) {
		log.debug("attaching clean AwsTopicRelation instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}