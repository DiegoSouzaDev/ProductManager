package com.easy.cadastro.spaCadastro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

/**
 * Created by Diego de Souza on 15/08/18.
 */

@Entity
public class ProductType {

    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String description;


}
