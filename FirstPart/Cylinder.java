package kz.aitu.training.fastjava;

public class Cylinder extends Circle{

    private double height;

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(String color, double radius) {
        super(color, radius);
    }

    public Cylinder(double radius) {
        super(radius);
    }

    @Override
    double getArea() {
        return 2 * super.getArea() + height * getLength();
    }

    public double getVolume() {
        return height * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{"+ super.toString() + "height=" + height + '}';
    }
}
