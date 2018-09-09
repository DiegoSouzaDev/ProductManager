package com.easy.cadastro.spaCadastro.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Diego de Souza on 06/08/18.
 */

@Getter
@Setter
@Entity
public class State {
	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String abrev;

	@OneToMany(fetch = FetchType.EAGER)
	private List<City> city;

	@ManyToOne
	private Country country;
}
