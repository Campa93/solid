package exercise.ocp;

import java.util.List;

public class FiguresOperations {

    public double calcPerimeter(Rectangle rectangle) {
        return (rectangle.getHeight() + rectangle.getWidth()) * 2;
    }

    public double totalArea(List<GeometricFigures> figuresList){
        double totalArea = 0;
        for(GeometricFigures figure : figuresList){
            totalArea += figure.area();
        }
        return totalArea;
    }
}
