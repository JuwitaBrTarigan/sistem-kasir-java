/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Barang {

    private String kode;
    private String nama;
    private int stok;
    private double harga;

    public Barang(String kode, String nama, int stok, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public double getHarga() {
        return harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void tampilkan() {
        System.out.println("Kode  : " + kode);
        System.out.println("Nama  : " + nama);
        System.out.println("Stok  : " + stok);
        System.out.println("Harga : Rp" + harga);
        System.out.println("----------------------");
    }
}