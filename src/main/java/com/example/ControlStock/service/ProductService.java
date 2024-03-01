package com.example.ControlStock.service;

import com.example.ControlStock.model.Product;
import com.example.ControlStock.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ProductService{ //Logica de negocio, validaciones

    @Autowired
    private ProductRepository repository;

    public void agregar(Product producto) {
        if (repository.existProduct(producto.getNombre())){
            //ERROR YA EXISTE UN PRODCUTO CON ESE NOMBRE
        }

    }

    public void modificar(Object entidad) {
        //if(repository)

    }


    public void eliminar(Object id) {

    }


    public Product findById(Object id) {
        return null;
    }

    public List<Product> getAll() {
        return null;
    }
}
