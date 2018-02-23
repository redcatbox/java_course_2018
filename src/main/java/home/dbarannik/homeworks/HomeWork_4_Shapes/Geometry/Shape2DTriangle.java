package home.dbarannik.homeworks.HomeWork_4_Shapes.Geometry;

public class Shape2DTriangle extends Shape2D {
    protected float sideA;
    protected float sideB;
    protected float sideC;

    public Shape2DTriangle(float sideA, float sideB, float sideC) {
        super(0, 0);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public float getSideA() { return sideA; }
    public float getSideB() { return sideB; }
    public float getSideC() { return sideC; }

    @Override
    public float getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public float getSquare() {
        return (float)Math.sqrt(getPerimeter() * 0.5 * (getPerimeter() * 0.5 - sideA) * (getPerimeter() * 0.5 - sideB) * (getPerimeter() * 0.5 - sideC));
    }

    @Override
    public String toString() {
        return "Shape2DTriangle with sideA = " + sideA + " sideB = " + sideB + " sideC = " + sideC + " Perimeter = " + getPerimeter() + " Square = " + getSquare();
    }
}
