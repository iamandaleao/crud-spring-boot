package com.crud_spring_boot.cadastro_usuario.infrastructure.repository;

import com.crud_spring_boot.cadastro_usuario.infrastructure.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

Import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email);
    @Transaction
    void deleteByEmail(String email);
}
