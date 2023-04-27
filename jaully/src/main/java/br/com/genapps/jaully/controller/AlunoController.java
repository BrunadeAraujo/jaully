package br.com.genapps.jaully.controller;

import br.com.genapps.jaully.model.Aluno;
import br.com.genapps.jaully.repository.AlunoRespostory;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aluno")
@AllArgsConstructor

public class AlunoController {
    private final AlunoRespostory alunoRespostory;
    @GetMapping
    public List <Aluno> list() {
        return alunoRespostory.findAll();
    }
    @PostMapping("/add")
    public Aluno addAluno(@RequestBody Aluno aluno) {
        return alunoRespostory.save(aluno);
    }
    @PutMapping("/update")
    public Aluno updateAluno(@RequestBody Aluno aluno){
        return alunoRespostory.save(aluno);
    }
    @DeleteMapping("/remove")
    public void removeAluno(@RequestBody Aluno aluno) {
        alunoRespostory.delete(aluno);
    }
}
