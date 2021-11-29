package Chapter4.exercise;

import java.util.Scanner;

public class WhileNumber {

    public static void main(String[] args) {
        int number = 1;
                int count = 0;
              int score = 0;

                Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER SCORE");
        score = scanner.nextInt();

        while (number >= score ){
            if (score % number == 0) {
                System.out.println("numbers are" + number);
                count++;
            }
                number++;

        }
        System.out.println(count);
    }

}
