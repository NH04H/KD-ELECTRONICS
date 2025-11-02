/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juan Sandoval
 */

public class Producto {
    
    private String codigo;
    private String nombre;
    private String descripcion;
    private double precio_costo; 
    private double precio_venta;
    private String categoria;
    private int cantidad;

    public Producto(String codigo, String nombre, String descripcion,
                    double precio_costo, double precio_venta,
                    String categoria, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_costo = precio_costo;
        this.precio_venta = precio_venta;
        this.categoria = categoria;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio_costo() {
        return precio_costo;
    }

    public void setPrecio_costo(double precio_costo) {
        this.precio_costo = precio_costo;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return "\n-------- PRODUCTO --------" + 
               "\nCódigo: " + codigo +
               "\nNombre: " + nombre +
               "\nDescripción: " + descripcion +
               "\nPrecio Costo: $" + precio_costo +
               "\nPrecio Venta: $" + precio_venta +
               "\nCategoría: " + categoria +
               "\nCantidad Disponible: " + cantidad +
               "\n==========================";
    }
}
