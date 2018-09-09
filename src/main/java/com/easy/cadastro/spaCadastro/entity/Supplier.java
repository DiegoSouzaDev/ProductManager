package com.easy.cadastro.spaCadastro.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Diego de Souza on 06/08/18.
 */
@Getter
@Setter
@Entity
public class Supplier {
	@Id
	@GeneratedValue
	private Long id;

	private String cnpj;

	private String razaoSocial;

	private String inscricaoEstadual;

	@OneToOne(fetch = FetchType.EAGER)
	private Address address;

	private String fone;

	private String email;

	@OneToMany(fetch = FetchType.LAZY)
	private List<Product> productList;
}
