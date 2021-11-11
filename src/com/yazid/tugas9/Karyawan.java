package com.yazid.tugas9;

public class Karyawan {
    protected String nama;
    protected double gaDas;

    public Karyawan(String nama, double gaDas) {
        this.nama = nama;
        this.gaDas = gaDas;
    }

    public void display() {
        System.out.println("Nama\t\t\t: " + this.nama);
        System.out.println("Gaji Dasar\t\t: "+this.gaDas);
    }
}
