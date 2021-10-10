package com.epam.task.task03;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task3 {
    private double a;
    private double b;
    private double c;

    public Task3() {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = sqrt(pow(a, 2) + pow(b, 2));
        scanner.close();
    }

    public double triangleP() {
        return a + b + c;
    }

    public double triangleS() {
        return a * b / 2;
    }
}
