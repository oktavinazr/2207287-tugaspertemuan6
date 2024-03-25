/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 * @author Oktavina Zahra R
 */
public class Segitiga {
    //Atribut
    double alas;
    double tinggi;
    double sisi;
    
    //Konstruktor tanpa parameter
    public Segitiga() {
        alas = 1;
        tinggi = 1;
        sisi = 1;
    }
    
    //Konstruktor dengan parameter
    public Segitiga(double alasBaru, double tinggiBaru, double sisiBaru) {
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisi = sisiBaru;
    }
    
    //Method
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    public double getKeliling() {
        return alas + tinggi + sisi;
    }

    public void setAlas(double alasBaru) {
        alas = alasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        tinggi = tinggiBaru;
    }

    public void setSisi(double sisiBaru) {
        sisi = sisiBaru;
    }
}
