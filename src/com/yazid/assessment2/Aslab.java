package com.yazid.assessment2;

import java.util.Scanner;

public class Aslab extends Keanggotaan {
    private String jabatan;

    public Aslab(String nama, String noTelp, String kelas, String angkatan, String divisi, String jabatan) {
        super(nama, noTelp, kelas, angkatan, divisi);
        this.jabatan = jabatan;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("jabatan" + this.jabatan);
    }

    @Override
    public void add() {
        Keanggotaan.dataAslab.add(this);
    }

    public static void list() {
        if (!Keanggotaan.dataAslab.isEmpty()) {
            for (Aslab aslab : Keanggotaan.dataAslab) {
                System.out.println("Nama\t: " + aslab.getNama());
                System.out.println("Kelas\t: " + aslab.getKelas());
                System.out.println("Angkatan\t: " + aslab.getAngkatan());
                System.out.println("Divisi\t: " + aslab.getDivisi());
                System.out.println("No Telp\t: " + aslab.getNoTelp());
                System.out.println("-----------------------------------");
            }
        } else {
            System.out.println("Tidak ada data Aslab");
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
        System.out.print("Jabatan\t: ");
        jabatan = in.next();
        new Aslab(nama, noTelp, kelas, angkatan, divisi, jabatan).add();
    }

    public static Aslab select(String nama) {
        for (Aslab aslab : Keanggotaan.dataAslab) {
            if (aslab.getNama().equalsIgnoreCase(nama)) {
                return aslab;
            }
        }
        return null;
    }

    public static void update() {
        String nama, kelas, angkatan, divisi, noTelp, jabatan;
        Aslab aslab;
        Scanner in = new Scanner(System.in);

        System.out.print("Nama\t: ");
        nama = in.next();
        aslab = Aslab.select(nama);
        if (aslab != null) {
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
            aslab.setNama(nama);
            aslab.setAngkatan(angkatan);
            aslab.setKelas(kelas);
            aslab.setDivisi(divisi);
            aslab.setNoTelp(noTelp);
            aslab.setJabatan(jabatan);
        } else {
            System.out.println("Data aslab tidak ada");
        }
    }

    public static void delete() {
        String nama;
        Aslab aslab;
        Scanner in = new Scanner(System.in);

        System.out.print("Nama\t: ");
        nama = in.next();
        aslab = Aslab.select(nama);
        if (aslab != null) {
            dataAslab.remove(aslab);
        } else {
            System.out.println("Data aslab tidak ada");
        }
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
