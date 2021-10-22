package com.yazid.tugas5.bagian1;

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(7f);
        System.out.println("Luas Lingkaran dari jari-jari lingkaran 7 adalah: " + lingkaran1.getLuas());
        System.out.println("Keliling Lingkaran dari jari-jari lingkaran 7 adalah: " + lingkaran1.getKeliling());
        System.out.println();

        Lingkaran lingkaran2 = new Lingkaran(5.5f);
        System.out.println("Luas Lingkaran dari jari-jari lingkaran 5.5 adalah: " + lingkaran2.getLuas());
        System.out.println("Keliling Lingkaran dari jari-jari lingkaran 5.5 adalah: " + lingkaran2.getKeliling());
        System.out.println();

        Lingkaran lingkaran3 = new Lingkaran(20.4);
        System.out.println("Luas Lingkaran dari diameter lingkaran 20.4 adalah: " + lingkaran3.getLuas());
        System.out.println("Keliling Lingkaran dari diameter lingkaran 20.4 adalah: " + lingkaran3.getKeliling());
    }
}
