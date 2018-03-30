package exercise.ocp;

import java.util.Arrays;
import java.util.List;

public class OcpApp {

    public static void main(String[] args) {
        //TODO try to calculate the area of the rectangle
        FiguresOperations ro = new FiguresOperations();

        Rectangle rectangle1 = new Rectangle(15,20);
        Rectangle rectangle2 = new Rectangle(10,15);
        Rectangle rectangle3 = new Rectangle(5,20);
        Rectangle rectangle4 = new Rectangle(25,20);

        final List<GeometricFigures> rectangleList = Arrays.asList(rectangle1, rectangle2, rectangle3, rectangle4 );


        System.out.print("Calculating perimeter rectangle1: ");
        System.out.print(ro.calcPerimeter(rectangle1));
        System.out.print("\nCalculating area rectangle1: ");
        System.out.print(ro.calcPerimeter(rectangle1));
        System.out.print("\nCalculating total area: ");
        System.out.print(ro.totalArea(rectangleList));

    }
}
