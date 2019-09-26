import java.util.*;

/**
 * This lab utilizes some concepts that may not have been covered yet in 210, such as class constructors and instancing.
 * The reason for this is so that we are not directly calling methods from the main() method, which would force us to have
 * to make ALL of our methods static. If the other instructors feel that this is maybe too much, I can change it so that
 * it is more standard and all static. I just wanted to do it this way because I personally struggled a lot going from
 * 210 to the other classes in understanding static & instance states, I want to expose them to these things early on
 * because I think once they fall in to habits of comfort, it becomes harder to re-teach/break them later on. I'm open
 * to adjusting these based on what the other lab & 210 instructors think, though.
 */

/**
 * Directions: I've provided the essentials of what you need to make this work. If you don't want to follow along in class
 * and want to do it on your own, go through all the "to do's" and and implement the requirements. Submit to iLearn before
 * 3pm on lab day for full credit on the lab. NOTE: You will still need to show up for attendance to get your attendance
 * points.
 */

public class Lab4Demo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // In future exercises, I won't provide this - you guys will be responsible for initializing your own scanners
        Lab4Demo demoObj = new Lab4Demo(); // This is our object handler. We will use this to reference methods in this class
        // TODO: Take 2 int inputs from the user. Set A and B using our setter methods.
        System.out.println("Please enter the first integer: ");
        System.out.println("Please enter the second integer: ");

        in.nextLine(); // we ask for a string next for the user. There is a newline carriage in the Scanner buffer at the end of nextInt, this clears it.

        // TODO: Ask the user which operation (^,*,+,-,/) they wish to perform. You need to build these methods first!
        System.out.println("Which operation would you like to perform? (^,*,+,-,/)");
        String cmd = in.nextLine();
        switch (cmd) {
            case "*":
                // TODO: repeat this for each possible operation and a default case as well
                break;
            default:
                // If we get here, it means the user entered an invalid operation string. We want to redirect them to try again
                // HINT: You may need to add a while loop outside the switch
        }

    }

    // TODO: We also want subtract(), multiply(), divide(), power()
    public static int add(/* insert args here */) {
        return 0; //Fix the return statement
    }

    public static void helloWorld(String name) {
        // TODO: Create a function that prints out "Hello World, I am <name>!"
    }


}
