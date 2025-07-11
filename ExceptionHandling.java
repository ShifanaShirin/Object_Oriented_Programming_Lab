import java.io.*;
import java.util.Scanner;

class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}
public class ExceptionHandling {
    public static void readFile(String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found.");
        }
    }

    public static void authenticate(String username, String password) throws AuthenticationException {
        if (!username.equals("admin") || !password.equals("admin123")) {
            throw new AuthenticationException("Invalid username or password.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename = scanner.nextLine();
        try {
            readFile(filename);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            scanner.close();
            return;
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
            scanner.close();
            return;
        }

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            authenticate(username, password);
            System.out.println("Authentication successful.");
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                System.out.println("File contents:");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("IO Error while reading file: " + e.getMessage());
            }
        } catch (AuthenticationException e) {
            System.out.println("Authentication Failed: " + e.getMessage());
        }

        scanner.close();
    }
}


