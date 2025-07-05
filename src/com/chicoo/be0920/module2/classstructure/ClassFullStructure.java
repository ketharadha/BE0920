package com.chicoo.be0920.module2.classstructure;

import com.kingdon.palace.Throne;

public class ClassFullStructure {
    private String palName;
    private int roomCount;

    //Default Constructor
    ClassFullStructure() {
        System.out.println("Constructor");
    }
    //Parameterized Constructors
    ClassFullStructure(String palName) {
        this.palName = palName;
    }

    ClassFullStructure(String palName, int roomCount) {
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
        ClassFullStructure palace = new ClassFullStructure();

        //Accessing instance variables from the same class.
        System.out.println("Instance Variable with in the same class : " + palace.palName);

        //Static variable example
        System.out.println("ClassFullStructure " + ClassFullStructure.numberOfVisitors);

        ClassFullStructure palace1 = new ClassFullStructure();
        numberOfVisitors++; //numberOfVisitors = numberOfVisitors + 1;
        System.out.println("ClassFullStructure 1 " + ClassFullStructure.numberOfVisitors);

        ClassFullStructure palace2 = new ClassFullStructure();
        System.out.println("ClassFullStructure 2 " + ClassFullStructure.numberOfVisitors);
        System.out.println("ClassFullStructure " + ClassFullStructure.numberOfVisitors);

        System.out.println("Object Count : " + ClassFullStructure.objectCount);

        ClassFullStructure palace3 = new ClassFullStructure("Central ClassFullStructure");

        ClassFullStructure palace4 = new ClassFullStructure("Central ClassFullStructure", 50);
        ClassFullStructure palace5 = new ClassFullStructure("Mediteranian ClassFullStructure", 10);

        //Accessing instance variables from the different class.
        Throne thorn1 = new Throne();
        thorn1.setPalaceName("Small ClassFullStructure 1");
        System.out.println("Thorne 1 Place Name: " + thorn1.getPalaceName());

        Throne thorn2 = new Throne();
        thorn2.setPalaceName("Small ClassFullStructure 2");
        System.out.println("Thorn 2 Place Name : " + thorn2.getPalaceName());

        System.out.println("Thorne 1 Place Name : " + thorn1.getPalaceName());
    }
}
