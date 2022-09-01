/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package porfolio.Backend.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author josvi
 */
@Entity
@Table (name= "estudios")
public class Estudio {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
     @Column(name = "entidad", length = 100, nullable = false)
    private String entidad;
      @Column(name = "detalle", length = 200, nullable = false)
    private String detalle;

    public Estudio() {
    }

    public Estudio(int id, String entidad, String detalle) {
        this.id = id;
        this.entidad = entidad;
        this.detalle = detalle;
    }
      
      

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
      
      
    
}
