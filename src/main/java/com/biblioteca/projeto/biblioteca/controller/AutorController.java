package com.biblioteca.projeto.biblioteca.controller;

import com.biblioteca.projeto.biblioteca.domain.Autor;
import com.biblioteca.projeto.biblioteca.service.autor.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/autor")
public class AutorController {

    @Autowired
    AutorService autorService;

    @GetMapping("/{id}")
    ResponseEntity<Autor> getById(@PathVariable Integer id){
        return ResponseEntity.ok(autorService.getById(id));
    }

    @PostMapping
    ResponseEntity<Autor> save(@RequestBody Autor autor){
        return ResponseEntity.ok(autorService.save(autor));
    }

    @PutMapping()
    ResponseEntity<Autor> update(@RequestBody Autor autor){
        return ResponseEntity.ok(autorService.update(autor));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        autorService.delete(id);
    }

}
