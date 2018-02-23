package home.dbarannik.homeworks.HomeWork_4_Shapes.Geometry;

import home.dbarannik.ConsoleReader.ConsoleReader;

public class Shape2DCircleFactory extends Shape2DFactory {
    protected float radius;

    @Override
    public void getShapeParams() {
        System.out.println("Enter circle radius (1-1000):");
        radius = reader.getValidInputFloat(1, 1000);
    }

    @Override
    public Shape2DCircle createShape() {
        return new Shape2DCircle(radius);
    }
}
