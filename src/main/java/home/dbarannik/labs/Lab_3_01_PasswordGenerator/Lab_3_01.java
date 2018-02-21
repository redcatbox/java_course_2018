package home.dbarannik.labs.Lab_3_01_PasswordGenerator;

public class Lab_3_01 {
    public static void main(String[] args) {
        int passLength;
        PasswordGenerator passGen = new PasswordGenerator();
        PasswordLengthReader passReader = new PasswordLengthReader(passGen);

        passLength = passReader.getValidPassLength();
        System.out.println(passGen.generate(passLength));

        /*
        System.out.println(passGen.generate(10));
        System.out.println(passGen.generate(5));
        System.out.println(passGen.generate(15));
        System.out.println(passGen.generate(15));
        System.out.println(passGen.generate(15));
        System.out.println(passGen.generate(-1));
        */
    }
}
