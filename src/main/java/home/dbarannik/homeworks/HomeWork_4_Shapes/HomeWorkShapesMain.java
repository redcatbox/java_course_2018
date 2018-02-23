package home.dbarannik.homeworks.HomeWork_4_Shapes;

import home.dbarannik.ConsoleReader.ConsoleReader;
import home.dbarannik.homeworks.HomeWork_4_Shapes.Geometry.*;

public class HomeWorkShapesMain {
    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();

        while (true) {
            showChoiceMenu();
            processUserChoice(reader.getValidInputInt(1, 5));
        }
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
        Shape2DFactory shape2Dfactory;
        Shape2D shape2D;

        switch (inputChoice) {
            case 1:
                shape2Dfactory = new Shape2DSquareFactory();
                break;
            case 2:
                shape2Dfactory = new Shape2DRectangleFactory();
                break;
            case 3:
                shape2Dfactory = new Shape2DCircleFactory();
                break;
            case 4:
                shape2Dfactory = new Shape2DTriangleFactory();
                break;
            case 5:
                System.exit(0);
            default:
                shape2Dfactory = null;
        }

        shape2Dfactory.getShapeParams();
        shape2D = shape2Dfactory.createShape();
        System.out.println(shape2D.toString());
    }
}
