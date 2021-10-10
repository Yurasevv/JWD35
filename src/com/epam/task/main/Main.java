package com.epam.task.main;

import com.epam.task.task01.Task1;
import com.epam.task.task02.Task2;
import com.epam.task.task03.Task3;
import com.epam.task.task04.Task4;
import com.epam.task.task05.Task5;
import com.epam.task.task06.Task6;
import com.epam.task.task07.Task7;
import com.epam.task.task08.Task8;
import com.epam.task.task09.Task9;
import com.epam.task.task10.Task10;

public class Main {
    public static void main(String[] args) {
        Task1 test1 = new Task1();
        System.out.println(test1.calculateSum());
        Task2 test2 = new Task2();
        System.out.println(test2.calculateSum());
        Task3 test3 = new Task3();
        System.out.println(test3.triangleS() + " " + test3.triangleP());
        Task4 test4 = new Task4();
        System.out.println(test4.isInside());
        Task5 test5 = new Task5();
        test5.elevation();
        System.out.println(test5.toString());
        Task6 test6 = new Task6();
        System.out.println(test6.sumOfMinMax());
        Task7 test7 = new Task7();
        test7.printFunctionValues();
        Task8 test8 = new Task8();
        System.out.println(test8.findSum());
        Task9 test9 = new Task9();
        test9.fillArrays();
        test9.mergeAndPrint();
        Task10 test10 = new Task10();
        test10.createArray();
    }
}
