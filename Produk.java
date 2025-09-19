/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Tsabitah Kawiswara
 */
public class Produk {
    private String nama;
    private String merk;
    private String warna;

    public Produk(String nama, String merk, String warna) {
        this.nama = nama;
        this.merk = merk;
        this.warna = warna;
    }

    // Getter & Setter (Encapsulation)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Method yang bisa dioverride
    public String getDeskripsi() {
        return "Produk: " + nama + " | Merk: " + merk + " | Warna: " + warna;
    }

    @Override
    public String toString() {
        return getDeskripsi();
    }
}
    



