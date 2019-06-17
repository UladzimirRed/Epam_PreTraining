package by.epam.pretraining.task2.one_dimensional_array;

public class Exercise4 {

    public static void run(){

        int n = 5;

        replaceMinAndMaxElements(n);
        System.out.println();

    }

    private static void replaceMinAndMaxElements(int n){

        int [] array = new int [n];

        System.out.print("Array is: ");

        for (int i = 0; i < n; i++){
            array[i] = (int) (Math.random() * 100);

            System.out.print(array[i] + " ");
        }

        int max = array [0];
        int imax = 0;
        int min = array [0];
        int imin = 0 ;

        for (int i =1; i< n; i++ ) {
            if (array [i] > max) {
                max = array [i];
                imax = i;
            }
            if (array [i] < min){
                min = array [i];
                imin = i;
            }
        }
        array [imin] = max;
        array [imax] = min;

        System.out.print("\n" + "Modified array is: ");
        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }

    }
}
