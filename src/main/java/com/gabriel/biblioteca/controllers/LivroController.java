package com.gabriel.biblioteca.controllers;


import com.gabriel.biblioteca.models.Livro;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @GetMapping("/{id}")
    public ResponseEntity<Livro> getById(@PathVariable long id){
        return ResponseEntity.ok().body(null);
    }

    @GetMapping
    public ResponseEntity<List<Livro>> getAll(){
        return ResponseEntity.ok().body(null);
    }

    @PostMapping
    public ResponseEntity<Livro> create(@RequestBody Livro livro){
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand('1').toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livro> update(@PathVariable long id, @RequestBody Livro livro){
        return ResponseEntity.ok().body(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable long id){
        return ResponseEntity.noContent().build();
    }

}
