package com.biblioteca.projeto.biblioteca.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "livro")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String titulo;

    @Column
    private String descricao;

    @OneToOne
    @JoinColumn(name = "editora_id")
    Editora editora;

    @OneToOne
    @JoinColumn(name = "autor_id")
    Autor autor;

}
