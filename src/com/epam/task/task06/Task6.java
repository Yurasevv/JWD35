package com.epam.task.task06;

import java.util.Scanner;

public class Task6 {
    private double a, b, c;

    public Task6() {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
    }

    public double sumOfMinMax() {
        double min = Math.min(a, Math.min(b, c));
        double max = Math.max(a, Math.max(b, c));
        return  min + max;
    }
}
