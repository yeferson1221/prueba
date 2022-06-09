package com.crud.democrud.ServicesTest;

import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.models.UsuarioRol;
import com.crud.democrud.repositories.UsuarioRepository;
import com.crud.democrud.repositories.UsuarioRolRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class UsuarioRolTest {
    @Autowired
    UsuarioRolRepository usuarioRolRepository;



    @Test
    public void testBuscarUsuarioRolPorId(){
        Long idBuscado=1L;
        Optional<UsuarioRol> usuarioRolBuscado=usuarioRolRepository.findById(idBuscado);
        assertThat(usuarioRolBuscado.get().getId()).isEqualTo(idBuscado);
    }

    @Test
    public void testListarUsuariosRol(){
        List<UsuarioRol> usuarioRolList=(List<UsuarioRol>) usuarioRolRepository.findAll();
        assertThat(usuarioRolList).size().isGreaterThan(0);
    }
}
