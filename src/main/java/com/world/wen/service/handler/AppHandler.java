package com.world.wen.service.handler;

import javax.servlet.http.HttpServletRequest;

import com.world.wen.vo.RequestBody;
import com.world.wen.vo.ResponseBody;

/**
 * 
 * @author jswu
 *
 */
public interface AppHandler {

	/* 处理接口请求 */
	ResponseBody handle(HttpServletRequest httpServletRequest, RequestBody requestBody);
}
