package com.yazid.tugas5.bagian1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Luas Lingkaran dari jari-jari lingkaran 7 adalah: " + Lingkaran.getLuas(7f));
        System.out.println("Keliling Lingkaran dari jari-jari lingkaran 7 adalah: " + Lingkaran.getKeliling(7f));
        System.out.println();

        System.out.println("Luas Lingkaran dari jari-jari lingkaran 5.5 adalah: " + Lingkaran.getLuas(5.5f));
        System.out.println("Keliling Lingkaran dari jari-jari lingkaran 5.5 adalah: " + Lingkaran.getKeliling(5.5f));
        System.out.println();

        System.out.println("Luas Lingkaran dari diameter lingkaran 20.4 adalah: " + Lingkaran.getLuas(20.4));
        System.out.println("Keliling Lingkaran dari diameter lingkaran 20.4 adalah: " + Lingkaran.getKeliling(20.4));
    }
}
