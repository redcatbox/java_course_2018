package home.dbarannik.homeworks;

import java.util.Scanner;

public class homework_2_02 {

    public static void main(String[] args) {
        long number = getNumber();
        printMinAndMaxDigitsInNumber(number);
    }

    public static long getNumber() {
        System.out.println("Enter long number:");
        Scanner console = new Scanner(System.in);
        return console.nextLong();
    }

    public static void printMinAndMaxDigitsInNumber(long number) {
        long numAbs = Math.abs(number);
        long numMod = 0;
        long digitMin = 9;
        long digitMax = 0;

        // Get min digit
        if(numAbs > 9)
        {
            do {
                numMod = numAbs % 10;
                numAbs = numAbs / 10;

                if (digitMin > numMod) {
                    digitMin = numMod;
                }

                if (digitMax < numMod) {
                    digitMax = numMod;
                }
            } while (numAbs > 0);
        }
        else
        {
            digitMin = numAbs;
            digitMax = digitMin;
        }
        // Print result
        System.out.printf("Number %d have:%n", number);
        System.out.printf("     Min digit is %d.%n", digitMin);
        System.out.printf("     Max digit is %d.%n", digitMax);
    }
}
