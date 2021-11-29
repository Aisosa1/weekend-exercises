package Chapter4.exercise;

import java.util.Scanner;

public class Prediction2 {

    public static void main(String[] args) {
        int counter =0;
        int number1 = 1;
        int slot = 500;

        Scanner input = new Scanner(System.in);




        do {
            slot = slot + number1;
            System.out.println("enter number");
            number1 = input.nextInt();
        }

        while (number1 < 50);
    }

     /*   while ()
            if ( score == slot) {
                System.out.println("Congratulation");
            }

        else

            if (score < number1) {
                System.out.println("too low, try again");
                counter = counter + 1;
            }

            else

            if (score > number1) {
                System.out.println("too high, try again");
                counter = counter + 1;
            }
        System.out.println(score);
**/
    }
