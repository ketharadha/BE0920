package com.chicoo.be0920.module2.oops.inheritance;

public class Starter {
    public static void main(String[] args) {
        SUV suv = new SUV();
        suv.horn();
        suv.horn("Bhow Bhow....");

        Car car = new Sedan();
        car.engine();
    }
}
 class Car {
    void horn() {
        System.out.println("Car generic horn");
    }

    void engine() {
        System.out.println("Generic Engine");
    }

    void chasis() {
        System.out.println("Common Chasis");
    }
}

 class SUV extends Car {
     void horn() {
         System.out.println("Siren Horn");
     }

     void horn(String sound) {
         System.out.println("Dog Barks " + sound);
     }
 }

 class Sedan extends Car {
     void engine() {
         System.out.println("Sedan Engine");
     }
 }

 class Sambar extends Car {
    void prepareSambar() {
        System.out.println("Sambar");
    }
 }
