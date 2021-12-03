package com.yazid.tugas10;

import java.util.Scanner;

public class Driver extends Member {
    private static Scanner in = new Scanner(System.in);
    private final String platNomor;
    private final String jenis;

    public Driver(String nik, String nama, String noTelp, double saldo, String platNomor, String jenis) {
        super(nik, nama, noTelp, saldo);
        this.platNomor = platNomor;
        this.jenis = jenis;
        Member.dataDriver.add(this);
    }

    private boolean topUp(Customer customer, double saldo) {
        if (super.saldo >= saldo) {
            customer.saldo += saldo;
            super.saldo -= saldo;
            return true;
        }
        return false;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Jenis Kendaraan\t: " + this.jenis);
        System.out.println("Plat Nomor Kendaraan\t: " + this.platNomor);
    }

    public static void infoCustomer(Customer customer) {
        System.out.println("NIK\t: " + customer.nik);
        System.out.println("Nama\t: " + customer.nama);
        System.out.println("No Telp\t: " + customer.noTelp);
        System.out.println("Saldo\t: " + customer.saldo);
    }

    protected static Driver select(String name) {
        for (Driver driver: Member.dataDriver) {
            if (driver.nama.equalsIgnoreCase(name)) {
                return driver;
            }
        }
        return null;
    }

    public static void add() {
        System.out.println("Tambah Driver");
        System.out.print("NIK\t: ");
        String nik = in.next();
        System.out.print("Nama\t: ");
        String nama = in.next();
        System.out.print("No.Telp\t: ");
        String noTelp = in.next();
        System.out.print("Saldo\t: ");
        double saldo = in.nextDouble();
        System.out.print("Plat No.\t: ");
        String platNomor = in.next();
        System.out.print("Jenis Kendaraan\t: ");
        String jenis = in.next();
        new Driver(nik, nama, noTelp, saldo, platNomor, jenis);
    }

    public static void getInfo() {
        System.out.println("Info Driver");
        System.out.print("Nama Driver: ");
        String nama = in.next();
        Driver driver = Driver.select(nama);
        if (driver != null) {
            driver.info();
        } else {
            System.out.println("tidak ada Driver");
        }
    }

    public static void topUpCustomer(){
        System.out.println("Topup saldo");
        System.out.print("Nama Driver: ");
        String nama = in.next();
        Driver driver = Driver.select(nama);
        if (driver != null) {
            System.out.print("Nama Customer: ");
            nama = in.next();
            Customer customer = Customer.select(nama);
            if (customer != null) {
                System.out.print("Saldo : ");
                double saldo = in.nextDouble();
                if (driver.topUp(customer, saldo)) {
                    System.out.println("Topup saldo berhasil");
                } else {
                    System.out.println("Topup saldo gagal");
                }
            } else {
                System.out.println("tidak ada customer");
            }
        } else {
            System.out.println("tidak ada Driver");
        }
    }
}
