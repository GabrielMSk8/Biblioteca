package com.gabriel.biblioteca.controllers;


import com.gabriel.biblioteca.models.Autor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @GetMapping("/{id}")
    public ResponseEntity<Autor> getById(@PathVariable long id){
        return ResponseEntity.ok().body(null);
    }

    @GetMapping
    public ResponseEntity<List<Autor>> getAll(){
        return ResponseEntity.ok().body(null);
    }

    @PostMapping
    public ResponseEntity<Autor> create(@RequestBody Autor autor){
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand("1").toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Autor> update(@PathVariable long id, @RequestBody Autor autor){
        return ResponseEntity.ok().body(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable long id){
        return ResponseEntity.noContent().build();
    }
}
