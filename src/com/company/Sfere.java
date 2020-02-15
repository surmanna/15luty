package com.company;

public class Sfere extends Figure3D {
    @Override
    void evaluateVolume() {
        volume=4/3*Math.PI*r*r*r;


    }

    @Override
    double getVolume() {
        return super.getVolume();
    }
    double r;

    Sfere(double r){
        this.r=r;
    }
}
