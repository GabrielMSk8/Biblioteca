package com.gabriel.biblioteca.services;

import com.gabriel.biblioteca.models.Perfil;
import com.gabriel.biblioteca.repositories.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PerfilService {

    @Autowired
    private PerfilRepository repo;


    public Perfil getById(long id){
        return repo.findById(id).orElse(null);
    }

    public List<Perfil> getAll(){
        return repo.findAll();
    }

    public Perfil create(Perfil perfil){

        return repo.save(perfil);
    }

    public Perfil update(Perfil perfil){
        return repo.save(perfil);
    }

    public void deleteById(long id){
        repo.deleteById(id);
    }
}
