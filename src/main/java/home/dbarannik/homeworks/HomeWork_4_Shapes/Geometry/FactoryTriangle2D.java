package home.dbarannik.homeworks.HomeWork_4_Shapes.Geometry;

import home.dbarannik.ConsoleReader.ConsoleReader;

public class FactoryTriangle2D extends FactoryShape2D {
    protected float sideA;
    protected float sideB;
    protected float sideC;

    @Override
    public void getShapeParams() {
        ConsoleReader reader = new ConsoleReader();

        System.out.println("Enter triangle side A (1-1000):");
        sideA = reader.getValidInputFloat(1, 1000);
        System.out.println("Enter triangle side B (1-1000):");
        sideB = reader.getValidInputFloat(1, 1000);
        System.out.println("Enter triangle side C (1-1000):");
        sideC = reader.getValidInputFloat(1, 1000);
    }

    @Override
    public ShapeTriangle2D createShape() {
        return new ShapeTriangle2D(sideA, sideB, sideC);
    }
}
