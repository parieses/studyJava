package com.company.day09;

public class Test3 {
    public int z;
    int i = 0;
    private int k;

    public static void main(String[] args) {
        Test3 t3 = new Test3();
        t3.setInfo();
        t3.showInfo();
    }

    public void setInfo() {
        new A().setTest3Fileds();
    }

    public void showInfo() {
        System.out.println(this.i);
    }

    class A {
        int a;

        public void setTest3Fileds() {
            Test3.this.i = 1;
            Test3.this.z = 2;
            Test3.this.k = 3;
        }

        public void set() {
            this.a = 1;
        }
    }
}
