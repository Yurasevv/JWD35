package com.epam.task.task04;

import java.util.Scanner;

public class Task4 {
    private double x;
    private double y;

    public Task4() {
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        scanner.close();
    }

    public boolean isInside(){
        return (x <= 2) && (x >= -2) && (y <= 4) && (y >= 0) || (x <= 4) && (x >= -4) && (y <= 0) && (y >= -3);
    }
}
