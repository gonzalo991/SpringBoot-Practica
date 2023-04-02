package com.practica.SpringBoot.service;

import com.practica.SpringBoot.model.Persona;
import com.practica.SpringBoot.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    public PersonaRepository personaRepository;
    
    @Override
    public List<Persona> verPersonas() {
        return personaRepository.findAll();
    }
    
    @Override
    public void crearPersona(Persona persona) {
        personaRepository.save(persona);
    }
    
    @Override
    public void borrarPersona(Long id) {
        personaRepository.deleteById(id);
    }
    
    @Override
    public Persona buscarPersona(Long id) {
        return personaRepository.findById(id).orElse(null);
    }
    
}
