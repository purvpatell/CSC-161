import java.util.Scanner;

    public class StockPulsCommission {
        public static void main(String[] args) {

            // x is number of shares
            // y is price per share
            // z is commission of share broker

            System.out.println("x");
            System.out.println("y");
            System.out.println("z");

            Scanner input = new Scanner(System.in);    // for input value

            // Get the first number.
            double x = input.nextDouble();

            // Get the second number.
            double y = input.nextDouble();

            // Get the third number.
            double z = input.nextDouble();

            // Calculate the amount paid for stock without the commission
            double a = x * y;    // a is number of shares multiplied price per share

            // Calculate the amount of the commission
            double b = (x * z) / 100;   // b is find commission by percentage

            // Calculate the total amount paid for the stock plus the commission
            double c = a + b;  //c is addition for total amount pain with commission

            //display all answer
            System.out.println("a= " + a + "\nb= " + b + "\nc= " + c);

        }
    }
