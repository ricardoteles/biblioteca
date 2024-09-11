package com.ricardo.biblioteca.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    @OneToOne
    @JoinColumn(name="id_perfil")
    private Perfil perfil;

    @OneToMany(mappedBy = "autor")
    private List<Livro> livros;
}
