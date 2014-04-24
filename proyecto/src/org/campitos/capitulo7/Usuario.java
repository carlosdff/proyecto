/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.campitos.capitulo7;


import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author campitos
 */
public class Usuario implements Serializable{
String nombre;
String edad;
 private ArrayList<Opcion> email;
 
public Usuario(String nombre, String edad,ArrayList<Opcion> email ) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public ArrayList<Opcion> getEmail() {
        return email;
    }

    public void setEmail(ArrayList<Opcion> email) {
        this.email = email;
    }

    

    
   

  

  
   
    
}
