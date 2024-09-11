package com.ricardo.biblioteca.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Autor autor;

    @ManyToMany
    @JoinTable(
            name = "categoria_livro",
            joinColumns = @JoinColumn(name = "id_livro"),
            inverseJoinColumns = @JoinColumn(name = "id_categoria")
    )
    private Set<Categoria> categorias;
}
