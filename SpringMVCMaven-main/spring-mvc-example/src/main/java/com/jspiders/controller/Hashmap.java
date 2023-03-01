package com.jspiders.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hi")
public class Hashmap 
{
	@RequestMapping("/map")
	public ModelAndView user()
	{
		ModelAndView model=new ModelAndView();
		model.setViewName("hashmap");
		return model;
	}
	
	HashMap<String,Customer> h1=new HashMap<String,Customer>();
	@RequestMapping("submit2")
	public ModelAndView user1(@RequestParam Map<String,String> data)
	{
		Customer c1=new Customer("1","sushma","12345","sushmargowda@gmail.com");
		Customer c2=new Customer("4","cherry","1234","ch@gmail.com");
		Customer c3=new Customer("6","abd","1245","abd@gmail.com");
		Customer c4=new Customer("8","msd","1345","msd@gmail.com");
		
		
		h1.put(c1.userid,c1);
		h1.put(c2.userid,c2);
		h1.put(c3.userid,c3);
		h1.put(c4.userid,c4);
		
//		c1.userid=data.get("userid");	
//		c1.password=data.get("password");
//		c1.email=data.get("email");
		ModelAndView model=new ModelAndView();
		String userid=data.get("userid");
		String name=data.get("name");
		String password=data.get("password");
		String email=data.get("email");
		
		if(h1.containsKey(userid))
		{
			model.addObject("msg","present");
			Customer cust=h1.get(userid);
			if(name.equals(cust.getName()))
			{
				model.addObject("msg2","username is present");
			}
			else
			{
				model.addObject("msg3","username is not present");
			}
			if(password.equals(cust.getPassword()))
			{
				model.addObject("msg4","password is present");
			}
			else
			{
				model.addObject("msg5","password is not present");
			}
			if(email.equals(cust.getEmail()))
			{
				model.addObject("msg6","email is present");
			}
			else
			{
				model.addObject("msg7",cust.getEmail() +"email is different");
			}
		}
		else
		{
			model.addObject("msg1","notpresent");
		}
		model.setViewName("usernotfound");
		return model;
	}
} 
