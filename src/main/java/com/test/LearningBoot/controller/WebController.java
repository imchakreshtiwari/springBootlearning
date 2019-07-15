package com.test.LearningBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@GetMapping("/index")
	public String indexreturn()
	{
		return "index";
	}
}
