package com.company;

public class RectanglePrism extends Figure3D implements Material{
    @Override
    public void setUnitPrice(double unitPrice) {

    }

    @Override
    public double getPrice() {
        return unitPrice*volume;
    }

    @Override
    public void printPrice() {

    }

    double unitPrice;
    RectanglePrism(double a,double b,double h){
        this.h=h;

        bottom = new Bottom (a*b);//zeby zmienic wzor w kazdej figurze
    }
    @Override
    void evaluateVolume(){
        volume= bottom.getField()*h;
    }
}
