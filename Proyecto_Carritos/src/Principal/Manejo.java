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
    
public static void clearScreen() {  
    System.out.print("\033[H\033[2J"); 
    System.out.print("\n\n\n");
    System.out.flush();  
   }

    public static void main(String[] args){
  
        Factura FF = new Factura();
        Clientes CC = new Clientes();
        Scanner input = new Scanner(System.in);
        int op = 1,op2 = 1,op3;
       
    VehiculosAereos AA = new VehiculosAereos();
    AA.inicializador();
    VehiculosMaritimos MM = new VehiculosMaritimos();
    MM.inicializador();
    VehiculosTerrestres TT = new VehiculosTerrestres();
    TT.inicializador();    
    Orden DD = new Orden();
    
    //DD.addToOrder(TT.getDodgeChallenger());
    
   //inicio del ciclo infinito 
  while(op != 0){
    clearScreen();
    System.out.println("\t\tBienvenido");
    System.out.println("1. Ver el menu de vehiculos");
    System.out.println("2. Ver el carrito de compras");
    System.out.println("3. Completar compra");
    System.out.println("0. Salir del programa");
    try{
    op = input.nextInt();
        if (op <0 || op >3) {
            while(op <0 || op >3){
            System.out.println("Numero invalido, intente de nuevo");
            op = input.nextInt();
            }
        }
        else{
         switch(op){
        case 1: //opcion 1 del menu principal
            while(op2 != 0){
            clearScreen();
            System.out.println("1. Vehiculos Terrestres");
            System.out.println("2. Vehiculos Maritimos");
            System.out.println("3. Vehiculos Aereos");
            System.out.println("0. Regresar al menu principal");
            try{
            op2 = input.nextInt();
            if (op2<0 || op2>3) {
                while(op2<0 || op2>3){
                System.out.println("Numero invalido, intente de nuevo");
                op2 = input.nextInt();
                }
            }
            else{
            switch(op2){
                case 1: //opcion 1 del menu de vehiculos
                    clearScreen();
                    System.out.println("0. Seleccione 0 para regresar al menu de vehiculos.");
                    System.out.println("Selecciones el vehiculo deseado(1, 2, 3): \n\n");
                    TT.imprimirTodosTerrestres();
                    op2 = input.nextInt();
                    try{
                        if (op2<0 || op2>3) {
                            while(op2<0 || op2>3){
                            System.out.println("Opcion no valida, intente de nuevo");
                            op2 = input.nextInt();
                            }
                        }
                        else{
                            DD.addToOrder(TT.selVehiculo(op2)); 
                            System.out.println("Vehiculo " + TT.selVehiculo(op2).getNombre() + " agregado a la orden");
                            break;
                        }
                    
                    }catch(RuntimeException error){ error.printStackTrace();break;}
                    
                case 2: //opcion 2 del menu de vehiculos
                    clearScreen();
                    System.out.println("0. Seleccione 0 para regresar al menu de vehiculos.");
                    System.out.println("Selecciones el vehiculo deseado(1, 2, 3): \n\n");
                    MM.imprimirTodosMaritimos();
                    op2 = input.nextInt();
                    try{
                        if (op2<0 || op2>3) {
                            while(op2<0 || op2>3){
                            System.out.println("Opcion no valida, intente de nuevo");
                            op2 = input.nextInt();
                            }
                        }
                        else{
                            DD.addToOrder(MM.selVehiculo(op2)); 
                            System.out.println("Vehiculo " + MM.selVehiculo(op2).getNombre() + " agregado a la orden");
                            break;
                        }
                    
                    }catch(RuntimeException error){ error.printStackTrace();break;}
                    
                case 3: 
                    clearScreen();
                    System.out.println("0. Seleccione 0 para regresar al menu de vehiculos.");
                    System.out.println("Selecciones el vehiculo deseado(1, 2, 3): \n\n");
                    AA.imprimeTodosAereos();
                    op2 = input.nextInt();
                    try{
                        if (op2<0 || op2>3) {
                            while(op2<0 || op2>3){
                            System.out.println("Opcion no valida, intente de nuevo");
                            op2 = input.nextInt();
                            }
                        }
                        else{
                            DD.addToOrder(AA.selVehiculo(op2)); 
                            System.out.println("Vehiculo " + AA.selVehiculo(op2).getNombre() + " agregado a la orden");
                            break;
                        }
                    
                    }catch(RuntimeException error){ error.printStackTrace();break;}
            }
            }
            }catch(RuntimeException error){
            error.printStackTrace();
            }
            }
            break;
        case 2: 
            System.out.println("\n\n\n");
                DD.getOrder();
                System.out.println("1. Eliminar un vehiculo del carrito");
                System.out.println("0. Regresar al menu anterior");
                op2 = input.nextInt();
                if(op2 == 1){
                try{
                    System.out.println("Seleccione el vehiculo a remover: \n");
                    op3 = input.nextInt();
                if(DD.removeItem(op3)){
                System.out.println("Elemento Removido de la order\n");
                DD.getOrder();
                }
                else
                    System.out.println("Error###Eleemento no encontrado\n");
                break;
                }catch(RuntimeException error){
                error.printStackTrace();
                break;
                }
                }
                

        case 3: break;
        case 4: break;
    }
            
        }
    }catch(RuntimeException error){
    error.printStackTrace();
    }
    
       
    }//fin del ciclo infinito
    
    
    
    
    
    try{
        DD.getFactura();
    }catch(RuntimeException ex){
    ex.printStackTrace();
    }
    }
}
