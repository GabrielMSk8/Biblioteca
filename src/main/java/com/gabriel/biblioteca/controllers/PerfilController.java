package com.gabriel.biblioteca.controllers;

import com.gabriel.biblioteca.models.Perfil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/perfis")
public class PerfilController {

    @GetMapping("/{id}")
    public ResponseEntity<Perfil> getById(@PathVariable long id){
        return ResponseEntity.ok().body(null);
    }

    @GetMapping
    public ResponseEntity<List<Perfil>> getAll(){
        return ResponseEntity.ok().body(null);
    }

    @PostMapping
    public ResponseEntity<Perfil> create(@RequestBody Perfil perfil){
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand('1').toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Perfil> update(@PathVariable long id, @RequestBody Perfil perfil){
        return ResponseEntity.ok().body(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable long id){
        return ResponseEntity.noContent().build();
    }
}
