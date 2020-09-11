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

/**
 *
 * @author GIOVANI DAVID MEZA POGGIO CARNÉ 5990-18-14676 SECCION A
 * @author Wendy Pricila Cifuentes Lutin CARNÉ 5990-18-4413 SECCION A
 * @author Flor Eunice Garcia Ajquil CARNÉ 5990-18-9172 SECCION A
 */
public class VehiculosMaritimos extends SuperVehiculos{
    protected VehiculosMaritimos arreglo[] = new VehiculosMaritimos[3];
    private int habitaciones;
    
    protected void setHabitaciones(int habitaciones){
        this.habitaciones = habitaciones;
    }
    public int getHabitaciones(){
    return this.habitaciones;
    }
            
    public VehiculosMaritimos(){}
    
    public void inicializador(){
    this.benetti122();
    this.princess30m();
    this.sunSeeker116();
    }
    
    public void imprimirTodosMaritimos(){
    System.out.println("\n\tSeleccionar Vehiculo(1)\n"+arreglo[0]);
    System.out.println("\n\tSeleccionar Vehiculo(2)\n"+arreglo[1]);
    System.out.println("\n\tSeleccionar Vehiculo(3)\n"+arreglo[2]);
    }
    
    protected void benetti122(){
        arreglo[0] = new VehiculosMaritimos();
        arreglo[0].setNombre("Benetti 122");
        arreglo[0].setCC(6000);
        arreglo[0].setCilindros(24);
        arreglo[0].setCombustible("Diesel");
        arreglo[0].setTanque(50);
        arreglo[0].setPuertas(6);
        arreglo[0].setAsientos(100);
        arreglo[0].setHabitaciones(4);
        arreglo[0].setPrecio(9500000);
        arreglo[0].setDisponibles(12);
    }
    public VehiculosMaritimos getBenetti122(){
    return arreglo[0];
    }
    
    protected void sunSeeker116(){
        arreglo[1] = new VehiculosMaritimos();
        arreglo[1].setNombre("Sun Seeker 116");
        arreglo[1].setCC(6000);
        arreglo[1].setCilindros(24);
        arreglo[1].setCombustible("Diesel");
        arreglo[1].setTanque(50);
        arreglo[1].setPuertas(6);
        arreglo[1].setAsientos(100);
        arreglo[1].setHabitaciones(6);
        arreglo[1].setPrecio(1080000);
        arreglo[1].setDisponibles(6);
    }
    public VehiculosMaritimos getSunSeekere116(){
    return arreglo[1];
    }
    
    protected void princess30m(){
        arreglo[2] = new VehiculosMaritimos();
        arreglo[2].setNombre("Princess 30M");
        arreglo[2].setCC(4000);
        arreglo[2].setCilindros(24);
        arreglo[2].setCombustible("Diesel");
        arreglo[2].setTanque(25);
        arreglo[2].setPuertas(8);
        arreglo[2].setAsientos(120);
        arreglo[2].setHabitaciones(8);
        arreglo[2].setPrecio(7500000);
        arreglo[2].setDisponibles(9);
    }
    public VehiculosMaritimos getPrincess30m(){
    return arreglo[2];
    }
    
    public VehiculosMaritimos selVehiculo(int a){
    return arreglo[a-1];
    }
    
    @Override
    public String toString(){
    
    return super.toString() +
            "\nNumero de Habitaciones: " + this.getHabitaciones();
    }
}
