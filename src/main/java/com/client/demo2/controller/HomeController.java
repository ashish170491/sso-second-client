package com.client.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@GetMapping(value = "/healthcheck")
	@ResponseBody
	public String processPostRequest() {
		return "success";
	}

}
