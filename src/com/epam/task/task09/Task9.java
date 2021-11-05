package com.epam.task.task09;

import java.util.ArrayList;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.close();

        for(int i = 0; i < 10; i++) {
            arr1.add(i, String.valueOf(i));
        }
        for(int i = 0; i < 5; i++) {
            arr2.add(i, String.valueOf(i));
        }

        arr1.addAll(k, arr2);
        for (String s: arr1) {
            System.out.println(s);
        }

    }

}
