package com.chicoo.be0920.module2.methods;

import com.chicoo.be0920.module2.classstructure.Dimensions;
import com.chicoo.be0920.module2.classstructure.ObjectReturnType;
import com.chicoo.be0920.module2.classstructure.Order;

import java.util.ArrayList;
import java.util.List;

public class ObjectReturnTypeValidation {
    public static void main(String[] args) {
        ObjectReturnTypeValidation obv = new ObjectReturnTypeValidation();
        var testReturnType = obv.getObjectReturnType();
    }

    private ObjectReturnType getObjectReturnType() {
        return new ObjectReturnType();
    }

    private Order getOrder(int orderId) {
        Order order = new Order();
        order.setOrderId(orderId);
        order.setOrderDescription("Apple box");
        Dimensions dimensions = new Dimensions();
        dimensions.setLength(5);
        dimensions.setBreadth(5);
        dimensions.setHeight(5);
        order.setDimensions(dimensions);
        return order;
    }

    private List<Order> getOrderList() {
        Order order = new Order();
        order.setOrderId(1);
        order.setOrderDescription("Apple box");
        Dimensions dimensions = new Dimensions();
        dimensions.setLength(5);
        dimensions.setBreadth(5);
        dimensions.setHeight(5);
        order.setDimensions(dimensions);

        Order order_evening = new Order();
        order.setOrderId(2);
        order.setOrderDescription("Pear box");
        Dimensions dimensions_evening = new Dimensions();
        dimensions.setLength(5);
        dimensions.setBreadth(5);
        dimensions.setHeight(5);
        order.setDimensions(dimensions_evening);

        List<Order> orderList = new ArrayList<Order>();
        orderList.add(order);
        orderList.add(order_evening);

        return orderList;
    }
}
