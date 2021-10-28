package com.yazid.assessment1.bagian1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Transaksi> dataTransaksi = new ArrayList<>();

        dataTransaksi.add(new Transaksi(
                1,
                "Eiger",
                "Bandung Kopo",
                "Dropship1",
                "Surabaya",
                "Bejo",
                "DayeuhKolot",
                "JNE",
                "N0001",
                21000.0,
                40000.0
        ));
        dataTransaksi.add(new Transaksi(
                2,
                "Eiger",
                "Bandung Kopo",
                "Tini",
                "DayeuhKolot",
                "J&T",
                "N0003",
                21000.0,
                40000.0
        ));
        dataTransaksi.add(new Transaksi(
                3,
                "Eiger",
                "Bandung Kopo",
                "Bambang",
                "DayeuhKolot",
                "Pos Indonesia",
                "N0004",
                23000.0
        ));
        dataTransaksi.add(new Transaksi(
                4,
                "Eiger",
                "Bandung Kopo",
                "Dropship2",
                "Pontianak",
                "Joko",
                "DayeuhKolot",
                "siCepat",
                "N0002",
                24000.0
        ));

        for (Transaksi t : dataTransaksi) {
            if (t.isAsuransi() && t.isDropshipper()) {
                System.out.println("Asuransi dan Dropship");
            } else if (t.isDropshipper()) {
                System.out.println("Dropship");
            } else if (t.isAsuransi()) {
                System.out.println("Asuransi");
            } else {
                System.out.println("Normal");
            }
            System.out.println("No Transaksi: " + t.getNoTransaksi());
            System.out.println("No Resi: " + t.getNoResi());
            System.out.println("Nama Eskpedisi: " + t.getNamaEkspedisi());
            System.out.println("Ongkos Kirim: " + t.getOngkosKirim());
            if (t.isDropshipper()) {
                System.out.println("Nama Pengirim: " + t.getNamaPenjualDropshipper());
                System.out.println("Alamat Pengirim: " + t.getAlamatPenjualDropshipper());
            } else {
                System.out.println("Nama Pengirim: " + t.getNamaPenjual());
                System.out.println("Alamat Pengirim: " + t.getAlamatPenjual());
            }
            System.out.println("Nama Penerima: " + t.getNamaPembeli());
            System.out.println("Alamat Penerima: " + t.getAlamatPembeli());
            if (t.isAsuransi()) {
                System.out.println("Nominal Asuransi: " + t.getNominalAsuransi());
            }
            System.out.println("===============================================");
        }
    }
}
