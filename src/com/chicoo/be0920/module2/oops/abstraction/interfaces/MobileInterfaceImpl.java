package com.chicoo.be0920.module2.oops.abstraction.interfaces;

public class MobileInterfaceImpl implements MobileInterface, MobileGeneration {

    @Override
    public void createOLEDScreen() {
        System.out.println("Write OLED functionality here");
    }

    @Override
    public void cameraControl() {
        System.out.println("Write Camera functionality here");
    }

    @Override
    public void volumeControl() {
        System.out.println("Write Volume Control functionality here");
    }

    @Override
    public void supportGeneration() {
        System.out.println("Mobile Interface Impl");
    }
}
