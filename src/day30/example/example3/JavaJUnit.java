package day30.example.example3;

import org.junit.Assert;
import org.junit.Test;

public class JavaJUnit {

    @Test
    public void testArea(){
        Rectangle rect1 = new Rectangle();
        rect1.length = 5;
        rect1.width = 10;

        int area = rect1.getArea();

        Assert.assertEquals("area calculation is not right", 30, area);
    }

}
