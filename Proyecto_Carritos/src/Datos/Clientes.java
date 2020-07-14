/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author giovani
 */
public class Clientes {
    //
    private String nombre;
    private String lugar;
    private int nit;
    private int telefono;
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
    
    public void setNIT(int nit){
    this.nit = nit;
    }
    
    public int getNIT(){
    return nit;
    }
    
    public void setTelefono(int Telefono){
    this.telefono = Telefono;
    }
    public int getTelefono(){
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
