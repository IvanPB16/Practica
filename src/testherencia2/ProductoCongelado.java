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
public class ProductoCongelado extends Producto{
    
        private double temperatura;

	public ProductoCongelado(String fechacaducidad,int numlote,double temperatura){
		super(fechacaducidad,numlote);
		this.temperatura = temperatura;
	}


    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
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
							"Temperatura ideal"+temperatura);
	}
    
}
