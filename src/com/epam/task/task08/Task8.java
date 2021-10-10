package com.epam.task.task08;

import java.util.Random;
import java.util.Scanner;

public class Task8 {
    private int[] arr = new int[10];
    private int k;

    public Task8() {
        Scanner scanner = new Scanner(System.in);
        k = scanner.nextInt();
        scanner.close();

        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }
    }

    public int findSum() {
        int sum = 0;
        for (int i : arr) {
            if (i % k == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

