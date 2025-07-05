package com.chicoo.be0920.module2.typecasting;


import com.chicoo.be0920.module2.oops.polymorphism.dynamicorruntime.Animal;
import com.chicoo.be0920.module2.oops.polymorphism.dynamicorruntime.Cat;
import com.chicoo.be0920.module2.oops.polymorphism.dynamicorruntime.Dog;

public class TypeCastingConcept {
    public static void main(String[] args) {
        /*
          Exercise 1
          Declare variables of types byte, short, int, long, float, and double.
          Assign a small value to a byte, and perform automatic conversions through all the types up to double.
         */
        byte b = 10;
        short s = b;
        int i = b;
        long l = b;
        float f = b;
        double d = b;
        byte by = (byte)d; //Casting is needed when placing a bigger type into smaller one. - Narrowing.

        /*
        Exercise 2
        Given a double value of 123.9876, convert it to float, long, int, and byte using explicit casting.
         */
        double dd = 123.45;
        float ff = (float)dd;
        long ll = (long)dd;
        int ii = (int)dd;
        byte bb = (byte)dd;

        /*
           Exercise 3
           Object Type Conversion (Upcasting/DownCasting)
         */
        Animal a = new Dog();
        if (a instanceof Dog dog) { // In this case we can use polymorphism. So instanceof is not needed and compiler is warning about it.
            System.out.println("a is a dog");
        } else {
            System.out.println("a is not a dog");
        }
    }
}
