package org.ciberclass.controller;

import javax.validation.Valid;

import org.ciberclass.model.Reserva;
import org.ciberclass.repository.ICarrerasRepository;
import org.ciberclass.repository.IReservaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller

public class ReservaController {

	@Autowired
	private ICarrerasRepository repoca;
	@Autowired
	private IReservaRepository repore;
	
	@GetMapping("/cargarReserva")
	public String cargarPag(Model model) {
		model.addAttribute("reserva", new Reserva());
		model.addAttribute("lstCarreras",repoca.findAll());
		
		return "reservaSandoval";
	}
	
	
	@PostMapping("/grabarReserva")
	public String grabarReserva(@Valid @ModelAttribute Reserva reserva, Model model, BindingResult result) {
		
		try {
		
		repore.save(reserva);	
		model.addAttribute("lstCarreras",repoca.findAll());
		
		model.addAttribute("mensaje","Reserva registrada exitosamente!");
		
		return "reservaSandoval";
		}catch(Exception e){
			 	
			   model.addAttribute("lstCarreras",repoca.findAll());
			   model.addAttribute("mensaje","Error | Elegir una carrera");
			return "reservaSandoval";
		}
	}

	
}
