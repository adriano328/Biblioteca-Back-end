package com.biblioteca.projeto.biblioteca.service.livro;

import com.biblioteca.projeto.biblioteca.domain.Livro;
import com.biblioteca.projeto.biblioteca.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroImpl implements LivroService{

    @Autowired
    LivroRepository livroRepository;

    @Override
    public Livro getById(Integer id) {
        return livroRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Livro não Localizado"));
    }

    @Override
    public Livro save(Livro livro) {
        return livroRepository.save(livro);
    }

    @Override
    public void delete(Integer id) {
        if(livroRepository.existsById(id)){
            livroRepository.deleteById(id);
        }
    }

    @Override
    public Livro update(Livro livro) {

        return livroRepository.save(livro);
    }
}
