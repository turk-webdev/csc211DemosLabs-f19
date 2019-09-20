import java.util.*;

public class Lab3Demo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Loops, selectors, casting

        // 1. Write a program that displays prime numbers
        System.out.println("PRIME OR NOT?\nEnter 0 to exit\n\n");
        System.out.print("Enter an integer: ");
        int input = in.nextInt();

        // What would be different about this if we used do-while instead of while? Any issues?
        // Could we use do-while here? How would we adapt for it?
        while (input != 0) {
            // TODO: Write an algorithm (using loops) that decides if int is prime or not
            // Code goes here
            if (input == 1) {
                System.out.print("Not a prime number.");
            } else {
                System.out.print("Maybe a prime number");
            }

            System.out.print("Enter an integer: ");
            input = in.nextInt();
        }


        // 2. Create an expression evaluator using a while loop & switch statements
        String expr;
        do {
            // TODO: Break up the string into an expression and then evaluate it
            System.out.println("\nEnter a mathematical expression to evaluate. q to exit");
            expr = in.nextLine();
            System.out.printf("Your expression is: '%s'\nGood job",expr);
            // Code goes here
        } while (expr != "q"); // why doesn't this work?
        in.close(); // CLOSE SCANNER, SUPER IMPORTANT!

    } // end main()

} // end class
