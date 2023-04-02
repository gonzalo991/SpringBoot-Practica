package com.practica.SpringBoot.Controllers;

import com.practica.SpringBoot.model.Persona;
import com.practica.SpringBoot.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private PersonaService personaService;

    //Mediante el metodo post mapping envio los datos
    //Lo datos viajan atraves de requestbody
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona persona) {
        personaService.crearPersona(persona);
    }
    
    @GetMapping("/ver/persona")
    @ResponseBody
    public List<Persona> verPersonas() {
        return personaService.verPersonas();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id) {
        personaService.borrarPersona(id);
    }
    
}
