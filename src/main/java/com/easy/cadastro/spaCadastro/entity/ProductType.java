package com.easy.cadastro.spaCadastro.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Diego de Souza on 15/08/18.
 */

@Getter
@Setter
@Entity
public class ProductType {
	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String description;

	@OneToMany
	private List<Product> product;

}
