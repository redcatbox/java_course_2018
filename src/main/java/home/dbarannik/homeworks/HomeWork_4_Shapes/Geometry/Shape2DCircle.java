package home.dbarannik.homeworks.HomeWork_4_Shapes.Geometry;

public class Shape2DCircle extends Shape2D {
    protected float radius;

    public Shape2DCircle(float radius) {
        super(0, 0);
        this.radius = radius;
    }

    public float getRadius() { return radius; }

    @Override
    public float getPerimeter() {
        return 2 * (float)Math.PI * radius;
    }

    @Override
    public float getSquare() {
        return (float)Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Shape2DCircle with radius = " + radius + " Perimeter = " + getPerimeter() + " Square = " + getSquare();
    }
}
