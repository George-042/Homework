package net.georgprog;

import java.util.Scanner;

public class Ex4 {

    private static float minusBorderOfPercents;
    private static float plusBorderOfPercents;

    public static void main(String[] args) {
        nearOrFar();
    }

    static void nearOrFar() {
        float numFirst;
        float numSecond;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Введите первое число:");
            numFirst = input.nextFloat();
            definitionBorder(numFirst);
            System.out.println("Введите второе число:");
            numSecond = input.nextFloat();
            if (numSecond >= minusBorderOfPercents && numSecond <= plusBorderOfPercents)
                System.out.println("Ваше число находится в предалах 10%");
            else
                System.out.println("Ваше число не находится в пределах 10%");
        } catch (Exception e) {
            System.out.println("Некорректный ввод!");
        }
    }

    static void definitionBorder(float numFirst) {
        minusBorderOfPercents = numFirst * 0.9f;
        plusBorderOfPercents = numFirst * 1.1f;
        System.out.println("Граница -10%: " + minusBorderOfPercents + "\nГраница +10%: " + plusBorderOfPercents);
    }
}
