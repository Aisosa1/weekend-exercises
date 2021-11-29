package Chapter4.exercise;

import java.util.Scanner;

public class Prediction {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int initialNumber = 501;
        int userInput = 0;
        int counter = 0;


        while (userInput <= 1) {
            System.out.println("enter digit");

            userInput = input.nextInt();

            if ( userInput == initialNumber) {
                System.out.println("Congratulation");
            }
            else

            if (userInput < initialNumber) {
                System.out.println("too low, try again");
            }
            else
            if (userInput > initialNumber) {
                System.out.println("too high, try again");
            }


        }

    }
}
