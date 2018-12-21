package common.helpers;

import java.util.ArrayList;
import java.util.List;

public class ColorHelper {

    public static String randomColor() {
        List<String> colorNames = new ArrayList<>();
    
        colorNames.add("жовтий");
        colorNames.add("білий");
        colorNames.add("сірий");

        return colorNames.get((int) (Math.random() * colorNames.size()));
    }

}
