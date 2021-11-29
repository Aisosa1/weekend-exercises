package Chapter4.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        int total = 0;
        int counter = 1;
        int [] numbers = new int[10];

        while (counter <= 10)
        {


            System.out.println("enter score");
            int score = input.nextInt();
            total = total + score;

            numbers [score] = score;
            counter = counter + 1;

        }
        System.out.println("total is: " + total);


        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int average = total/10;

        System.out.println("average is: " + average);



        do {
            System.out.println("enter digits");
            int figure = input.nextInt();
            total += figure;
            System.out.println("digit is: " + figure);
            numbers[figure] = figure;

            Arrays.sort(numbers);
            System.out.println(Arrays.toString(numbers));
        }

        while (counter != 40);


    }
}
