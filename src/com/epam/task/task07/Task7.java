package com.epam.task.task07;


import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        double a, b, h;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        h = scanner.nextDouble();
        scanner.close();

        for (double i = a; i <= b; i += h) {
            double fx = Math.pow(Math.sin(i), 2) - Math.cos(2 * i);
            System.out.println(i + "\t" + fx);
        }
    }
}
