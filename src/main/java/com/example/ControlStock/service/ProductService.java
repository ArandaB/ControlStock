package com.example.ControlStock.service;

import com.example.ControlStock.model.Product;
import com.example.ControlStock.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ProductService implements CRUDinterface{ //Logica de negocio, validaciones

    @Autowired
    private ProductRepository repository;
    @Override
    public void agregar(Object entidad) {

    }

    @Override
    public void modificar(Object entidad) {

    }

    @Override
    public void eliminar(Object id) {

    }

    @Override
    public Product get(Object id) {
        return null;
    }

    public List<Product> getAll() {
        return null;
    }
}
