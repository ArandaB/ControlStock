package com.example.ControlStock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="store")
public class Store {
    @Id
    private long id;
    private String name;
    private String direccion;
    private User duenio;
    private ArrayList<User> clientes;

}
