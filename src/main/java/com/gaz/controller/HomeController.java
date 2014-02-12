package com.gaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	/**
	 * Méthode renvoyant la vue  d'accueil lors de l'accès à l'application
	 * @param model
	 * @return La vue
	 */
	@RequestMapping(value = "/")
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Spring 3 MVC TellMeGazz Project =D");
		return "index";

	}
	
	/**
	 * Méthide renvoyant la vue home lors de la connexion de l'utilisateur
	 * @return La vue
	 */
	@RequestMapping(value = "/home")
	public String indexPage() {
		return "home";
	}

}
