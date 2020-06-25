/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Productos.VehiculosAereos;
import Productos.SuperVehiculos;
/**
 *
 * @author giovani
 */
public class Manejo {
    

    public static void main(String[] args){
        SuperVehiculos m2 = new SuperVehiculos();
        
    VehiculosAereos pp = new VehiculosAereos();
    pp.Boeing();

    System.out.println(pp.arreglo[0]);
    
    }
}
