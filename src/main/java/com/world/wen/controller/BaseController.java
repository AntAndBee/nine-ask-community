package com.world.wen.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.world.wen.service.BaseService;
import com.world.wen.vo.ResponseBody;

@RestController
@RequestMapping(value = "/rest")
public class BaseController {

	@Autowired
	private BaseService baseService;
	
	@RequestMapping(method = { RequestMethod.GET, RequestMethod.POST })
	public ResponseBody handle(HttpServletRequest httpServletRequest, String method) throws IOException, InterruptedException {
		return baseService.handle(httpServletRequest, method);
	}
}
