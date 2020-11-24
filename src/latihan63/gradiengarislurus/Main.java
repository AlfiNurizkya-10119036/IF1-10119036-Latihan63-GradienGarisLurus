/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan63.gradiengarislurus;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * Kelas    : IF-1
 * NIM      : 10119036
 * Deskripsi Program : Memasukkan Semua Data
 */
public class Main {

     public static void main(String[] args) {
	    Koordinat koordinat1, koordinat2;
        koordinat1 = new Koordinat(2, 10,5,7);
        System.out.println("Garis yang melalui titik ("+ koordinat1.getX1()+", "+ koordinat1.getY1()+") dan ("+ koordinat1.getX1() +", "+ koordinat1.getX2()+")");
	    System.out.println("memiliki gradien sebesar "+koordinat1.hitungGradien());
	    koordinat2 = new Koordinat(5,1,3,12);
        System.out.println("Garis yang melalui titik ("+ koordinat2.getX1()+", "+ koordinat2.getY1()+") dan ("+ koordinat2.getX1() +", "+ koordinat2.getX2()+")");
        System.out.println("memiliki gradien sebesar "+koordinat2.hitungGradien());
    }
}
