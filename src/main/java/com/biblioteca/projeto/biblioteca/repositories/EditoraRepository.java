package com.biblioteca.projeto.biblioteca.repositories;

import com.biblioteca.projeto.biblioteca.domain.Editora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Integer> {
}
