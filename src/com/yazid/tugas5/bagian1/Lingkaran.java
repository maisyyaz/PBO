package com.yazid.tugas5.bagian1;

public class Lingkaran {
    private final static float PI = 3.14f;

    public static double getLuas(float jariJari) {
        return PI * Math.pow(jariJari, 2);
    }

    public static double getLuas(double diameter) {
        float jariJari = (float) (diameter / 2);
        return PI * Math.pow(jariJari, 2);
    }

    public static double getKeliling(float jariJari) {
        double diameter = jariJari * 2;
        return PI * diameter;
    }

    public static double getKeliling(double diameter) {
        return PI * diameter;
    }
}
