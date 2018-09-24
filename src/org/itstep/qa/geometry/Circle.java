package org.itstep.qa.geometry;

public class Circle {
    public double radius;
    public double pi = 3.14;

    public void setRadius(double in){ //задать радиус
    radius = in;
    }

    public void getRadius(){
        System.out.println("Радиус круга равен " + radius); //узнать радиус
    }

    public double getAreaCircle(){
        double s = pi*radius*radius;
        System.out.println("Площадь круга равна " + s); //узнать площадь
        return s;
    }

    /*public void getAreaCircle(){
        double s = pi*radius*radius;
        System.out.println("Площадь круга равна " + s); //узнать площадь
    }*/
}
