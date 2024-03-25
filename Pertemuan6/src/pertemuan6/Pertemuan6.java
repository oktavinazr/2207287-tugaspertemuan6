 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan6;

/**
 * @author Oktavina Zahra R
 */
public class Pertemuan6 {

    public static void main(String[] args) {
        Segitiga segitiga1 = new Segitiga();
        System.out.println("Segitiga 1:");
        System.out.println("Luas = " + segitiga1.getLuas());
        System.out.println("Keliling = " + segitiga1.getKeliling());

        Segitiga segitiga2 = new Segitiga(30, 10, 90);
        System.out.println("\nSegitiga 2:");
        System.out.println("Luas = " + segitiga2.getLuas());
        System.out.println("Keliling = " + segitiga2.getKeliling());

        Segitiga segitiga3 = new Segitiga(20, 30, 60);
        System.out.println("\nSegitiga 3:");
        System.out.println("Luas = " + segitiga3.getLuas());
        System.out.println("Keliling = " + segitiga3.getKeliling());
    }
    
}
