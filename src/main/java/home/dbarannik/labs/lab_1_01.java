package home.dbarannik.labs;

import java.util.Scanner;

/**
 * Created by dbarannik on 06.02.2018.
 */
public class lab_1_01 {
    public static void main(String[] args) {
        double priceCandies = 0d;
        double priceCookies = 0d;
        double price1 = 0d;
        double price2 = 0d;
        Scanner console = new Scanner(System.in);

        System.out.println("Enter candies price: ");
        priceCandies = console.nextDouble();

        System.out.println("Enter cookies price: ");
        priceCookies = console.nextDouble();

        price1 = 0.3 * priceCandies + 0.4 * priceCookies;
        System.out.printf("Price for 0.3 candies and 0.4 cookies = %f.%n", price1);

        price2 = 3 * (2 * priceCandies + 1.8 * priceCookies);
        System.out.printf("Price for 2 candies and 1.8 cookies = %f.%n", price2);
    }
}
