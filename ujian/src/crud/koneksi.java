/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import praktikum.Praktikum;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author acer
 */
public class koneksi {
    private String databasename = "ujian";
    private String username = "root";
    private String password = "";
    private String lokasi = "jdbc:mysql://localhost/" + databasename;
    public static Connection koneksidb;

    public koneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksidb = DriverManager.getConnection(lokasi, username, password);
            System.out.println("Database Terkoneksi");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    private int Nominal(String kondisi) {
        if (kondisi.equalsIgnoreCase("baik")) {
            return 50000;
        } else if (kondisi.equalsIgnoreCase("rusak")) {
            return 15000;
        } else {
            throw new IllegalArgumentException("Kondisi tidak valid");
        }
    }

    public void simpanPraktikum(String kode, String buku, String kondisi) {
        try {
            int nominal = Nominal(kondisi);

            String sql = "INSERT INTO praktikum (kode, buku, kondisi, nominal) VALUES (?, ?, ?, ?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, kode);
            perintah.setString(2, buku);
            perintah.setString(3, kondisi);
            perintah.setInt(4, nominal);
            perintah.executeUpdate();
            System.out.println("Data Praktikum Berhasil Disimpan");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void ubahPraktikum(String kode, String buku, String kondisi) {
        try {
            int nominal = Nominal(kondisi);

            String sql = "UPDATE praktikum SET buku=?, kondisi=?, nominal=? WHERE kode=?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, buku);
            perintah.setString(2, kondisi);
            perintah.setInt(3, nominal);
            perintah.setString(4, kode);
            perintah.executeUpdate();
            System.out.println("Data Praktikum Berhasil Diubah");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void hapusPraktikum(String kode) {
        try {
            String sql = "DELETE FROM praktikum WHERE kode=?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, kode);
            perintah.executeUpdate();
            System.out.println("Data Praktikum Berhasil Dihapus");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
