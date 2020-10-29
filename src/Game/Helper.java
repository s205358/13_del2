package Game;

import java.util.Scanner;

public class Helper {
    Scanner sc = new Scanner(System.in);

    public void message(String text) {
        System.out.println(text);
    }

    public String scanString() {
        return sc.next();
    }

    public int scanInt() {
        while(!sc.hasNextInt()) {
            System.out.println("Enter an integer, please!");
            sc.next();
        }
        return sc.nextInt();
    }

    public int scanIntInRange(int lowerLimit, int upperLimit) {
        boolean cond = true;
        int num;
        do {
            num = scanInt();
            if (isIntInRange(num, lowerLimit, upperLimit)) {
                cond = false;
            }
        } while(cond);
        return num;
    }

    public boolean isIntInRange(int number, int lowerLimit, int upperLimit) {
        if (number < lowerLimit || number > upperLimit) {
            System.out.println("Enter an integer between "+ lowerLimit + " and " + upperLimit + ", please!");
            return false;
        } else {
            return true;
        }
    }
}
