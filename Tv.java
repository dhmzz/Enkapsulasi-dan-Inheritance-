/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko1;

/**
 *
 * @author Dhimaz Nur Ramadhan
 */
public class Tv extends Admin {
    String Jenis;
    @Override
    public float getHarga() {
        return Harga;
    }

    @Override
    public void setHarga(float Harga) {
        this.Harga = Harga;
    }

    @Override
    public int getTotal() {
        return Total;
    }

    @Override
    public void setTotal(int Total) {
        this.Total = Total;
    }

    @Override
    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }
    
    public void Display(){
        System.out.println("-------------------------------------");
        System.out.println("TV yang tersedia di entry(Jenis) : ");
        System.out.println("1.LG       (LED TV)");
        System.out.println("2.Samsung  (LCD TV)");
        System.out.println("3.Mi       (SmartTV)");
    }
}
