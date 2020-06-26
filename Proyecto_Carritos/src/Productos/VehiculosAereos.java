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
    System.out.println(this.getCessnaSkycatcher());
    System.out.println(this.getIconA5AmphibiousLightSport());
    System.out.println(this.getCessnaTTx());
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
}
