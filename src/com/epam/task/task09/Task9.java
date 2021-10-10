package com.epam.task.task09;

import java.util.ArrayList;
import java.util.Scanner;

public class Task9 {
    private int k;
    private ArrayList<String> arr1 = new ArrayList<>();
    private ArrayList<String> arr2 = new ArrayList<>();

    public Task9() {
        Scanner scanner = new Scanner(System.in);
        k = scanner.nextInt();
        scanner.close();

    }

    public void fillArrays(){
        for(int i = 0; i < 10; i++) {
            arr1.add(i, String.valueOf(i));
        }
        for(int i = 0; i < 5; i++) {
            arr2.add(i, String.valueOf(i));
        }
    }

    public void mergeAndPrint() {
        arr1.addAll(k, arr2);
        for (String s: arr1) {
            System.out.println(s);
        }
    }

}
