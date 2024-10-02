package com.gabriel.biblioteca.services;

import com.gabriel.biblioteca.models.Categoria;
import com.gabriel.biblioteca.models.exceptions.ObjetoNaoEncontradoException;
import com.gabriel.biblioteca.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;


    public Categoria getById(long id)
    {
        return repo.findById(id).orElseThrow(() -> new ObjetoNaoEncontradoException("Categoria não encontrada!"));
    }

    public List<Categoria> getAll(){
        return repo.findAll();
    }

    public Categoria create(Categoria categoria){

        return repo.save(categoria);
    }

    public Categoria update(Categoria categoria){
        return repo.save(categoria);
    }

    public void deleteById(long id){
       repo.deleteById(id);
    }
 }

