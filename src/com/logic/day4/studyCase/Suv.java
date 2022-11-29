package com.logic.day4.studyCase;

public class Suv extends Car {

    private double sewa;
    private double biayaSupir;


    public Suv(String noPolisi, int tahun) {
        super(noPolisi, tahun, "SUV");
        //TODO Auto-generated constructor stub
    }

    public Suv(String noPolisi, int tahun, double sewa, double biayaSupir) {
        super(noPolisi, tahun, "SUV");
        this.sewa = sewa;
        this.biayaSupir = biayaSupir;
        super.setTotalPendapatan(this.sewa + this.biayaSupir);
    }

    public double getSewa() {
        return sewa;
    }

    public void setSewa(double sewa) {
        this.sewa = sewa;
    }

    public double getBiayaSupir() {
        return biayaSupir;
    }

    public void setBiayaSupir(double biayaSupir) {
        this.biayaSupir = biayaSupir;
    }

    @Override
    public String toString() {
        return super.toString()+ " Suv [sewa=" + sewa + ", biayaSupir=" + biayaSupir + "]";
    }
    
    
}
