/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author acer
 */
public class koneksi {
    private String databasename = "2210020077";
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

    public void simpanInformasi(String id_info, String jdl_info, String tgl_info, String info, String alamat_gmb, String id_admin) {
        try {
            String kode = "insert into Informasi (id_info, jdl_info, tgl_info, info, alamat_gmb, id_admin) value(?,?,?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(kode);
            perintah.setString(1, id_info);
            perintah.setString(2, jdl_info);
            perintah.setString(3, tgl_info);
            perintah.setString(4, info);
            perintah.setString(5, alamat_gmb);
            perintah.setString(6, id_admin);
            perintah.executeUpdate();
            System.out.println("Data Informasi Berhasil Disimpan");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void ubahInformasi(String id_info, String jdl_info, String tgl_info, String info, String alamat_gmb, String id_admin) {
        try {
            String kode = "update Informasi set jdl_info=?, tgl_info=?, info=?, alamat_gmb=?, id_admin=? where id_info=?";
            PreparedStatement perintah = koneksidb.prepareStatement(kode);
            perintah.setString(1, jdl_info);
            perintah.setString(2, tgl_info);
            perintah.setString(3, info);
            perintah.setString(4, alamat_gmb);
            perintah.setString(5, id_admin);
            perintah.setString(6, id_info);
            perintah.executeUpdate();
            System.out.println("Data Informasi Berhasil Diubah");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void hapusInformasi(String id_info) {
        try {
            String kode = "delete from Informasi where id_info=?";
            PreparedStatement perintah = koneksidb.prepareStatement(kode);
            perintah.setString(1, id_info);
            perintah.executeUpdate();
            System.out.println("Data Informasi Berhasil Dihapus");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void simpanPesan(String id_pesan, String jdl_pesan, String tgl_pesan, String dari, String email, String pesan, String id_admin) {
        try {
            String kode = "insert into Pesan (id_pesan, jdl_pesan, tgl_pesan, dari, email, pesan, id_admin) value(?,?,?,?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(kode);
            perintah.setString(1, id_pesan);
            perintah.setString(2, jdl_pesan);
            perintah.setString(3, tgl_pesan);
            perintah.setString(4, dari);
            perintah.setString(5, email);
            perintah.setString(6, pesan);
            perintah.setString(7, id_admin);
            perintah.executeUpdate();
            System.out.println("Data Pesan Berhasil Disimpan");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void ubahPesan(String id_pesan, String jdl_pesan, String tgl_pesan, String dari, String email, String pesan, String id_admin) {
        try {
            String kode = "update Pesan set jdl_pesan=?, tgl_pesan=?, dari=?, email=?, pesan=?, id_admin=? where id_pesan=?";
            PreparedStatement perintah = koneksidb.prepareStatement(kode);
            perintah.setString(1, jdl_pesan);
            perintah.setString(2, tgl_pesan);
            perintah.setString(3, dari);
            perintah.setString(4, email);
            perintah.setString(5, pesan);
            perintah.setString(6, id_admin);
            perintah.setString(7, id_pesan);
            perintah.executeUpdate();
            System.out.println("Data Pesan Berhasil Diubah");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void hapusPesan(String id_pesan) {
        try {
            String kode = "delete from Pesan where id_pesan=?";
            PreparedStatement perintah = koneksidb.prepareStatement(kode);
            perintah.setString(1, id_pesan);
            perintah.executeUpdate();
            System.out.println("Data Pesan Berhasil Dihapus");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void simpanAkomodasi(int id_ako, String jdl_ako, String tgl_ako, String info_ako, String alamat_ako, String status, String id_admin) {
        try {
            String kode = "insert into Akomodasi (id_ako, jdl_ako, tgl_ako, info_ako, alamat_ako, status, id_admin) value(?,?,?,?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(kode);
            perintah.setInt(1, id_ako);
            perintah.setString(2, jdl_ako);
            perintah.setString(3, tgl_ako);
            perintah.setString(4, info_ako);
            perintah.setString(5, alamat_ako);
            perintah.setString(6, status);
            perintah.setString(7, id_admin);
            perintah.executeUpdate();
            System.out.println("Data Akomodasi Berhasil Disimpan");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void ubahAkomodasi(int id_ako, String jdl_ako, String tgl_ako, String info_ako, String alamat_ako, String status, String id_admin) {
        try {
            String kode = "update Akomodasi set jdl_ako=?, tgl_ako=?, info_ako=?, alamat_ako=?, status=?, id_admin=? where id_ako=?";
            PreparedStatement perintah = koneksidb.prepareStatement(kode);
            perintah.setString(1, jdl_ako);
            perintah.setString(2, tgl_ako);
            perintah.setString(3, info_ako);
            perintah.setString(4, alamat_ako);
            perintah.setString(5, status);
            perintah.setString(6, id_admin);
            perintah.setInt(7, id_ako);
            perintah.executeUpdate();
            System.out.println("Data Akomodasi Berhasil Diubah");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void hapusAkomodasi(int id_ako) {
        try {
            String kode = "delete from Akomodasi where id_ako=?";
            PreparedStatement perintah = koneksidb.prepareStatement(kode);
            perintah.setInt(1, id_ako);
            perintah.executeUpdate();
            System.out.println("Data Akomodasi Berhasil Dihapus");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void simpanWisata(String id_wisata, String jdl_wisata, String tgl_wisata, String info_wisata, String alamat_wisata, String jns_wisata, String id_admin) {
        try {
            String kode = "insert into wisata (id_wisata, jdl_wisata, tgl_wisata, info_wisata, alamat_wisata, jns_wisata, id_admin) values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement perintah = koneksidb.prepareStatement(kode);
            perintah.setString(1, id_wisata);
            perintah.setString(2, jdl_wisata);
            perintah.setString(3, tgl_wisata);
            perintah.setString(4, info_wisata);
            perintah.setString(5, alamat_wisata);
            perintah.setString(6, jns_wisata);
            perintah.setString(7, id_admin);
            perintah.executeUpdate();
            System.out.println("Data Wisata Berhasil Disimpan");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void ubahWisata(String id_wisata, String jdl_wisata, String tgl_wisata, String info_wisata, String alamat_wisata, String jns_wisata, String id_admin) {
        try {
            String kode = "update wisata set jdl_wisata=?, tgl_wisata=?, info_wisata=?, alamat_wisata=?, jns_wisata=?, id_admin=? where id_wisata=?";
            PreparedStatement perintah = koneksidb.prepareStatement(kode);
            perintah.setString(1, jdl_wisata);
            perintah.setString(2, tgl_wisata);
            perintah.setString(3, info_wisata);
            perintah.setString(4, alamat_wisata);
            perintah.setString(5, jns_wisata);
            perintah.setString(6, id_admin);
            perintah.setString(7, id_wisata);
            perintah.executeUpdate();
            System.out.println("Data Wisata Berhasil Diubah");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void hapusWisata(String id_wisata) {
        try {
            String kode = "delete from wisata where id_wisata=?";
            PreparedStatement perintah = koneksidb.prepareStatement(kode);
            perintah.setString(1, id_wisata);
            perintah.executeUpdate();
            System.out.println("Data Wisata Berhasil Dihapus");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

/*public class koneksi {
    private String databasename="2210020077";
    private String username="root";
    private String password="";
    private String lokasi="jdbc:mysql://localhost/"+databasename;
    public static Connection koneksidb;
    
    public koneksi(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksidb=DriverManager.getConnection(lokasi,username,password);
            System.out.println("Database Terkoneksi");

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void simpanbelajar(String varnik,String varnama, String vartelpon, String varalamat){
        try{
            String kode="insert into belajar (nik,nama,telpon,alamat) value(?,?,?,?)";
            PreparedStatement perintah=koneksidb.prepareStatement(kode);
            perintah.setString(1, varnik);
            perintah.setString(2, varnama);
            perintah.setString(3, vartelpon);
            perintah.setString(4, varalamat);
            perintah.executeUpdate();
            System.out.println("data Berhasil Disimpan");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void ubahbelajar(String varnik,String varnama, String vartelpon, String varalamat){
        try {
            String kode="update belajar set nama=?, telpon=?, alamat=? where nik=? ";
            PreparedStatement perintah=koneksidb.prepareStatement(kode);
            perintah.setString(1, varnama);
            perintah.setString(2, vartelpon);
            perintah.setString(3, varalamat);
            perintah.setString(4, varnik);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
        } catch (Exception e) {
            System.err.println(e.getMessage());
      }
    }
  
    public void hapusbelajar(String varnik){
        try {
            String kode="delete from belajar where nik=?";
            PreparedStatement perintah=koneksidb.prepareStatement(kode);
            perintah.setString(1, varnik);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        } catch (Exception e) {
            System.err.println(e.getMessage());
      }
    }
}*/
