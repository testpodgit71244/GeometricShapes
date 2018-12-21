package common.helpers;

import common.childs.Circle;
import common.childs.Square;
import common.childs.Trapeze;
import common.childs.Triangle;
import common.main.Shape;

import java.util.ArrayList;
import java.util.List;

public class ListHelper {


    public void listShapes() {
        List<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < RandomNumberHelper.randomSizeSide(); i++) {
            shapes.add(randomShape());

        }
        for (Shape sh: shapes){
            sh.shapeAllInformation();
        }

    }


    public Shape randomShape() {
        List<Shape> allShapes = new ArrayList<>();
        allShapes.add(new Triangle());

        return allShapes.get((int) (Math.random() * allShapes.size() ));
    }
}
