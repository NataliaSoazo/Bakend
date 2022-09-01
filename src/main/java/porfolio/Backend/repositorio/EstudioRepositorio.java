/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package porfolio.Backend.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import porfolio.Backend.modelo.Estudio;

/**
 *
 * @author josvi
 */
@Repository

public interface EstudioRepositorio  extends JpaRepository<Estudio, Integer>{
    
    
}