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

/**
 *
 * @author GIOVANI DAVID MEZA POGGIO CARNÉ 5990-18-14676 SECCION A
 * @author Wendy Pricila Cifuentes Lutin CARNÉ 5990-18-4413 SECCION A
 * @author Flor Eunice Garcia Ajquil CARNÉ 5990-18-9172 SECCION A
 */
public class Clientes {
    //
    private String nombre;
    private String lugar;
    private String nit;
    private String telefono;
    //constructor 
    public Clientes(){
    this.nombre = nombre;
    this.lugar = lugar;
    this.nit = nit;
    this.telefono = telefono;
    }
    
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    public String getNombre(){
    return this.nombre;
    }
    
    public void setLugar(String direccion){
    this.lugar = direccion;
    }
    public String getLugar(){
    return lugar;
    }
    
    public void setNIT(String nit){
    this.nit = nit;
    }
    
    public String getNIT(){
    return nit;
    }
    
    public void setTelefono(String Telefono){
    this.telefono = Telefono;
    }
    public String getTelefono(){
    return telefono;
    }

    /**
    *toString method has been override 
    *so there's no need to make extra parse on info
    *to get it printed as text on any call
    */
    @Override
    public String toString(){
    return "\nNombre: " + this.getNombre()
            + "\nTelefono: " + this.getTelefono()
            + "\nNIT: " + this.getNIT()
            + "\nDireccion: " + this.getLugar();
    }

}
