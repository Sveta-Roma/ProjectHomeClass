package org.itstep.qa.runner;

import org.itstep.qa.geometry.Circle;

public class CircleRunner {
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.setRadius(2);
        circle.getRadius();
        circle.getAreaCircle();

    }
}
