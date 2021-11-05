package com.epam.task.task06;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        double a, b, c;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        scanner.close();

        double min = Math.min(a, Math.min(b, c));
        double max = Math.max(a, Math.max(b, c));

        System.out.println(min + max);

    }
}
