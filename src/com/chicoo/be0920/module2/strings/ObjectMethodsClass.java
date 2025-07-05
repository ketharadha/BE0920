package com.chicoo.be0920.module2.strings;

import java.io.Serializable;
import java.util.Objects;

public class ObjectMethodsClass implements Serializable {
    private String orderid;
    private String orderDescription;
    private String deliveryAddress;
    private int quantity;

    public static void main(String[] args) {
        ObjectMethodsClass obj = new ObjectMethodsClass();
        System.out.println("hash code obj: " + obj.hashCode());
        obj.orderid = "Ord-1";
        System.out.println("hash code obj: " + obj.hashCode());

        ObjectMethodsClass obj1 = new ObjectMethodsClass();
        System.out.println("hash code obj1: " + obj1.hashCode());
        obj1.orderid = "Ord-1";
        System.out.println("hash code obj1: " + obj1.hashCode());

        ObjectMethodsClass obj2 = new ObjectMethodsClass();
        System.out.println("hash code obj2: " + obj2.hashCode());
        obj2.orderid = "Ord-1";
        System.out.println("hash code obj2: " + obj2.hashCode());

        //== Operator
        if (obj == obj1) {
            System.out.println("Both the object references are equal");
        } else {
            System.out.println("Both the object references are NOT equal");
        }

        if (obj == obj2) {
            System.out.println("Both the object references are equal");
        }

        if (obj1 == obj2) {
            System.out.println("Both the object references are equal");
        }

        //equals()
        if (obj.equals(obj1)) {
            System.out.println("1 Both the objects are equal");
        } else {
            System.out.println("Both the objects are NOT equal");
        }

        if (obj1.equals(obj2)) {
            System.out.println("2 Both the objects are equal");
        } else {
            System.out.println("2 Both the objects are NOT equal");
        }

        if (obj.equals(obj2)) {
            System.out.println("3 Both the objects are equal");
        } else {
            System.out.println("3 Both the objects are NOT equal");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectMethodsClass that = (ObjectMethodsClass) o;
        return quantity == that.quantity
                && Objects.equals(orderid, that.orderid)
                && Objects.equals(orderDescription, that.orderDescription)
                && Objects.equals(deliveryAddress, that.deliveryAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderid, orderDescription, deliveryAddress, quantity);
    }
}
