
    // Write a program that demonstrates how to enter 3 test grades, which
    // calculates the average test grade.

	import java.util.Scanner; // Needed for the Scanner class
    // so you can input the test grades
    public class TestScore {
        public static void main(String[] args){
            //Note: use double as your data type

            // Test score #1
            // Test score #2
            // Test score #3
            // Average of the test scores
            System.out.println("Enter three number");

            // Create a Scanner object for keyboard input.
            Scanner input = new Scanner(System.in);

            // Get the first test score.
            double testscore1 = input.nextDouble();

            // Get the second test score.
            double testscore2 = input.nextDouble();

            // Get the third test score.
            double testscore3 = input.nextDouble();

            // Calculate the average.
            double average = (testscore1 + testscore2 + testscore3) / 3;

            // Display the average.
            System.out.println("The average of " + testscore1 + " " + testscore2 + " " + testscore3 + " is " + average);
        }
    }



