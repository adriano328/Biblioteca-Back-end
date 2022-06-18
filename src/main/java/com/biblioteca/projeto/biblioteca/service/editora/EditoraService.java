package com.biblioteca.projeto.biblioteca.service.editora;

import com.biblioteca.projeto.biblioteca.domain.Editora;
import org.springframework.stereotype.Service;

@Service
public interface EditoraService {

    Editora getById(Integer id);

    Editora save(Editora editora);

    void delete(Integer id);

    Editora update(Editora editora);


}
