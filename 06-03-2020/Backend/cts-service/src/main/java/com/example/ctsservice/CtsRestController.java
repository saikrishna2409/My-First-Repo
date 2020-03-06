package com.example.ctsservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class CtsRestController {
	@GetMapping("/hi")
	public String sayHello() {
		return "GoodAfternoon";
	}
	@GetMapping("/languages")
	public List<String> languages()
	{
		return new ArrayList<String>(Arrays.asList("Telugu","Hindi"));
	}
}
