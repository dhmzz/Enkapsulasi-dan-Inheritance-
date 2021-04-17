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
public class SmartPhone extends Admin {
    String jmlkamera;
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
    public String getJmlkamera() {
        return jmlkamera;
    }
    public void setJmlkamera(String jmlkamera) {
        this.jmlkamera = jmlkamera;
    }
    @Override
    public String getMerk() {
        return Merk;
    }
    @Override
    public void setMerk(String Merk) {
        this.Merk = Merk;
    }
    public void Display(){
         System.out.println("-------------------------------------");
         System.out.println("Smartphone yang tersedia di entry : ");
         System.out.println("1.Mi     QuadCamera(4)");
         System.out.println("2.Realme TripleCamera(3)");
         System.out.println("3.Apple  TripleCamera(3)");
    }
}
