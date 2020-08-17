import java.nio.file.attribute.AttributeView;
import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){                              // . Creating the method "inputThenPrintSumAndAverage"

        Scanner input = new Scanner(System.in);                                    // . Creating a var "input" that is an instance of the class Scanner (allows taking input from user)
        int sum = 0;                                                               // . Creating all the variables that we will need for the solution.
        int counter = 0;
        long avg;

        while(true){                                                               // . Creating an infinite loop with the while, this loop is going to retrieve all the numbers from the user until the user will insert a non-number.

            //System.out.println("Insert Number: ");
            boolean isAnInt = input.hasNextInt();                                  // . Creating the var isAnInt to check if the next number in input will be an Integer.

            if(isAnInt){                                                           // . Verifying that is an integer

                int number = input.nextInt();                                      // . if yes retrieving the number from the user and storing it in the var number.

                sum += number;                                                     // . adding all the numbers received in input and storing it in the var sum
                counter ++;                                                        // . Each time the input is a number the counter will be increased by 1.

            }else{                                                                 // . If is not a number

                avg = Math.round((double) sum / counter);                          // . Calculate the average of the numbers inserted, keeping in mind that the Math.round will need a double (So the cast)
                break;                                                             // . Ending the loop.
            }
            input.nextLine();                                                      // . The enter key.
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);                      // . Printing the outcome
        input.close();                                                             // . Closing the scanner.
    }
}
