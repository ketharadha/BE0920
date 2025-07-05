package com.chicoo.be0920.module2.oops.functionalInterfaces;

public class Eagle {

    public static void main(String[] args) {

        //Usual way of implementing an interface
        /*@Override
        public void canFly() {
            System.out.println("Eagle Functional method implementation");
        }*/

        /*Bird eagle = new Eagle();
        eagle.canFly();
        eagle.canBreed();*/

        //Anonymous class way of instantiating and overriding.

        /*Bird eagle = new Bird() {
            @Override
            public void canFly() {
                    System.out.println("Eagle Functional method implementation");
            }
        };
        eagle.canFly();
        eagle.canBreed();*/

        //Lambdas go with functional interfaces
        Bird eagle = (String value) -> {
            System.out.println("Eagle Functional method implementation using Lambda : " + value);
        };

        Runnable runnable = () -> {
            System.out.println();
        };

        String wingSize = "10";
        eagle.canFly(wingSize);
    }
}
