/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventariotiendamaria;

import java.text.DecimalFormat;

/**
 *
 * @author Margarita
 */
public class Producto {
    
    //Definicion de atributos
    private String Nombre;
    private int Cantidad;
    private double Precio;
    
    //Constructor
    
    public Producto(){}
    
    public Producto(String nom, int cant, double prec){
        
        this.Nombre = nom;
        this.Cantidad = cant;
        this.Precio = prec;
        
        
    }
    
    //Definicion de metodos (funciones)
    
    //Getters y Setters
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public int getCantidad(){
        return Cantidad;
    }
    
    public void setCantidad(int Cantidad){
        this.Cantidad = Cantidad;
    }
    
    public double getPrecio(){
        return Precio;
    }
    
    public void setPrecio(double Precio){
        this.Precio = Precio;
    }
    
     @Override
     public String toString(){
         return "Producto{" + "Nombre=" + Nombre + ", Cantidad=" + Cantidad + ", Precio=" + Precio + '}';
     }
    
     
}
