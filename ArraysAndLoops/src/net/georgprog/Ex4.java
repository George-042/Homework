package net.georgprog;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        guessTheNumber();
    }

    public static void guessTheNumber() {
        int[] array = new int[200];
        Random random = new Random();
        try {
            System.out.println("Enter your number between 0 and 100.");
            int yourNum = new Scanner(System.in).nextInt();
            int countAttempts = 0;
            if (yourNum < 0 || yourNum > 100) {
                System.out.println("Enter your number between 0 and 100!");
            } else {
                for (int i = 0; i < array.length; i++) {
                    int numberOfProgram = random.nextInt(101);
                    countAttempts++;
                    array[i] = numberOfProgram;
                    if (numberOfProgram == yourNum) {
                        System.out.println("Your number is " + numberOfProgram);
                        break;
                    }
                    for (int j = 1; j < array.length; j++) {
                        if (array[i] == array[j]) {
                            numberOfProgram = random.nextInt(101);
                            array[i] = numberOfProgram;
                        }
                    }
                }
            }
            System.out.println("Number of attempts - " + countAttempts + ".");
        } catch (Exception e) {
            System.out.println("Incorrect input!");
        }
    }
}
