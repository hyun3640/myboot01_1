package com.myboot01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
public class DemoController {
	
	@ResponseBody
	@RequestMapping("/")
	public String home(){
		System.out.println("Have a nice day");
		return "hi";
	}
}
