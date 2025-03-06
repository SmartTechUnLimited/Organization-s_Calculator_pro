package Part3;

// Custom exception class that extends the built-in Exception class
public class NoMatchException extends Exception {
    
    // Constructor that accepts line number and input string as parameters
    NoMatchException(int line, String input) {
        // Calls the superclass constructor with a custom exception message
        super("Exception at line number: " + line + " No Match Found for " + input);
    }
}
