/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.campitos.capitulo7;

import java.io.Serializable;

/**
 *
 * @author Ramsses R6
 */
public class Opcion implements Serializable {
    private String nombre;
    private String edad;
    private boolean valor;

    @Override
    public String toString() {
        return nombre + ": " + edad + "=" + valor +"   " ;
    }

    public Opcion(String nombre, String edad, boolean valor) {
        this.nombre = nombre;
        this.edad = edad;
        this.valor = valor;
    }

    public boolean isValor() {
        return valor;
    }

    public void setValor(boolean valor) {
        this.valor = valor;
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

   
    
}
