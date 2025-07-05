package com.chicoo.be0920.module2.oops.abstraction.abstractclass;

public class AbstractClassDemo {
    public static void main(String[] args) {
        Car car = new Honda();
        AbstractClassDemo abstractClassDemo = new AbstractClassDemo();
        abstractClassDemo.useEngine(car);

        car = new Tesla();
        abstractClassDemo.useEngine(car);
    }

    private void useEngine(Car car) {
        car.engine();
    }
}
