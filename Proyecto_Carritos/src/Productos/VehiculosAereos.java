/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

/**
 *
 * @author giovani
 */
public class VehiculosAereos extends SuperVehiculos{
    
    public VehiculosAereos arreglo[] = new VehiculosAereos[10];
  
    public VehiculosAereos(){
   
    }
    
      public void Boeing(){
        arreglo[0] = new VehiculosAereos();
        arreglo[0].setNombre("Boeing");
        arreglo[0].setCC(3500);
        arreglo[0].setCilindros(10);
        arreglo[0].setCombustible("Gasolina");
        arreglo[0].setTanque(15);
        arreglo[0].setPuertas(2);
        arreglo[0].setAsientos(100);
        arreglo[0].setPrecio(5000);
    }
    
  
    
}
