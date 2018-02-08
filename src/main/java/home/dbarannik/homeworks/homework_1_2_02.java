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
        int numTmp = Math.abs(Num);
        int numMod = numTmp;
        System.out.printf("Your number is %d.%n", Num);
        while (numTmp > 0) {
            numMod = numTmp % 10;
            numTmp = numTmp / 10;
            System.out.printf("%d.%n", numMod);
        }
    }
}
