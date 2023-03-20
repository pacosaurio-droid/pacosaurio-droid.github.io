/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author denis
 */
public class ProductoClass {
    
    private String nombreProd;
    private double precio;
    
    public ProductoClass(String nombre, double precio) {
        this.nombreProd = nombre;
        this.precio = precio;
    }
    
    // getters y setters
    public String getNombre() {
        return nombreProd;
    }

    public void setNombre(String nombre) {
        this.nombreProd = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
