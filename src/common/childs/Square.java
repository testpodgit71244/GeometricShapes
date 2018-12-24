package common.childs;

import common.helpers.ColorHelper;
import common.helpers.RandomNumberHelper;
import common.main.Shape;

public class Square extends Shape {

    private double side;
    private String color;
    private double area;
    private double a;
    private double b;
    private double c;
    private double d;
    private double k;
        private double k1;
         private double k2;



    public Square() {
        getSide();
        shapeDraw();
        getArea();
        getColor();

    }

    public double getSide(){
        side = RandomNumberHelper.randomSizeSide();
        return side;
    }

    public void shapeDraw() {
        if(side==0){
            getSide();
        }
        a = side;
        b = side;
        c = side;
        d = side;
    }


    public String getColor() {
        color = ColorHelper.randomColor();
        return color;
    }


    public double getArea() {
        if (side == 0) {
            shapeDraw();
        }
        area = a * c;

        return area;
    }

    public void shapeAllInformation() {
        System.out.println("Фігура: квадрат" + ", площа: " + area + ", довжина сторони: " +
                side + ", колір: " + color);

    }

}
