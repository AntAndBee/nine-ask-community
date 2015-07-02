package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsArticle;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsArticle entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsArticle
 * @author MyEclipse Persistence Tools
 */
public class AwsArticleDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsArticleDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String TITLE = "title";
	public static final String MESSAGE = "message";
	public static final String COMMENTS = "comments";
	public static final String VIEWS = "views";
	public static final String ADD_TIME = "addTime";
	public static final String HAS_ATTACH = "hasAttach";
	public static final String LOCK = "lock";
	public static final String VOTES = "votes";
	public static final String TITLE_FULLTEXT = "titleFulltext";
	public static final String CATEGORY_ID = "categoryId";
	public static final String IS_RECOMMEND = "isRecommend";
	public static final String CHAPTER_ID = "chapterId";
	public static final String SORT = "sort";

	public void save(AwsArticle transientInstance) {
		log.debug("saving AwsArticle instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsArticle persistentInstance) {
		log.debug("deleting AwsArticle instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsArticle findById(java.lang.Integer id) {
		log.debug("getting AwsArticle instance with id: " + id);
		try {
			AwsArticle instance = (AwsArticle) getSession().get(
					"com.world.wen.AwsArticle", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsArticle instance) {
		log.debug("finding AwsArticle instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsArticle")
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
		log.debug("finding AwsArticle instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AwsArticle as model where model."
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

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByMessage(Object message) {
		return findByProperty(MESSAGE, message);
	}

	public List findByComments(Object comments) {
		return findByProperty(COMMENTS, comments);
	}

	public List findByViews(Object views) {
		return findByProperty(VIEWS, views);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findByHasAttach(Object hasAttach) {
		return findByProperty(HAS_ATTACH, hasAttach);
	}

	public List findByLock(Object lock) {
		return findByProperty(LOCK, lock);
	}

	public List findByVotes(Object votes) {
		return findByProperty(VOTES, votes);
	}

	public List findByTitleFulltext(Object titleFulltext) {
		return findByProperty(TITLE_FULLTEXT, titleFulltext);
	}

	public List findByCategoryId(Object categoryId) {
		return findByProperty(CATEGORY_ID, categoryId);
	}

	public List findByIsRecommend(Object isRecommend) {
		return findByProperty(IS_RECOMMEND, isRecommend);
	}

	public List findByChapterId(Object chapterId) {
		return findByProperty(CHAPTER_ID, chapterId);
	}

	public List findBySort(Object sort) {
		return findByProperty(SORT, sort);
	}

	public List findAll() {
		log.debug("finding all AwsArticle instances");
		try {
			String queryString = "from AwsArticle";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsArticle merge(AwsArticle detachedInstance) {
		log.debug("merging AwsArticle instance");
		try {
			AwsArticle result = (AwsArticle) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsArticle instance) {
		log.debug("attaching dirty AwsArticle instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsArticle instance) {
		log.debug("attaching clean AwsArticle instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}