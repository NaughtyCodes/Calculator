package com.naughtycodes.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	public AppController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/")
	public String home(){
		return "Welcome to Calculator App";
	}

	@RequestMapping("/calc/sum/{param1}/{param2}")
	public int sum(@PathVariable int param1, @PathVariable int param2){
		return param1+param2;
	}
	
}
