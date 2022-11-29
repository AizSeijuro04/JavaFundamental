package com.logic.day4.studyCase;

public class Car {
    private String noPolisi ;
    private int tahun;
    private String type;
    private double totalPendapatan;
    
    
    
    public Car(String noPolisi, int tahun, String type) {
        this.noPolisi = noPolisi;
        this.tahun = tahun;
        this.type = type;
    }



    public String getNoPolisi() {
        return noPolisi;
    }



    public void setNoPolisi(String noPolisi) {
        this.noPolisi = noPolisi;
    }



    public int getTahun() {
        return tahun;
    }



    public void setTahun(int tahun) {
        this.tahun = tahun;
    }



    public String getType() {
        return type;
    }



    public void setType(String type) {
        this.type = type;
    }



    public double getTotalPendapatan() {
        return totalPendapatan;
    }



    public void setTotalPendapatan(double totalPendapatan) {
        this.totalPendapatan = totalPendapatan;
    }



    @Override
    public String toString() {
        return "Car [noPolisi=" + noPolisi + ", tahun=" + tahun + ", type=" + type + ", totalPendapatan="
                + totalPendapatan + "]";
    }

    
}

