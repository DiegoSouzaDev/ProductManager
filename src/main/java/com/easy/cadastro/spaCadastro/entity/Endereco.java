package com.easy.cadastro.spaCadastro.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

/**
 * Created by Diego de Souza on 06/08/18.
 */
@Entity
@Getter
@Setter
public class Endereco {
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String rua;

    @Column
    private String numero;

    @Column
    private String bairro;

    @Column
    private Cidade cidade;

    @Column
    private Estado estado;

    @Column
    private Pais pais;
}
