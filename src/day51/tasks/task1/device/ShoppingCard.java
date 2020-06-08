package day51.tasks.task1.device;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {
    private List<Device> deviceList = new ArrayList<>();

    public void addDevice(Device device) {
        deviceList.add(device);
    }

    public void removeDevice(Device device) {
        deviceList.remove(device);
    }

    public double getTotalPrice() {
        double sum = 0;
        for(Device device : deviceList) {
            //1. way downcast device to AbstractDevice
            // AbstractDevice absDev = (AbstractDevice) device;
            // absDev.getPrice();

            //2. way downcast device in default method, so that you dont have to implement it in derived classes
            // device.getPrice();

            //3. way implement getPRice method in derived class
            sum += device.getPrice();
        }

        return sum;
    }

    public void checkOut(double money) {
        
    }
}
