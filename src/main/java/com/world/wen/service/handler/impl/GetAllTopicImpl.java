package com.world.wen.service.handler.impl;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.world.wen.service.AwsActiveDataService;
import com.world.wen.service.handler.AppHandler;
import com.world.wen.vo.RequestBody;
import com.world.wen.vo.ResponseBody;
import com.world.wen.vo.response.GetAllTopicResp;

@Service
@Transactional
public class GetAllTopicImpl implements AppHandler {
	@Autowired
	private AwsActiveDataService awsActiveDataService;

	@Override
	public ResponseBody handle(HttpServletRequest httpServletRequest,
			RequestBody requestBody) {
		GetAllTopicResp getAllTopicResp = new GetAllTopicResp();
		try {
			BeanUtils.copyProperties(getAllTopicResp.getGetTopicResps(), awsActiveDataService.getAllTopicResps());
		} catch (Exception e) {
		}

		return getAllTopicResp;
	}
}
