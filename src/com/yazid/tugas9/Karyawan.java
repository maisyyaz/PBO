package com.yazid.tugas9;

public class Karyawan {
    protected String nama;
    protected double gaDas;
    protected String type;

    public Karyawan(String nama, double gaDas) {
        this.nama = nama;
        this.gaDas = gaDas;
        this.type = "";
    }

    public void display() {
        System.out.println("Nama\t\t\t: " + this.nama);
        System.out.println("Gaji Dasar\t\t: "+this.gaDas);
        if (!this.type.equals("")) {
            System.out.println("Tipe\t\t\t: " + this.type);
        }
    }
}
