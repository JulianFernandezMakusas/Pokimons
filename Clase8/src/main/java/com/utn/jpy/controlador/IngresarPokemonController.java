package com.utn.jpy.controlador;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.utn.jpy.beans.Pokemon;
import com.utn.jpy.dao.PokemonDAOImpl;

@Controller
@RequestMapping(value = "ADMIN")
public class IngresarPokemonController {
	@Autowired
	PokemonDAOImpl pokemonDAO;
	
	@RequestMapping(value="formularioPokemon")
	public ModelAndView formularioPokemon (){
		ModelAndView mv = new ModelAndView();
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String nombre = auth.getName();
		mv.addObject("nombre",nombre);
		
		mv.setViewName("/ADMIN/formularioPokemon");
		return mv;
	}
	
	@RequestMapping(value="ingresoPokemon", method= RequestMethod.POST)
	public ModelAndView ingresoPokemon (@RequestParam Map<String, String> parametros){
		
		
		String nombre = parametros.get("nombre");
		int energia = Integer.parseInt(parametros.get("energia"));
		String tipo = parametros.get("tipo");
		int ataque = Integer.parseInt(parametros.get("ataque"));
		int defensa = Integer.parseInt(parametros.get("defensa"));
		
		Pokemon pokemon = new Pokemon(0,nombre,energia,tipo,ataque,defensa);

		pokemonDAO.ingresarPokemon(pokemon);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("inicio");
		return mv;
	}
}
