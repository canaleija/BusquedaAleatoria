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
public class VerificacionAleatoria {
    
    // donde buscar 
    private int [] arreglo;
    private int rango;

    public VerificacionAleatoria(int[] arreglo,int rango) {
        this.arreglo = arreglo;
        this.rango = rango;
    }
    
    public double verficar(){
       
        double inicio = 0;
        Random ram = new Random();
        System.currentTimeMillis();
        double _final = 0;
        // recorremos el arreglo 
        inicio = System.currentTimeMillis();
        for (int x=0; x < this.arreglo.length;x++){
          // buscar el elemento en la posicion x
          int nv = this.arreglo[x];
          // generar un aleatorio 
          int y;
        
          do {
             y=ram.nextInt(rango+1);
             
          }while(y!=nv);
        
        }
        _final = System.currentTimeMillis();
        return (_final - inicio)/1000;
    }
    
    

       
    
    
    
}
