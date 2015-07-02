package com.world.wen.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world.wen.dao.AwsActiveDataDAO;
import com.world.wen.vo.response.GetAllTopicResp;

@Service
public class AwsActiveDataService {
	@Autowired
	private AwsActiveDataDAO awsActiveDataDAO;
	
	/**
	 * 
	 * @return
	 * @throws Exception 
	 * @throws IllegalAccessException 
	 */
	@SuppressWarnings("rawtypes")
	public List<GetAllTopicResp> getAllTopicResps() throws IllegalAccessException, Exception {
		List list = awsActiveDataDAO.findAll();
		List<GetAllTopicResp> allTopicResps = new ArrayList<GetAllTopicResp>();
		
		BeanUtils.copyProperties(allTopicResps, list);
		
		return allTopicResps;
	}
}
