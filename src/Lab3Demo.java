import java.util.*;

public class Lab3Demo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Loops, selectors, casting

        // 1. Write a program that displays prime numbers
        System.out.println("--PRIME OR NOT?--\nEnter 0 to exit\n\n");
        System.out.print("Enter an integer: ");
        int input = in.nextInt();

        // What would be different about this if we used do-while instead of while? Any issues?
        // Could we use do-while here? How would we adapt for it?
        while (input != 0) {
            // TODO: Write an algorithm (using loops) that decides if int is prime or not
        }


        // 2. Create a counter up to the number that the user defines
        System.out.println("\n\n--NUMBER COUNTER--");
        System.out.println("Enter an integer (0-99");
        input = in.nextInt();

        while (input > 99) {
            System.out.println("Invalid input, must be between 0-99");
            input = in.nextInt();
        }

        // TODO: Write an algorithm that can count between 00 and input, always in ## format (ie: 00, 01, etc...)

        in.close(); // CLOSE SCANNER, SUPER IMPORTANT!

    } // end main()

} // end class
