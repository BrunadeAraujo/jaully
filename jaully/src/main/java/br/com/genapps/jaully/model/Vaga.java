package br.com.genapps.jaully.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Data
@Entity

public class Vaga {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 500, nullable = false)
    private String descricao;

     @Column(length = 10, nullable = false)
    private String bolsaAuxilio;

     @Column(length = 200, nullable = false)
    private String endereco;
}
