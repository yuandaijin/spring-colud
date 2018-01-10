package com.huatuo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTypeControlle {
	
	   @Autowired
	   private  RestTemplate restTemplate;
	   final String serviceName="service-B";
	   
	    @RequestMapping(value = "/rest/{userId}", method = RequestMethod.GET)
	    public String add() {
	    	//rest调用service-b服务(进程间的调用)
	        return restTemplate.getForEntity("http://"+serviceName+"/getUser/userId=1230", String.class).getBody();
	    }

}
