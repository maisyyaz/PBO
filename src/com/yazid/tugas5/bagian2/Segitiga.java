package com.yazid.tugas5.bagian2;

public class Segitiga {
    public static double luasTinggi(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }

    public static double kelilingTinggi(double alas, double tinggi) {
        double sisi = Math.sqrt(Math.pow(alas / 2 ,2) + Math.pow(tinggi, 2));
        return alas + (2 * sisi);
    }

    public static double luasSisi(double alas, double sisi) {
        double tinggi = Math.sqrt((Math.pow(sisi, 2) - Math.pow(alas / 2, 2)));
        return (alas * tinggi) / 2;
    }

    public static double kelilingSisi(double alas, double sisi) {
        return alas + (2 * sisi);
    }
}
