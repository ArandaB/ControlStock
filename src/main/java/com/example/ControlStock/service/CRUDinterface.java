package com.example.ControlStock.service;

import com.example.ControlStock.model.Product;

import java.util.List;

public interface CRUDinterface<T, Long> {
    void agregar(T entidad);
    void modificar(T entidad);
    void eliminar(Long id);
    Product get(Long id);
    List<Product> getAll();
}
