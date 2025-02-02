// Custom Exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Question2 {
    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to register.");
        } else {
            System.out.println("Age is valid. Registration successful!");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16); // This will throw InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
