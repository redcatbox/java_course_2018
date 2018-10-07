package home.dbarannik.homeworks.MathWorks;

public class StringsContains {
    public static void main(String[] args) {
        int numberOfSigns;

        for (int number = 0; number <= 9; number++) {
            numberOfSigns = 0;
            for (int i = 0; i <= 50000; i++) {
                String s = String.valueOf(i);
                if (s.contains(String.valueOf(number))) {
                    numberOfSigns++;
//                    System.out.println("Number with " + number + " to replace = " + s);
                }
            }

            System.out.println("Total number of signs with " + number + " to replace = " + numberOfSigns);
        }
    }
}

/*
НА СКЛАДЕ 50000 ПОЛОК С НОМЕРКАМИ. ВСЕ НОМЕРКИ СОДЕРЖАЩИЕ ЦИФРУ 2 НЕОБХОДИМО ЗАМЕНИТЬ. ПОДСЧИТАТЬ КОЛИЧЕСТВО НОМЕРКОВ ДЛЯ ЗАМЕНЫ
 */

/*
import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class JavaWork_5_4 {
    public static void main(String[] args) {

        int counterOne = 0;
        int counterTwo;
        String num = "50000";
        while (true) {
            Pattern p = Pattern.compile("\\d[^2]+"); // ищу все таблички не содержащие цифру 2
            Matcher m = p.matcher(num);
            if (m.matches()) {
                counterOne++; // считаю таблички не содержащие цифру 2
            }
            int x = Integer.parseInt(num); // преобразую строку в число
            x--;
            num = Integer.toString(x); // преобразую число обратно в строку
            if (x == 0)
                break;
        }
        counterTwo = 50000 - counterOne; // таблички содержащие цифру 2

        System.out.println("Табличек необходимо заменить " + counterTwo + " шт ");
    }


}
*/