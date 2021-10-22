package com.yazid.tugas5.bagian2;

public class Segitiga {
    private final double alas;
    private final double tinggi;
    private final float sisi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = (float) Math.sqrt(Math.pow(alas / 2 ,2) + Math.pow(tinggi, 2));
    }

    public Segitiga(double alas, float sisi) {
        this.alas = alas;
        this.sisi = sisi;
        this.tinggi = Math.sqrt((Math.pow(sisi, 2) - Math.pow(alas / 2, 2)));
    }

    public double getLuas() {
        return (this.alas * this.tinggi) / 2;
    }

    public double getKeliling() {
        return this.alas + (2 * this.sisi);
    }
}
