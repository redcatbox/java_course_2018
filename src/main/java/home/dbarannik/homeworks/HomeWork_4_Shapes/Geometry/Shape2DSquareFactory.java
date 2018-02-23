package home.dbarannik.homeworks.HomeWork_4_Shapes.Geometry;

import home.dbarannik.ConsoleReader.ConsoleReader;

public class Shape2DSquareFactory extends Shape2DFactory {
    protected float sideLength;

    @Override
    public void getShapeParams() {
        System.out.println("Enter square side length (1-1000):");
        sideLength = reader.getValidInputFloat(1, 1000);
    }

    @Override
    public Shape2DSquare createShape() {
        return new Shape2DSquare(sideLength);
    }
}
