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

    public static int calculateFibonacciInIndex(int index) {

    }
}


