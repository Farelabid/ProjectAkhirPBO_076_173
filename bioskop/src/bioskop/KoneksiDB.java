/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bioskop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Acer
 */
public class KoneksiDB {

    public static Connection getKoneksi(){
        Connection koneksi = null;
        
        String url = "jdbc:mysql://localhost:3306/bioskop24";
        String username = "root";
        String password = "";
        
        try {
            koneksi = DriverManager.getConnection(url, username, password);
            System.out.println("Koneksi sukses!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal! Error: " + e.getMessage());
        }
        
        return koneksi;
    }
    
}
