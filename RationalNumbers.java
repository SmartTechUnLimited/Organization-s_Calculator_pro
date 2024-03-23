package Part1;

public class RationalNumbers {
    private int numerator, denominator;

    public RationalNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Division by zero, not possible!");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public RationalNumbers addition(RationalNumbers other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumbers(newNumerator, newDenominator);
    }

    public RationalNumbers subtraction(RationalNumbers other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumbers(newNumerator, newDenominator);
    }

    public RationalNumbers multiplication(RationalNumbers other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumbers(newNumerator, newDenominator);
    }

    public RationalNumbers division(RationalNumbers other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Division by zero, not possible!");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new RationalNumbers(newNumerator, newDenominator);
    }

    public double convertToFloat() {
        return (double) this.numerator / (double) this.denominator;
    }

    public RationalNumbers absoluteValue() {
        int newNumerator = Math.abs(this.numerator);
        int newDenominator = Math.abs(this.denominator);
        return new RationalNumbers(newNumerator, newDenominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
