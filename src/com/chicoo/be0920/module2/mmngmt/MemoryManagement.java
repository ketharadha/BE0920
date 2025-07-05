package com.chicoo.be0920.module2.mmngmt;

public class MemoryManagement {

    public static void main(String args[]) {

        int primitiveVariable1 = 10;
        Person person0bj = new Person();
        String stringLiteral = "24";
        MemoryManagement mem0bj = new MemoryManagement();
        mem0bj.memoryManagementTest(person0bj);
    }

    private void memoryManagementTest(Person person0bj){

        Person person0bj2 = person0bj;
        String stringLiteral2 = "24";
        String stringLiteral3 = new String("24");
    }
}