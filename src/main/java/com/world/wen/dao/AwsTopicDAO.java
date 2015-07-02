package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsTopic;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsTopic entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsTopic
 * @author MyEclipse Persistence Tools
 */
public class AwsTopicDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsTopicDAO.class);
	// property constants
	public static final String TOPIC_TITLE = "topicTitle";
	public static final String ADD_TIME = "addTime";
	public static final String DISCUSS_COUNT = "discussCount";
	public static final String TOPIC_DESCRIPTION = "topicDescription";
	public static final String TOPIC_PIC = "topicPic";
	public static final String TOPIC_LOCK = "topicLock";
	public static final String FOCUS_COUNT = "focusCount";
	public static final String USER_RELATED = "userRelated";
	public static final String URL_TOKEN = "urlToken";
	public static final String MERGED_ID = "mergedId";
	public static final String SEO_TITLE = "seoTitle";
	public static final String PARENT_ID = "parentId";
	public static final String IS_PARENT = "isParent";
	public static final String DISCUSS_COUNT_LAST_WEEK = "discussCountLastWeek";
	public static final String DISCUSS_COUNT_LAST_MONTH = "discussCountLastMonth";
	public static final String DISCUSS_COUNT_UPDATE = "discussCountUpdate";

	public void save(AwsTopic transientInstance) {
		log.debug("saving AwsTopic instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsTopic persistentInstance) {
		log.debug("deleting AwsTopic instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsTopic findById(java.lang.Integer id) {
		log.debug("getting AwsTopic instance with id: " + id);
		try {
			AwsTopic instance = (AwsTopic) getSession().get(
					"com.world.wen.AwsTopic", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsTopic instance) {
		log.debug("finding AwsTopic instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsTopic")
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
		log.debug("finding AwsTopic instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AwsTopic as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTopicTitle(Object topicTitle) {
		return findByProperty(TOPIC_TITLE, topicTitle);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findByDiscussCount(Object discussCount) {
		return findByProperty(DISCUSS_COUNT, discussCount);
	}

	public List findByTopicDescription(Object topicDescription) {
		return findByProperty(TOPIC_DESCRIPTION, topicDescription);
	}

	public List findByTopicPic(Object topicPic) {
		return findByProperty(TOPIC_PIC, topicPic);
	}

	public List findByTopicLock(Object topicLock) {
		return findByProperty(TOPIC_LOCK, topicLock);
	}

	public List findByFocusCount(Object focusCount) {
		return findByProperty(FOCUS_COUNT, focusCount);
	}

	public List findByUserRelated(Object userRelated) {
		return findByProperty(USER_RELATED, userRelated);
	}

	public List findByUrlToken(Object urlToken) {
		return findByProperty(URL_TOKEN, urlToken);
	}

	public List findByMergedId(Object mergedId) {
		return findByProperty(MERGED_ID, mergedId);
	}

	public List findBySeoTitle(Object seoTitle) {
		return findByProperty(SEO_TITLE, seoTitle);
	}

	public List findByParentId(Object parentId) {
		return findByProperty(PARENT_ID, parentId);
	}

	public List findByIsParent(Object isParent) {
		return findByProperty(IS_PARENT, isParent);
	}

	public List findByDiscussCountLastWeek(Object discussCountLastWeek) {
		return findByProperty(DISCUSS_COUNT_LAST_WEEK, discussCountLastWeek);
	}

	public List findByDiscussCountLastMonth(Object discussCountLastMonth) {
		return findByProperty(DISCUSS_COUNT_LAST_MONTH, discussCountLastMonth);
	}

	public List findByDiscussCountUpdate(Object discussCountUpdate) {
		return findByProperty(DISCUSS_COUNT_UPDATE, discussCountUpdate);
	}

	public List findAll() {
		log.debug("finding all AwsTopic instances");
		try {
			String queryString = "from AwsTopic";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsTopic merge(AwsTopic detachedInstance) {
		log.debug("merging AwsTopic instance");
		try {
			AwsTopic result = (AwsTopic) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsTopic instance) {
		log.debug("attaching dirty AwsTopic instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsTopic instance) {
		log.debug("attaching clean AwsTopic instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}