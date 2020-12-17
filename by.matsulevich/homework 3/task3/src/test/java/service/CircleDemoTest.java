package service;

import bean.Circle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleDemoTest {
    CircleDemo circleDemo;
    Circle circle;

    @Before
    public void setUp() {
        circle = new Circle();
        circleDemo = new CircleDemo();

    }

    @Test
    public void radiusX() {
        double expected = 3.14;
        double actual = circleDemo.radiusCount();
        assertEquals(expected, actual, 0.0);

    }
}