package kz.aitu.training.fastjava;

public class Square extends Rectangular{

    public Square(String color, double side) {
        super(color, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    public void setSide(double side) {
        this.setHeight(side);
        this.setWidth(side);
    }

    public double getSide() {
        return this.getHeight();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
