package day51.tasks.task1.phone;

import day51.tasks.task1.AbstractDevice;

public abstract class AbstractPhone extends AbstractDevice {
    private Career career;


    public Career getCareer() {
        return career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }
}
