package com.chicoo.be0920.module2.strings;

public class StringClass {
    public static void main(String[] args) {

        //String - Immutable
        String s = "Hello"; //String Literal
        System.out.println(s);
        s = s + " World!";
        System.out.println(s);
        System.out.println(s.toUpperCase());

        String stringObject = new String("Hello"); //String oBject
        System.out.println(stringObject);

        stringObject = stringObject.concat("World");
        System.out.println(stringObject);



        //StringBuilder - Mutable
        StringBuilder sb = new StringBuilder("Hello SB");
        System.out.println(sb);
        sb = sb.append("World!");

        System.out.println(sb);
    }
}
