package kz.aitu.training.fastjava;

public class Main {

    public static void main(String[] args) {

        Rectangular rectangular = new Rectangular("Red", 1,5);
        Square square = new Square("Black", 8);
        Cylinder cylinder = new Cylinder("Brown", 2, 6);

        System.out.println( "Area of rectangular is " + rectangular.getArea() + " this shape have this properties " + rectangular.toString());
        System.out.println( "Area of square is " + square.getArea() + " this shape have this properties " + square.toString());
        System.out.println( "Area of cylinder is " + cylinder.getArea() + " this shape have this properties " + cylinder.toString());
        System.out.println("Also cylinder have volume " + cylinder.getVolume() + " and full area " + cylinder.getArea());

    }
}
