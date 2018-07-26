/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testherencia2;

/**
 *
 * @author ivanp
 */
public class Producto {

    public Producto(String fechacaducidad, int numlote) {
        this.fechacaducidad = fechacaducidad;
        this.numlote = numlote;
    }

    public String getFechacaducidad() {
        return fechacaducidad;
    }

    public int getNumlote() {
        return numlote;
    }

    public void setFechacaducidad(String fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }

    public void setNumlote(int numlote) {
        this.numlote = numlote;
    }
    
    protected String fechacaducidad;
    protected int numlote;
}
