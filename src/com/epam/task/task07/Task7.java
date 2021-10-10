package com.epam.task.task07;


import java.util.Scanner;

public class Task7 {
    private double a, b, h;

    public Task7() {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        h = scanner.nextDouble();
        scanner.close();
    }

    public void printFunctionValues(){
        for (double i = a; i <= b; i += h) {
            double fx = Math.pow(Math.sin(i), 2) - Math.cos(2 * i);
            System.out.println(i + "\t" + fx);
        }
    }
}
