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
public class Admin {
    private String admin;
    float Harga;
    int Total;
    String Merk;
    
    
    
    public void display(){
        System.out.println("-------------------------------------");
        System.out.println("Smartphone yang tersedia di entry : ");
        System.out.println("1.Mi     QuadCamera(4)");
        System.out.println("2.Realme TripleCamera(3)");
        System.out.println("3.Apple  TripleCamera(3)");
        System.out.println("-------------------------------------");
        System.out.println("TV yang tersedia di entry(Jenis) : ");
        System.out.println("1.LG       (LED TV)");
        System.out.println("2.Samsung  (LCD TV)");
        System.out.println("3.Mi       (SmartTV)");
        System.out.println("-------------------------------------");
        System.out.println("Kipas Angin yang tersedia di entry : ");
        System.out.println("1.LG      5inc");
        System.out.println("2.Samsung 6inc");
        System.out.println("3.Maspion 7inc");
        System.out.println("");
    }
    public void setadmin(String admin){
        this.admin = admin;
       
    }
    public String getadmin(){
        return admin;
    }
    public void setHarga(float Harga){
        this.Harga=Harga;        
    }
    public float getHarga(){
        return Harga;
    }
    public void setTotal(int Total){
        this.Total=Total;
        
    }
    public int getTotal(){
        return Total;
    }
    public void setMerk(String Merk){        
        this.Merk = Merk;
        
    }
    public String getMerk(){
         return Merk;   
    }
}
