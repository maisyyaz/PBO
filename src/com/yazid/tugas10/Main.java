package com.yazid.tugas10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nik, nama, noTelp, menu, subMenu, jenis;
        double saldo, ongkos;
        Driver driver;
        Customer customer;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:\n" +
                    "1. Tambah Driver/Customer\n" +
                    "2. Info Driver/Customer\n" +
                    "3. Melakukan Topup Saldo\n" +
                    "4. Transaksi Pengantaran\n" +
                    "5. keluar");
            System.out.print("Pilih: ");
            menu = in.next();
            switch (menu) {
                case "1":
                    System.out.println("Tambah Driver/Customer");
                    do {
                        System.out.println("Menu:\n" +
                                "1. Tambah Driver\n" +
                                "2. Tambah Customer\n" +
                                "3. Kembali");
                        System.out.print("Pilih: ");
                        subMenu = in.next();
                        switch (subMenu){
                            case "1":
                                System.out.println("Tambah Driver");
                                System.out.print("NIK\t: ");
                                nik = in.next();
                                System.out.print("Nama\t: ");
                                nama = in.next();
                                System.out.print("No.Telp\t: ");
                                noTelp = in.next();
                                System.out.print("Saldo\t: ");
                                saldo = in.nextDouble();
                                System.out.print("Plat No.\t: ");
                                String platNomor = in.next();
                                System.out.print("Jenis Kendaraan\t: ");
                                jenis = in.next();
                                new Driver(nik, nama, noTelp, saldo, platNomor, jenis);
                                break;
                            case "2":
                                System.out.println("Tambah Customer");
                                System.out.print("NIK\t: ");
                                nik = in.next();
                                System.out.print("Nama\t: ");
                                nama = in.next();
                                System.out.print("No.Telp\t: ");
                                noTelp = in.next();
                                new Customer(nik, nama, noTelp);
                                break;
                            default:
                                System.out.println("Pilihan tidak ada");
                                break;
                        }
                    } while(!subMenu.equals("3"));
                    break;
                case "2":
                    System.out.println("Info Driver/Customer");
                    do {
                        System.out.println("Menu:\n" +
                                "1. Info Driver\n" +
                                "2. Info Customer\n" +
                                "3. Kembali");
                        System.out.print("Pilih: ");
                        subMenu = in.next();
                        switch (subMenu){
                            case "1":
                                System.out.println("Info Driver");
                                System.out.print("Nama Driver: ");
                                nama = in.next();
                                driver = Driver.select(nama);
                                if (driver != null) {
                                    driver.info();
                                } else {
                                    System.out.println("tidak ada Driver");
                                }
                                break;
                            case "2":
                                System.out.println("Info Customer");
                                System.out.print("Nama Customer: ");
                                nama = in.next();
                                customer = Customer.select(nama);
                                if (customer != null) {
                                    customer.info();
                                } else {
                                    System.out.println("tidak ada Customer");
                                }
                                break;
                            default:
                                System.out.println("Pilihan tidak ada");
                                break;
                        }
                    } while(!subMenu.equals("3"));
                    break;
                case "3":
                    System.out.println("Topup saldo");
                    System.out.print("Nama Driver: ");
                    nama = in.next();
                    driver = Driver.select(nama);
                    if (driver != null) {
                        System.out.print("Nama Customer: ");
                        nama = in.next();
                        customer = Customer.select(nama);
                        if (customer != null) {
                            System.out.print("Saldo : ");
                            saldo = in.nextDouble();
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
                    break;
                case "4":
                    System.out.println("Transaksi Pengantaran");
                    System.out.print("Nama Customer: ");
                    nama = in.next();
                    customer = Customer.select(nama);
                    if (customer != null) {
                        System.out.print("Nama Driver: ");
                        nama = in.next();
                        driver = Driver.select(nama);
                        if (driver != null) {
                            System.out.print("Saldo : ");
                            ongkos = in.nextDouble();
                            if (customer.diantar(driver, ongkos)) {
                                customer.buktiTransaksi(driver);
                            } else {
                                System.out.println("Pengantaran gagal");
                            }
                        } else {
                            System.out.println("tidak ada customer");
                        }
                    } else {
                        System.out.println("tidak ada Driver");
                    }
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("pilihan tidak ada");
            }
        }
    }
}
