/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package Principal;
import java.util.Scanner;
import Productos.VehiculosAereos;
import Productos.SuperVehiculos;
import Productos.VehiculosMaritimos;
import Productos.VehiculosTerrestres;
import Datos.*;
import java.io.IOException;
/**
 *
 * @author GIOVANI DAVID MEZA POGGIO CARNÉ 5990-18-14676 SECCION A
 * @author Wendy Pricila Cifuentes Lutin CARNÉ 5990-18-4413 SECCION A
 * @author Flor Eunice Garcia Ajquil CARNÉ 5990-18-9172 SECCION A
 */
public class Manejo {
    
public static void clearScreen() {  
    System.out.print("\033[H\033[2J"); 
    System.out.print("\n\n\n");
    System.out.flush();  
   }

    public static void main(String[] args) throws IOException{
        Orden OO = new Orden();
        Factura FF = new Factura();
        Clientes CC = new Clientes();
        Scanner input = new Scanner(System.in);
        int op = 1,op2 = 1,op3,op4 = 0;
       
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
    System.out.println("------------Bienvenido------------");
    System.out.println("|  1. Ver el menu de vehiculos    |");
    System.out.println("|  2. Ver el carrito de compras   |");
    System.out.println("|  3. Completar compra            |");
    System.out.println("|  0. Salir del programa          |");
    System.out.println("----------------------------------");
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
                            if (op2 == 0) {
                                break;
                            }
                            else{
                            DD.addToOrder(TT.selVehiculo(op2)); 
                            System.out.println("Vehiculo " + TT.selVehiculo(op2).getNombre() + " agregado a la orden");
                            op2 = 1;
                            break;
                            }
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
                            if (op2 == 0) {
                                break;
                            }
                            else{
                            DD.addToOrder(MM.selVehiculo(op2)); 
                            System.out.println("Vehiculo " + MM.selVehiculo(op2).getNombre() + " agregado a la orden");
                            op2 = 1;
                            break;
                            }
                        }
                    
                    }catch(RuntimeException error){ error.printStackTrace();break;}
                    
                case 3: //opcion 3 del menu de vehiculos
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
                            if (op2 == 0) {
                                break;
                            }
                            else{
                            DD.addToOrder(AA.selVehiculo(op2)); 
                            System.out.println("Vehiculo " + AA.selVehiculo(op2).getNombre() + " agregado a la orden");
                            op2 = 1;
                            break;
                            }
                        }
                    
                    }catch(RuntimeException error){ error.printStackTrace();break;}
            }
            }
            }catch(RuntimeException error){
            error.printStackTrace();
            break;
            }
            }
            break;
        case 2: //opcion 2 del menu principal
            System.out.println("\n\n\n");
                DD.getOrder();
                System.out.println("1. Eliminar un vehiculo del carrito");
                System.out.println("0. Regresar al menu anterior");
                op2 = input.nextInt();
                try{
                if (op2<0 || op2>3) {
                            while(op2<0 || op2>3){
                            System.out.println("Opcion no valida, intente de nuevo");
                            op2 = input.nextInt();
                            }
                        }
                        
                else if (op2 == 0) {
                break;
                }
                else if(op2 == 1){
                    System.out.println("Seleccione el vehiculo a remover: \n");
                    op3 = input.nextInt();
                if(DD.removeItem(op3)){
                System.out.println("Elemento Removido de la order\n");
                DD.getOrder();
                break;
                }}
                else{
                    System.out.println("Error###Eleemento no encontrado\n");
                break;}
                }catch(RuntimeException error){error.printStackTrace();break;}

        case 3://opcion 3 del menu principal
             try{
            System.out.println("\n\n\t\t\tPor favor, ingrese los datos del cliente:\n");
            System.out.println("\tIngrese el nombre completo: \n");
            input.nextLine();
            CC.setNombre(input.nextLine());
            //System.out.println("\t\tPresione ENTER una vez mas por favor");
            System.out.println("\tIngrese ciudad para la factura: \n");
            CC.setLugar(input.nextLine());
            System.out.println("\tIngrese el numero de telefono del cliente: \n");
            CC.setTelefono(input.nextLine());
            System.out.println("\tIngrese NIT para el cliente(opcional)\n");
            CC.setNIT(input.nextLine());
            System.out.println("Datos a imprimir en la factura: \n");     
            System.out.println(CC);
            FF.agregarCliente(CC);
            DD.getFactura();
            System.out.println("Factura impresa! Revise el archivo.");
            break;
        }catch(RuntimeException ex){
        ex.printStackTrace();
     
        }
            break;
    }
            
        }
    }catch(RuntimeException error){
    error.printStackTrace();
    }
    
       
    }//fin del ciclo infinito
    }
}
