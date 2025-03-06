package Part1;

public class Main{
    public static void main(String[] args) {
        // Ensure exactly four arguments are provided
        if (args.length != 4) {
            System.out.println("Please provide four integer arguments (numerator1, denominator1, numerator2, denominator2)");
            return;
        }

        try {
            // Parse command-line arguments to integers
            int numerator1 = Integer.parseInt(args[0]);
            int denominator1 = Integer.parseInt(args[1]);
            int numerator2 = Integer.parseInt(args[2]);
            int denominator2 = Integer.parseInt(args[3]);

            // Create RationalNumbers objects
            RationalNumbers r1 = new RationalNumbers(numerator1, denominator1);
            RationalNumbers r2 = new RationalNumbers(numerator2, denominator2);

            // Print the rational numbers
            System.out.println("Rational Number 1: " + r1);
            System.out.println("Rational Number 2: " + r2);

            // Convert rational numbers to float values
            double r1ToFloat = r1.convertToFloat();
            double r2ToFloat = r2.convertToFloat();

            // Get the absolute values of the rational numbers
            RationalNumbers r1ToAbs = r1.absoluteValue();
            RationalNumbers r2ToAbs = r2.absoluteValue();

            // Print converted float values and absolute values
            System.out.println("Rational Number 1 converted to float: " + r1ToFloat);
            System.out.println("Absolute Value of Rational Number 1: " + r1ToAbs);

            System.out.println("Rational Number 2 converted to float: " + r2ToFloat);
            System.out.println("Absolute Value of Rational Number 2: " + r2ToAbs);

            // Perform arithmetic operations
            RationalNumbers sum = r1.addition(r2);
            RationalNumbers difference = r1.subtraction(r2);
            RationalNumbers product = r1.multiplication(r2);

            // Attempt division and catch potential division by zero
            try {
                RationalNumbers quotient = r1.division(r2);
                System.out.println("Quotient: " + quotient);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Print results of arithmetic operations
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);

            // Compare rational numbers based on their float values
            if (r1ToFloat > r2ToFloat) {
                System.out.println(r1 + " is the greater rational number");
            } else if (r1ToFloat < r2ToFloat) {
                System.out.println(r2 + " is the greater rational number");
            } else {
                System.out.println("Both rational numbers are equal");
            }
        }
        // Catch invalid number format exception
        catch (NumberFormatException e) {
            System.out.println("Invalid input format. Please provide integer arguments.");
        }
        // Catch illegal argument exceptions (e.g., division by zero)
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
