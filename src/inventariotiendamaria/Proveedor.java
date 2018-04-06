/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventariotiendamaria;

import java.util.ArrayList;

/**
 *
 * @author Margarita
 */
public class Proveedor {
    
    private ArrayList<String>empesas;
    private String administrador;

    public Proveedor(ArrayList<String> empesas, String administrador) {
        this.empesas = empesas;
        this.administrador = administrador;
    }

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    public ArrayList<String> getEmpesas() {
        return empesas;
    }

    public void setEmpesas(ArrayList<String> empesas) {
        this.empesas = empesas;
    }
    
    
    
}
