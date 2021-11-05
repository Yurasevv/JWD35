package com.epam.task.task05;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        double[] arr = new double[3];

        Scanner scanner = new Scanner(System.in);
        arr[0] = scanner.nextDouble();
        arr[1] = scanner.nextDouble();
        arr[2] = scanner.nextDouble();
        scanner.close();

        for (int i = 0; i < arr.length; i++) {
            if( arr[i] >= 0) {
                arr[i] = Math.pow(arr[i], 2);
            } else {
                arr[i] = Math.pow(arr[i], 4);
            }
        }

        System.out.println(String.valueOf(arr[0]) +" "+ String.valueOf(arr[1]) +" "+ String.valueOf(arr[2]));

    }

}
