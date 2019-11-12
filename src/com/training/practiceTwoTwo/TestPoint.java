package com.training.practiceTwoTwo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class TestPoint {
    @Test
    public void testConstructor(){
        try {
            Point p1 = new Point(2,3);
            Point p2 = new Point();
            Point p3 = new Point(1,2,2);
            Point p4 = new Point(1.1f, 1.2f);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testAddity(){
        Point p1 = new Point((float) (Math.random()*100), (float) (Math.random()*100));
        Point p2 = new Point((float) (Math.random()*100),(float) (Math.random()*100));
        Point p3 = p1.add(p2);

        assertEquals( p2.x + p1.x, p3.x, "Ожидается другое значение х" );
        assertEquals(p2.y + p1.y, p3.y, "Ожидается другое значение у");
        assertEquals(p2.z + p1.z, p3.z, "Ожидается другое значение z");
    }

    @Test
    public void testMinus(){
        Point p1 = new Point((float) (Math.random()*100), (float) (Math.random()*100));
        Point p2 = new Point((float) (Math.random()*100),(float) (Math.random()*100));
        Point p3 = p1.minus(p2);

        assertEquals( p1.x - p2.x, p3.x, "Ожидается другое значение х" );
        assertEquals(p1.y - p2.y, p3.y, "Ожидается другое значение у");
        assertEquals(p1.z - p2.z, p3.z, "Ожидается другое значение z");
    }

}
