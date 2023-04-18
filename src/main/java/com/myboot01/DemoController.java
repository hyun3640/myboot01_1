package com.myboot01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	@ResponseBody
	@RequestMapping("/")
	public String home(){
		System.out.println("Have a nice day");
		return "hi";
	}
	
	@RequestMapping("/hello.do")
	public String hello(Model model) {
		System.out.println("안녕하세요");
		model.addAttribute("message","hello.html입니다.!");
		return "hello";
	}
	
	@RequestMapping("/hi.do")
	public String hi(Model model) {
		System.out.println("안녕하세요");
		model.addAttribute("message","hi.jsp입니다");
		return "hi";
	}
}
	