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
* @author GIOVANI DAVID MEZA POGGIO CARNÉ 5990-18-14676
 * @author Wendy Pricila Cifuentes Lutin CARNÉ 5990-18-4413
 */
public class VehiculosAereos extends SuperVehiculos{
    
    protected VehiculosAereos arreglo[] = new VehiculosAereos[3];
  
    public VehiculosAereos(){
   
    }
    public void inicializador(){
        this.iconA5AmphibiousLightSport();
        this.cessnaSkycatcher();
        this.cessnaTTx();
    }
    public void imprimeTodosAereos(){
    System.out.println("\n\tSeleccionar Vehiculo(1)\n" + arreglo[0]);
    System.out.println("\n\tSeleccionar Vehiculo(2)\n" + arreglo[1]);
    System.out.println("\n\tSeleccionar Vehiculo(3)\n" + arreglo[2]);
    }
    
    
      private void iconA5AmphibiousLightSport(){
        arreglo[0] = new VehiculosAereos();
        arreglo[0].setNombre("Icon A5 Amphibious Light Sport");
        arreglo[0].setCC(3500);
        arreglo[0].setCilindros(10);
        arreglo[0].setCombustible("Gasolina");
        arreglo[0].setTanque(15);
        arreglo[0].setPuertas(2);
        arreglo[0].setAsientos(100);
        arreglo[0].setPrecio(250000);
    }   
      public VehiculosAereos getIconA5AmphibiousLightSport(){
      return (arreglo[0]);
      }
    
      private void cessnaSkycatcher(){
        arreglo[1] = new VehiculosAereos();
        arreglo[1].setNombre("Cessna Skycatcher");
        arreglo[1].setCC(4500);
        arreglo[1].setCilindros(10);
        arreglo[1].setCombustible("Gasolina");
        arreglo[1].setTanque(15);
        arreglo[1].setPuertas(2);
        arreglo[1].setAsientos(6);
        arreglo[1].setPrecio(150000);
      }
      public VehiculosAereos getCessnaSkycatcher(){
      return arreglo[1];
      }
    
      private void cessnaTTx(){
        arreglo[2] = new VehiculosAereos();
        arreglo[2].setNombre("Cessna TTx");
        arreglo[2].setCC(2500);
        arreglo[2].setCilindros(10);
        arreglo[2].setCombustible("Gasolina");
        arreglo[2].setTanque(15);
        arreglo[2].setPuertas(1);
        arreglo[2].setAsientos(6);
        arreglo[2].setPrecio(189000);
      }
      public VehiculosAereos getCessnaTTx(){
      return arreglo[2];
      }
      
      public VehiculosAereos selVehiculo(int a){
      return arreglo[a-1];
      }
}
