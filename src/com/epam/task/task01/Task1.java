package com.epam.task.task01;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean b = false;

        scanner.close();

        if( n / 1000 + n / 100 % 10 == n % 10 + n % 100 / 10) {
            b = true;
        }
        System.out.println(b);
    }
}
