package com.example.ControlStock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="precio")
    private double precio;
    @Column(name="cantidad")
    private long cantidad;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Category categoria;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "foto_id", referencedColumnName = "id")
    private Photo fotoProdcuto;


}
