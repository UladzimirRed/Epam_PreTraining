package by.epam.pretraining.task2.decomposition;

/**
 * Написать программу, определяющую сумму n - значных чисел, содержащих только
 * нечетные цифры. Определить также, сколько четных цифр в найденной сумме. Для
 * решения задачи использовать декомпозицию.
 */

public class Exercise16 {

    private static int n = 5;
    private static int oddSum, evenNumbers;

    public static void run() {
        oddSum = calculateSum(n);
        evenNumbers = countEvenNumbers(oddSum);
        System.out.printf("The sum of %d-digit numbers containing only odd digits: %d", n, oddSum);
        System.out.printf("\nIn the found sum is %d even numbers", evenNumbers);
    }

    private static int calculateSum(int n) {
        int[] numbers = findNumbers(n);
        int sum = 0;
        for (int element : numbers) {
            sum += element;
        }
        return sum;
    }

    //создаем массив и заполняем его необходимыми числами
    private static int[] findNumbers(int n) {
        int size = (int) Math.pow(5, n); //размер массива
        int[] numbers = new int[size];

        //ищем первое число в массиве
        int firstNumber = 1;
        for (int i = 1; i < n; i++) {
            firstNumber += (int) Math.pow(10, i);
        }
        numbers[0] = firstNumber;

        //ищем следующие числа массива
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = nextNumber(numbers[i - 1], n);
            //System.out.print(numbers[i] + "  ");  //проверка
        }
        return numbers;
    }

    //ищем следующее число с нечетными цифрами
    private static int nextNumber(int number, int n) {
        boolean isNext = false;
        while (!isNext) {
            number += 2;
            isNext = true;
            int m = n;
            while (m > 0) {
                if ((number / ((int) Math.pow(10, m-- - 1))) % 2 == 0) {
                    isNext = false;
                }
            }
        }
        return number;
    }

    private static int countEvenNumbers(int n) {
        int rest;
        int count = 0;
        while (n != 0) {
            rest = n % 10;
            n = n / 10;
            if (rest % 2 == 0)
                count++;
        }
        return count;
    }
}
