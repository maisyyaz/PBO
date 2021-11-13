package com.yazid.tugas8;

public class Main {
    public static void main(String[] args) {
        Departemen departemen = new Departemen("IF");

        departemen.addKaryawan(new Tetap("Yazid", 10, 10));
        departemen.addKaryawan(new Tetap("Arief", 10, 5));
        departemen.addKaryawan(new Kontrak("Chandra", 9, 8));
        departemen.addKaryawan(new Tetap("Wanda", 9, 5));
        departemen.addKaryawan(new Kontrak("Andi", 7, 6));
        departemen.addKaryawan(new Tetap("Nurul", 6, 9));
        departemen.addKaryawan(new Tetap("Naufal", 9, 7));
        departemen.addKaryawan(new Kontrak("Dafa", 5, 8));

        departemen.displayKontrak();
        System.out.println("=========================");
        departemen.displayTetap();
        System.out.println("=========================");
        departemen.displayAll();
    }
}
