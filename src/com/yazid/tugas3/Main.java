package com.yazid.tugas3;

public class Main {
    public static void main(String[] args) {
        Jurusan d3if = new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        d3if.addMahasiswa(new Mahasiswa("6701", "Rendi"));
        d3if.addMahasiswa(new Mahasiswa("6702", "Chaca"));
        d3if.addMahasiswa(new Mahasiswa("6703", "Agus"));

        Jurusan d3si = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");
        d3si.addMahasiswa(new Mahasiswa("6301", "Ridwan"));
        d3si.addMahasiswa(new Mahasiswa("6302", "Siska"));
        d3si.addMahasiswa(new Mahasiswa("6303", "Zayn"));
        d3si.addMahasiswa(new Mahasiswa("63-04", "Rahmat"));

        cetakData(d3if);
        cetakData(d3si);
    }

    static void cetakData(Jurusan jurusan) {
        int i = 0;
        System.out.println("Kode: " + jurusan.getKode());
        System.out.println("Nama: " + jurusan.getNama());
        System.out.println("Daftar mahasiswa:");
        for (Mahasiswa mhs : jurusan.getMhs()) {
            System.out.println("\t"+ (++i) + ". " + mhs.getNim() + " - " + mhs.getNama());
        }
        System.out.println();
    }
}
