package com.chicoo.be0920.module2.classstructure;

public class ConstructorBehaviour {

    private String defaultConstruction = "Default Constructor";
    private String instanceBlock = "Instance Block";

    private String accessFromLocalInstance = "Local Instance Variable";

    private static String staticVariable = "Static Variable";
    private String instanceVariable = "Instance Variable";

    //Default Constructor
    public ConstructorBehaviour() {
        System.out.println(defaultConstruction);
    }

    //Instance Initialization Block
    {
        var j = 10;
        System.out.println(instanceBlock);
        System.out.println(staticVariable + " In Instance Block");
    }

    // Static Block
    static {
        System.out.println(staticVariable);
        //System.out.println(instanceVariable + "In static Block");
    }

    public static void main(String[] args) {
        ConstructorBehaviour cb = new ConstructorBehaviour();
        System.out.println(cb.accessFromLocalInstance);
        System.out.println(ConstructorBehaviour.staticVariable);
    }
}
