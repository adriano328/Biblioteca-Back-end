package com.biblioteca.projeto.biblioteca.service.editora;

import com.biblioteca.projeto.biblioteca.domain.Editora;
import com.biblioteca.projeto.biblioteca.repositories.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EditoraImpl implements EditoraService {

    @Autowired
    EditoraRepository editoraRepository;

    @Override
    public Editora getById(Integer id) {
        return editoraRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Editora não localizado!"));
    }

    @Override
    public Editora save(Editora editora) {
        return editoraRepository.save(editora);
    }

    @Override
    public void delete(Integer id) {
        if(editoraRepository.existsById(id)){
            editoraRepository.deleteById(id);
        }
    }

    @Override
    public Editora update(Editora editora) {
        return editoraRepository.save(editora);
    }


}
