package common.childs;

import common.helpers.ColorHelper;
import common.helpers.RandomNumberHelper;
import common.main.Shape;

public class Triangle extends Shape {

    private String color;
    private double area;
    private double hypotenuse;
    private double a;
    private double b;
    private double c;


    public Triangle() {
        shapeDraw();
        getColor();
        getArea();
        getHypotenuse();
    }



    public void shapeDraw() {
        while (true) {
            a = RandomNumberHelper.randomSizeSide();
            b = RandomNumberHelper.randomSizeSide();
            c = RandomNumberHelper.randomSizeSide();

            if (a + b > c && a + c > b && b + c > a) {
                break;
            }
        }

    }


    public String getColor() {
        color = ColorHelper.randomColor();
        return color;
    }


    public double getArea() {
        if(a==0||b==0||c==0){
            shapeDraw();
        }

        double halfPerimeter = 0;

        shapeDraw();

        halfPerimeter = (a + b + c) / 2;

        area = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
        return area;
    }

    public double getHypotenuse() {
        if(a==0||b==0||c==0){
            shapeDraw();
        }

        hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return hypotenuse;

    }


    public void shapeAllInformation() {
        System.out.println("Фігура: трикутник" + ", площа: " + area +
                ", гіпотенуза: " + hypotenuse + ", колір: " + color);

    }

}
