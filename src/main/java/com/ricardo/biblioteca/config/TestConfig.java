package com.ricardo.biblioteca.config;

import com.ricardo.biblioteca.models.Autor;
import com.ricardo.biblioteca.models.Categoria;
import com.ricardo.biblioteca.models.Livro;
import com.ricardo.biblioteca.models.Perfil;
import com.ricardo.biblioteca.repositories.AutorRepository;
import com.ricardo.biblioteca.repositories.CategoriaRepository;
import com.ricardo.biblioteca.repositories.LivroRepository;
import com.ricardo.biblioteca.repositories.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Configuration
@Profile("teste")
public class TestConfig {
    @Autowired
    private AutorRepository autorRepository;

    @Autowired
    private LivroRepository livroRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private PerfilRepository perfilRepository;


    @Bean
    public boolean iniciaDB(){
        Perfil p1 = new Perfil(0, "Americano, nascido no Texas", LocalDateTime.now());
        Perfil p2 = new Perfil(0, "Brasileiro nascido em Salvador", LocalDateTime.now());

        Livro l1 = new Livro(0, "Java Spring Boot", null, null);
        Livro l2 = new Livro(0, "Python para iniciantes", null, null);

        Categoria c1 = new Categoria(0, "Computação", Set.of(l1));
        Categoria c2 = new Categoria(0, "T.I.", Set.of(l2));

        Autor a1 = new Autor(0, "Uncle Bob", p1, List.of(l1));
        Autor a2 = new Autor(0, "João Silva", p2, List.of(l2));

        l1.setAutor(a1);
        l1.setCategorias(Set.of(c1));

        l2.setAutor(a2);
        l2.setCategorias(Set.of(c2));

        perfilRepository.saveAll(List.of(p1,p2));
        categoriaRepository.saveAll(List.of(c1,c2));
        autorRepository.saveAll(List.of(a1,a2));
        livroRepository.saveAll(List.of(l1,l2));

        return true;
    }
}
