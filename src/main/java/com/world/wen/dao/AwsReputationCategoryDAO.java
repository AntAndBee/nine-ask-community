package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsReputationCategory;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsReputationCategory entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsReputationCategory
 * @author MyEclipse Persistence Tools
 */
public class AwsReputationCategoryDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsReputationCategoryDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String CATEGORY_ID = "categoryId";
	public static final String UPDATE_TIME = "updateTime";
	public static final String REPUTATION = "reputation";
	public static final String THANKS_COUNT = "thanksCount";
	public static final String AGREE_COUNT = "agreeCount";
	public static final String QUESTION_COUNT = "questionCount";

	public void save(AwsReputationCategory transientInstance) {
		log.debug("saving AwsReputationCategory instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsReputationCategory persistentInstance) {
		log.debug("deleting AwsReputationCategory instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsReputationCategory findById(java.lang.Integer id) {
		log.debug("getting AwsReputationCategory instance with id: " + id);
		try {
			AwsReputationCategory instance = (AwsReputationCategory) getSession()
					.get("com.world.wen.AwsReputationCategory", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsReputationCategory instance) {
		log.debug("finding AwsReputationCategory instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsReputationCategory")
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
		log.debug("finding AwsReputationCategory instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsReputationCategory as model where model."
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

	public List findByCategoryId(Object categoryId) {
		return findByProperty(CATEGORY_ID, categoryId);
	}

	public List findByUpdateTime(Object updateTime) {
		return findByProperty(UPDATE_TIME, updateTime);
	}

	public List findByReputation(Object reputation) {
		return findByProperty(REPUTATION, reputation);
	}

	public List findByThanksCount(Object thanksCount) {
		return findByProperty(THANKS_COUNT, thanksCount);
	}

	public List findByAgreeCount(Object agreeCount) {
		return findByProperty(AGREE_COUNT, agreeCount);
	}

	public List findByQuestionCount(Object questionCount) {
		return findByProperty(QUESTION_COUNT, questionCount);
	}

	public List findAll() {
		log.debug("finding all AwsReputationCategory instances");
		try {
			String queryString = "from AwsReputationCategory";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsReputationCategory merge(AwsReputationCategory detachedInstance) {
		log.debug("merging AwsReputationCategory instance");
		try {
			AwsReputationCategory result = (AwsReputationCategory) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsReputationCategory instance) {
		log.debug("attaching dirty AwsReputationCategory instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsReputationCategory instance) {
		log.debug("attaching clean AwsReputationCategory instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}