package com.gabriel.biblioteca.services;


import com.gabriel.biblioteca.models.Livro;
import com.gabriel.biblioteca.models.exceptions.ObjetoNaoEncontradoException;
import com.gabriel.biblioteca.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repo;


    public Livro getById(long id){
        return repo.findById(id).orElseThrow(() -> new ObjetoNaoEncontradoException("Livro não encontrado!"));
    }

    public List<Livro> getAll(){
        return repo.findAll();
    }

    public Livro create(Livro livro){

        return repo.save(livro);
    }

    public Livro update(Livro livro){
        return repo.save(livro);
    }

    public void deleteById(long id){
        repo.deleteById(id);
    }
}
