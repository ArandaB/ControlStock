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
public class ProductRepository implements CRUDinterface<Product,Long> {  //Consultad a la BDD
    @PersistenceContext
    EntityManager conexion;

    @Override
    public void agregar(Product product) {

    }

    @Override
    public void modificar(Product product) {

    }

    @Override
    public void eliminar(Long id) {

    }

    @Override
    public Product get(Long id) {
        /*List<Product> resultados = conexion.createNativeQuery("FROM Product p WHERE p.id = " + id)
                .getResultList();
        return resultados.get(0);*/
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
