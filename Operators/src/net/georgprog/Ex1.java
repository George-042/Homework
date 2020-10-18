package net.georgprog;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        rangeDefinition();
    }

    static void getDay(int numDay) {
        switch (numDay) {
            case 5:
            case 12:
            case 19:
            case 26:
                System.out.print("Понедельник");
                break;
            case 6:
            case 13:
            case 20:
            case 27:
                System.out.print("Вторник");
                break;
            case 7:
            case 14:
            case 21:
            case 28:
                System.out.print("Среда");
                break;
            case 1:
            case 8:
            case 15:
            case 22:
            case 29:
                System.out.print("Четверг");
                break;
            case 2:
            case 9:
            case 16:
            case 23:
            case 30:
                System.out.print("Пятница");
                break;
            case 3:
            case 10:
            case 17:
            case 24:
            case 31:
                System.out.print("Суббота");
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                System.out.print("Воскресенье");
                break;
        }
    }

    static void rangeDefinition() {
        boolean repeat = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число от 1 до 31:");
        try {
            int numDay = input.nextInt();
            while (repeat) {
                if (numDay >= 1 && numDay <= 31) {
                    System.out.print("Данное число соответствует дню недели (Октябрь) - ");
                    repeat = false;
                    getDay(numDay);
                } else {
                    System.out.println("Введите корректный диапазон!");
                    numDay = input.nextInt();
                }
            }
        } catch (Exception e) {
            System.out.println("Введите целое число!");
        }
    }
}
