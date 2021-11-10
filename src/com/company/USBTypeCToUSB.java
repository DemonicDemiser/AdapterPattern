package com.company;

public class USBTypeCToUSB implements USBTypeC{

    private Phone phone;

    public USBTypeCToUSB(Phone phone){
        this.phone = phone;
    }

    @Override
    public void connectWithUSBTypeCCable() {
        this.phone.insert();
        this.phone.readData();
    }
}
