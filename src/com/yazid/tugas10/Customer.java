package com.yazid.tugas10;

import java.util.Scanner;

public class Customer extends Member {
    static Scanner in = new Scanner(System.in);
    private double ongkos;
    private Driver driver;

    public Customer(String nik, String nama, String noTelp, double saldo) {
        super(nik, nama, noTelp, saldo);
        Member.dataCustomer.add(this);
    }

    private boolean diantar(Driver driver, double ongkos) {
        if (super.saldo >= saldo) {
            super.saldo -= ongkos;
            driver.saldo += ongkos;
            this.ongkos = ongkos;
            this.driver = driver;
            return true;
        }
        return false;
    }

    public void buktiTransaksi() {
        System.out.println("Nama\t: " + super.nama);
        System.out.println("Driver\t: " + this.driver.nama);
        System.out.println("Ongkos\t: " + this.ongkos);
        System.out.println("Status\t: Lunas");
        System.out.println("Saldo\t: " + super.saldo);
    }

    @Override
    public void info() {
        super.info();
    }

    public static void infoDriver(Driver driver) {
        System.out.println("NIK\t: " + driver.nik);
        System.out.println("Nama\t: " + driver.nama);
        System.out.println("No Telp\t: " + driver.noTelp);
        System.out.println("Saldo\t: " + driver.saldo);
    }

    protected static Customer select(String name) {
        for (Customer customer: Member.dataCustomer) {
            if (customer.nama.equalsIgnoreCase(name)) {
                return customer;
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
        new Customer(nik, nama, noTelp, saldo);
    }

    public static void getInfo() {
        System.out.println("Info Customer");
        System.out.print("Nama Customer: ");
        String nama = in.next();
        Customer customer = Customer.select(nama);
        if (customer != null) {
            customer.info();
        } else {
            System.out.println("tidak ada Customer");
        }
    }

    public static void diantarDriver() {
        System.out.println("Transaksi Pengantaran");
        System.out.print("Nama Customer: ");
        String nama = in.next();
        Customer customer = Customer.select(nama);
        if (customer != null) {
            System.out.print("Nama Driver: ");
            nama = in.next();
            Driver driver = Driver.select(nama);
            if (driver != null) {
                System.out.print("Ongkos : ");
                double ongkos = in.nextDouble();
                if (customer.diantar(driver, ongkos)) {
                    customer.buktiTransaksi();
                } else {
                    System.out.println("Pengantaran gagal");
                }
            } else {
                System.out.println("tidak ada customer");
            }
        } else {
            System.out.println("tidak ada Driver");
        }
    }
}
