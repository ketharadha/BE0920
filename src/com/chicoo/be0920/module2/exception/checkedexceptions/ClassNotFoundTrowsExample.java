package com.chicoo.be0920.module2.exception.checkedexceptions;

import com.chicoo.be0920.module2.exception.runtimeexceptions.StackTraceDemo;

public class ClassNotFoundTrowsExample {
    public static void main(String[] args) {
        ClassNotFoundTrowsExample throwe = new ClassNotFoundTrowsExample();
        throwe.calculateTotalCost();
    }

    private int calculateTotalCost() {
        int orderSize = 8;
        int orderCount = 0;
        int totalCost;
        try {
            orderCount = getOrderCount();
            totalCost = 8 * orderCount;
        } catch (Exception e) {
            throw new RuntimeException("OrderCount Should not be zero");
        }
       return totalCost;
    }

    private int getOrderCount() throws Exception, ClassNotFoundException, InterruptedException {
        String request = readingTheRequest(); //"{orderId: "", orderCount:0}"
        int orderCount = 2; //While testing replace 2 with 0
        if(orderCount == 0)
            throw new Exception();
        return orderCount;
    }

    private String readingTheRequest() {
        return "10";
    }


    /*public static void method1() throws ClassNotFoundException {

        throw new ClassNotFoundException();
    }*/


}
