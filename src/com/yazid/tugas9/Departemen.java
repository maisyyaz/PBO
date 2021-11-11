package com.yazid.tugas9;

public class Departemen {
    private final String nama;
    private final Karyawan[] kar = new Karyawan[10];
    private int index = 0;

    public Departemen(String nama) {
        this.nama = nama;
    }

    public void addKaryawan(Karyawan k) {
        if (this.index < kar.length) {
            kar[this.index] = k;
            this.index++;
        }
        System.out.println("Tambah Karyawan Penuh");
    }

    public void displayAll() {
        System.out.println("Departemen\t\t: " + this.nama);
        System.out.println("------------------------------");
        for (Karyawan k : kar) {
            if (k != null) {
                k.display();
                System.out.println("------------------------------");
            } else {
                return;
            }
        }
    }
}
