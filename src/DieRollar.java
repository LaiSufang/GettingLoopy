import java.util.Random;
import java.util.Scanner;
public class DieRollar {
    public static void main(String[] args) {
        //Your program will be a die rolling simulation.
        // Use java Random to generate 3 random values that represents  3 thrown die (1 – 6).
        // Throw until you get a triple where each die has the same value.
        //for each throw:
        //Use printf to neatly display in a table for each row:
        //the number of each throw 1,2,3…
        //the 3 die values,
        //the sum of the die

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int die1, die2, die3;
        int sum;
        int count = 0;
        String response;
        boolean gotTriple = false;

        do {
            System.out.println("-------------------------------------");
            System.out.println("Roll#   Die1    Die2    Die3     Sum");
            System.out.println("-------------------------------------");

            while (!gotTriple) {
                count++;
                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                die3 = random.nextInt(6) + 1;
                sum = die1 + die2 + die3;
                System.out.printf("%4d\t%4d\t%4d\t%4d\t%4d\n", count, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    gotTriple = true;
                }
            }
            gotTriple = false;

            System.out.print("Do you want to continue? (y/n): ");
            response = input.next();
        } while (response.equalsIgnoreCase("y"));
    }
}
