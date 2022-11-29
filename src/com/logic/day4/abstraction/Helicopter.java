package com.logic.day4.abstraction;

public class Helicopter extends AirCraft implements RevenueInterface {

    private double sewaPerHour;
    private int hours;

    public Helicopter(String type, String bahanBakar, int tahun, double hargaBeli, double tax, String noRegister) {
        super(type, bahanBakar, tahun, hargaBeli, tax, noRegister);
    }

    public Helicopter(String type, String bahanBakar, int tahun, double hargaBeli, double tax, double sewaPerHour,
            int hours) {
        super(type, bahanBakar, tahun, hargaBeli, tax);
        this.sewaPerHour = sewaPerHour;
        this.hours = hours;
    }

    @Override
    public double totalPendapatan() {
        return this.sewaPerHour*this.hours;
    }

    @Override
    public String toString() {
        return super.toString()+ "Helicopter [sewaPerHour=" + sewaPerHour + ", hours=" + hours + "]";
    }
    
    
    
}
