package com.gaz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gaz.model.Biker;
import com.gaz.service.BikerService;

@Controller
public class BikerController {

	@Autowired
	private BikerService BikerService;

	@RequestMapping(value="/biker/add")
	public ModelAndView addBikerPage() {
		ModelAndView modelAndView = new ModelAndView("add");
		modelAndView.addObject("biker", new Biker());
		return modelAndView;
	}

	@RequestMapping(value = "/biker/add/process")
	public ModelAndView addingBiker(@ModelAttribute Biker biker) {
		ModelAndView modelAndView = null;
		Biker myBiker = BikerService.getBiker(biker.getEmail());

		if (myBiker == null) {
			modelAndView = new ModelAndView("home");
			BikerService.addBiker(biker);
			String message = "Vous faites maintenant parti de la communauté, Bravo !";
			modelAndView.addObject("message", message);
		} else {
			String message = "Adresse email déjà utlisée";
			modelAndView = new ModelAndView("add");
			modelAndView.addObject("message", message);

		}

		return modelAndView;
	}

	@RequestMapping(value="/biker/account")
	public ModelAndView listOfBikers() {
		ModelAndView modelAndView = new ModelAndView("list");

		List<Biker> Bikers = BikerService.getBikers();
		modelAndView.addObject("Bikers", Bikers);

		return modelAndView;
	}


	@RequestMapping(value="/biker/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deleteBiker(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("home");
		BikerService.deleteBiker(id);
		String message = "Biker was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
	
	@RequestMapping(value="/biker/login")
	public ModelAndView loginPage() {
		ModelAndView modelAndView = new ModelAndView("login");
		modelAndView.addObject("biker", new Biker());
		return modelAndView;
	}
	
	
	@RequestMapping(value="/biker/logout")
	public String logoutPage() {
		
		return "index";
	}
	
	
	@RequestMapping(value="/biker/login/process")
	public ModelAndView loginBiker(@ModelAttribute Biker biker) {
		String message = null;
		ModelAndView modelAndView=null;
		if (!biker.getEmail().equals("") && !biker.getPassword().equals("")) {
			Biker theBiker = BikerService.getBiker(biker.getEmail(), biker.getPassword());
			if (theBiker!= null) {
				 modelAndView = new ModelAndView("home");
				 message = "Vous êtes maintenant connecté";
				
			} else {
				 modelAndView = new ModelAndView("login");
				 message ="Email/Mot de passe incorrecte";
			}
			
		}
		
		modelAndView.addObject("message", message);

		return modelAndView;
	}
	

	

}