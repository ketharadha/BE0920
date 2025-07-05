package com.chicoo.be0920.module2.oops.abstraction.interfaces;

public class TabletInterfaceImpl implements MobileInterface, MobileGeneration {
    @Override
    public void createOLEDScreen() {

    }

    @Override
    public void cameraControl() {

    }

    @Override
    public void volumeControl() {

    }

    @Override
    public void supportGeneration() {
        System.out.println("Tablet Interface Impl");
    }
}
