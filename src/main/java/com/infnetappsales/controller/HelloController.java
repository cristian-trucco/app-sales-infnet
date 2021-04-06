package com.infnetappsales.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/ola")
@ResponseBody
public class HelloController {
	 
	public String hello() {
		return "Hello Worl";
		}

}