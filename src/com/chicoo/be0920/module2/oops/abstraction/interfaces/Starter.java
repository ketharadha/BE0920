package com.chicoo.be0920.module2.oops.abstraction.interfaces;

public class Starter {
    public static void main(String[] args) {

        MobileInterface mobileInterfaceImpl = new MobileInterfaceImpl();
        mobileInterfaceImpl.supportGeneration();

        MobileInterface tabletInterfaceImpl = new TabletInterfaceImpl();
        tabletInterfaceImpl.supportGeneration();

        MobileGeneration mobileGeneration = new MobileInterfaceImpl();
        mobileGeneration.supportGeneration();

        MobileGeneration mobileGeneration1 = new TabletInterfaceImpl();
        mobileGeneration1.supportGeneration();

    }
}
