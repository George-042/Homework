package net.georgprog;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        printArray();
    }

    /**
     * This code only works with an array whose size is strictly 5!
     */

    static void printArray() {
        int size = new Scanner(System.in).nextInt();
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 || i == (size - 1)) {
                    array[i][j] = 1;
                }
                if (j == 0 || j == (size - 1)) {
                    array[i][j] = 1;
                }
                if (i > 0 && i <= 3 && j > 0 && j <= 3) {
                    array[i][j] = 2;
                }
                if (i > 1 && i <= 2 && j > 1 && j <= 2) {
                    array[i][j] = 3;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
