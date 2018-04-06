/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventariotiendamaria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Margarita
 */
public class ListaProductos {
    
    Scanner scan = new Scanner(System.in);
    private ArrayList <Producto> productos;
    
    public ListaProductos(){
        productos = new ArrayList<Producto>();
    }
    
    public void add(){
        Producto producto = new Producto();
        
        productos.add(producto);
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese nombre del producto");
        System.out.println(": ");
        producto.setNombre(leer.nextLine());
        
        System.out.println("Ingrese cantidad del producto");
        System.out.println(": ");
        producto.setCantidad(scan.nextInt());
        
        System.out.println("Ingrese Precio del producto");
        System.out.println(": ");
     //   producto.setPrecio(scan.next());
    }
}
