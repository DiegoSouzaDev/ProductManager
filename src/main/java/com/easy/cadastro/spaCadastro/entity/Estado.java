package com.easy.cadastro.spaCadastro.entity;

import antlr.ParserSharedInputState;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Diego de Souza on 06/08/18.
 */


@Entity
public class Estado {

    @GeneratedValue
    @Column
    private Long Id;

    @Column
    private String nome;

    @Column
    private String abrev;

    @OneToMany
    private List<Cidade> cidade;

    @Column
    @ManyToOne
    private Pais pais;
}
