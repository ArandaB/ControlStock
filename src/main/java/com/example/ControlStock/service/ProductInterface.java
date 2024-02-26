package com.example.ControlStock.service;

import com.example.ControlStock.model.Product;

import java.util.List;

public interface ProductInterface {
    void agregar(Product p);
    void modificar(Product p);
    void eliminar(Long id);
    Product get(Long id);
    List<Product> getAll();
}
