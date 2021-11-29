package Chapter4.exercise;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        int number = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter digit");

        int digit = input.nextInt();

        if (digit % digit == 0){
            if (digit % number == 0){

                System.out.println("digit is prime");
            }
            else {
                System.out.println("digit isn't prime");
            }

        }
    }
}
