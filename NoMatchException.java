package Part3;

public class NoMatchException extends Exception {
    NoMatchException(int line, String input) {
        super("Exception at line number: " + line + " No Match Found for "+ input);
    }
}
