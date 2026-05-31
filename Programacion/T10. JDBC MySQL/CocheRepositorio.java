package org.example;

import java.sql.*;
import java.util.ArrayList;

public class CocheRepositorio {
    public ArrayList<Coche> obtenerTodos() {
        ArrayList<Coche> lista = new ArrayList<>();

        try (Connection conn = ConexionBD.obtenerConexion()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM coches");

            while (rs.next()) {
                int id = rs.getInt("id");
                String marca = rs.getString("marca");
                int anio = rs.getInt("anio");
                String color = rs.getString("color");

                Coche coche = new Coche(id, marca, anio, color);
                lista.add(coche);
            }
        } catch (Exception e) {
            System.out.println("Error al consultar coches: " + e.getMessage());
        }

        return lista;
    }

    public void insertarCoche(Coche coche) {
        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement ps = conn.prepareStatement("INSERT INTO coches (marca, anio, color) VALUES (?,?,?)")) {

            ps.setString(1, coche.getMarca());
            ps.setInt(2, coche.getAnio());
            ps.setString(3, coche.getColor());

            ps.executeUpdate();

            System.out.println("Coche insertado correctamente");

        } catch (SQLException e) {
            System.out.println("Error al insertar coche: " + e.getMessage());
        }
    }

    public void actualizarCoche(Coche coche) {
        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement ps = conn.prepareStatement("UPDATE coches SET marca = ?, anio = ?, color = ? WHERE id = ?")) {

            ps.setString(1, coche.getMarca());
            ps.setInt(2, coche.getAnio());
            ps.setString(3, coche.getColor());
            ps.setInt(4, coche.getId());

            ps.executeUpdate();

            System.out.println("Coche actualizado correctamente");

        } catch (SQLException e) {
            System.out.println("Error al acualizar coche: " + e.getMessage());
        }
    }

    public void eliminarCoche(int id) {
        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement ps = conn.prepareStatement("DELETE FROM coches WHERE id = ?")) {

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Coche eliminado correctamente");

        } catch (SQLException e) {
            System.out.println("Error al eliminar coche: " + e.getMessage());
        }
    }
}