/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidi.quiz;

/**
 *
 * @author user
 */
public class TestMangga {
    public static void main(String[] args) {
        Pembeli orang = new Pembeli("Angga");
        Mangga mangga = new Mangga("Manalagi", 10000);
        Transaksi uang = new Transaksi(1, 20, mangga, orang);
        System.out.println(uang.tampil());
        
        Pembeli orang2 = new Pembeli("Aflah");
        Mangga mangga2 = new Mangga("Podang", 5000);
        Transaksi uang2 = new Transaksi(2, 10, mangga2, orang2);
        System.out.println(uang2.tampil());
        
        Pembeli orang3 = new Pembeli("Aditya");
        Mangga mangga3 = new Mangga("Gadung", 15000);
        Transaksi uang3 = new Transaksi(3, 6, mangga3, orang3);
        System.out.println(uang3.tampil());
    }
}
