package com.yazid.tugas1.bagian1;

public class Main {

    public static void main(String[] args) {
        // deklarasi variabel
        Barang barang1, barang2, barang3, barang4;
        double total;

        System.out.println("Konstruktor 2 Parameter");
        System.out.println("------------------------");

        barang1 = new Barang("BRG-001", "Tas Gucci");
        barang1.setHarga(1200);

        barang2 = new Barang("BRG-002", "Printer Epson L355");
        barang2.setHarga(200);

        barang1.printData();
        barang2.printData();

        System.out.println("Konstruktor 3 Parameter");
        System.out.println("------------------------");

        barang3 = new Barang("BRG-003", "Koper", 150);
        barang4 = new Barang("BRG-004", "Helm", 20);

        barang3.printData();
        barang4.printData();

        total = barang1.getHarga() + barang2.getHarga() + barang3.getHarga() + barang4.getHarga();

        System.out.println("total harga adalah: $" + total);
    }
}
