package com.yazid.tugas9;

public class Main {
    public static void main(String[] args) {
        Departemen departemen = new Departemen("IF");

        departemen.addKaryawan(new Karyawan("Yazid", 10));
        departemen.addKaryawan(new Tetap("Arief", 10, 5));
        departemen.addKaryawan(new Kontrak("Chandra", 9, 8));
        departemen.addKaryawan(new Tetap("Chandra", 9, 8));
        departemen.addKaryawan(new Kontrak("Chandra", 9, 8));
        departemen.addKaryawan(new Kontrak("Chandra", 9, 8));
        departemen.addKaryawan(new Tetap("Chandra", 9, 8));
        departemen.addKaryawan(new Kontrak("Chandra", 9, 8));

        departemen.displayAll();
        departemen.displayKontrak();
        departemen.displayTetap();
    }
}
