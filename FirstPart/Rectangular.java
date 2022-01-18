package kz.aitu.training.fastjava;

public class Rectangular extends Shape{

    private double width;
    private double height;

    public Rectangular(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangular(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangular[" + super.toString() + ",width=" + width +  ", height=" + height + ']';
    }
}
