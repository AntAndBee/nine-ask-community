package com.world.wen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.world.wen.dao.AwsActiveDataDAO;

@RestController
@RequestMapping(value = "/awsActiveData")
public class AwsActiveDataController {
	@Autowired
	private AwsActiveDataDAO awsActiveDataDAO;
	@RequestMapping(value ="findAll")
	public List findAll() {
		List awsActiveDatas =  awsActiveDataDAO.findAll();
		
		return awsActiveDatas;
	}
}
