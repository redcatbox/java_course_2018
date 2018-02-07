package home.dbarannik.labs;

import java.util.Scanner;

/**
 * Created by dbarannik on 06.02.2018.
 */
public class lab_1_02 {
    public static void main(String[] args) {
        double timeInMins = 0;
        double lengthInKilometers = 0;
        Scanner console = new Scanner(System.in);

        System.out.printf("Enter time in mins: ");
        timeInMins = console.nextDouble();
        System.out.println("Enter length in kms: ");
        lengthInKilometers = console.nextDouble();

        System.out.printf("Velocity in m/s = %f.%n", CalcVelocityKmsInMinsToMsInSecs(timeInMins, lengthInKilometers));
    }

    public static double CalcVelocityKmsInMinsToMsInSecs(double timeMins, double lengthKms) {
        double velocityMsInSecs = (lengthKms*1000)/(timeMins*60);
        return velocityMsInSecs;
    }
}
