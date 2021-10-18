package com.yazid.tugas5.bagian2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double alas, tinggi, sisi;
        String pilih;

        System.out.println("======================================");
        System.out.println("Aplikasi Luas dan Keliling Segitiga");
        System.out.println("======================================");

        while (true) {
            System.out.println("Menu:\n" +
                    "1. input alas dan tinggi\n" +
                    "2. input alas dan sisi\n" +
                    "3. keluar");
            System.out.print("pilih: ");
            pilih = in.next();
            switch (pilih) {
                case "1":
                    System.out.print("Masukkan alas: ");
                    alas = in.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    tinggi = in.nextDouble();
                    System.out.println("Luas segitiga adalah: " + Segitiga.luasTinggi(alas, tinggi));
                    System.out.println("Keliling segitiga adalah: " + Segitiga.kelilingTinggi(alas, tinggi));
                    break;
                case "2":
                    System.out.print("Masukkan alas: ");
                    alas = in.nextDouble();
                    System.out.print("Masukkan sisi: ");
                    sisi = in.nextDouble();
                    System.out.println("Luas segitiga adalah: " + Segitiga.luasSisi(alas, sisi));
                    System.out.println("Keliling segitiga adalah: " + Segitiga.kelilingSisi(alas, sisi));
                    break;
                case "3":
                    System.exit(0);
            }
        }
    }
}
