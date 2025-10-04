package com.crud_spring_boot.cadastro_usuario.infrastructure.repository;

import com.crud_spring_boot.cadastro_usuario.infrastructure.entitys.Usuario; // verifique se é entity e não entitys
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
