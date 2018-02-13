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

    /*
    01 03-04 10-11              01
    | /  /  /  /              02  03
    02 05 09 12 19          06  05  04
      /  /  /  / |        07  08  09  10
    06 08 13 18 20      15  14  13  12  11
    | /  /  /  /          16  17  18  19
    07 14 17 21 24          22  21  20
      /  /  /  / |            23  24
    15-16 22-23 25              25
    */
    public static int[][] fillZigzag2DArray(int arraySize) {
        int[][] result = new int[arraySize][arraySize];

        for (int x = 0; x < arraySize; x++) {
            for (int y = 0; y < arraySize; y++) {
                result[x][y] = (y + 1) + x * arraySize;
            }
        }
        return result;
    }

    public static void print2DIntArray(int[][] intArray2D) {
        // This can align results up to 3 numbers
        for (int x = 0; x < intArray2D.length; x++) {
            for (int y = 0; y < intArray2D.length; y++) {
                if (intArray2D.length * intArray2D.length < 1000) {
                    if (intArray2D[x][y] < 10) {
                        System.out.printf("  %d ", intArray2D[x][y]);
                    } else if (intArray2D[x][y] < 100) {
                        System.out.printf(" %d ", intArray2D[x][y]);
                    } else {
                        System.out.printf("%d ", intArray2D[x][y]);
                    }
                }
            }
            System.out.printf("%n");
            System.out.printf("%n");
        }
    }
}
