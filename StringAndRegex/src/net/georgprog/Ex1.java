package net.georgprog;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {


    public static void main(String[] args) {
        choose();
    }

    public static void choose() {
        try {
            System.out.println("Выберите операцию:" +
                    "\n1. String." +
                    "\n2. StringBuilder.");
            int yourNum = new Scanner(System.in).nextInt();
            if (yourNum == 1 || yourNum == 2) {
                switch (yourNum) {
                    case 1:
                        getString();
                        break;
                    case 2:
                        getStringBuilder();
                        break;
                }
            } else {
                System.out.println("You must choose 1 or 2!");
            }
        } catch (Exception e) {
            System.out.println("Incorrect input!");
        }
    }

    static void getString() {
        for (int i = 0; i < 100; i++) {
            int intStr = new Random().nextInt(1000);
            String str = Integer.toString(intStr);
            System.out.print(str + " ");
        }
    }

    static void getStringBuilder() {
        for (int i = 0; i < 100; i++) {
            int intStr = new Random().nextInt(1000);
            String str = Integer.toString(intStr);
            StringBuilder strBuild = new StringBuilder(str);
            System.out.print(strBuild + " ");
        }
    }
}
