package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}
	
	//以参数的形式访问
	//http://localhost:9062/syygl/hello?method=hello
	@RequestMapping(params = "method=hello")
	public String hello() {
		return "ni hao";
	}

}
