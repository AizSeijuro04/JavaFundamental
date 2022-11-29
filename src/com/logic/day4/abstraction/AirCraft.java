package com.logic.day4.abstraction;

public class AirCraft extends Vehicle{

    private String noRegister;

    public AirCraft(String type, String bahanBakar, int tahun, double hargaBeli, double tax, String noRegister) {
        super(type, bahanBakar, tahun, hargaBeli, tax);
        this.noRegister = noRegister;
    }

    public AirCraft(String type, String bahanBakar, int tahun, double hargaBeli, double tax) {
        super(type, bahanBakar, tahun, hargaBeli, tax);
    }

    @Override
    public double taksiranPajak() {
        
        return super.pajakBM()+100d;
    }

    @Override
    public String toString() {
        return super.toString()+ "AirCraft [noRegister=" + noRegister + "]";
    }

    
    
}
