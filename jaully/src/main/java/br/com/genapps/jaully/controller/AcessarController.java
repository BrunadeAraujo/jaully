package br.com.genapps.jaully.controller;


import br.com.genapps.jaully.model.Acessar;
import br.com.genapps.jaully.repository.AcessarRespostory;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/acessar")
@AllArgsConstructor


public class AcessarController {

    private final AcessarRespostory acessarRespostory;
    @GetMapping
    public List<Acessar> list() { return acessarRespostory.findAll();}

    @PostMapping("/add")
    public Acessar addAcessar(@RequestBody Acessar acessar) { return  acessarRespostory.save(acessar);}

    @PutMapping("/update")
    public Acessar updateacessar (@RequestBody Acessar acessar) { return acessarRespostory.save(acessar);}

    @DeleteMapping("/remove")
    public void removeacessar (@RequestBody Acessar acessar) { acessarRespostory.delete(acessar);}

}
