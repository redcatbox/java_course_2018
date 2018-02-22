package home.dbarannik.homeworks.HomeWork_4_Shapes.Geometry;

import home.dbarannik.ConsoleReader.ConsoleReader;

public class FactoryCircle2D extends FactoryShape2D {
    protected float radius;

    @Override
    public void getShapeParams() {
        ConsoleReader reader = new ConsoleReader();

        System.out.println("Enter circle radius (1-1000):");
        radius = reader.getValidInputFloat(1, 1000);
    }

    @Override
    public ShapeCircle2D createShape() {
        return new ShapeCircle2D(radius);
    }
}
