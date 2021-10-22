package com.yazid.tugas5.bagian1;

public class Lingkaran {
    private final float PI = 3.14f;
    private final float jariJari;
    private final double diameter;

    public Lingkaran(float jariJari) {
        this.jariJari = jariJari;
        this.diameter = 2 * jariJari;
    }

    public Lingkaran(double diameter) {
        this.diameter = diameter;
        this.jariJari = (float) (diameter / 2);
    }

    public double getLuas() {
        return PI * Math.pow(this.jariJari, 2);
    }

    public double getKeliling() {
        return PI * this.diameter;
    }
}
