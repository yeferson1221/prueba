package com.crud.democrud.services;

import com.crud.democrud.models.UsuarioRol;
import com.crud.democrud.repositories.UsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class UsuarioRolService {
    @Autowired
    UsuarioRolRepository usuarioRolRepository;

    public ArrayList<UsuarioRol> obtenerUsuariosRol(){
        return (ArrayList<UsuarioRol>) usuarioRolRepository.findAll();
    }

    public UsuarioRol guardarUsuarioRol(UsuarioRol role){
        return usuarioRolRepository.save(role);
    }

    public Optional<UsuarioRol> obtenerPorId(Long id){
        return usuarioRolRepository.findById(id);
    }


    public ArrayList<UsuarioRol>  obtenerPorPrioridad(Integer prioridad) {
        return usuarioRolRepository.findByPrioridad(prioridad);
    }

    public boolean eliminarUsuarioRol(Long id) {
        try{
            usuarioRolRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
