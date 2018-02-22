package home.dbarannik.homeworks.HomeWork_4_Shapes.Geometry;

public class ShapeRectangle2D extends Shape2D  {
    protected float sideLengthX;
    protected float sideLengthY;

    public ShapeRectangle2D(float sideLengthX, float sideLengthY) {
        super(0, 0);
        this.sideLengthX = sideLengthX;
        this.sideLengthY = sideLengthY;
    }

    public float getSideLengthX() { return sideLengthX; }
    public float getSideLengthY() { return sideLengthY; }

    @Override
    public float getPerimeter() { return sideLengthX * 2 + sideLengthY * 2; }

    @Override
    public float getSquare() {
        return sideLengthX * sideLengthY;
    }

    @Override
    public String toString() {
        return "ShapeRectangle2D with SideX = " + sideLengthX + " SideY = " + sideLengthY + " Perimeter = " + getPerimeter() + " Square = " + getSquare();
    }
}
