package com.telusko.springMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameController {
	
	@Autowired
	ServiceSaveName service;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView h = new ModelAndView();
		h.setViewName("home.jsp");
		return h;
	}
	
	@RequestMapping("/addName")
	public ModelAndView addName(SaveName savename) {
		ModelAndView m = new ModelAndView();
		String s = savename.getName();
		
		if(s.matches("(^[a-zA-Z][a-zA-Z ]*$)")) {
			service.newadd(savename);
			m.addObject("msg",savename.getName()+" has added to database.");
			m.setViewName("home.jsp");
		}
		else {
			m.addObject("msg","Enter valid name!!!");
			m.setViewName("home.jsp");
		}
		return m;
	}
}

