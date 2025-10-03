package com.crud_spring_boot.cadastro_usuario.infrastructure.entitys;

import lombok.Getter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "usuario")
@Entity

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nome = "email", unique = true)
    private String email;

    @Column(name = "nome")
    private String nome;
}
