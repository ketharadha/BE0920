package com.chicoo.be0920.module2.accessmodifiers;

/**
 * DAccess modifiers
 * 1. Public - Anyone can access the member from anywhere.
 * 2. Protected - Members can be access within the package and the child class if inherited.
 * 3. Package - Members can be accessed within the same package.
 * 4. Private - Members can be accessed within the class they are defined.
 *
 * Note : Any members that are overridden in the child class then the access modifier should be either same level
 * or more relaxed level but not restricted.
 *
 */
public class AccessModifiers {

   public String publicString = "v6";
    protected String protectedString = "";

    String packageString = "";

    private String privateString = "";

    public void publicMethod() {
        System.out.println("Public v6 engine");
    }

    protected void protectedMethod() {
        System.out.println("Protected Seat");
    }

    void packageMethod() {
        System.out.println("Package or Default headlight");
    }

    private void privateMethod() {
        System.out.println("Private horn");
    }
}
