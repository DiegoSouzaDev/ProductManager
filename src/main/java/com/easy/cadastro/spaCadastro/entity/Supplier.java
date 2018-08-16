package com.easy.cadastro.spaCadastro.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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

    @OneToOne(mappedBy = "supplier")
    private Address address;

    private String fone;

    private String email;

    @OneToMany(mappedBy = "supplier")
    private List<Product> productList;
}
