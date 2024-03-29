package com.example.ControlStock.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="correo")
    private String correo;
    @Column(name="telefono")
    private String telefono;
    @Column(name="userName")
    private String userName;
    @Column(name="password")
    private String password;

    @ManyToOne(fetch = FetchType.EAGER)  //Esto debido a la relacion uno a muchos entre un Store y sus Customers.
    @JoinColumn(name = "id_store", referencedColumnName = "id")
    private Store store;
}

