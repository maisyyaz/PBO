package com.yazid.tugas8;

public class Kontrak extends Karyawan {
    private final int waktu;

    public Kontrak(String nama, double gaDas, int waktu) {
        super(nama, gaDas);
        super.type = "Kontrak";
        this.waktu = waktu;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Waktu\t\t\t: "+this.waktu);
    }
}
