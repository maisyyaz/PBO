package com.yazid.assessment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String menu, subMenu;
        String username = "admin", password = "admin", usernameIn, passwordIn;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Username: ");
            usernameIn = in.next();
            System.out.print("Password: ");
            passwordIn = in.next();
            if (!username.equals(usernameIn) && !password.equals(passwordIn)) {
                System.out.println("akun tidak valid");
            }
        } while (!username.equals(usernameIn) && !password.equals(passwordIn));

        while(true) {
            System.out.println("=======================");
            System.out.println("Aplikasi Keanggotaan");
            System.out.println("=======================");
            System.out.println("Menu\n" +
                    "1. Aslab\n" +
                    "2. Anggota\n" +
                    "3. Keluar");
            System.out.print("Pilih: ");
            menu = in.next();
            switch (menu) {
                case "1":
                    System.out.println("==================");
                    System.out.println("Aslab");
                    System.out.println("==================");
                    do {
                        System.out.println("Menu:\n" +
                                "1. Tambah\n" +
                                "2. Lihat\n" +
                                "3. Ubah\n" +
                                "4. Hapus\n" +
                                "5. Kembali");
                        System.out.print("Pilih: ");
                        subMenu = in.next();
                        switch (subMenu) {
                            case "1":
                                Aslab.create();
                                break;
                            case "2":
                                Aslab.list();
                                break;
                            case "3":
                                Aslab.update();
                                break;
                            case "4":
                                Aslab.delete();
                                break;
                            default:
                                System.out.println("Menu tidak ada");
                        }
                    } while (!subMenu.equals("5"));
                    break;
                case "2":
                    System.out.println("==================");
                    System.out.println("Anggota");
                    System.out.println("==================");
                    do {
                        System.out.println("Menu:\n" +
                                "1. Tambah\n" +
                                "2. Lihat\n" +
                                "3. Ubah\n" +
                                "4. Hapus\n" +
                                "5. Kembali");
                        System.out.print("Pilih: ");
                        subMenu = in.next();
                        switch (subMenu) {
                            case "1":
                                Anggota.create();
                                break;
                            case "2":
                                Anggota.list();
                                break;
                            case "3":
                                Anggota.update();
                                break;
                            case "4":
                                Anggota.delete();
                                break;
                            default:
                                System.out.println("Menu tidak ada");
                        }
                    } while (!subMenu.equals("5"));
                    break;
                case "3":
                    System.exit(0);
                default:
                    System.out.println("Menu tidak ada");
                    break;
            }
        }
    }
}
