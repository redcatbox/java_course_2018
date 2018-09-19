package home.dbarannik.homeworks.MathWorks;

import java.util.ArrayList;

public class SymmetricalTime {
    public static void main(String[] args) {
        int counter = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 5; j++) {
                if (!((i == 2) && ((j == 4) || (j==5)))) {
                    sb.append(i);
                    sb.append(j);
                    sb.append(".");
                    sb.append(j);
                    sb.append(i);
                    System.out.println(sb.toString());
                    sb.setLength(0);
                    counter++;
                }
            }
        }

        System.out.println("Num of symmetries = " + counter);
    }
}

/*
ЭЛЕКТРОННЫЕ ЧАСЫ ПОКАЗЫВАЮТ ВРЕМЯ В ФОРМАТЕ ОТ 00.00 ДО 23.59
СКОЛЬКО РАЗ В СУТКИ СЛЕВА ОТ ДВОЕТОЧИЯ ПОКАЗЫВАЕТСЯ СИММЕТРИЧНАЯ КОМБИНАЦИЯ ДЛЯ ТОЙ, ЧТО СПРАВА ОТ ДВОЕТОЧИЯ
 */

        /*
        int counter = 0;
        int hours = 0;
        int minutes;

        while (hours < 24) {
            for (minutes = 59; minutes >= 0; minutes--) { // счетчик минут
                int minutes1 = minutes;
                int[] masMin = new int[2];

                for (int i = 0; i < masMin.length; i++) { // заполнение массива минут
                    masMin[i] = minutes1 % 10;
                    minutes1 = minutes1 / 10;
                }

                if (minutes == 0) {
                    hours++; // счетчик часов
                }

                int hours1 = hours;
                int[] masHour = new int[2];

                for (int j = 0; j < masHour.length; j++) { // заполнение массива часов
                    masHour[j] = hours1 % 10;
                    hours1 = hours1 / 10;
                }
                System.out.println(hours + ":" + minutes);
                if (hours == 24)
                    break;

                if (masMin[0] == masHour[1] && masMin[1] == masHour[0]) { // сравнение минут и часов на предмет симметрии

                    counter++; // счетчик совпадений симметрии
                }
            }
        }

        System.out.println("Электронные часы за сутки показывают " + counter + " случаев симметрии");
    }*/