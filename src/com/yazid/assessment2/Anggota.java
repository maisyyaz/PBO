package com.yazid.assessment2;

import java.util.Scanner;

public class Anggota extends Keanggotaan {
    public Anggota(String nama, String noTelp, String kelas, String angkatan, String divisi) {
        super(nama, noTelp, kelas, angkatan, divisi);
    }

    @Override
    public void info() {
        super.info();
    }

    @Override
    public void add() {
        Keanggotaan.dataAnggota.add(this);
    }

    public static void list() {
        if (!Keanggotaan.dataAnggota.isEmpty()) {
            for (Anggota anggota : Keanggotaan.dataAnggota) {
                System.out.println("Nama\t: " + anggota.getNama());
                System.out.println("Kelas\t: " + anggota.getKelas());
                System.out.println("Angkatan\t: " + anggota.getAngkatan());
                System.out.println("Divisi\t: " + anggota.getDivisi());
                System.out.println("No Telp\t: " + anggota.getNoTelp());
                System.out.println("-----------------------------------");
            }
        } else {
            System.out.println("Tidak ada data Anggota");
        }
    }

    public static void create() {
        String nama, kelas, angkatan, divisi, noTelp, jabatan;
        Scanner in = new Scanner(System.in);

        System.out.print("Nama\t: ");
        nama = in.next();
        System.out.print("Kelas\t: ");
        kelas = in.next();
        System.out.print("Angkatan\t: ");
        angkatan = in.next();
        System.out.print("Divisi\t: ");
        divisi = in.next();
        System.out.print("No Telp\t: ");
        noTelp = in.next();
        new Anggota(nama, noTelp, kelas, angkatan, divisi).add();
    }

    public static Anggota select(String nama) {
        for (Anggota anggota : Keanggotaan.dataAnggota) {
            if (anggota.getNama().equalsIgnoreCase(nama)) {
                return anggota;
            }
        }
        return null;
    }

    public static void update() {
        String nama, kelas, angkatan, divisi, noTelp, jabatan;
        Anggota anggota;
        Scanner in = new Scanner(System.in);

        System.out.print("Nama\t: ");
        nama = in.next();
        anggota = Anggota.select(nama);
        if (anggota != null) {
            System.out.print("Kelas\t: ");
            kelas = in.next();
            System.out.print("Angkatan\t: ");
            angkatan = in.next();
            System.out.print("Divisi\t: ");
            divisi = in.next();
            System.out.print("No Telp\t: ");
            noTelp = in.next();
            System.out.print("Jabatan\t: ");
            jabatan = in.next();
            anggota.setNama(nama);
            anggota.setAngkatan(angkatan);
            anggota.setKelas(kelas);
            anggota.setNoTelp(noTelp);
        } else {
            System.out.println("Data anggota tidak ada");
        }
    }

    public static void delete() {
        String nama;
        Anggota anggota;
        Scanner in = new Scanner(System.in);

        System.out.print("Nama\t: ");
        nama = in.next();
        anggota = Anggota.select(nama);
        if (anggota != null) {
            dataAnggota.remove(anggota);
        } else {
            System.out.println("Data anggota tidak ada");
        }
    }
}
