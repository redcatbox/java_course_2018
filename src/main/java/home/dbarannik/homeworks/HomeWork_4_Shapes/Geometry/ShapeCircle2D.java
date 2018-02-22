package home.dbarannik.homeworks.HomeWork_4_Shapes.Geometry;

public class ShapeCircle2D extends Shape2D {
    protected float radius;

    public ShapeCircle2D(float radius) {
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
        return "ShapeCircle2D with radius = " + radius + " Perimeter = " + getPerimeter() + " Square = " + getSquare();
    }
}
