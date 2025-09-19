/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Tsabitah Kawiswara
 */
    public class Sandal extends Produk {
    private String jenis;

    public Sandal(String nama, String merk, String warna, String jenis) {
        super(nama, merk, warna);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // Overriding method getDeskripsi()
    @Override
    public String getDeskripsi() {
        return "Sandal: " + getNama() + " | Merk: " + getMerk() + 
               " | Warna: " + getWarna() + " | Jenis: " + jenis;
    }
}

