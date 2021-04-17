/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko1;

import java.util.Scanner;

/**
 *
 * @author Dhimaz Nur Ramadhan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner in = new Scanner(System.in);
    Admin a = new Admin();
    SmartPhone hp = new SmartPhone();
    Tv tv = new Tv();
    KipasAngin ka = new KipasAngin();
    
    
    System.out.println("-------------ADMIN-----------------");
    System.out.println("1.Smartphone");
    System.out.println("2.Televisi");
    System.out.println("3.Kipas Angin");
    System.out.print("Barang yang dibeli customer(Input angka) : ");
    int pilih = in.nextInt();
    
        switch (pilih) {
            case 1:
                hp.Display();
                hp.setMerk("Mi");
                hp.setJmlkamera("Quadcamera");
                hp.setHarga(2000000);
                hp.setTotal(2000000*1);//Dikali dengan jumlah pesanan
                System.out.println("--------------------------------------");
                System.out.println("Pilihan Customer ");
                System.out.println("Merk HP      : "+hp.getMerk());
                System.out.println("Jenis Kamera : "+hp.getJmlkamera());
                System.out.println("Harga        : "+hp.getHarga());
                System.out.println("Total        : "+hp.getTotal());    
                break;
            case 2:
                tv.Display();
                tv.setMerk("LG");
                tv.setJenis("LED TV");
                tv.setHarga(2500000);
                tv.setTotal(2000000*1);//Dikali dengan jumlah pesanan
                System.out.println("--------------------------------------");
                System.out.println("Pilihan Customer ");
                System.out.println("Merk TV      : "+tv.getMerk());
                System.out.println("Jenis TV     : "+tv.getJenis());
                System.out.println("Harga        : "+tv.getHarga());
                System.out.println("Total        : "+tv.getTotal());
                break;
            case 3:
                ka.Display();
                ka.setMerk("LG");
                ka.setUkuran(5);
                ka.setHarga(500000);
                ka.setTotal(500000*1);//Dikali dengan jumlah pesanan
                System.out.println("--------------------------------------");
                System.out.println("Pilihan Customer ");
                System.out.println("Merk Kipas   : "+ka.getMerk());
                System.out.println("Ukuran Kipas : "+ka.getUkuran());
                System.out.println("Harga        : "+ka.getHarga()); 
                System.out.println("Total        : "+ka.getHarga());
                break;
            default:
                break;
        }
    }  
}
