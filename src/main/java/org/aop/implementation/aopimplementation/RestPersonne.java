package org.aop.implementation.aopimplementation;

import org.aop.implementation.aopimplementation.entities.Personne;
import org.aop.implementation.aopimplementation.entities.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestPersonne {
    @Autowired
    private PersonneRepository personneRepository;


    @GetMapping("getAll")
    public List<Personne> findAll(){
        return personneRepository.findAll();
    }
    @GetMapping("/personnes/{id}")
    public Personne findById(@PathVariable(name = "id") Long id){
        return personneRepository.findById(id).get();
    }

    @PostMapping
    public Personne insert(Personne p){
        return personneRepository.save(p);
    }
}
