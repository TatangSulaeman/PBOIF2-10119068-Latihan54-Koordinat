/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.koordinat.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan program Koordinat
 * 
 */
public class Main {
    public static void main(String[]args){
        WarnaKoordinat waKor = new WarnaKoordinat(10,4,"Jingga");
        
        System.out.println("Warna Koordinat : " + waKor.getNamaWarna());
        System.out.println("Koordinat Sumbu X : " + waKor.getX() + ", Y : " + waKor.getY());
    }
}
