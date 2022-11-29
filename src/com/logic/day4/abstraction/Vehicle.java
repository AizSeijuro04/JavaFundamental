package com.logic.day4.abstraction;

public abstract class Vehicle {
    private String type;
    private String bahanBakar;
    private int tahun;
    private double hargaBeli;
    private double tax;


    public Vehicle(String type, String bahanBakar, int tahun, double hargaBeli, double tax) {
        this.type = type;
        this.bahanBakar = bahanBakar;
        this.tahun = tahun;
        this.hargaBeli = hargaBeli;
        this.tax = tax;
    }

    public abstract double taksiranPajak();

    public double pajakBM(){
        return this.hargaBeli*this.tax;
    }

    @Override
    public String toString() {
        return "Vehicle [type=" + type + ", bahanBakar=" + bahanBakar + ", tahun=" + tahun + ", hargaBeli=" + hargaBeli
                + ", tax=" + tax + "]";
    }

    


    
}
