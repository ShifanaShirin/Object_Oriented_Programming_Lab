import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert to uppercase and lowercase
        String uppercaseString = inputString.toUpperCase();
        String lowercaseString = inputString.toLowerCase();
        System.out.println("Uppercase: " + uppercaseString);
        System.out.println("Lowercase: " + lowercaseString);

        // Count vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;
        inputString = inputString.toLowerCase(); // Convert to lowercase for easier vowel checking
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);

        // Replace all spaces with underscores
        String replacedString = inputString.replace(' ', '_');
        System.out.println("String with spaces replaced by underscores: " + replacedString);

        // Check if it is a palindrome
        String reversedString = new StringBuilder(inputString.replaceAll("[^a-zA-Z0-9]", "")).reverse().toString();
        String cleanedInput = inputString.replaceAll("[^a-zA-Z0-9]", ""); // Remove non-alphanumeric characters for palindrome check
        if (cleanedInput.equalsIgnoreCase(reversedString)) {
            System.out.println("The string (ignoring non-alphanumeric characters and case) is a palindrome.");
        } else {
            System.out.println("The string (ignoring non-alphanumeric characters and case) is not a palindrome.");
        }

        scanner.close();
    }
}
