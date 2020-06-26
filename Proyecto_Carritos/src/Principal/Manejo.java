/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Productos.VehiculosAereos;
import Productos.SuperVehiculos;
import Productos.VehiculosMaritimos;
import Productos.VehiculosTerrestres;
import Datos.Orden;
/**
 *
 * @author giovani
 */
public class Manejo {
    

    public static void main(String[] args){
   
        
    VehiculosAereos AA = new VehiculosAereos();
    AA.inicializador();
    AA.imprimeTodosAereos();

    VehiculosMaritimos MM = new VehiculosMaritimos();
    MM.inicializador();
    MM.imprimirTodosMaritimos();
    
    VehiculosTerrestres TT = new VehiculosTerrestres();
    TT.inicializador();
    TT.imprimirTodosTerrestres();
    
    TT.getCamaroSS();
    System.out.println("de nada");
    
    Orden DD = new Orden();
    DD.addToOrder(AA.getCessnaSkycatcher());
    DD.addToOrder(AA.getIconA5AmphibiousLightSport());
    DD.addToOrder(TT.getDodgeChallenger());
    DD.addToOrder(MM.getPrincess30m());
    DD.addToOrder(MM.getPrincess30m());
    DD.addToOrder(MM.getPrincess30m());
    DD.addToOrder(MM.getPrincess30m());
    DD.addToOrder(MM.getPrincess30m());
    DD.addToOrder(MM.getPrincess30m());
    DD.addToOrder(MM.getPrincess30m());
      DD.addToOrder(MM.getPrincess30m());
        DD.addToOrder(MM.getPrincess30m());
    System.out.println("RESULTADO DE LA ORDEN");
    System.out.println("RESULTADO DE LA ORDEN");
    System.out.println("RESULTADO DE LA ORDEN");
    
    DD.getOrder();
    
    //System.out.println();
    //DD.fibonacci(5);
    }
}
