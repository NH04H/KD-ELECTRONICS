/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Producto;
import modelo.Operaciones;
import modelo.ValidarCampo;

/**
 *
 * @author Juan Sandoval
 */

public class ValidarDatos {
    
    private Operaciones dao = new Operaciones();
    
    public void registrarProducto(String codigo, String nombre, String descripcion,
                                  double precio_costo, double precio_venta,
                                  String categoria, int cantidad) {
        
        boolean valido = ValidarCampo.validarCodigo(codigo) &&
                         ValidarCampo.validarNombre(nombre) &&
                         ValidarCampo.validarDescripcion(descripcion) &&
                         ValidarCampo.validarPrecio(String.valueOf(precio_costo)) &&
                         ValidarCampo.validarPrecio(String.valueOf(precio_venta)) &&
                         ValidarCampo.validarCategoria(categoria) &&
                         ValidarCampo.validarCantidad(String.valueOf(cantidad));

        if (!valido) {
            System.out.println("Error: Uno o más campos NO cumplen con el formato requerido.");
            return;
        }

        Producto p = new Producto(codigo, nombre, descripcion, precio_costo, precio_venta, categoria, cantidad);
        boolean exito = dao.agregar(p);
        
        if (exito) {
            System.out.println("El registro del Producto fue Exitoso!");
        } else {
            System.out.println("Error: Ya existe un Producto con ese Código!");
        }
    }
    
    public void consultarProducto(String codigo) {
        Producto p = dao.consultar(codigo);
        if (p != null) {
            System.out.println("\nProducto " + codigo + " encontrado: " + p);
        } else {
            System.out.println("\nNO se encontraron coincidencias para el Producto " + codigo);
        }
    }
    
    public void actualizarProducto(Producto p) {
        boolean valido = ValidarCampo.validarCodigo(p.getCodigo()) &&
                         ValidarCampo.validarNombre(p.getNombre()) &&
                         ValidarCampo.validarDescripcion(p.getDescripcion()) &&
                         ValidarCampo.validarPrecio(String.valueOf(p.getPrecio_costo())) &&
                         ValidarCampo.validarPrecio(String.valueOf(p.getPrecio_venta())) &&
                         ValidarCampo.validarCategoria(p.getCategoria()) &&
                         ValidarCampo.validarCantidad(String.valueOf(p.getCantidad()));

        if (!valido) {
            System.out.println("Error: Uno o más campos NO cumplen con el formato requerido.");
            return;
        }
        
        boolean exito = dao.actualizar(p);
        if (exito) {
            System.out.println("\nLa actualización del Producto " + p.getCodigo() + " fue Exitosa!");
        } else {
            System.out.println("\nNO se encontraron coincidencias para el Producto " + p.getCodigo());
        }
    }

    public void eliminarProducto(String codigo) {
        boolean exito = dao.eliminar(codigo);
        if (exito) {
            System.out.println("\nProducto " + codigo + " NO disponible!");
        } else {
            System.out.println("\nProducto " + codigo + " NO disponible!");
        }
    }    
}
