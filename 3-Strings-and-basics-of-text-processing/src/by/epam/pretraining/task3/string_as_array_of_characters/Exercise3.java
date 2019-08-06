package by.epam.pretraining.task3.string_as_array_of_characters;

/**
 * В строке найти количество цифр
 */

public class Exercise3 {

    public static void run(){
        String cocktailRecipe = "WHITE RUSSIAN: \n" +
                "Vodka -- 25ml, \n" +
                "Coffee Liqueur -- 25ml, \n" +
                "Cream -- 15ml, \n" +
                "Milk -- 15ml, \n" +
                "Chocolate Powder";
        System.out.println("Number of digits per line: " + countDigit(cocktailRecipe));
    }

    private static int countDigit(String line){
        int counter = 0;
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for(int i = 0; i < line.length(); i++){
            for (char element : digits){
                if (line.charAt(i) == element){
                    counter++;
                }
            }
        }
        return counter;
    }
}
