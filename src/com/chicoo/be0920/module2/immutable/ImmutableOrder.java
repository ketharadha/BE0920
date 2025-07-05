package com.chicoo.be0920.module2.immutable;

public record ImmutableOrder(String orderId, String orderDescription, int quantity, double price, boolean coupon, Address address) {}
