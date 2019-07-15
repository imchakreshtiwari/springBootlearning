package com.test.LearningBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@RequestMapping("/addproduct")
	public String addproduct()
	{
		return "addproduct";
	}
	@RequestMapping("/viewproduct")
	public String viewproduct()
	{
		return "viewproduct";
	}
}
