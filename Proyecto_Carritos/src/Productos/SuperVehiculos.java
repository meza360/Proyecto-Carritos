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
* @author GIOVANI DAVID MEZA POGGIO CARNÉ 5990-18-14676
 * @author Wendy Pricila Cifuentes Lutin CARNÉ 5990-18-4413
 */
public class SuperVehiculos {
    private int cc;
    private double precio;
    private String combustible;
    private int cilindros;
    private int puertas;
    private String nombre;
    private float tanque;
    private int asientos;
    private int disponibles;
    
    public SuperVehiculos()
    {
    this.cc = cc;
    this.precio = precio;
    this.combustible = combustible;
    this.cilindros = cilindros;
    this.puertas = puertas;
    this.nombre = nombre;
    this.tanque = tanque;
    this.asientos = asientos;
    
    }
    
    protected void setCC(int cc){
        this.cc = cc;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setCombustible(String combustible){
        this.combustible = combustible;
    }
    public void setCilindros(int cilindros){
        this.cilindros = cilindros;
    }
    public void setPuertas(int puertas){
        this.puertas = puertas;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTanque(float capacidad){
    this.tanque = capacidad;
    }
    public void setAsientos(int asientos){
    this.asientos = asientos;
    }
    public int getCC(){
        return this.cc;
    }
    public double getPrecio(){
        return this.precio;
    }
    public String getCombustible(){
        return this.combustible;
    }
    public int getCilindros(){
        return this.cilindros;
    }
    public int getPuertas(){
        return this.puertas;
    }
    public String getNombre(){
        return this.nombre;
    }
    public float getCapacidad(){
    return this.tanque;
    }
    public int getAsientos(){
    return this.asientos;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }
    
    @Override
    public String toString(){
    
    return "\nVehiculo: " + getNombre() 
            + "\nCentimetros Cubicos: " + getCC() 
            + "\nNumero de Cilindros: " + getCilindros() 
            + "\nTipo de combustible: " + getCombustible() 
            + "\nTamaño del tanque(Galones): " + getCapacidad() 
            + "\nNumero de puertas: " + getPuertas()
            + "\nNumero de asientos: " + getAsientos()
            + "\nPrecio: (Dolares)" + getPrecio()
            + "\nDisponibles: " + getDisponibles();
    }
}
