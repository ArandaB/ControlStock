package com.example.ControlStock.controller;

import com.example.ControlStock.model.Product;
import com.example.ControlStock.model.User;
import com.example.ControlStock.service.CRUDinterface;
import com.example.ControlStock.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController implements CRUDinterface<User,Long>{

    @Autowired
    UserService userService;

    @PostMapping("api/usuarios")
    public void agregar(@RequestBody User usuario) {
        userService.agregar(usuario);
    }

    @PutMapping("api/usuarios")
    public void modificar(User entidad) {
        userService.modificar(entidad);
    }

    @DeleteMapping("api/usuarios/{id}")
    public void eliminar(@PathVariable Long id) {
        userService.eliminar(id);
    }

    @GetMapping("api/usuarios/{id}")
    public Product get(@PathVariable Long id) {
        return userService.findById(id);
    }

    @GetMapping("api/usuarios")
    public List<Product> getAll() {
        return null;
    }
}
