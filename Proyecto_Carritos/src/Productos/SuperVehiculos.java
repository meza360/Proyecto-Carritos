/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

/**
 *
 * @author giovani
 */
public class SuperVehiculos {
    private int cc;
    private double precio;
    private String combustible;
    private short cilindros;
    private short puertas;
    private String nombre;
    public SuperVehiculos()
    {
    this.cc = cc;
    this.precio = precio;
    this.combustible = combustible;
    this.cilindros = cilindros;
    this.puertas = puertas;
    this.nombre = nombre;
    
    }
    
    public void setCC(int cc){
        this.cc = cc;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setCombustible(String combustible){
        this.combustible = combustible;
    }
    public void setCilindros(short cilindros){
        this.cilindros = cilindros;
    }
    public void setPuertas(short puertas){
        this.puertas = puertas;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
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
    public short getCilindros(){
        return this.cilindros;
    }
    public short getPuertas(){
        return this.puertas;
    }
    public String getNombre(){
        return this.nombre;
    }
    
}
