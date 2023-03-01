package com.jspiders.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home12")
public class HellloController1 
{
	@RequestMapping(value = "/home2")
	public ModelAndView user() {
		System.out.println("User Page Requested");
		ModelAndView model= new ModelAndView();
		model.setViewName("home");
		model.addObject("msg","Login Page");
		return model;
	}
	@RequestMapping("submit")
	public ModelAndView user1(@RequestParam Map<String,String> data)
	{
		ModelAndView model=new ModelAndView();
		String username=data.get("username");
		String password=data.get("password");
		String email=data.get("email");
		if(!username.equals("ben_stokes"))
		{
			model.addObject("msg","username is wrong");
		}
		else if(!password.equals("England"))
		{
			model.addObject("msg","password is wrong");
		}
		else if(!(email.contains(".") && (email.contains("@"))))
		{
			model.addObject("msg","email is wrong");
		}
		else
		{
			model.addObject("user1",username);
			model.addObject("pass1",password);
			model.addObject("ema1",email);
		}
		model.setViewName("user");
		return model;
	}
}
