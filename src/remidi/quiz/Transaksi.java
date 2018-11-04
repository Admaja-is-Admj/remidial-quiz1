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
public class Transaksi {
    private int nomer;
    private int jumlah;
    private Mangga mangga;
    private Pembeli pembeli;

    public Transaksi(int nomer, int jumlah, Mangga mangga, Pembeli pembeli) {
        this.nomer = nomer;
        this.jumlah = jumlah;
        this.mangga = mangga;
        this.pembeli = pembeli;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public Mangga getMangga() {
        return mangga;
    }

    public void setMangga(Mangga mangga) {
        this.mangga = mangga;
    }

    public Pembeli getPembeli() {
        return pembeli;
    }

    public void setPembeli(Pembeli pembeli) {
        this.pembeli = pembeli;
    }
    public float total(){
        return getJumlah()*mangga.getHarga();
    }
    public String tampil(){
       String tampil ="";
       tampil += "Nomor : "+this.nomer;
       tampil += pembeli.info();
       tampil += mangga.info();
       tampil += "Total pembelian: "+total();
       return tampil;
    }
}
