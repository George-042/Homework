package net.georgprog;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        getFormattedStr();
    }

    static void getFormattedStr() {
        try {
            System.out.println("Enter your name:");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Enter your age:");
            int age = new Scanner(System.in).nextInt();
            String formatStr = "Your name is %s" + " and your age is %d";
            System.out.println(String.format(formatStr, name, age));
        } catch (Exception e) {
            System.out.println("Incorrect input!");
        }
    }
}
