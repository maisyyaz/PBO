package com.yazid.tugas1.bagian2;

public class Main {
    public static void main(String[] args) {
        // deklarasi variabel
        Buku buku1, buku2;

        buku1 = new Buku("Harry Potter", "J.K Rowling", 300000);
        buku2 = new Buku("UML", "Ivar Jacobson", 400000);

        buku1.printData();
        buku2.printData();
    }
}
