package home.dbarannik.homeworks;

import java.util.Scanner;

public class homework_2_03 {

    public static void main(String[] args) {
        int index = getIndex();
        System.out.println(calculateFibonacciInIndex(index));
    }

    public static int getIndex() {
        System.out.println("Enter Fibonacci number index:");
        Scanner console = new Scanner(System.in);
        return console.nextInt();
    }

    public static long calculateFibonacciInIndex(int index) {
        // 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 ...
        index = Math.abs(index);
        if (index <= 1)
        {
            return index;
        }
        else
        {
            return calculateFibonacciInIndex(index-1) + calculateFibonacciInIndex(index-2);
        }
    }
}
