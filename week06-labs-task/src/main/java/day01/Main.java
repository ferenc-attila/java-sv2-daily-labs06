package day01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PositiveNumberContainer positiveNumberContainer = new PositiveNumberContainer();

        Scanner scanner = new Scanner(System.in);

        double number;
        do {
            System.out.println("Enter a number!");
            number = scanner.nextDouble();
            positiveNumberContainer.addPositiveNumber(number);
        } while (number > 0);
        System.out.println(positiveNumberContainer.getPositiveNumbers().toString());

    }
}
