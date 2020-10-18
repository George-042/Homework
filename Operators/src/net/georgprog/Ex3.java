package net.georgprog;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        findingMaxMinAvg();
    }

    static void findingMaxMinAvg() {
        Float minNum = 0f;
        float num;
        float maxNum = -2147483648;
        float avg = 0;
        float sum = 0;
        minNum = minNum.MAX_VALUE;
        Scanner input = new Scanner(System.in);
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Введите " + (i + 1) + "-e число:");
                num = input.nextFloat();
                if (num > maxNum) {
                    maxNum = num;
                }
                if (num < minNum) {
                    minNum = num;
                }
                sum += num;
                avg = sum / 3;
            }
            System.out.println("Максимальный элемент - " + maxNum);
            System.out.println("Минимальный элемент - " + minNum);
            System.out.println("Среднее арифметическое - " + avg);
        } catch (Exception e) {
            System.out.println("Некорректный ввод!");
        }
    }
}
