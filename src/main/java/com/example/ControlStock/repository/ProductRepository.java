package com.example.ControlStock.repository;

import com.example.ControlStock.model.Product;
import com.example.ControlStock.service.CRUDinterface;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class ProductRepository {  //Consultad a la BDD
    @PersistenceContext
    EntityManager conexion;

    public void agregar(Product product) {

    }


    public void modificar(Product product) {

    }


    public void eliminar(Long id) {

    }


    public Product findById(Long id) {
        return conexion.find(Product.class,id);
    }

    public boolean existProduct (String name){
        Product productExistence=conexion.find(Product.class,name);
        return (productExistence==null);
    }


    public List<Product> getAll() {
        return null;
    }
}
