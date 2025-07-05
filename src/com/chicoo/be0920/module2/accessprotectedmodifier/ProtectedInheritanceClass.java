package com.chicoo.be0920.module2.accessprotectedmodifier;

import com.chicoo.be0920.module2.accessmodifiers.ProtectedAccess;

public class ProtectedInheritanceClass extends ProtectedAccess {
    public static void main(String[] args) {
        ProtectedInheritanceClass pic = new ProtectedInheritanceClass();
        pic.protectedMethod();
        System.out.println(pic.protectedString);
    }

    protected void protectedMethod() {
        System.out.println("Protected Seat Child Class");
    }

    public void publicMethod() {
        System.out.println("Public v6 engineChild Class");
    }

    //This method is owned by this class not from the parent class.
    void packageMethod() {
        System.out.println("Package or Default headlight");
    }

}
