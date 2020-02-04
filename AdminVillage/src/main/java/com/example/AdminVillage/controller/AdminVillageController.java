package com.example.AdminVillage.controller;

import java.util.Date;

import org.apache.logging.log4j.CloseableThreadContext.Instance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.EurekaClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;




@RestController
public class AdminVillageController{
	
	
	@Autowired
	RestTemplate resttemplate;
	
	@Autowired
	EurekaClient eurkaclient;

	
	@HystrixCommand(fallbackMethod ="Village")
	@PostMapping(path="/update")
	public String Store(ClientVillageEntity villageentity)
	{
		String url="http://localhost:8080/Store/Update" ;
	    RestTemplate template=new RestTemplate();
	    ResponseEntity<String>entity=template.postForEntity(url, villageentity, String.class);
		return "The details: "+entity;
		
	}
	@SuppressWarnings("unused")
	private String Village(ClientVillageEntity villageentity)
	{
		return "Service is not working!!!, The service will be back shortly "+new Date();
	}
	
	
	

}
