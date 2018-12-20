package com.utn.jpy.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mysql.cj.api.mysqla.result.Resultset;
import com.utn.jpy.beans.Pokemon;

@Repository
public class PokemonDAOImpl implements PokemonDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Pokemon buscarPokemon(String nombre) {
		String sql = "SELECT * FROM basededatospokemon WHERE nombre = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { nombre }, new PokemonMapper());
	}

	@Override
	public void ingresarPokemon(Pokemon pokemon) {
		String sql = "INSERT INTO basededatospokemon () VALUES (?,?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] { 0,
				pokemon.getNombre(),
				pokemon.getEnergia(),
				pokemon.getTipo(),
				pokemon.getAtaque(), 
				pokemon.getDefensa() });
	}

	@Override
	public Pokemon comprarPokemon() {

		return null;
	}

	@Override
	public List<Pokemon> verPokemones() {
		String sql = "SELECT * FROM basededatospokemon";	
		return jdbcTemplate.query(sql, new PokemonMapper());
	}

	
	private static final class PokemonMapper implements RowMapper<Pokemon> {

		@Override
		public Pokemon mapRow(ResultSet rs, int rowNum) throws SQLException {
			Pokemon pokemon = new Pokemon();

			pokemon.setIdPokemon(rs.getInt("idPokemon"));
			pokemon.setNombre(rs.getString("nombre"));
			pokemon.setEnergia(rs.getInt("energia"));
			pokemon.setTipo(rs.getString("tipo"));
			pokemon.setAtaque(rs.getInt("ataque"));
			pokemon.setDefensa(rs.getInt("defensa"));

			return pokemon;
		}

	}





}
