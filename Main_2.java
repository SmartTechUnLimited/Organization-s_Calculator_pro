package Part2;

public class Main_2 {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
       for(String arg: args) {
           try {
               int n = Integer.parseInt(arg);
               if(n<0 || n>15) {
                   throw new FactorialException("Value out of range..only 0 to 15 accepted");
               }
               System.out.println("Factorial of " + n + " = " + factorial(n));
           }
           catch(NumberFormatException e) {
                System.out.println("Invalid Input: " + e.getMessage());
           }
           catch(FactorialException e) {
               System.out.println(e.getMessage());
           }
       }
    }
}