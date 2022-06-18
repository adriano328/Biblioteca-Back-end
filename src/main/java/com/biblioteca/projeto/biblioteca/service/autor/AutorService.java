package com.biblioteca.projeto.biblioteca.service.autor;

import com.biblioteca.projeto.biblioteca.domain.Autor;
import org.springframework.stereotype.Service;

@Service
public interface AutorService {

    Autor getById(Integer id);

    Autor save(Autor autor);

    void delete(Integer id);

    Autor update(Autor autor);
}
