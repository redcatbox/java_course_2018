package home.dbarannik.homeworks.HomeWork_4_Shapes.Geometry;

import home.dbarannik.ConsoleReader.ConsoleReader;

public class FactorySquare2D extends FactoryShape2D {
    protected float sideLength;

    @Override
    public void getShapeParams() {
        ConsoleReader reader = new ConsoleReader();

        System.out.println("Enter square side length (1-1000):");
        sideLength = reader.getValidInputFloat(1, 1000);
    }

    @Override
    public ShapeSquare2D createShape() {
        return new ShapeSquare2D(sideLength);
    }
}
