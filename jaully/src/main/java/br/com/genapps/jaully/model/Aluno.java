package br.com.genapps.jaully.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Data
@Entity

public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 100, nullable = false)
    private String nomeCompleto;

    @Column(length = 15, nullable = false)
    private String celular;

    @Column(length = 100, nullable = false)
    private String nascimento;

    @Column(length = 11, nullable = false)
    private String cpf;

    @Column(length = 100, nullable = false)
    private String senha;

    @Column(length = 100, nullable = false)
    private String confirmarSenha;

}
































