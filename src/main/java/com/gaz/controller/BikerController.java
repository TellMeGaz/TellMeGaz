package com.gaz.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gaz.form.BikerForm;
import com.gaz.model.Biker;
import com.gaz.service.BikerService;

@Controller
public class BikerController {

	@Autowired
	private BikerService BikerService;

	/**
	 * Méthode permettant d'être redirigé vers le formulaire d'inscription de
	 * biker
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/biker/add")
	public ModelAndView addBikerPage() {
		ModelAndView modelAndView = new ModelAndView("add");
		modelAndView.addObject("biker", new Biker());
		return modelAndView;
	}

	/**
	 * Méthode permettant la gestion du formulaire d'inscription et la
	 * redirection vers l'interface utilisateur
	 * 
	 * @param biker
	 * @return ModelAndView
	 */
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

	/**
	 * Méthode permettant d'être redirigé vers la page affichant les données
	 * utilisateur
	 * 
	 * @return String
	 */
	@RequestMapping(value = "/biker/account")
	public String listOfBikers() {
		return "list";
	}

	@RequestMapping(value = "/biker/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteBiker(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("home");
		BikerService.deleteBiker(id);
		String message = "Biker was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}

	/**
	 * Méthode permettant la redirection vers le formulaire de login
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/biker/login")
	public ModelAndView loginPage() {
		ModelAndView modelAndView = new ModelAndView("login");
		modelAndView.addObject("biker", new BikerForm());
		return modelAndView;
	}

	/**
	 * Méthode permettant la deconnexion et la redirection vers la page
	 * d'accueil
	 * 
	 * @param session
	 * @return String
	 */
	@RequestMapping(value = "/biker/logout")
	public String logoutPage(HttpSession session) {
		session.invalidate();
		return "index";
	}

	/**
	 * Méthode permettant la gestion du formulaire de login
	 * 
	 * @param biker
	 * @param session
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/biker/login/process")
	public ModelAndView loginBiker(@Valid @ModelAttribute("biker") BikerForm biker,
			BindingResult result, HttpSession session) {
		String message = null;
		ModelAndView modelAndView = null;
		if (result.hasErrors()) {
			System.out.println("ko");
			return new ModelAndView("login");
		}
		System.out.println("ok");
		
		Biker theBiker = BikerService.getBiker(biker.getEmail(),
				biker.getPassword());
		if (theBiker != null) {
			session.setAttribute("biker", theBiker);
			modelAndView = new ModelAndView("home");
			message = "Vous êtes maintenant connecté";
			modelAndView.addObject("message", message);
			return modelAndView;

		} else {
			modelAndView = new ModelAndView("login");
			message = "Email/Mot de passe incorrecte";
			modelAndView.addObject("message", message);
			return modelAndView;
		}

	}

}