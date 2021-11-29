package Chapter4.exercise;

import java.util.Scanner;

public class AskNumber {
    public static void main(String[] args) {
        int number1 = 1;
        int counter =0;

        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int score = input.nextInt();


        for ( number1=1; number1 <=score;  number1++ )
            if (score % number1 == 0 ){
                counter = counter +1;

                System.out.println(number1);

            }

        System.out.println(" factorials is "+counter);

    }


    }

