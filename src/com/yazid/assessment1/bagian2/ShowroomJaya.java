package com.yazid.assessment1.bagian2;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowroomJaya {
    private static final ArrayList<Mobil> arrMobil = new ArrayList<>();

    public static void main(String[] args) {
        String menu, merk, tahun;
        int jumlah, stok;
        double harga;

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:\n" +
                    "1. Tambah Mobil\n" +
                    "2. Beli Mobil\n" +
                    "3. Lihat Stok\n" +
                    "4. Keluar");
            System.out.print("pilih: ");
            menu = in.next();
            switch (menu) {
                case "1":
                    System.out.println("Showroom Mobil Jaya - Tambah Mobil");
                    System.out.print("Merk\t\t\t: ");
                    merk = in.next();
                    System.out.print("Tahun Keluaran\t: ");
                    tahun = in.next();
                    System.out.print("Harga\t\t\t: ");
                    harga = in.nextDouble();
                    System.out.print("Stok\t\t\t: ");
                    stok = in.nextInt();
                    tambahMobil(merk, tahun, harga, stok);
                    break;
                case "2":
                    System.out.println("Showroom Mobil Jaya - Pembelian");
                    System.out.print("Merk\t\t\t: ");
                    merk = in.next();
                    System.out.print("Tahun Keluaran\t: ");
                    tahun = in.next();
                    System.out.print("Jumlah\t\t\t: ");
                    jumlah = in.nextInt();
                    beliMobil(merk, tahun, jumlah);
                    break;
                case "3":
                    System.out.println("Showroom Mobil Jaya - Cek Stok");
                    viewStok();
                    break;
                case "4":
                    System.exit(0);
                    break;
            }
        }
    }

    public static void tambahMobil(String merk, String tahun, double harga, int stok) {
        arrMobil.add(new Mobil(merk, tahun, harga, stok));
        System.out.println("Mobil ditambahkan.");
    }

    public static void beliMobil(String merk, String tahun, int jumlah) {
        Mobil tempMobil = null;
        double diskon = 0.0, totalBayar, totalDiskon;
        boolean kosong = true;
        String pesan;

        for (Mobil mobil : arrMobil) {
            if (mobil.getMerk().equalsIgnoreCase(merk)) {
                tempMobil = mobil;
                kosong = false;
            }
        }
        if (kosong) {
            System.out.println("merk tidak ditemukan.");
            return;
        }
        if (tempMobil.getTahunKeluaran().equals(tahun)) {
            if (tempMobil.getStok() > jumlah) {
                if (jumlah == 2) {
                    diskon = 10.0;
                } else if (jumlah > 2) {
                    diskon = 20.0;
                }
                tempMobil.setStok(tempMobil.getStok() - jumlah);
                totalDiskon = (tempMobil.getHarga() * diskon) / 100;
                totalBayar = tempMobil.getHarga() - totalDiskon;
                System.out.println("Merk\t\t\t: " + tempMobil.getMerk());
                System.out.printf("Harga Satuan\t: %.1f%n", tempMobil.getHarga());
                System.out.println("Tahun Keluaran\t: " + tempMobil.getTahunKeluaran());
                System.out.println("Jumlah Beli\t\t: " + jumlah);
                System.out.println("Diskon\t\t\t: " + diskon + " persen");
                System.out.printf("Total Diskon\t: %.1f%n", totalDiskon);
                System.out.printf("Total Bayar\t\t: %.1f%n", totalBayar);
                return;
            } else {
                pesan = "Maaf, Jumlah Stok Tidak Mencukupi";
            }
        } else {
            pesan = "Tahun keluaran mobil tidak ada";
        }
        System.out.println(pesan);
    }

    public static void viewStok() {
        for (Mobil mobil : arrMobil) {
            mobil.displayInfo();
            System.out.println("===============================");
        }
    }
}
