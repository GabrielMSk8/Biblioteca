package com.gabriel.biblioteca.services;

import com.gabriel.biblioteca.models.Autor;
import com.gabriel.biblioteca.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AutorService {
    @Autowired
    private AutorRepository repo;

    public Autor getById(long id){
        return repo.findById(id).orElse(null);
    }

    public List<Autor> getAll(){
        return repo.findAll();
    }

    public Autor create(Autor autor){
        return repo.save(autor);
    }

    public Autor update(Autor autor){
        return repo.save(autor);
    }

    public void deleteById(long id){
        repo.deleteById(id);
    }
}
