package org.aop.implementation.aopimplementation;

import org.aop.implementation.aopimplementation.entities.Personne;
import org.aop.implementation.aopimplementation.entities.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping ("/{id}")
    public Personne delete(@PathVariable(name = "id") Long id){
         Personne p=personneRepository.findById(id).get();
         personneRepository.delete(p);
        return p;
    }
}
