# Java_Assignment_7

This Java program implements a simple rational numbers calculator. It allows performing basic arithmetic operations (addition, subtraction, multiplication, division) on rational numbers and also provides functionality to convert rational numbers to float, find their absolute values, and compare them.

RationalNumbers Class
The RationalNumbers class represents rational numbers and provides methods for various operations:

- Constructor: Initializes a rational number with a numerator and a non-zero denominator. It throws an exception if the denominator is zero.
- addition: Performs addition with another rational number.
- subtraction: Performs subtraction with another rational number.
- multiplication: Performs multiplication with another rational number.
- division: Performs division with another rational number. It throws an exception if the divisor's numerator is zero.
- convertToFloat: Converts the rational number to a floating-point number.
- absoluteValue: Computes the absolute value of the rational number.
- toString: Returns a string representation of the rational number in the form "numerator/denominator".

NoMatchException Class
The NoMatchException class extends the Exception class and is used to handle situations where no match is found. It has a constructor that takes two parameters: the line number where the exception occurred and the input string that caused the exception. The constructor generates an appropriate error message using these parameters.
