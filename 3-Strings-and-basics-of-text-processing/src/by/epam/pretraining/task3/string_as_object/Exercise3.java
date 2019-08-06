package by.epam.pretraining.task3.string_as_object;

/**
 * Проверить, является ли заданное слово палиндромом
 */

public class Exercise3 {

    public static void run() {
        String[] words = {"Anna", "murder", "radar", "Civic", "Volvo", "alarm"};
        for (String word : words) {
            String result = isPalindrome(word) ? " is palindrome" : " isn't palindrome";
            System.out.println(word + result);
        }
    }

    private static boolean isPalindrome(String line) {
        boolean isPalindrome = true;
        for (int i = 0; i < line.length(); i++) {
            String a = String.valueOf(line.charAt(i));
            String b = String.valueOf(line.charAt(line.length() - i - 1));
            if (!a.equalsIgnoreCase(b)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
