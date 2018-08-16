package com.easy.cadastro.spaCadastro.service;

import com.easy.cadastro.spaCadastro.entity.Product;
import com.easy.cadastro.spaCadastro.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by Diego de Souza on 15/08/18.
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Long createProduct(final Product product){
        return repository.save(product).getId();
    }


    public Product updateProduct(final Product product) {
        return repository.save(product);
    }

    public Product findById(final Long id) {
        Optional<Product> productOptional = repository.findById(id);
        return productOptional.orElse(null);
    }

    public Iterable<Product> findAll() {
        Iterable<Product> allProduList = repository.findAll();

        return allProduList ;
    }
}
