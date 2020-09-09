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
public class Factura{
    private Scanner input = new Scanner(System.in);
    //private Clientes cliente = new Clientes();
    private final String RUTA; 
    public Factura(){
        this.RUTA = ".\\dist\\orden.txt";
    }
    public void agregarCliente(Clientes cliente){
    
        try{
        File archivo = new File(RUTA);
        PrintWriter salida = new PrintWriter(new FileWriter(archivo,false));
        salida.print("\t\tVenta de vehiculos \"Los Marianos\""
        + "\n\tZona 6, Chinautla, Guatemala" 
        + "\n\tNIT: 5484662-0" 
        + "\n\tSujeto a pagos trimestrales ISR" 
        + "\n\tDOCUMENTO TRIBUTARIO ELECTRONICO"
        + "\n\tAutorizacion No. BB5425-F54545-FDA54564654"
        + "\n\t\t*-*-*-*--*-*-*"
        + "\n\tDATOS DEL CONSUMIDOR");
        salida.print(cliente);
        salida.close();
        }catch(IOException ex){
        ex.printStackTrace();
        }
    }
  
    public void agregarFactura(SuperVehiculos... vehiculo){
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
    
    }
   

}
