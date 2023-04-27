package br.com.genapps.jaully.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Data
@Entity

public class Faculdade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String area;

    @Column(length = 50, nullable = false)
    private String curso;

    @Column(length = 100, nullable = false)
    private String nomeDaInstituicao;

    @Column(length = 50, nullable = false)
    private String dataDeInicio;

    @Column(length = 50, nullable = false)
    private String dataDeTermino;

}