package com.logic.day4.studyCase;

public class Taxi extends Car{

    private int order;
    private double orderPerKM;
    private int totalKM;
    private double bonus; 

    public Taxi(String noPolisi, int tahun) {
        super(noPolisi, tahun, "TAXI");
        //TODO Auto-generated constructor stub
    }

    public Taxi(String noPolisi, int tahun, int order, double orderPerKM, int totalKM, double bonus) {
        super(noPolisi, tahun, "TAXI");
        this.order = order;
        this.orderPerKM = orderPerKM;
        this.totalKM = totalKM;
        this.bonus = bonus;
        super.setTotalPendapatan((this.order * this.bonus)+(this.orderPerKM*this.totalKM) );
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public double getOrderPerKM() {
        return orderPerKM;
    }

    public void setOrderPerKM(double orderPerKM) {
        this.orderPerKM = orderPerKM;
    }

    public int getTotalKM() {
        return totalKM;
    }

    public void setTotalKM(int totalKM) {
        this.totalKM = totalKM;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString()+" Taxi [order=" + order + ", orderPerKM=" + orderPerKM + ", totalKM=" + totalKM + ", bonus=" + bonus
                + "]";
    }

    

    
    
}
