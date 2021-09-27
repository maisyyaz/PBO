package com.yazid.tugas2.bagian1;

public class Buku {
    private final String isbn;
    private String judul, pengarang;
    private int tahun;
    private double harga;
    private float rating;

    public Buku(String isbn, String judul, String pengarang, int tahun, double harga, float rating) {
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahun = tahun;
        this.harga = harga;
        this.rating = rating;
    }

    public String getIsbn() {
        return isbn;
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

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
