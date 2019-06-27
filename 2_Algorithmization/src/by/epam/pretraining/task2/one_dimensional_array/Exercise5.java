package by.epam.pretraining.task2.one_dimensional_array;

/*
 * Даны целые числа а1 ,а2 ,..., аn.
 * Вывести на печать только те числа, для которых аi > i.
 */

import java.util.Random;

public class Exercise5 {

    public static void run(){
        int n = 10;

        printNumbersThatMatchTheCondition(n);
        System.out.println();
    }

    private static void printNumbersThatMatchTheCondition (int n){
        int [] array = new int [n];

        Random random = new Random();

        System.out.print("The numbers that match the condition a[i] > i: ");
        for (int i = 0; i < n; i++){
            array[i] = random.nextInt(10 + 1);
            if (array[i] > i){
                System.out.print( + array[i] + " ");
            }
        }
    }
}
