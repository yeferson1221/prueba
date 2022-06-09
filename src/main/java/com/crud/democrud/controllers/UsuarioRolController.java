package com.crud.democrud.controllers;

import com.crud.democrud.models.UsuarioRol;
import com.crud.democrud.services.UsuarioRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/rol")
public class UsuarioRolController {
        @Autowired
        UsuarioRolService usuarioRolService;

        @GetMapping()
        public ArrayList<UsuarioRol> obtenerRol() {
            return usuarioRolService.obtenerUsuariosRol();
        }

        @PostMapping()
        public UsuarioRol guardarUsuarioRol(@RequestBody UsuarioRol role) {
            return this.usuarioRolService.guardarUsuarioRol(role);
        }
        @GetMapping(path = "/{id}")
        public Optional<UsuarioRol> obtenerUsuarioPorId(@PathVariable("id") Long id) {
            return this.usuarioRolService.obtenerPorId(id);
        }

        @DeleteMapping(path = "/{id}")
        public String eliminarPorId(@PathVariable("id") Long id) {
            boolean ok = this.usuarioRolService.eliminarUsuarioRol(id);
            if (ok) {
                return "Se eliminó el usuario con id " + id;
            } else {
                return "No pudo eliminar el usuario con id" + id;
            }
        }
}
