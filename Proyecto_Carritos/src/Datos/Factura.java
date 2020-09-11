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
package Datos;
import java.io.*;
import java.util.Scanner;
import Productos.SuperVehiculos;
/**
 *
 * @author GIOVANI DAVID MEZA POGGIO CARNÉ 5990-18-14676
 * @author Wendy Pricila Cifuentes Lutin CARNÉ 5990-18-4413
 */
public class Factura extends Metodo_Pago{
    private Scanner input = new Scanner(System.in);
    private String RUTA; 
    private int opcionPago;
    private double subtotal,total;
    public Factura(){
        this.RUTA = ".\\dist\\orden.txt";
    }
    
    public void setTotal(double total){
    this.total += total;
    }

    public double getTotal() {
        return total;
    }
    
    
    public void agregarCliente(Clientes cliente){
        try{
        File archivo = new File(RUTA);
        PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
        salida.print("\n\tVenta de vehiculos \"LOS MARIANOS\""
        + "\n\t\tZona 6, Chinautla, Guatemala" 
        + "\n\t\tNIT: 5484662-0" 
        + "\n\t\tSujeto a pagos trimestrales ISR" 
        + "\n\t\tDOCUMENTO TRIBUTARIO ELECTRONICO"
        + "\n\t\tAutorizacion No. BB5425-F54545-FDA54564654"
        + "\n\t\t\t\t*-*-*-*--*-*-*"
        + "\n\t\t\t\tDATOS DEL CONSUMIDOR");
        salida.print("\n\n"+cliente);
        salida.print("\n\t\t\t\t*-*-*-*--*-*-*");
        salida.print("\n\t\t\t\tDATOS DE LA COMPRA");
        salida.close();
        }catch(IOException ex){
        ex.printStackTrace();
        }
    }

    public void agregarFactura(SuperVehiculos... vehiculo) throws IOException{
        try{
        File archivo = new File(RUTA);
        PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
        for(SuperVehiculos producto:vehiculo){
        salida.print("\n"+producto);
        }
        salida.close();
        }catch(IOException ex){
        ex.printStackTrace();
        }
        finally{
        File archivo = new File(RUTA);
        PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
        salida.print("\n\n\t\tTotal para esta factura:" + this.total);
        salida.close();
        }
    
    }
   @Override
    public void menuPago(double total){
        this.total = total;
        System.out.println("\tSeleccione el metodo de pago de su preferencia: ");
        System.out.println("\t1. Tarjeta de debito.");
        System.out.println("\t2. Tarjeta de credito.");
        System.out.println("\t3. Efectivo.");
        opcionPago = input.nextInt();
        switch(opcionPago){
            case 1: //opcion 1 pagos
                System.out.println("Inserte la tarjeta por favor.");
                System.out.println("¡Pago procesado!");
                System.out.println("\t\tRevise la bandeja de salida de la impresora por su factura por favor...");
                break;
            case 2:     //opcion 2 pagos
                System.out.println("\t\t\t\tSeleccione una opcion.");
                System.out.println("\t1.Pago contado con tarjeta credito");
                System.out.println("\t2. 3 cuotas");
                System.out.println("\t3. 6 cuotas");
                System.out.println("\t4. 12 cuotas");
                
                //opciones tarjeta de credito
                opcionPago = input.nextInt();
                switch(opcionPago){
                    case 1://opcion 1 tarjeta de credito 
                System.out.println("Inserte la tarjeta por favor.");
                System.out.println("¡Pago procesado!");
                System.out.println("\t\tRevise la bandeja de salida de la impresora por su factura por favor...");
                        break;
                    case 2: //opcion 2 tarjeta de credito
                subtotal = total/3;
                System.out.println("Su total en pagos sera: " + subtotal);
                System.out.println("Inserte la tarjeta por favor.");
                System.out.println("¡Pago procesado!");
                System.out.println("\t\tRevise la bandeja de salida de la impresora por su factura por favor...");
                        break;
                    case 3://opcion 3 tarjeta de credito 
                        subtotal = total/6;
                        System.out.println("Su total en pagos sera: " + subtotal);
                System.out.println("Inserte la tarjeta por favor.");
                System.out.println("¡Pago procesado!");
                System.out.println("\t\tRevise la bandeja de salida de la impresora por su factura por favor...");
                        break;
                    case 4://opcion 4 tarjeta de credito 
                        subtotal = total/12;
                System.out.println("Su total en pagos sera: " + subtotal);
                System.out.println("Inserte la tarjeta por favor.");
                System.out.println("¡Pago procesado!");
                System.out.println("\t\tRevise la bandeja de salida de la impresora por su factura por favor...");
                        break;
                }
                //termina la seccion de pagos con tarjeta de credito
                break;
            case 3://opcion 3 pagos
                System.out.println("El dinero sera recibido por el vendedor.");
                break;
        
        }
    }
}
