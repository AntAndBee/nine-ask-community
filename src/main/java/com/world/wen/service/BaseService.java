package com.world.wen.service;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world.wen.filter.AppFilterChain;
import com.world.wen.service.handler.AppHandler;
import com.world.wen.session.Session;
import com.world.wen.utils.Constants;
import com.world.wen.vo.RequestBody;
import com.world.wen.vo.ResponseBody;

@Service
public class BaseService {
	@Autowired
	private Map<String, AppHandler> appHandlers;

	@Autowired
	private AppFilterChain appFilterChain;
	
	/**
	 * 
	 * @param httpServletRequest
	 * @param method
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public ResponseBody handle(HttpServletRequest httpServletRequest, String method) throws IOException, InterruptedException {
		RequestBody requestBody = new RequestBody();
		requestBody.setMethod(method);

		appFilterChain.doFilter(requestBody, httpServletRequest);
		requestBody = (RequestBody) Session.get("requestBody");
		Session.clear();

		ResponseBody responseBody = executeTask(httpServletRequest, requestBody);
		return responseBody;
	}
	
	/**
	 * 
	 * @param httpServletRequest
	 * @param requestBody
	 * @return
	 */
	private ResponseBody executeTask(HttpServletRequest httpServletRequest, RequestBody requestBody) {
		ResponseBody responseBody = null;
		responseBody = appHandlers.get(Constants.APP_HANDLER.get(requestBody.getMethod())).handle(httpServletRequest, requestBody);
		return responseBody;
	}

}
