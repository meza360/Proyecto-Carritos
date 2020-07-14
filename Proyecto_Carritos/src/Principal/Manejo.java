/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import java.util.Scanner;
import Productos.VehiculosAereos;
import Productos.SuperVehiculos;
import Productos.VehiculosMaritimos;
import Productos.VehiculosTerrestres;
import Datos.*;
/**
 *
 * @author giovani
 * @version 1.0 
 */
public class Manejo {
    

    public static void main(String[] args){
  
        Factura FF = new Factura();
        Clientes CC = new Clientes();
    Scanner input = new Scanner(System.in);
    VehiculosAereos AA = new VehiculosAereos();
    AA.inicializador();
    //AA.imprimeTodosAereos();

    VehiculosMaritimos MM = new VehiculosMaritimos();
    MM.inicializador();
    //MM.imprimirTodosMaritimos();
    
    VehiculosTerrestres TT = new VehiculosTerrestres();
    TT.inicializador();
    //TT.imprimirTodosTerrestres();
    
    TT.getCamaroSS();
    //System.out.println("de nada");
    
    Orden DD = new Orden();
    
    //DD.addToOrder(TT.getDodgeChallenger());
    //System.out.println("RESULTADO DE LA ORDEN");
    
    System.out.println("\t\tBienvenido");
    System.out.println("1. Ver la lista de vehiculos disponibles");
    System.out.println("2. Ver Datos de Cliente ");
    System.out.println("3. Ver el carrito de compras");
    
    switch(1){
    
        case 1: break;
    }
    
    
    
    try{
        DD.getFactura();
    }catch(RuntimeException ex){
    ex.printStackTrace();
    }
    }
}
