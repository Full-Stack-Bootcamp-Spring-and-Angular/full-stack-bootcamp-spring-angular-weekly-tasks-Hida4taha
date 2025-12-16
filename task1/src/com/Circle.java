package com;

public class Circle implements Shape {
    @Override
    public double getArea(double r) {
        return bye * (r * r);
    }

    public double bye =3.14;
    private double r;
    public Circle(){

    }

}
