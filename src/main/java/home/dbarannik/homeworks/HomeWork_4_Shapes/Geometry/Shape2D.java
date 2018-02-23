package home.dbarannik.homeworks.HomeWork_4_Shapes.Geometry;

public abstract class Shape2D {
    protected float pivotCoordX;
    protected float pivotCoordY;

    public Shape2D(float pivotCoordX, float pivotCoordY) {
        this.pivotCoordX = pivotCoordX;
        this.pivotCoordY = pivotCoordY;
    }

    public abstract float getPerimeter();
    public abstract float getSquare();
}
