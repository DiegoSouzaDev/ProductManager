package com.easy.cadastro.spaCadastro.service;

import com.easy.cadastro.spaCadastro.entity.Supplier;
import com.easy.cadastro.spaCadastro.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by Diego de Souza on 15/08/18.
 */

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository repository;

    public Supplier findById(final Long id) {
        Optional<Supplier> supplierOptional = repository.findById(id);
        return supplierOptional.orElse(null);
    }

    public Long createSupplier(final Supplier supplier){
        return repository.save(supplier).getId();
    }

    public Supplier updateSupplier(final Supplier supplier) {
        return repository.save(supplier);
    }

    public Iterable<Supplier> findAll() {
        return repository.findAll();
    }
}
