package com.example.ControlStock.service;

import com.example.ControlStock.model.Product;
import com.example.ControlStock.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ProductService implements ProductInterface{ //Logica de negocio, validaciones

    @Autowired
    private ProductRepository repository;

    public void eliminar(Long id) {
    }

    public void modificar(Product propiedad) {
    }

    public void agregar(Product propiedad) {
    }

    public Product get(Long id) {
        return null;
    }

    public List<Product> getAll() {
        return null;
    }
}
