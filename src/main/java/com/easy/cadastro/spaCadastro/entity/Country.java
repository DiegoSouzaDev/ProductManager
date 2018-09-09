package com.easy.cadastro.spaCadastro.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Diego de Souza on 06/08/18.
 */

@Getter
@Setter
@Entity
public class Country {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String abrev;
	
	// @OneToMany(mappedBy = "country")
	// private List<State> stateList;
	
}
