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
public class Factura extends Clientes{
    public Factura(){}
    private Clientes CC = new Clientes();
    private Orden OO = new Orden();
    
    public void imprimirFactura(){
    System.out.println("Datos del Cliente ######");
    System.out.println(CC);
    System.out.println("Datos de la orden ######");
    System.out.println(OO);
    }
    
}
