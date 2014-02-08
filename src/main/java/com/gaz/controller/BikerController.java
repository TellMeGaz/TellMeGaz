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

	@RequestMapping(value="/biker/add/process")
	public ModelAndView addingBiker(@ModelAttribute Biker biker) {

		ModelAndView modelAndView = new ModelAndView("home");
		BikerService.addBiker(biker);

		String message = "Biker was successfully added.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}

	@RequestMapping(value="/biker/list")
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
	
	

	

}