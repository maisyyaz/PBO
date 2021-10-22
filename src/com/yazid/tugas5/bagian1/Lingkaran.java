package com.yazid.tugas5.bagian1;

public class Lingkaran {
    private final float PI = 3.14f;
    private final float jariJari;

    public Lingkaran(float jariJari) {
        this.jariJari = jariJari;
    }

    public Lingkaran(double diamteter) {
        this.jariJari = (float) (diamteter / 2);
    }

    public double getLuas() {
        return PI * Math.pow(jariJari, 2);
    }

    public double getKeliling() {
        return PI * (2 * jariJari);
    }
}
