package day49.tasks.task1.vehicles;

import day49.tasks.task1.interfaces.Vehicle;

public class Train implements Vehicle {
    @Override
    public int speed() {
        return 90; // m/h
    }
}
