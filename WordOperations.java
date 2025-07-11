import java.util.Arrays;
import java.util.Scanner;

public class WordOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+"); // Split by one or more whitespace characters

        System.out.println("\n--- Word Operations ---");
        for (String word : words) {
            // Reverse the word
            String reversedWord = new StringBuilder(word).reverse().toString();
            System.out.println("Original Word: " + word);
            System.out.println("Reversed Word: " + reversedWord);

            // Print the length of the word
            System.out.println("Length: " + word.length());

            // Check if the word starts with a vowel (case-insensitive)
            if (!word.isEmpty()) {
                char firstChar = Character.toLowerCase(word.charAt(0));
                if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
                    System.out.println("Starts with a vowel: Yes");
                } else {
                    System.out.println("Starts with a vowel: No");
                }
            } else {
                System.out.println("Starts with a vowel: (Empty word)");
            }
            System.out.println("-----------------------");
        }

        scanner.close();
    }
}
