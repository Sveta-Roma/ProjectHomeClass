package org.itstep.qa.runner;

import org.itstep.qa.geometry.Circle;

public class CircleRunner {
    public static void main(String[] args) {
        Circle circle = new Circle();//версия препод добавить
        //System.out.println("Было: " + circle.getRadius());версия препод
        circle.setRadius(2);//версия препод добавить
        //System.out.println("Стало: " + circle.getRadius());версия препод
        //System.out.println("Площадь: " + circle.getAreaCircle());версия препод
        circle.getRadius();//не писать
        circle.getAreaCircle();//не писать

    }
}
