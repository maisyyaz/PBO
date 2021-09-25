package com.yazid.tugas1.bagian2;

public class Buku {
    private String judul, pengarang;
    private double harga;

    public Buku(String judul, String pengarang, double harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void printData() {
        System.out.println("Judul : " + this.getJudul());
        System.out.println("Pengarang : " + this.getPengarang());
        System.out.println("Harga : " + this.getHarga());
        System.out.println();
    }
}
