/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.DTO;

import java.io.Serializable;

/**
 *
 * @author alvarodanieleraso
 */
public class HamburguesaDTO implements Serializable{
    
    private int ID;
    private String nombre;
    private String tipo;
    private int cantidadIngredientesExtra;
    private float costo;

    //public HamburguesaDTO(int ID, String nombre, String tipo, int cantidadIngredientesExtra, float costo) {
    public HamburguesaDTO(String nombre, String tipo, int cantidadIngredientesExtra, float costo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidadIngredientesExtra = cantidadIngredientesExtra;
        this.costo = costo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidadIngredientesExtra() {
        return cantidadIngredientesExtra;
    }

    public void setCantidadIngredientesExtra(int cantidadIngredientesExtra) {
        this.cantidadIngredientesExtra = cantidadIngredientesExtra;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    
    
    
    
}
