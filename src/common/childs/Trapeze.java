package common.childs;

import common.helpers.ColorHelper;
import common.helpers.RandomNumberHelper;
import common.main.Shape;

public class Trapeze extends Shape {

    private double area;
    private String color;
    private double baseTopLength;
    private double baseBottomLength;
    private double height;
      private double height1;
        private double height2;



    private double area1;
    private String color1;
    private double baseTopLength1;
    private double baseBottomLength1;
    private double height1;

    public Trapeze() {
        shapeDraw();
        getColor();
        getArea();
    }

    public void shapeDraw() {

        baseBottomLength = RandomNumberHelper.randomSizeSide();
        height = RandomNumberHelper.randomSizeSide();
        while (true) {
            baseTopLength = RandomNumberHelper.randomSizeSide();
            if (baseTopLength < baseBottomLength) {
                break;
            }
        }
    }


    public String getColor() {
        color = ColorHelper.randomColor();
        return color;
    }

    public double getArea() {
        if(baseBottomLength==0||baseTopLength==0||height==0){
            shapeDraw();
        }
        area = ((baseTopLength + baseBottomLength) * height) / 2;
        return area;
    }

    public void shapeAllInformation() {
        System.out.println("Фігура: трапеція" + ", площа: " + area +
                ", висота: " + height + ", колір: " + color);

    }

}
