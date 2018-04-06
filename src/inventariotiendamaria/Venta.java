/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventariotiendamaria;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Margarita
 */
public class Venta {
    
    private ArrayList<Producto>lista;
    private DecimalFormat precioTotal= new DecimalFormat("#.##");

    public Venta() {
        this.lista= new ArrayList<Producto>();
    }

    public DecimalFormat getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(DecimalFormat precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    
    
    
    
}
