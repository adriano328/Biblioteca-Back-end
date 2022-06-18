package com.biblioteca.projeto.biblioteca.service.autor;

import com.biblioteca.projeto.biblioteca.domain.Autor;
import com.biblioteca.projeto.biblioteca.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorImpl implements AutorService{

    @Autowired
    AutorRepository autorRepository;


    @Override
    public Autor getById(Integer id) {
        return autorRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Autor não localizado!"));
    }

    @Override
    public Autor save(Autor autor) {
        return autorRepository.save(autor);
    }

    @Override
    public void delete(Integer id) {
        if(autorRepository.existsById(id)){
            autorRepository.deleteById(id);
        }
    }

    @Override
    public Autor update(Autor autor) {
        return autorRepository.save(autor);
    }


}
