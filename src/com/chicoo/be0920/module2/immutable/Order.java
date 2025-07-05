package com.chicoo.be0920.module2.immutable;

//Convert this into an Immutable class
//POJO Class - Plain Old Java Object.

//1. final - Yes - Stopping the inheritance.
//2. Access modifiers - private - Limiting the field access to this class.
//3. Inheritance - Initialize variables using Constructor.
//4. Getters and Settings - Only Getters and no Setters.

public final class Order {

    private final String orderId;
    private final String orderDescription;
    private final int quantity;
    private final double price;
    private final boolean coupon;
    private final Address address;

    public Order(String orderId, String orderDescription, int quantity, double price, boolean coupon, Address address) {
        this.orderId = orderId;
        this.orderDescription = orderDescription;
        this.quantity = quantity;
        this.price = price;
        this.coupon = coupon;
        this.address = address;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public Address getAddress() {
        return address;
    }

    public double getPrice() {
        return price;
    }

    public boolean getCoupon() {
        return coupon;
    }

}
