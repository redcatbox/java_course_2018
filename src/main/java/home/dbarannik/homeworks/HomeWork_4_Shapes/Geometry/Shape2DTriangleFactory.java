package home.dbarannik.homeworks.HomeWork_4_Shapes.Geometry;

import home.dbarannik.ConsoleReader.ConsoleReader;

public class Shape2DTriangleFactory extends Shape2DFactory {
    protected float sideA;
    protected float sideB;
    protected float sideC;

    @Override
    public void getShapeParams() {
        System.out.println("Enter triangle side A (1-1000):");
        sideA = reader.getValidInputFloat(1, 1000);
        System.out.println("Enter triangle side B (1-1000):");
        sideB = reader.getValidInputFloat(1, 1000);
        System.out.println("Enter triangle side C (1-1000):");
        sideC = reader.getValidInputFloat(1, 1000);
    }

    @Override
    public Shape2DTriangle createShape() {
        return new Shape2DTriangle(sideA, sideB, sideC);
    }
}
