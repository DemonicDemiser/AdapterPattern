package com.company;

public class Main {

    public static void main(String[] args) {
        USBTypeC USBTypeCToUSB = new USBTypeCToUSB(new Phone());
        USBTypeCToUSB.connectWithUSBTypeCCable();
    }
}
