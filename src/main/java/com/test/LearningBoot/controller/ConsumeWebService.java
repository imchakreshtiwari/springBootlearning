package com.test.LearningBoot.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class ConsumeWebService {
@RequestMapping("/")
public String sayhello()
{
	return "helooo world"
;
	}
	
//	@Autowired
//     RestTemplate restTemplate;
//	
//	
//	@RequestMapping(value="/template/products")
//	public String getProductList()
//	{
//		HttpHeaders header=new HttpHeaders();
//		header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		HttpEntity<String> entity=new HttpEntity<String>(header);
//		return restTemplate.exchange("http://127.0.0.1:8080/products", HttpMethod.GET,entity,String.class).getBody();
//	}
	
	
}
