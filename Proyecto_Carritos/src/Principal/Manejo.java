/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Productos.VehiculosAereos;
import Productos.SuperVehiculos;
import Productos.VehiculosMaritimos;
/**
 *
 * @author giovani
 */
public class Manejo {
    

    public static void main(String[] args){
   
        
    VehiculosAereos AA = new VehiculosAereos();
    AA.inicializador();
    AA.imprimeTodosAereos();

    VehiculosMaritimos MM = new VehiculosMaritimos();
    MM.inicializador();
    MM.imprimirTodosMaritimos();
    
    System.out.println("de nada");
    
    }
}
