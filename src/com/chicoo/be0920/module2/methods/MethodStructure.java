package com.chicoo.be0920.module1.methods;

import com.kingdon.palace.Throne;

public class MethodStructure {
    public static void main(String[] args) {
        System.out.println("Main method");

        MethodStructure ms = new MethodStructure();
        System.out.println( "Addition : " + ms.increment(100,5) );
        System.out.println( "Subtraction : " + subtraction(100,5) );
        Throne throne = ms.getThorn();
        System.out.println( "Get Thorne Instance : " + throne );

    }
    private Throne getThorn() {
        var thorne = new Throne();
        thorne.setPalaceName("Method Structure Palace");
        return thorne;
    }
    private int counter;

    private int add( int a, int b) {
        System.out.println("Inside Add");
        return increment(a, b);
    }

    //Instance Method accessing a static method directly - True
    private int increment( int a, int b) {
        System.out.println("Inside Increment");
        var sub = 100 + 5;
        return sub;
    }

    //Static method accessing an instance method directly - False
    private static int subtraction(int a, int b) {
        var ms = new MethodStructure();
        //int add = ms.add(a, b);
        return a - b;
    }


}
