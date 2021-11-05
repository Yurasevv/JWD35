package com.epam.task.task10;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
    }
    private int n;

    public Task10() {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();

        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = array[j].length - j;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
    }
}
