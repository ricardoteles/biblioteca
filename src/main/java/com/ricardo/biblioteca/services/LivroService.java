package com.ricardo.biblioteca.services;

import com.ricardo.biblioteca.models.Livro;
import com.ricardo.biblioteca.models.exceptions.ObjectNotFoundException;
import com.ricardo.biblioteca.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    @Autowired
    private LivroRepository repo;

    public Livro getById(long id) {
        return repo.findById(id).orElseThrow(() -> new ObjectNotFoundException("Livro não encontrado!"));
    }

    public List<Livro> getAll() {
        return repo.findAll();
    }

    public Livro create(Livro livro) {
        return repo.save(livro);
    }

    public Livro update(Livro livro) {
        return repo.save(livro);
    }

    public void delete(long id){
        repo.deleteById(id);
    }
}
