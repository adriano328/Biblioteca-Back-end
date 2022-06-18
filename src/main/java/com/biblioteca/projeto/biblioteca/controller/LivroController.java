package com.biblioteca.projeto.biblioteca.controller;

import com.biblioteca.projeto.biblioteca.domain.Livro;
import com.biblioteca.projeto.biblioteca.service.livro.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    LivroService livroService;

    @GetMapping("/{id}")
    ResponseEntity<Livro> getById(@PathVariable Integer id){
        return ResponseEntity.ok(livroService.getById(id));
    }

    @PostMapping()
    ResponseEntity<Livro> save(@RequestBody Livro livro){
        return ResponseEntity.ok(livroService.save(livro));
    }

    @DeleteMapping
    public void delete(@PathVariable  Integer id){
        livroService.delete(id);
    }

    @PutMapping("/{id}")
    ResponseEntity<Livro>update(@RequestBody Livro livro){
        return ResponseEntity.ok(livroService.update(livro));
    }


}
