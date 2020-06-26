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
public class VehiculosTerrestres extends SuperVehiculos{
    public VehiculosTerrestres(){}
    public void inicializador(){
    this.camaroSS();
    this.dodgeChallenger();
    this.shelbyCobra69();
    }
    public void imprimirTodosTerrestres(){
    System.out.println(arreglo[0]);
    System.out.println(arreglo[1]);
    System.out.println(arreglo[2]);
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
    }
    public VehiculosTerrestres getDodgeChallenger(){
    return arreglo[2];
    }
    
}
