package com.world.wen.filter.impl;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.world.wen.filter.AppFilter;
import com.world.wen.filter.AppFilterChain;
import com.world.wen.session.Session;
import com.world.wen.utils.BusinessException;
import com.world.wen.utils.Constants;
import com.world.wen.utils.MapUtil;
import com.world.wen.utils.PropertiesReader;
import com.world.wen.vo.RequestBody;

/**
 * 
 * @author wujinsong
 * 
 */
@Service
public class AccessFormatFilter implements AppFilter {

	@Override
	public void doFilter(RequestBody requestBody, HttpServletRequest httpServletRequest, AppFilterChain appFilterChain) {
		RequestBody newBody;
		try {
			Map<String, String[]> paramters = httpServletRequest.getParameterMap();
			// 参数map转化为bean
			newBody = (RequestBody) MapUtil.convertMap(Constants.APP_VO.get(requestBody.getMethod()), paramters);
			Session.put("requestBody", newBody);
		} catch (NullPointerException e) {
			e.printStackTrace();
			throw new BusinessException(Constants.CODE_115, PropertiesReader.readAsString(Constants.CODE_115));
		}
		appFilterChain.doFilter(newBody, httpServletRequest);
	}
}
