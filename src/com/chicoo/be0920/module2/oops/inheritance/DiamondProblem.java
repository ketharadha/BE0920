package com.chicoo.be0920.module2.oops.inheritance;

public class DiamondProblem implements Interface1, Interface2 {
    @Override
    public void diamondSolution1() {
        System.out.println("Concrete Class override diamond1 method");
    }

    @Override
    public void diamondSolution2() {
        System.out.println("Concrete Class override diamond2 method");
    }

    //From the below code two things to note
    //1. Diamond problem can be address by calling default methods using Interface name and super keyword.
    //2. Able to call the methods with same name from interfaces the class in implementing.
    public void multipleInheritance1() {
        Interface1.super.diamondSolution1();
        Interface1.super.diamondSolution2();
    }

    public void multipleInheritance2() {
        Interface2.super.diamondSolution1();
        Interface2.super.diamondSolution2();
    }

    public static void main(String[] args) {
        DiamondProblem diamondProblem = new DiamondProblem();
        diamondProblem.multipleInheritance1();
        diamondProblem.multipleInheritance2();

        diamondProblem.diamondSolution1();
        diamondProblem.diamondSolution2();
    }
}
