package home.dbarannik.homeworks;

import java.util.Scanner;

public class HomeWork_3_04 {
    final static int MIN_ARRAY_SIZE = 2;
    final static String ERROR_MESSAGE = "Invalid value! Please, try again...";
    public static void main(String[] args) {
        int arraySize = getInputValidArraySize();
        int[][] array = fillZigzag2DArray(arraySize);
        print2DIntArray(array);
    }

    public static int getInputValidArraySize() {
        int result;
        Scanner console = new Scanner(System.in);

        while (true) {
            System.out.println("Enter array size >= 2.");
            if (console.hasNextInt()) {
                result = console.nextInt();
                if (result >= MIN_ARRAY_SIZE) {
                    break;
                } else {
                    System.out.println(ERROR_MESSAGE);
                }
            } else {
                System.out.println(ERROR_MESSAGE);
                console.next();
            }
        }
        return result;
    }

    public static int[][] fillZigzag2DArray(int arraySize) {
        int[][] result = new int[arraySize][arraySize];
        for (int i = 1; i <= arraySize; i++) {
            for (int j = 1; j <= arraySize; j++) {
                result[i-1][j-1] = i * j;
            }
        }
        return result;
    }

    public static void print2DIntArray(int[][] intArray2D) {
        for (int i = 0; i < intArray2D.length; i++) {
            for (int j = 0; j < intArray2D.length; j++) {
                System.out.printf(" %d ", intArray2D[i][j]);
            }
            System.out.printf("%n");
        }
    }
}
