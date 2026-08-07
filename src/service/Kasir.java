/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.Barang;

/**
 *
 * @author ASUS
 */
public class Kasir {
    ArrayList<Barang> daftarBarang = new ArrayList<>();

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public void tampilBarang() {
        for (Barang barang : daftarBarang) {
            barang.tampilkan();
        }
    }
}
