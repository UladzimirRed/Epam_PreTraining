package by.epam.pretraining.task3.string_as_array_of_characters;

/**
 * В строке найти количество чисел.
 */

public class Exercise4 {

    public static void run(){
        String cocktailRecipe = "WHITE RUSSIAN: \n" +
                "Vodka -- 25ml, \n" +
                "Coffee Liqueur -- 25ml, \n" +
                "Cream -- 15ml, \n" +
                "Milk -- 15ml, \n" +
                "Chocolate Powder";
        System.out.println("Number of numbers per line: " + countNumber(cocktailRecipe));
    }

    private static int countNumber(String line){
        int counter = 0;
        for (int i = 0; i < line.length(); i++){
            if(isDigit(line.charAt(i))){
                if (i == line.length() - 1 || isDigit(line.charAt(i + 1))){
                    counter++;
                }
            }
        }
        return counter;
    }

    private static boolean isDigit(char ch){
        boolean isDigit = false;
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (char element : digits){
            if (ch == element){
                isDigit = true;
            }
        }
        return isDigit;
    }
}
