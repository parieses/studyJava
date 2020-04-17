package com.company.day09;

public interface BMW {
    //产品信息介绍 车的发动方式
    void showInfo();
}

//工厂
interface BMWFactory {
    BMW BMWProduct();
}

//构建具体车得类
class BMW3 implements BMW {

    @Override
    public void showInfo() {

    }
}

class BMW5 implements BMW {

    @Override
    public void showInfo() {

    }
}

class BMW7 implements BMW {

    @Override
    public void showInfo() {

    }
}

/**
 * 实现具体车型的生产工厂
 */
class BMW3Factory implements BMWFactory {

    @Override
    public BMW BMWProduct() {
        System.out.println("生产宝马三系");
        return new BMW3();
    }
}

class BMW5Factory implements BMWFactory {

    @Override
    public BMW BMWProduct() {
        System.out.println("生产宝马五系");
        return new BMW5();
    }
}

class BMW7Factory implements BMWFactory {

    @Override
    public BMW BMWProduct() {
        System.out.println("生产宝马七系");
        return new BMW5();
    }
}

class Test1 {
    public static void main(String[] args) {

        //开发人员B的工资
        BMW b3 = new BMW3Factory().BMWProduct();
        b3.showInfo();
    }
}