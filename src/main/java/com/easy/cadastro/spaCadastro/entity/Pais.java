package com.easy.cadastro.spaCadastro.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Diego de Souza on 06/08/18.
 */

@Getter
@Setter
@Entity
public class Pais {

    @GeneratedValue
    @Column
    private Long Id;

    @Column
    private String nome;

    @Column
    private String abrev;


    @Column
    @OneToMany
    private List<Estado> estadoList;


}
