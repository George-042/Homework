package net.georgprog;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        findingDayInMonth();
    }

    public static void findingDayInMonth() {
        int[] arrayWith31 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
                18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        int[] arrayWith30 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
                18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int[] arrayFebruary = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
                18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter the month:");
            int month = input.nextInt();
            System.out.println("Enter the day:");
            int day = input.nextInt();
            checkCorrectness(month, day);
            int count = 0;
            if (month == 2) {
                for (int i = 0; i < arrayFebruary.length; i++) {
                    if (arrayFebruary[i] == day) {
                        count++;
                    }
                }
                foundOrNot(count);
            }
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                for (int i = 0; i < arrayWith30.length; i++) {
                    if (arrayWith30[i] == day) {
                        count++;
                    }
                }
                foundOrNot(count);
            }
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                for (int i = 0; i < arrayWith31.length; i++) {
                    if (arrayWith31[i] == day) {
                        count++;
                    }
                }
                foundOrNot(count);
            }
        } catch (Exception e) {
            System.out.println("Check correctness of the input!");
        }
    }

    public static void checkCorrectness(int month, int day) {
        if (month <= 0 || month > 12 || day <= 0 || day > 31) {
            System.out.println("There is no such month (day)!");
        }
    }

    public static void foundOrNot(int count) {
        if (count == 1) {
            System.out.println("This day exists in this month!");
        } else {
            System.out.println("This day does not exists in this month!");
        }
    }
}

