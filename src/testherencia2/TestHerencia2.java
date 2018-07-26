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
public class TestHerencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	try{
             ProductoFresco pf = new ProductoFresco("15/12/2018", 25, "18/06/2018", "Mexico");
             ProductoCongelado pc = new ProductoCongelado("15/12/2018", 25, 12.5);
             ProductoRefrigerado pr = new ProductoRefrigerado("15/12/2018", 25, 12334);
             
             
             pf.mostrar();
             pc.mostrar();
             pr.mostrar();
	}catch(Exception e){
	System.out.print("Error capa 8 del modelo OSI!!!");
	}
		
    }
    
}
