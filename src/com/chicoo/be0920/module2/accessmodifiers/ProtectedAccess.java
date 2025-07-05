package com.chicoo.be0920.module2.accessmodifiers;

public class ProtectedAccess {

    protected String protectedString = "protectedString";

    String packageString = "";

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
        System.out.println("This is private method");
    }

}
