package com.epam.task.task01;

import java.util.Scanner;

public class Task1 {
    private int n;

    public Task1() {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();
    }

    public boolean calculateSum() {

        if( n / 1000 + n / 100 % 10 == n % 10 + n % 100 / 10) {
            return true;
        }
        return false;
    }

}
