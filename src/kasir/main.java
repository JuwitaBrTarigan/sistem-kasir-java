/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasir;

/**
 *
 * @author ASUS
 */

import model.Barang;
import service.Kasir;

public class Main {

    public static void main(String[] args) {

        Kasir kasir = new Kasir();
        
        System.out.println("=== Fitur Barang Versi 2 ===");

        kasir.tambahBarang(new Barang("B001","Indomie",100,3500));
        kasir.tambahBarang(new Barang("B002","Aqua",50,5000));
        kasir.tambahBarang(new Barang("B003","Teh Botol",40,4500));
        kasir.tambahBarang(new Barang("B004","Susu",25,12000));

        kasir.tampilBarang();
    }
}