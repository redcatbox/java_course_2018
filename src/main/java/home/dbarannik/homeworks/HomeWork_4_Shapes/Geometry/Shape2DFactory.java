package home.dbarannik.homeworks.HomeWork_4_Shapes.Geometry;

import home.dbarannik.ConsoleReader.ConsoleReader;

public abstract class Shape2DFactory {
    ConsoleReader reader = new ConsoleReader();
    public abstract void getShapeParams();
    public abstract Shape2D createShape();
}
