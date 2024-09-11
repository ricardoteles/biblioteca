package com.ricardo.biblioteca.services;

import com.ricardo.biblioteca.models.Categoria;
import com.ricardo.biblioteca.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repo;

    public Categoria getById(long id) {
        return repo.findById(id).orElse(null);
    }

    public List<Categoria> getAll() {
        return repo.findAll();
    }

    public Categoria create(Categoria categoria) {
        return repo.save(categoria);
    }

    public Categoria update(Categoria categoria) {
        return repo.save(categoria);
    }

    public void delete(long id){
        repo.deleteById(id);
    }
}
