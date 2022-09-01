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
@Table (name= "contacto")
public class Contacto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
     @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
      @Column(name = "apellido", length = 50, nullable = false)
    private String apellido;
    @Column(name = "correo", length = 50, nullable = false)
    private String correo;
    @Column(name = "telefono", length = 200, nullable = false)
    private String telefono;
    @Column(name = "ciudad", length = 200, nullable = false)
    private String ciudad;
    @Column(name = "provincia", length = 50, nullable = false)
    private String provincia;
    @Column(name = "pais", length = 50, nullable = false)
    private String pais;
    @Column(name = "comentarios", length = 400, nullable = false)
    private String comentarios;

    public Contacto() {
    }

    public Contacto(int id, String nombre, String apellido, String correo, String telefono, String ciudad, String provincia, String pais, String comentarios) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
        this.comentarios = comentarios;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
    
    
    
}