package com.easy.cadastro.spaCadastro.entity;

import javax.persistence.*;

/**
 * Created by Diego de Souza on 15/08/18.
 */

@Entity
public class ProductType {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    @OneToOne
    private Product product;

}
