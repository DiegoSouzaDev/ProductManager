package com.easy.cadastro.spaCadastro.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToOne;

/**
 * Created by Diego de Souza on 06/08/18.
 */
@Getter
@Setter
@Entity
public class Supplier {
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String cnpj;

    @Column
    private String razaoSocial;

    @Column
    private String inscricaoEstadual;

    @Column
    private Endereco endereco;

    @Column
    private String fone;

    @Column
    @OneToOne
    private String email;
}
