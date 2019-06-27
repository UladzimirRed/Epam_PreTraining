package by.epam.pretraining.task2.one_dimensional_array;

/*
 *  В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
 */

public class Exercise1 {

    public static void run (){
        int n = 10;
        int k = 3;

        System.out.println("\n" + "The sum of the elements that are divided by " + k + " is: " + findSumOfItems(n, k));
    }

    private static int findSumOfItems (int n, int k){
        int [] array = new int [n];
        int sum = 0;

        System.out.print("\n" + "Array is: ");

        for (int i = 0; i < n; i++){
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
            if (array[i] % k == 0){
                sum += array[i];
            }
        }
        return sum;
    }
}
