package bai8_clean_code_refactoring.thuc_hanh;

public class Cylinder {
    public static double getVolume(int radius, int height){
//        double baseArea = getBaseArea(radius);
//        double perimeter = getPerimeter(radius);
        double volume = getPerimeter(radius) * height + 2 * getBaseArea(radius);
        return volume;
    }


    public static double getPerimeter(int radius) {
        return 2 * Math.PI  * radius;
    }
    public static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }
}

//    public static double getVolume(int radius, int height){
//        double baseArea = Math.PI * radius * radius;
//        double perimeter = 2 * Math.PI  * radius;
//        double volume = perimeter * height + 2 * baseArea;
//        return volume;
//    }