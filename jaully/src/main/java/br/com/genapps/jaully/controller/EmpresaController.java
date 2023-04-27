package br.com.genapps.jaully.controller;


import br.com.genapps.jaully.model.Empresa;
import br.com.genapps.jaully.repository.EmpresaRespostory;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empresa")
@AllArgsConstructor

public class EmpresaController {

    private final EmpresaRespostory empresaRespostory;

    @GetMapping
    public List <Empresa> list() { return empresaRespostory.findAll();}

    @PostMapping("/add")
    public Empresa addEmpresa(@RequestBody Empresa empresa) { return empresaRespostory.save(empresa);}

    @PutMapping("/update")
    public Empresa updateempresa(@RequestBody Empresa empresa ) { return empresaRespostory.save(empresa);}

    @DeleteMapping("/remove")
    public void removeEmpresa(@RequestBody Empresa empresa ) { empresaRespostory.save(empresa);}

}
