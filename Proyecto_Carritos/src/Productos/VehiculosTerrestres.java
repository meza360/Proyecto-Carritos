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
package Productos;
import java.util.*;
/**
 *
 * @author GIOVANI DAVID MEZA POGGIO CARNÉ 5990-18-14676 SECCION A
 * @author Wendy Pricila Cifuentes Lutin CARNÉ 5990-18-4413 SECCION A
 * @author Flor Eunice Garcia Ajquil CARNÉ 5990-18-9172 SECCION A
 */
public class VehiculosTerrestres extends SuperVehiculos{
    public VehiculosTerrestres(){}
    public void inicializador(){
    this.camaroSS();
    this.dodgeChallenger();
    this.shelbyCobra69();
    }
    public void imprimirTodosTerrestres(){
    System.out.println("\n\tSeleccionar Vehiculo(1)\n"+arreglo[0]);
    System.out.println("\n\tSeleccionar Vehiculo(2)\n"+arreglo[1]);
    System.out.println("\n\tSeleccionar Vehiculo(3)\n"+arreglo[2]);
    }
    
    private VehiculosTerrestres arreglo[] = new VehiculosTerrestres[3];
    
    protected void camaroSS(){
        arreglo[0] = new VehiculosTerrestres();
        arreglo[0].setNombre("Camaro SS");
        arreglo[0].setCC(3500);
        arreglo[0].setCilindros(8);
        arreglo[0].setCombustible("Gasolina");
        arreglo[0].setTanque(12);
        arreglo[0].setPuertas(2);
        arreglo[0].setAsientos(5);
        arreglo[0].setPrecio(88000);
        arreglo[0].setDisponibles(22);
    }
    public VehiculosTerrestres getCamaroSS(){
    return arreglo[0];
    }
    
    protected void shelbyCobra69(){
        arreglo[1] = new VehiculosTerrestres();
        arreglo[1].setNombre("Shelby Cobra \"69");
        arreglo[1].setCC(3500);
        arreglo[1].setCilindros(8);
        arreglo[1].setCombustible("Gasolina");
        arreglo[1].setTanque(15);
        arreglo[1].setPuertas(2);
        arreglo[1].setAsientos(2);
        arreglo[1].setPrecio(150000);
        arreglo[1].setDisponibles(32);
    }
    public VehiculosTerrestres getShelbyCobra69(){
    return arreglo[1];
    }
    
    protected void dodgeChallenger(){
        arreglo[2] = new VehiculosTerrestres();
        arreglo[2].setNombre("Dodge Challenger 79");
        arreglo[2].setCC(3500);
        arreglo[2].setCilindros(8);
        arreglo[2].setCombustible("Gasolina");
        arreglo[2].setTanque(15);
        arreglo[2].setPuertas(2);
        arreglo[2].setAsientos(4);
        arreglo[2].setPrecio(80000);
        arreglo[2].setDisponibles(4);
    }
    
    public VehiculosTerrestres getDodgeChallenger(){
    return arreglo[2];
    }
    
    public VehiculosTerrestres selVehiculo(int a){
    return arreglo[a-1];
    }
    
}
