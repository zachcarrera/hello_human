package com.zachcarrera.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {

	@RequestMapping("/")
	public String index(
			@RequestParam(value = "name", required = false, defaultValue="Human") String name,
			@RequestParam(value = "last_name", required = false, defaultValue="") String lastName,
			@RequestParam(value = "times", required = false, defaultValue="1") Integer times) {
		String greeting = "";
		
		// set times default value to 1
//		if (times == null) {
//			times = 1;
//		}
//		if (name == null) {
//			greeting = "Hello Human";
//		}
		
		
		for(int i = 0; i < times; i++) {
			greeting += "Hello " + name + " " + lastName + " ";
		}
		
		
		return greeting;
	}

}
