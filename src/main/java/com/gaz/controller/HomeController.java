package com.gaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC TellMeGazz Project =D");
		return "index";

	}

	@RequestMapping(value = "/home")
	public String indexPage() {
		return "home";
	}

}
