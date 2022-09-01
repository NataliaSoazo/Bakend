/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package porfolio.Backend.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import porfolio.Backend.modelo.Contacto;
import porfolio.Backend.repositorio.ContactoRepositorio;

/**
 *
 * @author josvi
 */
@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins= "http://localhost:4200/")
public class ContactoController {
    @Autowired 
    private ContactoRepositorio repositorio;
    @GetMapping("/contactos")
    public List<Contacto>listarTodos(){
        return repositorio.findAll();
    }  
    
    @PostMapping("/contactos")
    public Contacto guardarDatos(@RequestBody Contacto contacto){
        return repositorio.save(contacto);
    }
}