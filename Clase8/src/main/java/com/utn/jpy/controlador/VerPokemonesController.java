package com.utn.jpy.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.utn.jpy.beans.Pokemon;
import com.utn.jpy.dao.PokemonDAOImpl;
@Controller
public class VerPokemonesController {

	@Autowired
	PokemonDAOImpl pokemonDAO;
	
	@RequestMapping("verPokemones")
	public ModelAndView verPokemones () {
		ModelAndView mv = new ModelAndView();
		List<Pokemon> listaPokemones = pokemonDAO.verPokemones();
		mv.addObject("listaPokemones",listaPokemones);
		mv.setViewName("verPokemones");
		return mv;
	}
	
}
