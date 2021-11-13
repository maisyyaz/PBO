package com.yazid.tugas9;

public class Tetap extends Karyawan {
    private final double tuDas;

    public Tetap(String nama, double gaDas, double tuDas) {
        super(nama, gaDas);
        super.type = "Tetap";
        this.tuDas = tuDas;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tunjangan Dasar\t: "+this.tuDas);
    }
}
