package com.logic.day4.studyCase;

public class Angkot extends Car{

    private double hargaTiket;
    private int totalPenumpang;
    

    public Angkot(String noPolisi, int tahun, double hargaTiket, int totalPenumpang) {
        super(noPolisi, tahun, "ANGKOT");
        this.hargaTiket = hargaTiket;
        this.totalPenumpang = totalPenumpang;
        super.setTotalPendapatan(this.hargaTiket*this.totalPenumpang);
    }


    public Angkot(String noPolisi, int tahun) {
        super(noPolisi, tahun, "ANGKOT");
        //TODO Auto-generated constructor stub
    }


    public double getHargaTiket() {
        return hargaTiket;
    }


    public void setHargaTiket(double hargaTiket) {
        this.hargaTiket = hargaTiket;
    }


    public int getTotalPenumpang() {
        return totalPenumpang;
    }


    public void setTotalPenumpang(int totalPenumpang) {
        this.totalPenumpang = totalPenumpang;
    }


    @Override
    public String toString() {
        return super.toString()+" Angkot [hargaTiket=" + hargaTiket + ", totalPenumpang=" + totalPenumpang + "]";
    }
    
}
