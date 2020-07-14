/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import Productos.SuperVehiculos;
import Productos.VehiculosAereos;
import Productos.VehiculosMaritimos;
import Datos.*;
/**
 *
 * @author giovani
 */
public class Orden{
    public Orden(){}
    private Factura FF = new Factura();
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
            cont = 8;
        }
        }catch(ArrayIndexOutOfBoundsException es){
        System.out.println("Error en la orden" + es);
        }       
    }
    
    public SuperVehiculos getOrder(){
        try{
            if (cont == 0) {
                System.out.println("\nCarrito de compras vacio\nRegresando al menu principal\n\n\n\n\n\n");
                return null;
            }
            else if (cont >= 0) {
             cont--;
            System.out.println(cont + "\n" + orden[cont]);
            
            return getOrder();      
        } 
        else
        return null;
        }catch(RuntimeException es){
            System.out.println("Error en el proceso: ### " + es);
        return null;
        }  
    }
    
    public boolean removeItem(int a) throws ArrayIndexOutOfBoundsException{
        orden[a-1] = null;
        cont-=1;
        if (orden[a-1] == null) {
        return true;    
        }
        else
            return false;
    }
    
     public void getFactura(){
        try{
            for(SuperVehiculos producto:orden){
                if(producto != null)
                FF.agregarFactura(producto);
            }
        }catch(RuntimeException es){
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
