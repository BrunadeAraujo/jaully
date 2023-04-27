package br.com.genapps.jaully.controller;

import br.com.genapps.jaully.model.Faculdade;
import br.com.genapps.jaully.repository.FaculdadeRespostory;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/faculdade")
@AllArgsConstructor


public class FaculdadeController {

    private final FaculdadeRespostory faculdadeRespostory;
 
    @GetMapping
    public List <Faculdade> list() { return faculdadeRespostory.findAll();}

    @PostMapping("/add")
    public Faculdade addFaculdade(@RequestBody Faculdade faculdade) { return  faculdadeRespostory.save(faculdade);}

    @PutMapping("/update")
    public Faculdade updatefaculdade(@RequestBody Faculdade faculdade) { return faculdadeRespostory.save(faculdade);}

    @DeleteMapping("/remove")
    public void removeFaculdade(@RequestBody Faculdade faculdade) { faculdadeRespostory.delete(faculdade);}

}
