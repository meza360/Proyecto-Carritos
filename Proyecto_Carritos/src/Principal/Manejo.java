/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Productos.VehiculosAereos;
import Productos.SuperVehiculos;
import Productos.VehiculosMaritimos;
import Productos.VehiculosTerrestres;
import Datos.Factura;
import Datos.Clientes;
import Datos.Orden;
import Datos.*;
/**
 *
 * @author giovani
 */
public class Manejo {
    

    public static void main(String[] args){
   
   
        Factura FF = new Factura();
        Clientes CC = new Clientes();
        
    VehiculosAereos AA = new VehiculosAereos();
    AA.inicializador();
    AA.imprimeTodosAereos();

    VehiculosMaritimos MM = new VehiculosMaritimos();
    MM.inicializador();
    MM.imprimirTodosMaritimos();
    
    VehiculosTerrestres TT = new VehiculosTerrestres();
    TT.inicializador();
    TT.imprimirTodosTerrestres();
    
    TT.getCamaroSS();
    System.out.println("de nada");
    
    Orden DD = new Orden();
    
    DD.addToOrder(TT.getDodgeChallenger());
    DD.addToOrder(MM.getPrincess30m());
    DD.addToOrder(MM.getPrincess30m());
   /* 
    
    
    DD.addToOrder(MM.getPrincess30m());
    DD.addToOrder(MM.getPrincess30m());
    DD.addToOrder(MM.getPrincess30m());
    DD.addToOrder(MM.getPrincess30m());
    DD.addToOrder(MM.getPrincess30m());
      DD.addToOrder(MM.getPrincess30m());
        DD.addToOrder(MM.getPrincess30m());
    System.out.println("RESULTADO DE LA ORDEN");
    System.out.println("RESULTADO DE LA ORDEN");*/
    System.out.println("RESULTADO DE LA ORDEN");
    
    try{
    
   DD.getFactura();
    
    }catch(RuntimeException ex){ex.printStackTrace();}
    
    
    /*
    while(true){
    System.out.println("Bienvenido");
    System.out.println("Selecciona una opcion para continuar");
    System.out.println("");
    }
    */
    
        
    
    

    }
}
