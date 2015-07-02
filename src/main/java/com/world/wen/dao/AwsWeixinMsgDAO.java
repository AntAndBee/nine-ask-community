package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsWeixinMsg;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsWeixinMsg entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsWeixinMsg
 * @author MyEclipse Persistence Tools
 */
public class AwsWeixinMsgDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsWeixinMsgDAO.class);
	// property constants
	public static final String MSG_ID = "msgId";
	public static final String GROUP_NAME = "groupName";
	public static final String STATUS = "status";
	public static final String ERROR_NUM = "errorNum";
	public static final String MAIN_MSG = "mainMsg";
	public static final String ARTICLES_INFO = "articlesInfo";
	public static final String QUESTIONS_INFO = "questionsInfo";
	public static final String CREATE_TIME = "createTime";
	public static final String FILTER_COUNT = "filterCount";

	public void save(AwsWeixinMsg transientInstance) {
		log.debug("saving AwsWeixinMsg instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsWeixinMsg persistentInstance) {
		log.debug("deleting AwsWeixinMsg instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsWeixinMsg findById(java.lang.Integer id) {
		log.debug("getting AwsWeixinMsg instance with id: " + id);
		try {
			AwsWeixinMsg instance = (AwsWeixinMsg) getSession().get(
					"com.world.wen.AwsWeixinMsg", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsWeixinMsg instance) {
		log.debug("finding AwsWeixinMsg instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsWeixinMsg")
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
		log.debug("finding AwsWeixinMsg instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsWeixinMsg as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByMsgId(Object msgId) {
		return findByProperty(MSG_ID, msgId);
	}

	public List findByGroupName(Object groupName) {
		return findByProperty(GROUP_NAME, groupName);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findByErrorNum(Object errorNum) {
		return findByProperty(ERROR_NUM, errorNum);
	}

	public List findByMainMsg(Object mainMsg) {
		return findByProperty(MAIN_MSG, mainMsg);
	}

	public List findByArticlesInfo(Object articlesInfo) {
		return findByProperty(ARTICLES_INFO, articlesInfo);
	}

	public List findByQuestionsInfo(Object questionsInfo) {
		return findByProperty(QUESTIONS_INFO, questionsInfo);
	}

	public List findByCreateTime(Object createTime) {
		return findByProperty(CREATE_TIME, createTime);
	}

	public List findByFilterCount(Object filterCount) {
		return findByProperty(FILTER_COUNT, filterCount);
	}

	public List findAll() {
		log.debug("finding all AwsWeixinMsg instances");
		try {
			String queryString = "from AwsWeixinMsg";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsWeixinMsg merge(AwsWeixinMsg detachedInstance) {
		log.debug("merging AwsWeixinMsg instance");
		try {
			AwsWeixinMsg result = (AwsWeixinMsg) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsWeixinMsg instance) {
		log.debug("attaching dirty AwsWeixinMsg instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsWeixinMsg instance) {
		log.debug("attaching clean AwsWeixinMsg instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}