package com.yazid.tugas10;

import com.yazid.assessment1.bagian1.Transaksi;

public class Customer extends Member {
    private double ongkos;
    public Customer(String nik, String nama, String noTelp) {
        super(nik, nama, noTelp, 0);
        addCustomer(this);
    }

    public boolean diantar(Driver driver, double ongkos) {
        if (super.saldo >= saldo) {
            super.saldo -= ongkos;
            driver.saldo += ongkos;
            this.ongkos = ongkos;
            return true;
        }
        return false;
    }

    public void buktiTransaksi(Driver driver) {
        System.out.println("Nama\t: " + super.nama);
        System.out.println("Driver\t: " + driver.nama);
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
}
