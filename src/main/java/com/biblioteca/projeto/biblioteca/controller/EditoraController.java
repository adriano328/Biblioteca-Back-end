package com.biblioteca.projeto.biblioteca.controller;

import com.biblioteca.projeto.biblioteca.domain.Editora;
import com.biblioteca.projeto.biblioteca.service.editora.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/editora")
public class EditoraController {

    @Autowired
    EditoraService editoraService;

    @GetMapping("/{id}")
    ResponseEntity<Editora> getById(@PathVariable Integer id){
        return ResponseEntity.ok(editoraService.getById(id));
    }

    @PostMapping()
    ResponseEntity<Editora> save(@RequestBody Editora editora){
        return ResponseEntity.ok(editoraService.save(editora));
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable Integer id){
        editoraService.delete(id);
    }

    @PutMapping()
    ResponseEntity<Editora> update(@RequestBody Editora editora){
        return ResponseEntity.ok(editoraService.update(editora));
    }


}
