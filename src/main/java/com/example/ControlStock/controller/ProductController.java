package com.example.ControlStock.controller;

import com.example.ControlStock.model.Product;
import com.example.ControlStock.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/api/producto")
    public void agregar(@RequestBody Product propiedad) {
        productService.agregar(propiedad);
    }

    @PutMapping("/api/producto/{id}")
    public void modificar(@RequestBody Product propiedad, @PathVariable("id") Long id) {
        productService.modificar(propiedad);
    }

    @DeleteMapping("/api/producto/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        productService.eliminar(id);
    }

    @GetMapping("/api/producto/{id}")
    public Product get(@PathVariable("id") Long id) {
        return productService.get(id);
    }

    @GetMapping("/api/producto")
    public List<Product> getAll() {
        return productService.getAll();
    }
}
