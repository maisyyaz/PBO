package com.yazid.tugas10;

import java.util.ArrayList;

public class Member {
    protected String nik, nama, noTelp;
    protected double saldo;
    protected static ArrayList<Driver> dataDriver = new ArrayList<>();
    protected static ArrayList<Customer> dataCustomer = new ArrayList<>();

    public Member(String nik, String nama, String noTelp, double saldo) {
        this.nik = nik;
        this.nama = nama;
        this.noTelp = noTelp;
        this.saldo = saldo;
    }

    protected void info() {
        System.out.println("NIK\t: " + this.nik);
        System.out.println("Nama\t: " + this.nama);
        System.out.println("No Telp\t: " + this.noTelp);
        System.out.println("Saldo\t: " + this.saldo);
    }

    protected void addDriver(Driver driver) {
        dataDriver.add(driver);
    }

    protected void addCustomer(Customer customer) {
        dataCustomer.add(customer);
    }
}
