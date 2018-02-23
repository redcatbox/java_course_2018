package home.dbarannik.homeworks.HomeWork_4_Shapes.Geometry;

public class Shape2DSquare extends Shape2D {
    protected float sideLength;

    public Shape2DSquare(float side) {
        super(0, 0);
        this.sideLength = side;
    }

    public float getSideLength() { return sideLength; }

    @Override
    public float getPerimeter() {
        return sideLength * 4;
    }

    @Override
    public float getSquare() {
        return sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "Shape2DSquare with Side = " + sideLength + " Perimeter = " + getPerimeter() + " Square = " + getSquare();
    }
}
