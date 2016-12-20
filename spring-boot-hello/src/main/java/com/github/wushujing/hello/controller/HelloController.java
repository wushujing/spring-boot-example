package com.github.wushujing.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wushujing on 05/12/2016.
 */
@RestController
public class HelloController {

	@RequestMapping("/")
	public String hello() {
		return "Hello, World";
	}

	@GetMapping(value = "/hello/{msg}")
	public String sayHi(@PathVariable String msg) {
		return "Hello, " + msg;
	}
}
