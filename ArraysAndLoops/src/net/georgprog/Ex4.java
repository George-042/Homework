package net.georgprog;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        findYourNum();
    }

    public static void findYourNum() {
        int[] arrayNumbers = new int[100];
        int[] box = new int[1000];
        int count = 0;
        int countAttempts = 0;
        boolean repeat = true;
        Random random = new Random();
        try {
            System.out.println("Enter your number between 0 and 100.");
            int yourNum = new Scanner(System.in).nextInt();
            if (yourNum < 0 || yourNum > 100) {
                System.out.println("Enter your number between 0 and 100!");
            } else {
                for (int i = 0; i <= box.length; i++) {
                    if (repeat == false) {
                        break;
                    } else {
                        for (int j = 0; j < arrayNumbers.length; j++) {
                            int numberOfProgram = random.nextInt(101);
                            if (box[j] == numberOfProgram) {
                                count++;
                                if (count > 1) {
                                    numberOfProgram = random.nextInt(101);
                                }
                            }
                            box[j] = numberOfProgram;
                            arrayNumbers[j] = numberOfProgram;
                            countAttempts++;
                            if (numberOfProgram == yourNum) {
                                System.out.println("Your number - " + numberOfProgram +
                                        ". Number of attempts - " + countAttempts + ".");
                                repeat = false;
                                break;
                            }
                        }
                        count = 0;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Check correctness of the input!");
        }
    }
}
