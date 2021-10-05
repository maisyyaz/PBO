package com.yazid.tugas2.bagian1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Buku> buku = new ArrayList<>();
    static ArrayList<String> error = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("========================");
        System.out.println("APLIKASI PENDATAAN BUKU");
        System.out.println("========================");

        while (true) {
            System.out.println("menu:\n" +
                    "1. Tambah Data Buku\n" +
                    "2. Ubah Data Buku\n" +
                    "3. Hapus Data Buku\n" +
                    "4. Lihat Semua Buku\n" +
                    "5. Cari Buku\n" +
                    "6. Keluar\n");
            String menu = input("Pilih menu: ");
            switch (menu) {
                case "1":
                    do {
                        String isbn = input("ISBN: ");
                        String judul = input("Judul: ");
                        String pengarang = input("Pengarang: ");
                        int tahun = inputInt("Tahun: ");
                        double harga = inputDouble("Harga: ");
                        float rating = inputFloat("Rating: ");
                        if (!error.isEmpty()) {
                            System.out.println("Harap masukkan data dengan benar");
                            cetakError();
                            error = new ArrayList<>();
                        } else {
                            tambahBuku(isbn, judul, pengarang, tahun, harga, rating);
                        }
                        if (!ulang()) {
                            break;
                        }
                    } while (error != null);
                    break;
                case "2":
                    do {
                        String isbn = input("ISBN: ");
                        if (cekISBN(isbn) == null) {
                            print("Buku tidak ada");
                            break;
                        }
                        String judul = input("Judul: ");
                        String pengarang = input("Pengarang: ");
                        int tahun = inputInt("Tahun: ");
                        double harga = inputDouble("Harga: ");
                        float rating = inputFloat("Rating: ");
                        if (!error.isEmpty()) {
                            System.out.println("Harap masukkan data dengan benar");
                            cetakError();
                            error = new ArrayList<>();
                        } else {
                            ubahBuku(isbn, judul, pengarang, tahun, harga, rating);
                        }
                        if (!ulang()) {
                            break;
                        }
                    } while (error != null);
                    break;
                case "3":
                    do {
                        String isbn = input("ISBN buku: ");
                        hapusData(isbn);
                        if (!error.isEmpty()) {
                            cetakError();
                            error = new ArrayList<>();
                        }
                        System.out.println("menu:\n" +
                                "1. Hapus lagi\n" +
                                "2. Ke Menu\n");
                        menu = input("Pilih menu: ");
                    } while (!menu.equals("2"));
                    break;
                case "4":
                    cetakSemuaData();
                    do {
                        System.out.println("menu:\n" +
                                "1. Ke Menu\n");
                        menu = input("Pilih menu: ");
                    } while (!menu.equals("1"));
                    break;
                case "5":
                    do {
                        String isbn = input("ISBN buku: ");
                        cetakData(isbn);
                        if (!error.isEmpty()) {
                            cetakError();
                            error = new ArrayList<>();
                        }
                        System.out.println("menu:\n" +
                                "1. Ulang\n" +
                                "2. Ke Menu\n");
                        menu = input("Pilih menu: ");
                    } while (!menu.equals("2"));
                    break;
                case "6":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak ada");
                    break;
            }
        }
    }

    static void cetakError() {
        for (String e : error) {
            System.out.println(e);
        }
    }

    static boolean ulang() {
        String menu;
        do {
            System.out.println("menu:\n" +
                    "1. Ulang\n" +
                    "2. Ke Menu\n");
            menu = input("Pilih menu: ");
        } while (!menu.equals("1") && !menu.equals("2"));
        return !menu.equals("2");
    }

    static String input(String text) {
        Scanner in = new Scanner(System.in);
        System.out.print(text);
        return in.next();
    }

    static int inputInt(String text) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print(text);
            return in.nextInt();
        } catch (Exception e) {
            error.add(text + " tipe data tidak sesuai");
            return 0;
        }
    }

    static double inputDouble(String text) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print(text);
            return in.nextDouble();
        } catch (Exception e) {
            error.add(text + " tipe data tidak sesuai");
            return 0;
        }
    }

    static float inputFloat(String text) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print(text);
            return in.nextFloat();
        } catch (Exception e) {
            error.add(text + " tipe data tidak sesuai");
            return 0;
        }
    }

    static void tambahBuku(String isbn, String judul, String pengarang, int tahun, double harga, float rating) {
        Buku b = cekISBN(isbn);
        if (b != null) {
            error.add("buku sudah ada");
            return;
        }
        buku.add(new Buku(isbn, judul, pengarang, tahun, harga, rating));
    }

    static Buku cekISBN(String isbn) {
        for (Buku b : buku) {
            if (b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        error.add("tidak ada buku");
        return null;
    }

    static void ubahBuku(String isbn, String judul, String pengarang, int tahun, double harga, float rating) {
        Buku b = cekISBN(isbn);
        if (!judul.equals("")) {
            b.setJudul(judul);
        }
        if (!pengarang.equals("")) {
            b.setPengarang(pengarang);
        }
        if (tahun != 0) {
            b.setTahun(tahun);
        }
        if (harga != 0) {
            b.setHarga(harga);
        }
        if (rating != 0) {
            b.setRating(rating);
        }
    }

    static void hapusData(String isbn) {
        Buku b = cekISBN(isbn);
        buku.remove(b);
    }

    static void cetakSemuaData() {
        for (Buku b : buku) {
            System.out.println("ISBN: " + b.getIsbn());
            System.out.println("Judul Buku: " + b.getJudul());
            System.out.println("Pengarang Buku: " + b.getPengarang());
            System.out.println("Tahun Terbit: " + b.getTahun());
            System.out.println("Harga Buku: " + b.getHarga());
            System.out.println("Rating Buku: " + b.getRating());
            System.out.println();
        }
    }

    static void cetakData(String isbn) {
        Buku b = cekISBN(isbn);
        System.out.println("ISBN: " + b.getIsbn());
        System.out.println("Judul Buku: " + b.getJudul());
        System.out.println("Pengarang Buku: " + b.getPengarang());
        System.out.println("Tahun Terbit: " + b.getTahun());
        System.out.println("Harga Buku: " + b.getHarga());
        System.out.println("Rating Buku: " + b.getRating());
    }
    
    static void print(String text) {
        System.out.println(text);
    }
}
