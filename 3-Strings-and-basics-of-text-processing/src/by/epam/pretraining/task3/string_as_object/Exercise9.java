package by.epam.pretraining.task3.string_as_object;

/**
 * Посчитать количество строчных (маленьких) и прописных (больших) букв в
 * введенной строке. Учитывать только английские буквы.
 */

public class Exercise9 {

    public static void run() {
        String sentence = "That's one small step for a man, one giant leap for mankind. Neil Alden Armstrong" ;
        System.out.printf("Upper case letter: %d%n", countUpperCase(sentence));
        System.out.printf("Lower case letter: %d%n", countLowerCase(sentence));

    }

    private static int countUpperCase(String line){
        int counter = 0;
        for (int i = 0; i < line.length(); i++){
            char letter = line.charAt(i);
            if (letter >= 'A' && letter <= 'Z'){
                counter++;
            }
        }
        return counter;
    }

    private static int countLowerCase (String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(i);
            if (letter >= 'a' && letter <= 'z') {
                counter++;
            }
        }

        return counter;
    }
}
