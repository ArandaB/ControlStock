package com.example.ControlStock.repository;

import com.example.ControlStock.model.Product;
import com.example.ControlStock.model.User;
import com.example.ControlStock.service.CRUDinterface;
import com.example.ControlStock.service.UserService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;
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
        String query = "INSERT INTO `user`(`id`,`apellido`, `correo`, `nombre`, `password`, `telefono`, `user_name`, `id_store`) VALUES (?, ?, ?, ?, ?, ?, ?,?)";

        Query nativeQuery = conexion.createNativeQuery(query)
                .setParameter(1, user.getId())
                .setParameter(2, user.getApellido())
                .setParameter(3, user.getCorreo())
                .setParameter(4, user.getNombre())
                .setParameter(5, user.getPassword())
                .setParameter(6, user.getTelefono())
                .setParameter(7, user.getUserName())
                .setParameter(8, user.getStore());

        nativeQuery.executeUpdate();
    }

    @Override
    public void modificar(User user) {
        //String query="UPDATE `user` SET `id`='2',`apellido`='Aranda',`correo`='benja@gmaiñ.com',`nombre`='Benja',`password`='12',`telefono`='12',`user_name`='Benja11',`id_store`=null WHERE `id`=1";
    }

    @Override
    public void eliminar(Long id) {
        String query = "DELETE FROM `user` WHERE id=?" ;

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
