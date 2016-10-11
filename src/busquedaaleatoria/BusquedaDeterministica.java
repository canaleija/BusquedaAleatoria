/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedaaleatoria;

/**
 *
 * @author Roberto Cruz Leija
 */
public class BusquedaDeterministica {
    
    // donde buscar 
    private int [] arreglo;
    private int rango;

    public BusquedaDeterministica(int[] arreglo,int rango) {
        this.arreglo = arreglo;
        this.rango = rango;
    }
    
    public long verficar(){
       
        long inicio = 0;
        System.currentTimeMillis();
        long _final = 0;
        // recorremos el arreglo 
        inicio = System.currentTimeMillis();
        for (int x=0; x < this.arreglo.length;x++){
          // buscar el elemento en la posicion x
          int nv = this.arreglo[x];
          for (int y = 0 ; y <=rango;y++){
              if (nv == y){
                  break;
              }
          }
        
        }
        _final = System.currentTimeMillis();
        return (_final - inicio)/1000;
    }
    
    

       
    
    
    
}
