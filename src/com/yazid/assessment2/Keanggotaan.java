package com.yazid.assessment2;

import java.util.ArrayList;

public abstract class Keanggotaan {
    private String nama;
    private String noTelp;
    private String kelas;
    private String angkatan;
    private String divisi;
    protected static ArrayList<Aslab> dataAslab = new ArrayList<>();
    protected static ArrayList<Anggota> dataAnggota = new ArrayList<>();

    protected Keanggotaan(String nama, String noTelp, String kelas, String angkatan, String divisi) {
        this.nama = nama;
        this.noTelp = noTelp;
        this.kelas = kelas;
        this.angkatan = angkatan;
        this.divisi = divisi;
    }

    protected abstract void add();

    protected void info() {
        System.out.println("Nama\t: " + this.nama);
        System.out.println("Kelas\t: " + this.kelas);
        System.out.println("Angkatan\t: " + this.angkatan);
        System.out.println("Divisi\t: " + this.divisi);
        System.out.println("No Telp\t: " + this.noTelp);
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public String getKelas() {
        return kelas;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public String getDivisi() {
        return divisi;
    }

    protected void setNama(String nama) {
        this.nama = nama;
    }

    protected void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    protected void setKelas(String kelas) {
        this.kelas = kelas;
    }

    protected void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    protected void setDivisi(String divisi) {
        this.divisi = divisi;
    }
}
