package com.yazid.assessment1.bagian1;

public class Transaksi {
    private final String namaPenjual;
    private final String alamatPenjual;
    private final String namaPembeli;
    private final String alamatPembeli;
    private final String namaEkspedisi;
    private final String noResi;
    private String namaPenjualDropshipper;
    private String alamatPenjualDropshipper;
    private final double ongkosKirim;
    private double nominalAsuransi;
    private final int noTransaksi;
    private boolean dropshipper = false, asuransi = false;

    //    normal
    public Transaksi(
            int noTransaksi,
            String namaPenjual,
            String alamatPenjual,
            String namaPembeli,
            String alamatPembeli,
            String namaEkspedisi,
            String noResi,
            double ongkosKirim
    ) {
        this.noTransaksi = noTransaksi;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
        this.ongkosKirim = ongkosKirim;
    }

    //    normal + dropshipper
    public Transaksi(
            int noTransaksi,
            String namaPenjual,
            String alamatPenjual,
            String namaPenjualDropshipper,
            String alamatPenjualDropshipper,
            String namaPembeli,
            String alamatPembeli,
            String namaEkspedisi,
            String noResi,
            double ongkosKirim
    ) {
        this.noTransaksi = noTransaksi;
        this.namaPenjual = namaPenjual;
        this.namaPenjualDropshipper = namaPenjualDropshipper;
        this.alamatPenjual = alamatPenjual;
        this.alamatPenjualDropshipper = alamatPenjualDropshipper;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
        this.ongkosKirim = ongkosKirim;
        this.dropshipper = true;
    }

    //    normal + asuransi
    public Transaksi(
            int noTransaksi,
            String namaPenjual,
            String alamatPenjual,
            String namaPembeli,
            String alamatPembeli,
            String namaEkspedisi,
            String noResi,
            double ongkosKirim,
            double nominalAsuransi
    ) {
        this.noTransaksi = noTransaksi;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
        this.asuransi = true;
        this.nominalAsuransi = nominalAsuransi;
        if (this.nominalAsuransi > 20000) {
            this.ongkosKirim = ongkosKirim - 5000;
        } else {
            this.ongkosKirim = ongkosKirim;
        }
    }

    //  normal + asuransi + dropshipper
    public Transaksi(
            int noTransaksi,
            String namaPenjual,
            String alamatPenjual,
            String namaPenjualDropshipper,
            String alamatPenjualDropshipper,
            String namaPembeli,
            String alamatPembeli,
            String namaEkspedisi,
            String noResi,
            double ongkosKirim,
            double nominalAsuransi
    ) {
        this.noTransaksi = noTransaksi;
        this.namaPenjual = namaPenjual;
        this.namaPenjualDropshipper = namaPenjualDropshipper;
        this.alamatPenjual = alamatPenjual;
        this.alamatPenjualDropshipper = alamatPenjualDropshipper;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
        this.ongkosKirim = ongkosKirim;
        this.nominalAsuransi = nominalAsuransi;
        this.asuransi = true;
        this.dropshipper = true;
    }

    public String getNamaPenjual() {
        return namaPenjual;
    }

    public String getNamaPenjualDropshipper() {
        return namaPenjualDropshipper;
    }

    public String getAlamatPenjual() {
        return alamatPenjual;
    }

    public String getAlamatPenjualDropshipper() {
        return alamatPenjualDropshipper;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public String getAlamatPembeli() {
        return alamatPembeli;
    }

    public String getNamaEkspedisi() {
        return namaEkspedisi;
    }

    public String getNoResi() {
        return noResi;
    }

    public double getOngkosKirim() {
        return ongkosKirim;
    }

    public double getNominalAsuransi() {
        return nominalAsuransi;
    }

    public boolean isDropshipper() {
        return dropshipper;
    }

    public boolean isAsuransi() {
        return asuransi;
    }

    public int getNoTransaksi() {
        return noTransaksi;
    }
}
