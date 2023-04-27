package br.com.genapps.jaully.controller;

import br.com.genapps.jaully.model.FiltroVagas;
import br.com.genapps.jaully.repository.FiltroVagasRespostory;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/filtrovagas")
@AllArgsConstructor

public class FiltroVagasController {
       private final FiltroVagasRespostory filtroVagasRespostory;
       @GetMapping
    public List <FiltroVagas> list() { return filtroVagasRespostory.findAll();}

       @PostMapping("/add")
    public FiltroVagas updateFiltroVagas(@RequestBody FiltroVagas filtroVagas) {return filtroVagasRespostory.save(filtroVagas);}


    @PutMapping("/update")
    public FiltroVagas updatefiltroVagas(@RequestBody FiltroVagas filtroVagas) { return filtroVagasRespostory.save(filtroVagas);}

    @DeleteMapping("/remove")
    public void removeFiltroVagas(@RequestBody FiltroVagas filtroVagas) { filtroVagasRespostory.delete(filtroVagas);}

}
