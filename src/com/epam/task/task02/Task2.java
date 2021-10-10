package com.epam.task.task02;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task2 {
    private double a;
    private double b;
    private double c;

    public Task2() {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();
    }
    public double calculateSum() {
        return (b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a) - pow(a, 3) * c + pow(b, 0.5);
    }

}
