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
import Productos.SuperVehiculos;
import Productos.VehiculosAereos;
import Productos.VehiculosMaritimos;
import Datos.*;
/**
* @author GIOVANI DAVID MEZA POGGIO CARNÉ 5990-18-14676
 * @author Wendy Pricila Cifuentes Lutin CARNÉ 5990-18-4413
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
