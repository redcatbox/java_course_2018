package home.dbarannik.homeworks;

/**
 * Created by dbarannik on 06.02.2018.
 */
public class homework_1_2_03 {
    public static void main(String[] args) {
        float x = 1;
        float y = 1;
        float z = 1;
        //имена переменных с прописной буквы
        double VectorLength;
        VectorLength = Math.sqrt(x * x + y * y + z * z);
        System.out.printf("Vector (X, Y, Z) length is %f.%n", VectorLength);
    }
}
