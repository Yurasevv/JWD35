package com.epam.task.task04;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        scanner.close();

        if((x <= 2) && (x >= -2) && (y <= 4) && (y >= 0) || (x <= 4) && (x >= -4) && (y <= 0) && (y >= -3)) {
            System.out.println("Inside");
        }
        System.out.println("Outside");
    }
}
