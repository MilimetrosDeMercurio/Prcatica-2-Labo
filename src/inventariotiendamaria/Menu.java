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
public class Menu {
    
    private static Menu menu;
    
    private Menu(){
        
    }
    
    public static Menu getInstance(){
        if(menu == null){
            menu = new Menu();
        }
        return menu;
    }
    
    public void opciones(){
        System.out.println("----------- Menu ------------");
        
    }
}
