package com.springboot.hostelmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class logincontroller {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcomepage(ModelMap model) {
		model.put("name", "in28minutes");
		return "welcome";
	}	
}
