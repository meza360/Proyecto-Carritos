/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import Productos.SuperVehiculos;
import Productos.VehiculosAereos;
import Productos.VehiculosMaritimos;
/**
 *
 * @author giovani
 */
public class Orden{
    public Orden(){}
  
    private SuperVehiculos orden[] = new SuperVehiculos[9];
    protected int cont = 0;
    protected int cont2 = 1;
    
    public void addToOrder(SuperVehiculos vehiculo){
        try{
        if (cont != 8) {
        orden[cont] = vehiculo;    
        ++cont;
        }
        else{
            System.out.println("Limite de productos alcanzado");
        }
        }catch(ArrayIndexOutOfBoundsException es){
        System.out.println("Error en la orden" + es);
        }       
    }
    
    public SuperVehiculos getOrder(){
        try{
         if (cont >= 0) {
            System.out.println(orden[cont]);
            cont--;
            return getOrder();      
        } 
        else
        return null;
        }catch(RuntimeException es){
            System.out.println("Error en el proceso: ### " + es);
        return null;
        }
       
    }
    
    @Override
    public String toString(){
     try{
         if (cont >= 0) {
            System.out.println(orden[cont]);
            cont--;
            return toString();      
        } 
        else
        return null;
        }catch(RuntimeException es){
            System.out.println("Error en el proceso: ### " + es);
        return null;
        }
    }
}
