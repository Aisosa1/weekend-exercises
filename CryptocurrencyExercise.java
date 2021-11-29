package Chapter4.exercise;

import java.util.Scanner;

public class CryptocurrencyExercise {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int digit1 = 0;
        int digit2 = 0;
        int digit3 = 0;
        int digit4 = 0;
        int number = 7;
        int remainder = 10;
        int pin = 0;
        int pin2 = 1;
        int pin3 = 1;
        int pin4 = 0;

        while (digit1 <= 1) {

            System.out.println("Enter Pin");
            digit1 = input.nextInt();

            digit1 = (digit1 + number) % remainder;

            pin = digit1;


            System.out.println(pin);
        }

        while (digit2 <= 1) {

            System.out.println("Enter Pin");
            digit2 = input.nextInt();

            digit2 = (digit2 + number) % remainder;

            pin2 = digit2;

            System.out.println(pin2);

        }
        while (digit3 <= 1) {

            System.out.println("Enter Pin");
            digit3 = input.nextInt();

            digit3 = (digit3 + number) % remainder;

            pin3 = digit3;

            System.out.println(pin3);

            pin = pin3;

        }


          while (digit4 <= 1) {

              System.out.println("Enter pin");
              digit4 = input.nextInt();

              digit4 = (digit4 + number) % remainder;

              pin4 = digit4;

              System.out.println(pin4);

              pin2 = pin4;
}


        System.out.println("Pin is");

        System.out.printf("%d%d%d%d", pin, pin2, pin3, pin4);



    }

}

