package kz.aitu.training.fastjava;

public abstract class Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {}

    abstract double getArea();

    @Override
    public String toString() {
        return "Shape{" + "color='" + color + '\'' +'}';
    }
}
