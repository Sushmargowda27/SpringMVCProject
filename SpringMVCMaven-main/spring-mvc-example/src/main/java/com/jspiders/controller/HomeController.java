package com.jspiders.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/home1")
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	public HomeController()
	{
		System.out.println("I am home controller");
	}
	
//method before present	
	@RequestMapping(value = "/home")
	public ModelAndView user() {
		System.out.println("User Page Requested");
		ModelAndView model= new ModelAndView();
		model.setViewName("home");
		model.addObject("msg","Login Page");
		return model;
	}
	@RequestMapping("submit1")
	public ModelAndView user1(@RequestParam Map<String,String> data, @RequestParam("emailid") String data1)
	{
		int count=0;
		System.out.println("submit method has been called");
		ModelAndView model=new ModelAndView();
		if(data.get("password").equals("camlin"))
		{
//			model.addObject("user", data.get("username"));
//			model.addObject("pass",data.get("password"));
			for(int i=0;i<data1.length()-1;i++)
			{
				if(data1.charAt(i)=='.')
				{
						count++;
				}
				if(data1.charAt(i)=='@')	
				{
					count++;
				}
			}
		}
		if(count==2)
		{
			model.addObject("success","Email and Password is correct");
			model.addObject("user1", data.get("username"));
			model.addObject("pass1",data.get("password"));
			model.addObject("ema1",data1);
		}
		else
		{
			model.addObject("msg","user is not authorized");
		}
		model.setViewName("user");
		return model;
	}
//	@RequestMapping(value = "/firstone")
//	public ModelAndView user1()
//	{
//		System.out.println("loginpage");
//		ModelAndView model=new ModelAndView();
//		model.setViewName("home");
//		return model;
//	}
//	
//	@RequestMapping(value = "/loginpage");
//	public ModelAndView user2()
//	{
//		ModelAndView model=new ModelAndView();
//		model.setViewName("home");
//		return model;
//	}
}
