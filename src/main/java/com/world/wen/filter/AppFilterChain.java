package com.world.wen.filter;

import javax.servlet.http.HttpServletRequest;

import com.world.wen.vo.RequestBody;

public interface AppFilterChain {

	public void doFilter(RequestBody requestBody, HttpServletRequest httpServletRequest);

}
