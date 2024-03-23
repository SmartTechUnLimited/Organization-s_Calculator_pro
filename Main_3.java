package Part3;

import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the message..");
        String message = s.nextLine();
        try {
            if(!message.equals("India")) {
                throw new NoMatchException(7, message);
            }
            System.out.println("Match found for " + message);
        }
        catch(NoMatchException e) {
            System.out.println(e.getMessage());
        }
    }
}