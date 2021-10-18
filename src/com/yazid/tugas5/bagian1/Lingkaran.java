package com.yazid.tugas5.bagian1;

public class Lingkaran {
    private static final float pi = 3.14f;

    public static double luasjariJari(float jariJari) {
        return pi * jariJari * jariJari;
    }

    public static double luasDiameter(double diameter) {
        double jariJari = diameter / 2;
        return pi * jariJari * jariJari;
    }

    public static double kelilingJariJari(float jariJari) {
        return pi * (2 * jariJari);
    }

    public static double kelilingDiameter(double diameter) {
        return pi * diameter;
    }
}
