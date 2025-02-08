package com.example.demo.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/")
	public Map<String, Object> getValues(){
		Map<String, Object> data = new HashMap<>();
		data.put("message", "Java api working");
		data.put("languages", Arrays.asList("java", "python", "c"));
		data.put("code", 2546);
		return data;
	}
}
