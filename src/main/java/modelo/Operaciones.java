/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

//import controlador.ValidarDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Juan Sandoval
 */

public class Operaciones {
    
    public boolean agregar(Producto p) {
        String sql = "INSERT INTO productos (codigo, nombre, descripcion, precio_costo, precio_venta, categoria, cantidad)"
                   + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.getCodigo());
            stmt.setString(2, p.getNombre());
            stmt.setString(3, p.getDescripcion());
            stmt.setDouble(4, p.getPrecio_costo());
            stmt.setDouble(5, p.getPrecio_venta());
            stmt.setString(6, p.getCategoria());
            stmt.setInt(7, p.getCantidad());

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error: No fue posible agregar el producto! " + e.getMessage());
            return false;
        }
    }
    
    public Producto consultar(String codigo) {
        String sql = "SELECT * FROM productos WHERE codigo = ?";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, codigo);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Producto(
                    rs.getString("codigo"),
                    rs.getString("nombre"),
                    rs.getString("descripcion"),
                    rs.getDouble("precio_costo"),
                    rs.getDouble("precio_venta"),
                    rs.getString("categoria"),
                    rs.getInt("cantidad")
                );
            }

        } catch (SQLException e) {
            System.out.println("Error: No se encuentran coincidencias con ese producto! " + e.getMessage());
        }
        return null;
    }
    
    public boolean actualizar(Producto p) {
        String sql = "UPDATE productos SET nombre = ?, descripcion = ?, precio_costo = ?, precio_venta = ?, categoria = ?, cantidad = ? WHERE codigo = ?";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.getNombre());
            stmt.setString(2, p.getDescripcion());
            stmt.setDouble(3, p.getPrecio_costo());
            stmt.setDouble(4, p.getPrecio_venta());
            stmt.setString(5, p.getCategoria());
            stmt.setInt(6, p.getCantidad());
            stmt.setString(7, p.getCodigo());

            int filas = stmt.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            System.out.println("Error: No se pudo actualizar el producto! " + e.getMessage());
            return false;
        }
    }
    
    public boolean eliminar(String codigo) {
        String sql = "UPDATE productos SET cantidad = 0 WHERE codigo = ?";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, codigo);
            int filas = stmt.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            System.out.println("Error: Producto NO disponible!" + e.getMessage());
            return false;
        }
    }
}
