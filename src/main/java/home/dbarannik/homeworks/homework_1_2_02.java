package home.dbarannik.homeworks;

import java.util.Scanner;

/**
 * Created by dbarannik on 06.02.2018.
 */
public class homework_1_2_02 {
    public static void main(String[] args) {
        int Number = 0;
        Number = setNumber();
        printNumber(Number);
    }

    public static int setNumber() {
        System.out.println("Enter interger number: ");
        Scanner console = new Scanner(System.in);
        return console.nextInt();
    }

    public static void printNumber(int Num) {
        int NumTmp = Math.abs(Num);
        int NumMod = NumTmp;
        System.out.printf("Your number is %d.%n", Num);
        while (NumTmp > 0) {
            NumMod = NumTmp % 10;
            NumTmp = NumTmp / 10;
            System.out.printf("%d.%n", NumMod);
        }
    }
}
