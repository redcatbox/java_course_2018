package home.dbarannik.homeworks.HomeWork_4_Shapes;

import home.dbarannik.ConsoleReader.ConsoleReader;
import home.dbarannik.homeworks.HomeWork_4_Shapes.Geometry.*;

public class HomeWork_4_Main {
    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();

        while (true) {
            showChoiceMenu();
            processUserChoice(reader.getValidInputInt(1, 5));
        }
    }

    enum Shape {
        DEFAULT,
        SQUARE,
        RECTANGLE,
        CIRCLE,
        TRIANGLE
    }

    public static void showChoiceMenu() {
        // Show choice menu
        System.out.println();
        System.out.println("Select shape:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");
        System.out.println("5. Exit");
        System.out.println();
    }

    public static void processUserChoice(int inputChoice) {
        FactoryShape2D factoryShape2D;
        Shape2D shape2D;
        Shape shape = Shape.DEFAULT;

        switch (inputChoice) {
            case 1:
                shape = Shape.SQUARE;
                break;
            case 2:
                shape = Shape.RECTANGLE;
                break;
            case 3:
                shape = Shape.CIRCLE;
                break;
            case 4:
                shape = Shape.TRIANGLE;
                break;
            case 5:
                System.exit(0);
        }

        factoryShape2D = selectShapeFactory(shape);
        factoryShape2D.getShapeParams();
        shape2D = factoryShape2D.createShape();
        System.out.println(shape2D.toString());
    }

    public static FactoryShape2D selectShapeFactory(Shape shape) {
        switch (shape) {
            case DEFAULT:
                return null;
            case SQUARE:
                return new FactorySquare2D();
            case RECTANGLE:
                return new FactoryRectangle2D();
            case CIRCLE:
                return new FactoryCircle2D();
            case TRIANGLE:
                return new FactoryTriangle2D();
            default:
                return null;
        }
    }
}
