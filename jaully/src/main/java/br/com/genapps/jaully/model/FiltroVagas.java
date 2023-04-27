package br.com.genapps.jaully.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Data
@Entity

public class FiltroVagas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 100, nullable = false)
    private String codigoDaVaga;

    @Column(length = 100, nullable = false)
    private String tipoDeVaga;

    @Column(length = 100, nullable = false)
    private String NomeDaEmpresa;

}
