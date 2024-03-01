package com.example.ControlStock.repository;

import com.example.ControlStock.model.Product;
import com.example.ControlStock.model.User;
import com.example.ControlStock.service.CRUDinterface;
import com.example.ControlStock.service.UserService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Repository
@Transactional //Pongo transactional ya que trabajo con metodos CRUD
public class UserRepository implements CRUDinterface<User,Long> {

    @PersistenceContext
    EntityManager conexion;

    @Override
    public void agregar(User user) {

    }

    @Override
    public void modificar(User user) {

    }

    @Override
    public void eliminar(Long id) {

    }

    @Override
    public Product get(Long id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
