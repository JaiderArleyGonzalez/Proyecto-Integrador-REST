package edu.ieti.integrador.model;


import java.util.ArrayList;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    @Nonnull
    private String nombre;
    @NonNull
    private String email;
    private String password;

    public Usuario(){
    }

    public Usuario(String userName, String nombre, String email, String password){
        this.userName=userName;
        this.nombre=nombre;
        this.email=email;
        this.password=password;
    }
}
