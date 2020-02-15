package com.company;

public class Cone extends Figure3D implements Material {
    double unitPrice;
    @Override
    public void setUnitPrice(double unitPrice) {
        this.unitPrice=unitPrice;

    }

    @Override
    public double getPrice() {
        return unitPrice*volume;
    }

    Cone(double r, double h){
        this.h=h;

        bottom=new Bottom(Math.PI*r*r);
    }

    @Override
    void evaluateVolume(){
        volume=1.0/3.0*bottom.getField()*h;

    }
    @Override
    public void printPrice(){
        System.out.println("Price :" +getPrice());
    }
}
