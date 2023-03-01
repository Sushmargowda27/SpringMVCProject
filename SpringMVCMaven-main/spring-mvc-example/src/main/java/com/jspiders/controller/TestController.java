package com.jspiders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jspiders.model.TestService;

@Controller
@RequestMapping("/hellert")
public class TestController 
{
	@Autowired
	private TestService testSurya;
	@RequestMapping(value="/testprogram")
	public ModelAndView user()
	{
		ModelAndView model=new ModelAndView();
		testSurya.iAmMethod();
		model.setViewName("test");
		return model;
	}
	
	@RequestMapping(value="/submit12345")
	public ModelAndView user1(@RequestParam("username") String data, @RequestParam("emailid") String data1)
	{
		ModelAndView model=new ModelAndView();
		model.setViewName("run");
		model.addObject("msg",data);
		model.addObject("msg1",data1);
		return model;
	}
}
