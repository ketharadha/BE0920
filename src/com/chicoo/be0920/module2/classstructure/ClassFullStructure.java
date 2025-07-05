package com.chicoo.be0920.module2;

import com.kingdon.palace.Throne;

public class Palace {
    private String palName;
    private int roomCount;

    //Default Constructor
    Palace() {
        System.out.println("Constructor");
    }
    //Parameterized Constructors
    Palace(String palName) {
        this.palName = palName;
    }

    Palace(String palName, int roomCount) {
        this.palName = palName;
        this.roomCount = roomCount;
    }

    static private int objectCount = 0;

    //Instance Initialization Block
    {
        System.out.println("Instance Initialization Block");
        palName = "Huge Building";
        objectCount ++;
    }

    private static int numberOfVisitors = 0;

    static {
        numberOfVisitors++;
    }

    public static void main(String[] args) {
        Palace palace = new Palace();

        //Accessing instance variables from the same class.
        System.out.println("Instance Variable with in the same class : " + palace.palName);

        //Static variable example
        System.out.println("Palace " + Palace.numberOfVisitors);

        Palace palace1 = new Palace();
        numberOfVisitors++; //numberOfVisitors = numberOfVisitors + 1;
        System.out.println("Palace 1 " + Palace.numberOfVisitors);

        Palace palace2 = new Palace();
        System.out.println("Palace 2 " + Palace.numberOfVisitors);
        System.out.println("Palace " + Palace.numberOfVisitors);

        System.out.println("Object Count : " + Palace.objectCount);

        Palace palace3 = new Palace("Central Palace");

        Palace palace4 = new Palace("Central Palace", 50);
        Palace palace5 = new Palace("Mediteranian Palace", 10);

        //Accessing instance variables from the different class.
        Throne thorn1 = new Throne();
        thorn1.setPalaceName("Small Palace 1");
        System.out.println("Thorne 1 Place Name: " + thorn1.getPalaceName());

        Throne thorn2 = new Throne();
        thorn2.setPalaceName("Small Palace 2");
        System.out.println("Thorn 2 Place Name : " + thorn2.getPalaceName());

        System.out.println("Thorne 1 Place Name : " + thorn1.getPalaceName());
    }
}
