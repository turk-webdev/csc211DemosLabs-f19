import java.util.*;

public class Lab3DemoFilled {

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
            boolean isPrime = true;

            for (int i=2; i<input; i++) {
                if (input == 1 || input%i == 0) {
                    System.out.println(input + " is not a prime number");
                    isPrime = false;
                    break;
                }
            } // end of for


            if (isPrime) {
                System.out.println(input + " is a prime number.");
            }
            System.out.print("Enter an integer: ");
            input = in.nextInt();

        } // end of while



        // 2. Create a counter up to the number that the user defines
        System.out.println("\n\n--NUMBER COUNTER--");
        System.out.println("Enter an integer (0-99");
        input = in.nextInt();

        while (input > 99) { // for error catching
            System.out.println("Invalid input, must be between 0-99");
            input = in.nextInt();
        }

        // TODO: Write an algorithm that can count between 00 and input, always in ## format (ie: 00, 01, etc...)
        int tens = input/10;
        int ones = input%10;

        for (int i=0; i<=tens; i++) {
            for (int j=0; j<=ones; j++) {
                System.out.println(i + "" + j); // concatenate two variables
            }
        }






        in.close(); // CLOSE SCANNER, SUPER IMPORTANT!

    } // end main()

} // end class
