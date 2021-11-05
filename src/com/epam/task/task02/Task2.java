package com.epam.task.task02;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        scanner.close();

        double sum = (b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a) - pow(a, 3) * c + pow(b, 0.5);
        System.out.println(sum);

    }
}
