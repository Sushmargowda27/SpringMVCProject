package com.jspiders.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hash")
public class HashController 
{
	@RequestMapping("/map")
	public ModelAndView user()
	{
		ModelAndView model=new ModelAndView();
		model.setViewName("map");
		return model;
	}
	
	@RequestMapping("/submit1")
//	public ModelAndView user1(@RequestParam("name1") String data1, @RequestParam("name2") String data2)
	public ModelAndView user1(@RequestParam Map<String, String> data)
	{
		HashMap<String,String> h1=new HashMap<String,String>();
		h1.put("abdul","kalam");
		h1.put("sushma","gowda");
		h1.put("anu", "pama");
		h1.put("kavya","mathad");
		h1.put("bindu","gujanlli");
		ModelAndView model=new ModelAndView();
		String name1=data.get("name1");
		String name2=data.get("name2");
		for(Map.Entry<String,String> set: h1.entrySet())
		{
			if(!h1.containsKey(name1))
			{
				model.addObject("frst","invalid username");
			}
			else if(!h1.containsValue(name2))
			{
				model.addObject("scnd","invalid password");
			}
			else
			{
				model.addObject("msg",name1);
				model.addObject("msg1",name2);
			}
		}
		
//		HashMap<String,String> h2=new HashMap<String,String>();
//		ModelAndView model=new ModelAndView();
//		h2.put(data1,data2);
//		for(Map.Entry<String,String> m:h2.entrySet())
//		{
//			String s1=m.getKey();
//			String s2=m.getValue();
//			for(Map.Entry<String,String> n:h2.entrySet())
//			{
//				if(s1==n.getKey())
//				{
//					model.addObject("frst",data1);
//				}
//				else if(s2==n.getValue())
//				{
//					model.addObject("scnd",data2);
//				}
//				else
//				{
//					model.addObject("msg","firstname and lastname is correct");
//				}
//			}
//		}
		model.setViewName("home1");
		return model;	
	}
}