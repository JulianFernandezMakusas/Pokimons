package com.utn.jpy.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ComprarPokemonesController {
	
	@RequestMapping("/USER/comprarPokemones")
	public ModelAndView verPokemones() {
		ModelAndView mv = new ModelAndView();
		
		
		
		mv.setViewName("/USER/comprarPokemones");
		return mv;
	}
	
}
