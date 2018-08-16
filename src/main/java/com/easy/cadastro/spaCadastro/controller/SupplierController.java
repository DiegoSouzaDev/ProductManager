package com.easy.cadastro.spaCadastro.controller;

import com.easy.cadastro.spaCadastro.entity.Supplier;
import com.easy.cadastro.spaCadastro.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Diego de Souza on 15/08/18.
 */

@RestController
@RequestMapping(path = "/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Long createSupplier(@RequestBody Supplier supplier) {
        return supplierService.createSupplier(supplier);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType
            .APPLICATION_JSON_UTF8_VALUE)
    public Supplier updateSupplier(@RequestBody Supplier supplier) {
        return supplierService.updateSupplier(supplier);
    }

    @RequestMapping(value = "/find/{supplierId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Supplier findSupplier(@PathVariable("supplierId") Long id) {
        return supplierService.findById(id);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Iterable<Supplier> findAll() {
        return supplierService.findAll();
    }


}
