package Part1;

public class Main_1 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please provide four integer arguments (numerator1, denominator1, numerator2, denominator2)");
            return;
        }

        try {
            int numerator1 = Integer.parseInt(args[0]);
            int denominator1 = Integer.parseInt(args[1]);
            int numerator2 = Integer.parseInt(args[2]);
            int denominator2 = Integer.parseInt(args[3]);

            RationalNumbers r1 = new RationalNumbers(numerator1, denominator1);
            RationalNumbers r2 = new RationalNumbers(numerator2, denominator2);

            System.out.println("Rational Number 1: " + r1);
            System.out.println("Rational Number 2: " + r2);

            double r1ToFloat = r1.convertToFloat();
            double r2ToFloat = r2.convertToFloat();

            RationalNumbers r1ToAbs = r1.absoluteValue();
            RationalNumbers r2ToAbs = r2.absoluteValue();

            System.out.println("Rational Number 1 converted to float: " + r1ToFloat);
            System.out.println("Absolute Value of Rational Number 1: " + r1ToAbs);

            System.out.println("Rational Number 2 converted to float: " + r2ToFloat);
            System.out.println("Absolute Value of Rational Number 2: " + r2ToAbs);

            RationalNumbers sum = r1.addition(r2);
            RationalNumbers difference = r1.subtraction(r2);
            RationalNumbers product = r1.multiplication(r2);

            try {
                RationalNumbers quotient = r1.division(r2);
                System.out.println("Quotient: " + quotient);
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);

            if (r1ToFloat > r2ToFloat) {
                System.out.println(r1 + " is the greater rational number");
            }
            else if (r1ToFloat < r2ToFloat) {
                System.out.println(r2 + " is the greater rational number");
            }
            else {
                System.out.println("Both rational numbers are equal");
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input format. Please provide integer arguments.");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
