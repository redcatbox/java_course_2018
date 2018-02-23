package home.dbarannik.homeworks.HomeWork_4_Shapes.Geometry;

public class Shape2DRectangle extends Shape2D  {
    protected float sideLengthX;
    protected float sideLengthY;

    public Shape2DRectangle(float sideLengthX, float sideLengthY) {
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
        return "Shape2DRectangle with SideX = " + sideLengthX + " SideY = " + sideLengthY + " Perimeter = " + getPerimeter() + " Square = " + getSquare();
    }
}
