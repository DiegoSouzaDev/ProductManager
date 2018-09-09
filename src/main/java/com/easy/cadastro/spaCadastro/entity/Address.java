package com.easy.cadastro.spaCadastro.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Diego de Souza on 06/08/18.
 */
@Entity
@Getter
@Setter
public class Address {
	@Id
	@GeneratedValue
	private Long id;

	private String street;

	private String number;

	private String neighbourhood;

	@OneToOne
	private City city;

	@OneToOne
	private State state;

	@OneToOne
	private Country country;
}
