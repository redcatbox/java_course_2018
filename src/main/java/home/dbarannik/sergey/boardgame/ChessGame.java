package home.dbarannik.sergey.boardgame;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChessGame {
    final static Pattern REGEX_STEPS = Pattern.compile("[UDLR]+");

    public static void main(String[] args) {
        Pawn pawn = new Pawn(3, 3);
        Scanner scanner = new Scanner(System.in);
        String s;

        while (true) {
            System.out.println("Point the way:");
            s = scanner.nextLine().trim().toUpperCase();

            if (checkInputPath(s)) {
                pawn.followPath(s);
                System.out.println(pawn.address.toString());
            } else {
                System.out.println("Error, invalid path!");
            }
        }
    }

    public static boolean checkInputPath(String s) {
        Matcher mat = REGEX_STEPS.matcher(s);
        if (mat.matches()) {
            return true;
        } else {
            return false;
        }
    }
}

/*
0 1 2 3 4 5 6 7
0 1 2 3 4 5 6 7
0 1 2 3 4 5 6 7
0 1 2 3 4 5 6 7
0 1 2 3 4 5 6 7
0 1 2 3 4 5 6 7
0 1 2 3 4 5 6 7
0 1 2 3 4 5 6 7
*/