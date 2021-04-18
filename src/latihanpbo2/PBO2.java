/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo2;

/**
 *
 * @author MOKLET-2
 */
public class PBO2 {
    String nama;
    String warna;
    String vitamin;
    String fungsi;
    
    void wortel(){
        nama = "wortel";
        warna = "oranye";
        vitamin = "vitamin A";
        fungsi = "kesehatan mata";
        
        System.out.println("Buah ini bernama "+nama);
        System.out.println("Wortel berwarna "+warna);
        System.out.println("Wortel mengandung "+vitamin);
        System.out.println("Vitamin A pada wortel berguna untuk "+fungsi);
    }
}
