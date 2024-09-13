package com.ricardo.biblioteca.controllers;

import com.ricardo.biblioteca.controllers.swagger.AutorSwagger;
import com.ricardo.biblioteca.services.AutorService;
import com.ricardo.biblioteca.models.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController implements AutorSwagger {

    @Autowired
    private AutorService service;

    @GetMapping("/{id}")
    public ResponseEntity<Autor> getById(@PathVariable long id){
        return ResponseEntity.ok().body(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<Autor>> getAll(){
        return ResponseEntity.ok().body(service.getAll());
    }

    @PostMapping
    public ResponseEntity<Autor> create(@RequestBody Autor autor){
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(service.create(autor).getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Autor> update(@PathVariable long id, @RequestBody Autor autor){
        return ResponseEntity.ok().body(service.update(autor));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Autor> delete(@PathVariable long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
