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
import porfolio.Backend.modelo.Acerca;
import porfolio.Backend.repositorio.AcercaRepositorio;

/**
 *
 * @author josvi
 */
@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins= "http://localhost:4200/")
public class AcercaController {
    @Autowired 
    private AcercaRepositorio repositorio;
    @GetMapping("/acerca")
    public List<Acerca>listarTodos(){
        return repositorio.findAll();
    }    
    
    @PostMapping("/acerca")
    public Acerca guardarDatos(@RequestBody Acerca acerca){
        return repositorio.save(acerca);
    }
}