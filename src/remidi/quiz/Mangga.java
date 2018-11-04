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
public class Mangga {
    private String jenis;
    private float harga;

    public Mangga(String jenis, float harga) {
        this.jenis = jenis;
        this.harga = harga;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }
    public String info(){
        String info="";
        info += "Jenis : "+this.jenis;
        info += "Harga : "+this.harga;
        return info;
    }
}
