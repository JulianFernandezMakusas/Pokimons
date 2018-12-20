package com.utn.jpy.beans;


public class Pokemon {
	private int idPokemon;
	
	private String nombre;
	
	private int energia;
	
	private String tipo;
	
	private int ataque;
	
	private int defensa;
	
	public int getIdPokemon() {
		return idPokemon;
	}
	public void setIdPokemon(int idPokemon) {
		this.idPokemon = idPokemon;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	public Pokemon(int idPokemon, String nombre, int energia, String tipo, int ataque, int defensa) {
		super();
		this.idPokemon = idPokemon;
		this.nombre = nombre;
		this.energia = energia;
		this.tipo = tipo;
		this.ataque = ataque;
		this.defensa = defensa;
	}
	public Pokemon() {
		
	}	
	
}
