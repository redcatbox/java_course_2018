package home.dbarannik.homeworks.HomeWork_4_Shapes.Geometry;

import home.dbarannik.ConsoleReader.ConsoleReader;

public class Shape2DRectangleFactory extends Shape2DFactory {
    protected float sideLengthX;
    protected float sideLengthY;

    @Override
    public void getShapeParams() {
        System.out.println("Enter rectangle side X length (1-1000):");
        sideLengthX = reader.getValidInputFloat(1, 1000);
        System.out.println("Enter rectangle side Y length (1-1000):");
        sideLengthY = reader.getValidInputFloat(1, 1000);
    }

    @Override
    public Shape2DRectangle createShape() {
        return new Shape2DRectangle(sideLengthX, sideLengthY);
    }
}
