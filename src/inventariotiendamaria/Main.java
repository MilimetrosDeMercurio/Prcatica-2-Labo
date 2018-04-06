/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventariotiendamaria;

/**
 *
 * @author Margarita
 */
//Clase Principal
public class Main {

    /**
     * @param args the command line arguments
     */
    //Metodo main (metodo que se ejecuta primero que todo)
    public static void main(String[] args) {
        
        Producto Producto1 = new Producto();
        Producto Producto2;
        Producto2 = new Producto("Pan Bimbo",5,1.50 );
        Producto Producto3 = new Producto("Shampoo Sedal",10, 2.50);
        Producto Producto4 = new Producto("Sopa Maggi",25, 0.75);
        
        System.out.println(Producto1.toString());
        System.out.println(Producto2.toString());
        System.out.println(Producto3.toString());
        System.out.println(Producto4.toString());
        
        //Menu menu = Menu.getInstance();
        
        //menu.mostrar();
        
        
        

        
    }
   
}
