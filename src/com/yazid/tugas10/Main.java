package com.yazid.tugas10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String menu, subMenu;
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
                        switch (subMenu) {
                            case "1":
                                Driver.add();
                                break;
                            case "2":
                                Customer.add();
                                break;
                            default:
                                System.out.println("Pilihan tidak ada");
                                break;
                        }
                    } while (!subMenu.equals("3"));
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
                        switch (subMenu) {
                            case "1":
                                Driver.getInfo();
                                break;
                            case "2":
                                Customer.getInfo();
                                break;
                            default:
                                System.out.println("Pilihan tidak ada");
                                break;
                        }
                    } while (!subMenu.equals("3"));
                    break;
                case "3":
                    Driver.topUpCustomer();
                    break;
                case "4":
                    Customer.diantarDriver();
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
