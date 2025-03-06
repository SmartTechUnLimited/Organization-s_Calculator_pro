package Part1;

public class RationalNumbers {
    // Private fields for numerator and denominator
    private int numerator, denominator;

    // Constructor to initialize the rational number with numerator and denominator
    public RationalNumbers(int numerator, int denominator) {
        // Check for division by zero
        if (denominator == 0) {
            throw new IllegalArgumentException("Division by zero, not possible!");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Method to perform addition of two rational numbers
    public RationalNumbers addition(RationalNumbers other) {
        // Calculate the new numerator and denominator
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        // Return the result as a new RationalNumbers object
        return new RationalNumbers(newNumerator, newDenominator);
    }

    // Method to perform subtraction of two rational numbers
    public RationalNumbers subtraction(RationalNumbers other) {
        // Calculate the new numerator and denominator
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        // Return the result as a new RationalNumbers object
        return new RationalNumbers(newNumerator, newDenominator);
    }

    // Method to perform multiplication of two rational numbers
    public RationalNumbers multiplication(RationalNumbers other) {
        // Calculate the new numerator and denominator
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        // Return the result as a new RationalNumbers object
        return new RationalNumbers(newNumerator, newDenominator);
    }

    // Method to perform division of two rational numbers
    public RationalNumbers division(RationalNumbers other) {
        // Check for division by zero
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Division by zero, not possible!");
        }
        // Calculate the new numerator and denominator
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        // Return the result as a new RationalNumbers object
        return new RationalNumbers(newNumerator, newDenominator);
    }

    // Method to convert the rational number to a floating-point value
    public double convertToFloat() {
        return (double) this.numerator / (double) this.denominator;
    }

    // Method to return the absolute value of the rational number
    public RationalNumbers absoluteValue() {
        // Calculate the absolute values of numerator and denominator
        int newNumerator = Math.abs(this.numerator);
        int newDenominator = Math.abs(this.denominator);
        // Return the result as a new RationalNumbers object
        return new RationalNumbers(newNumerator, newDenominator);
    }

    // Override toString method to provide string representation of the rational number
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
