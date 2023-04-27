package br.com.genapps.jaully.controller;

import br.com.genapps.jaully.model.Vaga;
import br.com.genapps.jaully.repository.VagaRespostory;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/api/vaga")
@AllArgsConstructor


public class VagaController {
        private final VagaRespostory vagaRespostory;
        @GetMapping
    public List <Vaga> list() { return vagaRespostory.findAll();}

       @PostMapping("/add")
    public Vaga addVaga(@RequestBody Vaga vaga) { return  vagaRespostory.save(vaga);}

      @PutMapping("/update")
    public Vaga updateavaga(@RequestBody Vaga vaga) { return vagaRespostory.save(vaga);}

    @DeleteMapping("/remove")
    public void removeVaga(@RequestBody Vaga vaga) { vagaRespostory.delete(vaga);}
}
