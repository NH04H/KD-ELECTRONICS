/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juan Sandoval
 */

public class ValidarCampo {
    
    public static boolean validarCodigo(String codigo) {
        return codigo.matches("^[A-Z]{2}[0-9]{4}$");
    }

    public static boolean validarNombre(String nombre) {
        return nombre.matches("^[a-zA-Z0-9\\s ]{3,50}$");
    }

    public static boolean validarDescripcion(String descripcion) {
        return descripcion.matches("^[a-zA-Z0-9\\s .,-]{10,250}$");
    }

    public static boolean validarPrecio(String precio) {
        return precio.matches("^[0-9]+(\\.\\d{1,2})?$");
    }

    public static boolean validarCategoria(String categoria) {
        return categoria.matches("^[a-zA-Z\\s]{3,30}$");
    }

    public static boolean validarCantidad(String cantidad) {
        return cantidad.matches("^[0-9]+$");
    }
}
