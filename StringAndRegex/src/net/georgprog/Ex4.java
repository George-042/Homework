package net.georgprog;

import java.util.Scanner;

public class Ex4 {

    /**
     * Register is important!
     */

    public static void main(String[] args) {
        printArray();
    }

    static void printArray() {
        String str = new Scanner(System.in).nextLine();
        String[] arrStr = str.split(" ");
        for (String words : arrStr) {
            System.out.println(words);
        }
        getOccurrence(arrStr);
    }

    static void getOccurrence(String[] arrStr) {
        int count = 0;
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr.length; j++) {
                if (arrStr[i].equals(arrStr[j])) {
                    count++;
                }
            }
            System.out.println("Для " + (i + 1) + " кол-во вхождений = " + count);
            count = 0;
        }
    }
}
