package net.georgprog;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        validation();
    }

    static void rangeDefinition(int range1, int range2, int num) {
        if (num <= range1)
            System.out.println("Число принадлежит диапазону от -бесконечности до " + range1);
        else if (num > range1 && num <= range2)
            System.out.println("Число принадлежит диапазону от " + range1 + " до " + range2);
        else if (num > range2)
            System.out.println("Число принадлежит диапазону от " + range2 + " до +бесконечности");
    }

    static void validation() {
        boolean repeat = true;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Первая точка:");
            int range1 = input.nextInt();
            System.out.println("Вторая точка:");
            int range2 = input.nextInt();
            while (repeat) {
                if (range1 >= range2) {
                    System.out.println("Введите корректный диапазон!");
                    System.out.println("Первая точка:");
                    range1 = input.nextInt();
                    System.out.println("Вторая точка:");
                    range2 = input.nextInt();
                } else {
                    repeat = false;
                    System.out.println("Ваше число:");
                    int num = input.nextInt();
                    rangeDefinition(range1, range2, num);
                }
            }
        } catch (Exception e) {
            System.out.println("Вводите целые числа!");
        }
    }
}
