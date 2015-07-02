package com.world.wen.filter;

import javax.servlet.http.HttpServletRequest;

import com.world.wen.vo.RequestBody;


/**
 * @Description:过滤器
 * 
 * @author:SM
 * 
 */
public interface AppFilter {

	void doFilter(RequestBody requestBody, HttpServletRequest httpServletRequest, AppFilterChain appFilterChain);

}
