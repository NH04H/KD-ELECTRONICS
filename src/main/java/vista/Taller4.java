/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vista;

import controlador.ValidarDatos;
import modelo.Producto;

/**
 *
 * @author Juan Sandoval
 */

public class Taller4 {

    public static void main(String[] args) {
        ValidarDatos controlador = new ValidarDatos();

        controlador.registrarProducto("TV2025", "Televisor SMART", "55 pulgadas, UHD", 1499.99, 1999.99, "Electrodomesticos", 17);
        controlador.registrarProducto("TV2027", "Televisor SMART", "75 pulgadas, 4K", 1999.99, 2499.99, "Electrodomesticos", 8);
        
        controlador.consultarProducto("TV2025");
        
        Producto p = new Producto("TV2025", "Televisor LED", "43 pulgadas, HD", 999.99, 1499.99, "Electrodomesticos", 5);
        
        controlador.actualizarProducto(p);
        
        controlador.eliminarProducto("TV2025");
    }
}
