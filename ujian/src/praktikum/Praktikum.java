/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author acer
 */
public class Praktikum {
    private String kode, buku, kondisi;
    private int nominal;

    public Praktikum(String kode, String buku, String kondisi) {
        this.kode = kode;
        this.buku = buku;
        setKondisi(kondisi);
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getBuku() {
        return buku;
    }

    public void setBuku(String buku) {
        this.buku = buku;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
        if (this.kondisi.equals("baik")) {
            this.nominal = 50000;
        } else if (this.kondisi.equals("rusak")) {
            this.nominal = 15000;
        }
    }

    public int getNominal() {
        return nominal;
    }
}
