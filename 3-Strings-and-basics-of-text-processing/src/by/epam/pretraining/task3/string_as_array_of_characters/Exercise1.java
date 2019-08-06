package by.epam.pretraining.task3.string_as_array_of_characters;

/**
 * Дан массив названий переменных в camelCase. Преобразовать названия в snake_case
 */

public class Exercise1 {

    private static String[] snakeCase;
    private static String[] camelCase = {"firstNumber", "secondDigit", "countOfAction",
            "twinNumber", "amountOfFactorial", "camelCase"};

    public static void run(){
        snakeCase = convertToSnakeCase(camelCase);
        System.out.println(String.join(", ", camelCase));
        System.out.println(String.join(", ", snakeCase));
    }

    private static String[] convertToSnakeCase(String[]camalCase){
        snakeCase = new String[camalCase.length];
        for(int i = 0; i < snakeCase.length; i++){
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < camalCase[i].length(); j++){
                char letter = camalCase[i].toCharArray()[j];
                if (Character.isLowerCase(letter)){
                    stringBuilder.append(letter);
                }else {
                    stringBuilder.append("_");
                    stringBuilder.append(Character.toLowerCase(letter));
                }
            }
            snakeCase[i] = stringBuilder.toString();
        }
        return snakeCase;
    }
}
