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
    private int cilindros;
    private int puertas;
    private String nombre;
    private float tanque;
    private int asientos;
    
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
    
    @Override
    public String toString(){
    
    return "\nVehiculo: " + getNombre() 
            + "\nCentimetros Cubicos: " + getCC() 
            + "\nNumero de Cilindros: " + getCilindros() 
            + "\nTipo de combustible: " + getCombustible() 
            + "\nTamaño del tanque(Galones): " + getCapacidad() 
            + "\nNumero de puertas: " + getPuertas()
            + "\nNumero de asientos: " + getAsientos()
            + "\nPrecio: (Dolares)" + getPrecio();
    }
}
