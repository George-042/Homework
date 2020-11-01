package net.georgprog;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        try {
            while (repeat) {
                System.out.println("Select the subject of your question:" +
                        "\n1: Physics." +
                        "\n2: Math." +
                        "\n3: Programming." +
                        "\n4: Stop!");
                int numOfQuest = input.nextInt();
                int count = 2;
                switch (numOfQuest) {
                    case 1:
                        System.out.println("What field appears around any item? You have 2 attempts." +
                                "\nPress 4 if you want to give up.");
                        System.out.println("1: Magnetic field." +
                                "\n2: Gravitational field." +
                                "\n3: Electric field.");
                        for (int i = 1; i <= 2; i++) {
                            int yourAns = input.nextInt();
                            if (yourAns == 4) {
                                repeat = false;
                                break;
                            }
                            if (yourAns == 2) {
                                System.out.println("Correct answer!");
                                break;
                            } else {
                                System.out.println("Wrong!");
                                count--;
                            }
                            if (count == 0) {
                                System.out.println("You used up your attempts and lost!");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("5 * 5? You have 2 attempts." +
                                "\nPress 1 if you want to give up.");
                        for (int i = 1; i <= 2; i++) {
                            int yourAns = input.nextInt();
                            if (yourAns == 25) {
                                System.out.println("Correct answer!");
                                break;
                            } else {
                                System.out.println("Wrong!");
                                count--;
                            }
                            if (count == 0) {
                                System.out.println("You used up your attempts and lost!");
                            }
                            if (yourAns == 1) {
                                repeat = false;
                            }
                        }
                        break;
                    case 3:
                        System.out.println("What programming language is this program written in? You have 2 attempts." +
                                "\nPress 5 if you want to give up.");
                        System.out.println("1: Java." +
                                "\n2: C++." +
                                "\n3: C#." +
                                "\n4: Pascal.");
                        for (int i = 1; i <= 2; i++) {
                            int yourAns = input.nextInt();
                            if (yourAns == 1) {
                                System.out.println("Correct answer!");
                                break;
                            } else {
                                System.out.println("Wrong!");
                                count--;
                            }
                            if (count == 0) {
                                System.out.println("You used up your attempts and lost!");
                            }
                            if (yourAns == 5) {
                                repeat = false;
                            }
                        }
                        break;
                    case 4:
                        repeat = false;
                        break;
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Check correctness of the input!");
        }
    }
}