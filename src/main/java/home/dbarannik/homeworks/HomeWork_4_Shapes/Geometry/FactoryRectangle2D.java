package home.dbarannik.homeworks.HomeWork_4_Shapes.Geometry;

import home.dbarannik.ConsoleReader.ConsoleReader;

public class FactoryRectangle2D extends FactoryShape2D {
    protected float sideLengthX;
    protected float sideLengthY;

    @Override
    public void getShapeParams() {
        ConsoleReader reader = new ConsoleReader();

        System.out.println("Enter rectangle side X length (1-1000):");
        sideLengthX = reader.getValidInputFloat(1, 1000);
        System.out.println("Enter rectangle side Y length (1-1000):");
        sideLengthY = reader.getValidInputFloat(1, 1000);
    }

    @Override
    public ShapeRectangle2D createShape() {
        return new ShapeRectangle2D(sideLengthX, sideLengthY);
    }
}
