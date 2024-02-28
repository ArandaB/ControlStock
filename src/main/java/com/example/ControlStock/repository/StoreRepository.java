package com.example.ControlStock.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class StoreRepository {
    @PersistenceContext
    EntityManager conexion;
}
