/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.campitos.capitulo7;

import java.io.Serializable;

/**
 *
 * @author campitos
 */
public class Usuario implements Serializable{
String nombre;
int edad;
String pregunta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

  

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + ", pregunta=" + pregunta + '}';
    }
    public Usuario(String nombre, int edad, String pregunta) {
        this.nombre = nombre;
        this.edad = edad;
        this.pregunta = pregunta;
    }
    
}
