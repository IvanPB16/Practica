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
public class ProductoRefrigerado extends Producto{
      private int codigo;
      
        public ProductoRefrigerado(String fechacaducidad,int numlote,int codigo){
          super(fechacaducidad,numlote);
	this.codigo = codigo;
	}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
							"Codigo del organismo de supervision alimenticia"+codigo);
	}
  
        
}
