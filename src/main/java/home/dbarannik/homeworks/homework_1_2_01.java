package home.dbarannik.homeworks;

/**
 * Created by dbarannik on 06.02.2018.
 */
public class homework_1_2_01 {
    public static void main(String[] args) {
        final double x = 10;
        final double y = 10;
        final double z = 10;
        final double n = 10;
        System.out.printf("x + (y - 100) * z / n = %d.%n", calculate1((long)x, (long)y, (long)z, (long)n));
        System.out.printf("(x - (50 + y * z) * n) + x = %d.%n", calculate2((int)x, (int)y, (int)z, (int)n));
        System.out.printf("x * (y / (z-1) + 555) - n = %f.%n", calculate3((float)x, (float)y, (float)z, (float)n));
        System.out.printf("-x / y + z * (n+1) = %f.%n", calculate4(x, y, z, n));
    }

    public static long calculate1(long x, long y, long z, long n) {
        return (x + (y - 100) * z / n);
    }

    public static int calculate2(int x, int y, int z, int n) {
        return ((x - (50 + y * z) * n) + x);
    }

    public static float calculate3(float x, float y, float z, float n) {
        return (x * (y / (z-1) + 555) - n);
    }

    public static double calculate4(double x, double y, double z, double n) {
        return (-x / y + z * (n+1));
    }
}
