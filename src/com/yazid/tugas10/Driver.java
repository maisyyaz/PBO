package com.yazid.tugas10;

public class Driver extends Member {
    private final String platNomor;
    private final String jenis;

    public Driver(String nik, String nama, String noTelp, double saldo, String platNomor, String jenis) {
        super(nik, nama, noTelp, saldo);
        this.platNomor = platNomor;
        this.jenis = jenis;
        super.addDriver(this);
    }

    public boolean topUp(Customer customer, double saldo) {
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

    public void infoCustomer(Customer customer) {
        System.out.println("NIK\t: " + customer.nik);
        System.out.println("Nama\t: " + customer.nama);
        System.out.println("No Telp\t: " + customer.noTelp);
        System.out.println("Saldo\t: " + customer.saldo);
    }

    public static Driver select(String name) {
        for (Driver driver: Member.dataDriver) {
            if (driver.nama.equalsIgnoreCase(name)) {
                return driver;
            }
        }
        return null;
    }
}
