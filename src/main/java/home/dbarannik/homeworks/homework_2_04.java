package home.dbarannik.homeworks;

import java.util.Scanner;

public class homework_2_04 {
    public static void main(String[] args) {
        int number = getNumber();
        if (validateIsNumberPowerOfTwo(number)) {
            System.out.println("Number " + number + " \033[32;1;2mIS\033[0m power of two!");
        } else {
            System.out.println("Number " + number + " \033[31;1mIS NOT\033[0m power of two!");
        }
    }

    public static int getNumber() {
        Scanner console = new Scanner(System.in);;
        int result;
        do {
            System.out.println("Enter number > 1:");
            result = console.nextInt();
        }
        while (result <= 1);
        return result;
    }

    public static boolean validateIsNumberPowerOfTwo(int n) {
        if (n % 2 == 0) {
            return validateIsNumberPowerOfTwo(n/2);
        } else if (n == 1) {
                 return true;
             } else {
                 return false;
             }
    }
}