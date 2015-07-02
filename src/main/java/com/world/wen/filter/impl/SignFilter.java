package com.world.wen.filter.impl;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.world.wen.filter.AppFilter;
import com.world.wen.filter.AppFilterChain;
import com.world.wen.utils.BusinessException;
import com.world.wen.utils.CommonUtil;
import com.world.wen.utils.Constants;
import com.world.wen.utils.MapUtil;
import com.world.wen.utils.PropertiesReader;
import com.world.wen.vo.RequestBody;


@Service
public class SignFilter implements AppFilter {

	@Override
	public void doFilter(RequestBody requestBody, HttpServletRequest httpServletRequest, AppFilterChain appFilterChain) {

		try {
			Map<String, Object> paramters = MapUtil.changeGetParameterMap(httpServletRequest);
			String sign = CommonUtil.getSequenceString(paramters);
			if (!requestBody.getSign().equals(sign)) {
				String key = Constants.CODE_114;
				throw new BusinessException(key, PropertiesReader.readAsString(key));
			}
		} catch (Exception e) {
		}
		appFilterChain.doFilter(requestBody, httpServletRequest);
	}
}
