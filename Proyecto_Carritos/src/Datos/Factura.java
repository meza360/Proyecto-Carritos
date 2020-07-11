/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.io.*;
import Productos.SuperVehiculos;
/**
 *
 * @author giovani
 */
public class Factura {
    private final String RUTA; 
    public Factura(){
    this.RUTA = ".\\dist\\orden.txt";
    }
    
    public void agregarFactura(SuperVehiculos... vehiculo){
        
        try{
        File archivo = new File(RUTA);
        PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
        for(SuperVehiculos producto:vehiculo){
        salida.print("\n"+producto);
        }
        salida.close();
        
        }catch(IOException ex){
        ex.printStackTrace();
        }
    
    }
    
}
