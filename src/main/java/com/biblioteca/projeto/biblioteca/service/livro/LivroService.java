package com.biblioteca.projeto.biblioteca.service.livro;

import com.biblioteca.projeto.biblioteca.domain.Livro;
import org.springframework.stereotype.Service;

@Service
public interface LivroService {

    Livro getById(Integer id);

    Livro save(Livro livro);

    void delete(Integer id);

    Livro update(Livro livro);


}
