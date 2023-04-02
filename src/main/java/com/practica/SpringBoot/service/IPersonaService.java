
package com.practica.SpringBoot.service;

import com.practica.SpringBoot.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> verPersonas();
    
    public void crearPersona(Persona persona);
    
    public void borrarPersona(Long id);
    
    public Persona buscarPersona (Long id);
}
