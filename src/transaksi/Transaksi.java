/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transaksi;

import java.util.ArrayList;
import model.Barang;

/**
 *
 * @author ASUS
 */
public class Transaksi {
    private ArrayList<Barang> daftarBelanja = new ArrayList<>();

    public void tambahBarang(Barang barang){
        daftarBelanja.add(barang);
    }

    public void tampilBelanja(){
        System.out.println("===== DAFTAR BELANJA =====");

        int total = 0;

        for(Barang b : daftarBelanja){
            System.out.println(
                b.getNama() +
                " x " + b.getStok() +
                " = Rp." + (b.getHarga() * b.getStok())
            );

            total += b.getHarga() * b.getStok();
        }

        System.out.println("-------------------------");
        System.out.println("Total : Rp." + total);
    }
    
}
