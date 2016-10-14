/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedaaleatoria;

import java.util.Random;

/**
 *
 * @author Roberto Cruz Leija
 */
public class BusquedaAleatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo [] = generarArreglo(1000, 1000000);
        VerificacionAleatoria va = new  VerificacionAleatoria(arreglo, 1000);
        for (int x=0; x < 500;x++){
           System.out.println(va.verficar());
        }
        
        
    }
    
    
    public static int[] generarArreglo (int rango, int dim){
       int[] arreglo = new int[dim];
       Random ran = new Random();
       for (int c=0; c < dim;c++)
         arreglo[c] = ran.nextInt(rango+1);
       
      return arreglo; 
    }
    
}
