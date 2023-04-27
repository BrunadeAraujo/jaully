package br.com.genapps.jaully.repository;

import br.com.genapps.jaully.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmpresaRespostory extends JpaRepository<Empresa, Integer> {
}
