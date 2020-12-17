package service;

import bean.Circle;

public class CircleDemo {
    Circle circle = new Circle();
    public double radiusCount(){
        circle.setRadius(2.0);
        return 3.14 * circle.getRadius() * circle.getRadius();


    }

}
