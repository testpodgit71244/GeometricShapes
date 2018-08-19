package common.helpers;



public class RandomNumberHelper {
    private static double number = 0;
    private static double max = 10;

    public static double randomSizeSide() {

        number = Math.abs(Math.random() * max);
        return number;
    }

}
