package com.ty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public ModelAndView  home()
	{
		ModelAndView view=new ModelAndView();
		view.addObject("s","Hello How are you");
		view.addObject("h","Hemanth, Uday , Venkatesh");
		view.setViewName("home.jsp");
		return view;
	}
	
}
