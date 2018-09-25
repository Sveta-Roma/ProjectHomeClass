package org.itstep.qa.geometry;

public class Circle {
    public double radius;
    public double pi = 3.14;

    public void setRadius(double in){ //задать радиус
    radius = in;
    } // задать радиус
    //public void setRadius(double radius){//версия препод
        //this.radius = radius; }

    public void getRadius(){
        System.out.println("Радиус круга равен " + radius); //узнать радиус
    }
    //public double getRadius (){//версия препод
        //return radius;    }

    public double getAreaCircle(){
        double s = pi*radius*radius;
        System.out.println("Площадь круга равна " + s); //узнать площадь
        return s;
    }
    //public double getAreaCircle(){//версия препод
        //return Math.PI*radius*radius; }

}
