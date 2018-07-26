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
public class ProductoFresco extends Producto  {
    
    private String fechaembasado;
    private String paisOrigen;
    
    	public ProductoFresco(String fechacaducidad,int numlote, String fechaembasado,String paisOrigen){
		super(fechacaducidad,numlote);
		this.fechaembasado = fechaembasado;
		this.paisOrigen = paisOrigen;
	}
        

    public String getFechaembasado() {
        return fechaembasado;
    }

    public void setFechaembasado(String fechaembasado) {
        this.fechaembasado = fechaembasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getFechacaducidad() {
        return fechacaducidad;
    }

    public void setFechacaducidad(String fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }

    public int getNumlote() {
        return numlote;
    }

    public void setNumlote(int numlote) {
        this.numlote = numlote;
    }
   	public void mostrar(){
		System.out.println("Fecha de caducidad"+fechacaducidad+
							"numero de lote:" +numlote+
							"Fecha de embasado"+fechaembasado+
							"paisOrigen:" + paisOrigen);
	}
}
