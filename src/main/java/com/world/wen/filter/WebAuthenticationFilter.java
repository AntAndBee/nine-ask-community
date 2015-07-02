package com.world.wen.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class WebAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
		String picCode = request.getParameter("picCode");

		if (StringUtils.isEmpty(picCode) || !picCode.equalsIgnoreCase((String) request.getSession().getAttribute("capText")))
			throw new AuthenticationServiceException("验证码不匹配");
		return super.attemptAuthentication(request, response);
	}
}
