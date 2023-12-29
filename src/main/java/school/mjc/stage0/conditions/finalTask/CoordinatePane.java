package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public static void printQuadrant(int x, int y) {
        String quadrant;

        if (x==0 || y==0) {
            quadrant = "zero";
        } else if (x>0 && y>0) {
            quadrant = "first";
        } else if (x<0 && y>0) {
            quadrant = "second";
        } else if (x<0 && y<0) {
            quadrant = "third";
        } else {
            quadrant = "fourth";
        }

        System.out.println(quadrant);
    }
    public static void main(String[] args) {
        printQuadrant(18, -30);
    }
}
