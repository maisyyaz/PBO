package com.yazid.tugas3;

import java.util.ArrayList;

public class Jurusan {
    private final String kode, nama;
    private final ArrayList<Mahasiswa> mhs;

    public Jurusan(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        mhs = new ArrayList<>();
    }

    public void addMahasiswa(Mahasiswa m) {
        mhs.add(m);
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<Mahasiswa> getMhs() {
        return mhs;
    }
}
