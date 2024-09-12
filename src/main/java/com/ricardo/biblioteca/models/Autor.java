package com.ricardo.biblioteca.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    @OneToOne
    @JoinColumn(name="id_perfil")
    private Perfil perfil;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "autor")
    private List<Livro> livros = new ArrayList<>();
}
