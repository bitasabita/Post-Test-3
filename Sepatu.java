/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Tsabitah Kawiswara
 */
public class Sepatu extends Produk {
    private int ukuran;

    public Sepatu(String nama, String merk, String warna, int ukuran) {
        super(nama, merk, warna); // inheritance dari Produk
        this.ukuran = ukuran;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    // Overriding method getDeskripsi()
    @Override
    public String getDeskripsi() {
        return "Sepatu: " + getNama() + " | Merk: " + getMerk() + 
               " | Warna: " + getWarna() + " | Ukuran: " + ukuran;
    }
}

   

