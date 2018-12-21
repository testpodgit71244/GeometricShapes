package common.childs;

import common.helpers.ColorHelper;
import common.helpers.RandomNumberHelper;
import common.main.Shape;

public class Circle extends Shape {

    private double area;
    private String color;
    private double diameter;
    private double radius;
    private double pan;
    private int a = 0;
    private int b = 2; 


    public Circle() {
        shapeDraw();
        getArea();
        getRadius();
        getColor();

    }


    public void shapeDraw() {
        diameter = RandomNumberHelper.randomSizeSide();
    }

    public double getArea() {
        if(area==0){
            getRadius();
        }
        area = (Math.PI * Math.pow(diameter, 2)) / 4;
        return area;
    }


    public String getColor() {
        color = ColorHelper.randomColor();
        return color;
    }


    public double getRadius() {
        if(diameter==0){
            shapeDraw();
        }
        radius = diameter / 2;
        return radius;
    }

    public void shapeAllInformation() {
        System.out.println("Фігура: коло" + ", площа: " + area + ", діаметр: " +
                diameter + ", гіпотенуза: " + radius + ", колір: " + color);

    }
}
