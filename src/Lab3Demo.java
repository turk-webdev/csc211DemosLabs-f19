import java.util.*;

/**
 * This is the practice code we worked with in class. There were bugs in the code that I fixed over the weekend.
 * Feel free to read through below, I've left as many comments as I thought necessary.
 */

public class Lab3Demo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Loops, selectors, casting

        // 1. Write a program that displays prime numbers
        System.out.println("--PRIME OR NOT?--\nEnter 0 to exit\n\n");
        System.out.print("Enter an integer: ");
        int input;

        while ((input = in.nextInt()) != 0) { // We are calling the nextInt() at the top of each loop cycle, thus to reduce repeated code
            // TODO: Write an algorithm (using loops) that decides if int is prime or not
            boolean isPrime = true;

            if (input == 1) {
                System.out.println(input + " is not a prime number");
                continue;
            }

            for (int i=2; i<input; i++) {
                if (input%i == 0) {
                    System.out.println(input + " is not a prime number");
                    isPrime = false;
                    break;
                }
            } // end of for

            if (isPrime) {
                System.out.println(input + " is a prime number.");
            }

        } // end of while



        // 2. Create a counter up to the number that the user defines
        System.out.println("\n\n--NUMBER COUNTER--");
        System.out.println("Enter an integer (0-99)");
        input = in.nextInt();

        while (input > 99) { // for error catching
            System.out.println("Invalid input, must be between 0-99");
            input = in.nextInt();
        }

        // TODO: Write an algorithm that can count between 00 and input, always in ## format (ie: 00, 01, etc...)
        int tensMax = input/10;
        int onesMax = input%10;

        /**
         * We want to have two separate embedded loops because we want one embedded loop that
         * just prints in the ones place 0-9 until we get to the target tens place. Once we get there,
         * we want to only print to the maximum ones place.
         *
         * NOTE: You can apply this same logic to create a counter that can count up to 3,4,5,...n digits
         **/
        for (int i=0; i<=tensMax; i++) {
            if (i == tensMax) {
                for (int j=0; j<onesMax; j++) {
                    System.out.printf("\n%d%d",i,j); // This printf lets us print two decimal ints (%d) beside one another, i and j respectively
                }
            } else {
                for (int j=0; j<10; j++) {
                    System.out.printf("\n%d%d",i,j); // This printf lets us print two decimal ints (%d) beside one another, i and j respectively
                }
            }
        }

        in.close(); // CLOSE SCANNER WHEN DONE, SUPER IMPORTANT!

    } // end main()

} // end class
