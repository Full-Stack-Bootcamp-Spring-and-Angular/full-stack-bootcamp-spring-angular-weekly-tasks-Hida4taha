package com;

public class Square implements Shape{
        private double r;
        public Square(){

        }
        @Override
        public double getArea(double r){
            return (r * r);
        }
    }


