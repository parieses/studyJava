package com.company.test;

public class TriAngle {
    private int base;
    private int height;

    public void setTriAngle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public double getArea() {
        return (double) base * height / 2;
    }
}
