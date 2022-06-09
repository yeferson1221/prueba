package com.crud.democrud.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="role")
public class UsuarioRol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;


    public UsuarioRol(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public UsuarioRol(){

    }

    public UsuarioRol(String name) {
        this.name = name;
    }
}
