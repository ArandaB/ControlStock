package model;

import jakarta.persistence.*;

import lombok.*;
import org.springframework.stereotype.Repository;


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


}

