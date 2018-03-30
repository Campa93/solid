package exercise.ocp;

public class Circle implements GeometricFigures{

    private double radius;


    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return Math.pow(this.getRadius(), 2) * Math.PI;
    }
}
