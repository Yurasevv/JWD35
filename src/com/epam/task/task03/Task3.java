package com.epam.task.task03;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = sqrt(pow(a, 2) + pow(b, 2));
        scanner.close();

        System.out.println("TriangleP: " + a + b + c);

        System.out.println("TriangleS: " + a * b / 2);
    }
}
