/**
 *      DIRECTIONS: In this assignment, you will be practicing writing methods still as well as using your newly learned
 *      String/char functions to compare strings. I will still provide the skeleton code and ask you guys to fill it in.
 *      Follow the TODO's in the file and fill in the incomplete code. The TODO's will also instruct you how to build the
 *      primary program.
 *
 *      NOTE: Because the code is intentionally wrong/broken, your IDE's hints or suggested fixes may not be the right
 *      one. Don't just blindly apply all the changes your IDE suggests.
 *
 *      PROGRAM GOAL: The program should prompt the user for a string line. After, it will print out the string in a loop
 *      by each character and then it will use methods to calculate the number of consanants and vowels. Then, we will
 *      perform some mathematical operations on those two numbers (see directions in code) and print out the results along
 *      the way. When we get to the end, we will use printVarValue() to print out the final values for numConsonants and
 *      numVowels. ALL OPERATIONS MUST BE DEALT IN INTEGERS!!!
 */

public class Lab5 {
    public static void main(String[] args) {
        // TODO: Parts of the code code below is incomplete/broken - Fix it.
        // HINT: Think about scope, naming rules, and method declarations.

        /**
         * This method is supposed to take a variable name & value and print it out
         * as such: "<varName> has value of <varValue>". varName should be put to
         * uppercase.
         */
        public static void printVarValue(String varName, int varValue) {
            System.out.println();
        }


        // TODO: Prompt the user for a line of text (using Scanner class)

        // TODO: Complete/fix the for loop below that will write out the string and announce how long the string is (NOTE: I know that .length() can be used for this, but I want you to practice loops
        int strLength=1;
        System.out.print("\n");
        for (int i; i><=?; i++) {
            System.out.print(inputString.charAt(i)); // NOTE: you do not have to name your string inputString if you don't want to, I am just making it this so you know what will be printed
        }
        System.out.println("The string has a length of: " + strLength);

        // TODO: Create two variables: numVowels and numConsanants. Complete the given methods below and use them to initialize these two variables

        // TODO: Using the two variables you have initialized, perform the following operations in this order:
        /**
         * 1) Add numVowels and numConsanants
         * 2) Multiply them together
         * 3) Half numConsanants
         * 4) Subtract numVowels by 5
         * 5) Raise numVowels to numConsanants power
         * 6) Use printVarValue to print out the values for both numVowels and numConsanants
         */



    } // end main()

    // TODO: Just like you did in Lab 4, create 5 math operation methods (+,-,*,^,/). They MUST return an int value
    // NOTE: ALL of your mathematical operation functions should print the two operators and the operation and its result before returning the value

    // TODO: Complete the getNumVowels and getNumConsanants methods.
    public static int getNumVowels(String str) {
        int num = 0;
        for (int i=0; i<str.length(); i++) {
            switch (str.charAt()) {
                case: // fill in the cases
                default: // do nothing
            }
        }
        return num;
    }

    public static int getNumConsanants(String str) {
        int num = 0;
        for (int i=0; i<str.length(); i++) {
            switch (str.charAt()) {
                case: // HINT: think about the vowels
                default: // you figure it out
            }
        }
        return num;
    }


} // end class Lab5
