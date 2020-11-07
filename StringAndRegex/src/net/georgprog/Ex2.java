package net.georgprog;

import java.util.Random;

public class Ex2 {

    public static void main(String[] args) {
        getString();
    }

    static void getString() {
        for (int i = 0; i < 100; i++) {
            int intStr = new Random().nextInt(1000);
            String str = Integer.toString(intStr);
            getStringRegEx(str, intStr);
        }
        System.out.println();
    }

    static void getStringRegEx(String str, int intStr) {
        String regex = "\\w[0-9]";
        String str1 = "";
        if (intStr >= 10 && intStr <= 99) {
            str1 = str.replaceAll(regex, "-1");
            System.out.print(str1 + " ");
        } else {
            System.out.print(str + " ");
        }
    }
}
