package com.world.wen.filter.impl;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.world.wen.filter.AppFilter;
import com.world.wen.filter.AppFilterChain;
import com.world.wen.utils.BusinessException;
import com.world.wen.utils.Constants;
import com.world.wen.utils.PropertiesReader;
import com.world.wen.vo.RequestBody;

@Service
public class SessionFilter implements AppFilter {

	private static List<String> excludeUrl = Arrays.asList(Constants.ALL_TOPIC);

	@Override
	public void doFilter(RequestBody requestBody, HttpServletRequest httpServletRequest, AppFilterChain appFilterChain) {

		try {
			if (!excludeUrl.contains(requestBody.getMethod())) {
				if (null == httpServletRequest.getSession().getAttribute(Constants.SESSION_USER_ID)) {
					String key = Constants.CODE_113;
					throw new BusinessException(key, PropertiesReader.readAsString(key));
				}
			}
		} catch (Exception e) {
		}
		appFilterChain.doFilter(requestBody, httpServletRequest);
	}
}
