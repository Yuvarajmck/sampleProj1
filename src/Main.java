import java.awt.*;


public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2=point1;
        System.out.println(point2);
        point1.x=10;
        System.out.println(point2);
    }
}