package home.dbarannik.homeworks;

import java.util.Scanner;

/**
 * Created by dbarannik on 06.02.2018.
 */
public class homework_1_2_02 {
    public static void main(String[] args) {
        int number = 0;
        number = setNumber();
        printNumber(number);
    }

    public static int setNumber() {
        System.out.println("Enter interger number: ");
        Scanner console = new Scanner(System.in);
        return console.nextInt();
    }

    public static void printNumber(int Num) {
        int numAbs = Math.abs(Num);
        int numMod = numAbs;
        System.out.printf("Your number is %d.%n", Num);
        while (numAbs > 0) {
            numMod = numAbs % 10;
            numAbs = numAbs / 10;
            System.out.printf("%d.%n", numMod);
        }
    }
}
