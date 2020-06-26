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
    System.out.println(arreglo[0]);
    System.out.println(arreglo[1]);
    System.out.println(arreglo[2]);
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
        arreglo[1].setPrecio(10800000);
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
    }
    public VehiculosMaritimos getPrincess30m(){
    return arreglo[2];
    }
    
    @Override
    public String toString(){
    
    return "\nNumero de Habitaciones: " + this.getHabitaciones()
            + super.toString();
    }
}
