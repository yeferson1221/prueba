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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "rol_usuario_id", nullable = false)
    @Getter
    @Setter
    private UsuarioModel rolUser;

    public UsuarioRol(Long id, String name, UsuarioModel rolUser) {
        this.id = id;
        this.name = name;
        this.rolUser = rolUser;
    }

    public UsuarioRol(){

    }

    public UsuarioRol(String name) {
        super();
        this.name = name;
    }
}
