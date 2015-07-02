package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsPostsIndex;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsPostsIndex entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsPostsIndex
 * @author MyEclipse Persistence Tools
 */
public class AwsPostsIndexDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsPostsIndexDAO.class);
	// property constants
	public static final String POST_ID = "postId";
	public static final String POST_TYPE = "postType";
	public static final String ADD_TIME = "addTime";
	public static final String UPDATE_TIME = "updateTime";
	public static final String CATEGORY_ID = "categoryId";
	public static final String IS_RECOMMEND = "isRecommend";
	public static final String VIEW_COUNT = "viewCount";
	public static final String ANONYMOUS = "anonymous";
	public static final String POPULAR_VALUE = "popularValue";
	public static final String UID = "uid";
	public static final String LOCK = "lock";
	public static final String AGREE_COUNT = "agreeCount";
	public static final String ANSWER_COUNT = "answerCount";

	public void save(AwsPostsIndex transientInstance) {
		log.debug("saving AwsPostsIndex instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsPostsIndex persistentInstance) {
		log.debug("deleting AwsPostsIndex instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsPostsIndex findById(java.lang.Integer id) {
		log.debug("getting AwsPostsIndex instance with id: " + id);
		try {
			AwsPostsIndex instance = (AwsPostsIndex) getSession().get(
					"com.world.wen.AwsPostsIndex", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsPostsIndex instance) {
		log.debug("finding AwsPostsIndex instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsPostsIndex")
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
		log.debug("finding AwsPostsIndex instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsPostsIndex as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPostId(Object postId) {
		return findByProperty(POST_ID, postId);
	}

	public List findByPostType(Object postType) {
		return findByProperty(POST_TYPE, postType);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findByUpdateTime(Object updateTime) {
		return findByProperty(UPDATE_TIME, updateTime);
	}

	public List findByCategoryId(Object categoryId) {
		return findByProperty(CATEGORY_ID, categoryId);
	}

	public List findByIsRecommend(Object isRecommend) {
		return findByProperty(IS_RECOMMEND, isRecommend);
	}

	public List findByViewCount(Object viewCount) {
		return findByProperty(VIEW_COUNT, viewCount);
	}

	public List findByAnonymous(Object anonymous) {
		return findByProperty(ANONYMOUS, anonymous);
	}

	public List findByPopularValue(Object popularValue) {
		return findByProperty(POPULAR_VALUE, popularValue);
	}

	public List findByUid(Object uid) {
		return findByProperty(UID, uid);
	}

	public List findByLock(Object lock) {
		return findByProperty(LOCK, lock);
	}

	public List findByAgreeCount(Object agreeCount) {
		return findByProperty(AGREE_COUNT, agreeCount);
	}

	public List findByAnswerCount(Object answerCount) {
		return findByProperty(ANSWER_COUNT, answerCount);
	}

	public List findAll() {
		log.debug("finding all AwsPostsIndex instances");
		try {
			String queryString = "from AwsPostsIndex";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsPostsIndex merge(AwsPostsIndex detachedInstance) {
		log.debug("merging AwsPostsIndex instance");
		try {
			AwsPostsIndex result = (AwsPostsIndex) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsPostsIndex instance) {
		log.debug("attaching dirty AwsPostsIndex instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsPostsIndex instance) {
		log.debug("attaching clean AwsPostsIndex instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}