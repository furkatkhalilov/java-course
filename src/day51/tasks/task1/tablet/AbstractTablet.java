package day51.tasks.task1.tablet;

import day51.tasks.task1.AbstractDevice;

public abstract class AbstractTablet extends AbstractDevice {

    private boolean pen;// hasPen

    public boolean hasPen() {
        return pen;
    }

    public void setPen(boolean pen) {
        this.pen = pen;
    }
}
